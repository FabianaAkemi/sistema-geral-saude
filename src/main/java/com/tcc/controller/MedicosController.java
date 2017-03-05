package com.tcc.controller;

import com.tcc.model.Medico;
import com.tcc.model.TipoEspecialista;
import com.tcc.repository.MedicosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

/**
 * Created by akemi on 27/02/17.
 */
@Controller
@RequestMapping("/saude/medicos")
public class MedicosController {

    @Autowired
    private MedicosRepository medicosRepository ;

    @GetMapping("/novo")
    public ModelAndView novo(Medico medico){

        ModelAndView mv = new ModelAndView("cadastros/cadastro-medico");
        mv.addObject(medico);
        mv.addObject("especialistas", TipoEspecialista.values());
        return mv;

    }

    @PostMapping("/novo")
    public ModelAndView salvar(@Valid Medico medico, BindingResult result, RedirectAttributes attributes) {

        if (result.hasErrors()) {
            return novo(medico);
        }

        medicosRepository.save(medico);
        attributes.addFlashAttribute("mensagem", "Médico salvo com sucesso!");
        return new ModelAndView("redirect:/saude/medicos/novo");
    }



}
