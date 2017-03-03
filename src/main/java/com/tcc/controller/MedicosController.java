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

import javax.validation.Valid;

/**
 * Created by akemi on 27/02/17.
 */
@Controller
@RequestMapping("/vinhos")
public class MedicosController {

    @Autowired
    private MedicosRepository medicosRepository ;

    @GetMapping("/novo")
    private ModelAndView novo(Medico medico){

        ModelAndView mv = new ModelAndView("saude/cadastro-medico");
        mv.addObject("especialistas", TipoEspecialista.values());
        return mv;

    }

    @PostMapping("/novo")
    private ModelAndView novo(@Valid Medico medico, BindingResult result) {

        if (result.hasErrors()) {
            return novo(medico);
        }

        medicosRepository.save(medico);
        return new ModelAndView("redirect:/vinhos/novo");
    }



}
