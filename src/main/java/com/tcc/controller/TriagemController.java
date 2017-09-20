package com.tcc.controller;


import com.tcc.model.Triagem;
import com.tcc.repository.TriagensRepository;
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
@RequestMapping("/saude")
public class TriagemController {

    @Autowired
    private TriagensRepository triagensRepository ;

    @GetMapping("/triagem")
    private ModelAndView novo(Triagem triagem){

        ModelAndView mv = new ModelAndView("cadastros/cadastro-triagem");
        mv.addObject(triagem);
        return mv;

    }

    @PostMapping("/triagem")
    private ModelAndView salvar(@Valid Triagem triagem, BindingResult result, RedirectAttributes attributes) {

        if (result.hasErrors()) {
            return novo(triagem);
        }

        triagensRepository.save(triagem);
        attributes.addFlashAttribute("mensagem", "Triagem salva com sucesso!");
        return new ModelAndView("redirect:/saude/triagem");
    }

}
