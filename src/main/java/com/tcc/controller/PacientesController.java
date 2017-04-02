package com.tcc.controller;

import com.tcc.model.Paciente;
import com.tcc.repository.PacientesRepository;
import com.tcc.repository.filter.PacienteFilter;
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
public class PacientesController {

    @Autowired
    private PacientesRepository pacientesRepository;

    @GetMapping("/paciente")
    private ModelAndView novo(Paciente paciente){

        ModelAndView mv = new ModelAndView("cadastros/cadastro-paciente");
        mv.addObject(paciente);
        return mv;

    }

    @PostMapping("/paciente")
    private ModelAndView salvar(@Valid Paciente paciente, BindingResult result, RedirectAttributes attributes) {

        if (result.hasErrors()) {
            return novo(paciente);
        }

        pacientesRepository.save(paciente);
        attributes.addFlashAttribute("mensagem", "Paciente salvo com sucesso!");
        return new ModelAndView("redirect:/saude/paciente");
    }

    @GetMapping("/pacientes")
    public ModelAndView pesquisar(PacienteFilter  pacienteFilter){

        ModelAndView mv = new ModelAndView("pesquisas/pesquisa-pacientes");
        mv.addObject("pacientesRepository", pacientesRepository.findByNomeContainingIgnoreCase(
                Optional.ofNullable(pacienteFilter.getNome()).orElse("%")));

        return mv;
    }





}
