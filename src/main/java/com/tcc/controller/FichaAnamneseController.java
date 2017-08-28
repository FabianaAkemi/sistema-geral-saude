package com.tcc.controller;


import com.tcc.model.Anamnese;
import com.tcc.repository.AnamneseRepository;
import com.tcc.repository.filter.AnamneseFilter;
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
public class FichaAnamneseController {

        @Autowired
        private AnamneseRepository anamneseRepository ;

        @GetMapping("/anamnese")
        public ModelAndView novo(Anamnese anamnese){

                ModelAndView mv = new ModelAndView("saude/anamnese");
                mv.addObject(anamnese);
                return mv;

        }

        @PostMapping("/anamnese")
        public ModelAndView salvar(@Valid Anamnese anamnese , BindingResult result, RedirectAttributes attributes) {

                if (result.hasErrors()) {
                        return novo(anamnese);
                }

                anamneseRepository.save(anamnese);
                attributes.addFlashAttribute("mensagem", "Ficha de Anamnese salvo com sucesso!");
                return new ModelAndView("redirect:/saude/anamnese");
        }

        @GetMapping("/anamnese")
        public ModelAndView pesquisar(AnamneseFilter anamneseFilter){
                ModelAndView mv = new ModelAndView("pesquisas/pesquisa-anamnese");
                mv.addObject("anamneseRepository", anamneseRepository.findByNomeContainingIgnoreCase(
                    Optional.ofNullable(anamneseFilter.getNome()).orElse("%")));

                return mv;
        }

        @GetMapping("/anamnese/{id}")
        public ModelAndView editar(@PathVariable Long id){
                Anamnese anamnese = anamneseRepository.findOne(id);
                return novo(anamnese);
        }

        @DeleteMapping("/anamnese/{id}")
        public String deletar(@PathVariable Long id, RedirectAttributes attributes){
                anamneseRepository.delete(id);
                attributes.addFlashAttribute("mensagem", "Ficha de Anamnese removido com sucesso!");
                return "redirect:/saude/anamnese";
        }



}
