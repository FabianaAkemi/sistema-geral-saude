package com.tcc.controller;

import com.tcc.model.Medico;
import com.tcc.model.TipoEspecialista;
import com.tcc.repository.MedicosRepository;
import com.tcc.repository.filter.MedicoFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Optional;

/**
 * Created by akemi on 27/02/17.
 */
@Controller
@RequestMapping("/saude")
public class MedicosController {

    @Autowired
    private MedicosRepository medicosRepository ;

    @GetMapping("/medico")
    public ModelAndView novo(Medico medico){

        ModelAndView mv = new ModelAndView("cadastros/cadastro-medico");
        mv.addObject(medico);
        mv.addObject("especialistas", TipoEspecialista.values());
        return mv;

    }

    @PostMapping("/medico")
    public ModelAndView salvar(@Valid Medico medico, BindingResult result, RedirectAttributes attributes) {

        if (result.hasErrors()) {
            return novo(medico);
        }

        medicosRepository.save(medico);
        attributes.addFlashAttribute("mensagem", "Médico salvo com sucesso!");
        return new ModelAndView("redirect:/saude/medico");
    }

    @GetMapping("/medicos")
    public ModelAndView pesquisar(MedicoFilter medicoFilter){
        ModelAndView mv = new ModelAndView("pesquisas/pesquisa-medico");
        mv.addObject("medicosRepository", medicosRepository.findByNomeContainingIgnoreCase(
                Optional.ofNullable(medicoFilter.getNome()).orElse("%")));

            return mv;
    }

    @GetMapping("/medicos/{id}")
    public ModelAndView editar(@PathVariable Long id){
        Medico medico = medicosRepository.findOne(id);
        return novo(medico);
    }

    @DeleteMapping("/medicos/{id}")
    public ModelAndView deletar(@PathVariable Long id, RedirectAttributes attributes){
        medicosRepository.delete(id);
        attributes.addFlashAttribute("mensagem", "Médico removido com sucesso!");
        return new ModelAndView("redirect:/saude/medico");
    }




}
