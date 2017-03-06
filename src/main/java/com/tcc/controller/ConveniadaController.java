package com.tcc.controller;

import com.tcc.model.Conveniada;
import com.tcc.repository.ConveniadaRepository;
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
@RequestMapping("/saude/conveniadas")
public class ConveniadaController {

    @Autowired
    private ConveniadaRepository conveniadaRepository;

    @GetMapping("/novo")
    public ModelAndView novo(Conveniada conveniada){
        ModelAndView mv = new ModelAndView("cadastros/cadastro-conveniada");
        mv.addObject(conveniada);
        return mv;
    }

    @PostMapping("/novo")
    public ModelAndView salvar(@Valid Conveniada conveniada, BindingResult result, RedirectAttributes attributes){

        if (result.hasErrors()) {
            return novo(conveniada);
        }

        conveniadaRepository.save(conveniada);
        attributes.addFlashAttribute("mensagem", "Conveniada salvo com sucesso!");
        return new ModelAndView("redirect:/saude/conveniadas/novo");
    }
}
