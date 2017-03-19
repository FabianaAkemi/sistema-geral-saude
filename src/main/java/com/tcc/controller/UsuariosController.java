package com.tcc.controller;

import com.tcc.model.Usuario;
import com.tcc.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
@RequestMapping("/saude")
public class UsuariosController {

    @Autowired
    private UsuariosRepository usuariosRepository;

    @GetMapping("/usuario")
    public ModelAndView novo (Usuario usuario){

        ModelAndView mv = new ModelAndView("cadastros/cadastro-usuario");
        return mv;
    }

    @PostMapping("/usuario")
    public ModelAndView salvar(@Valid Usuario usuario, BindingResult result){
        if (result.hasErrors()) {
            return novo(usuario);
        }

        usuariosRepository.save(usuario);
        return new ModelAndView("redirect:/medicos/novo");
    }
}
