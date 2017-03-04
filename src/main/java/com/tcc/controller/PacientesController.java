package com.tcc.controller;

import com.tcc.model.Paciente;
import com.tcc.model.TipoEspecialista;
import com.tcc.repository.PacientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * Created by akemi on 27/02/17.
 */
@Controller
@RequestMapping("/saude/pacientes")
public class PacientesController {

    @Autowired
    private PacientesRepository pacientesRepository;

    @GetMapping("/novo")
    private ModelAndView novo(Paciente medico){

        ModelAndView mv = new ModelAndView("cadastros/cadastro-paciente");
        return mv;

    }

    @PostMapping("/novo")
    private ModelAndView salvar(@Valid Paciente paciente, BindingResult result) {

        if (result.hasErrors()) {
            return novo(paciente);
        }

        pacientesRepository.save(paciente);
        return new ModelAndView("redirect:/pacientes/novo");
    }
}
