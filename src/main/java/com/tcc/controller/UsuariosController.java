package com.tcc.controller;

import com.tcc.model.Usuario;
import com.tcc.repository.UsuariosRepository;
import com.tcc.repository.filter.UsuarioFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.Optional;

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
    public ModelAndView salvar(@Valid Usuario usuario, BindingResult result, RedirectAttributes attributes){
        if (result.hasErrors()) {
            return novo(usuario);
        }

        usuariosRepository.save(usuario);
        attributes.addFlashAttribute("mensagem", "Usuário salvo com sucesso!");
        return new ModelAndView("redirect:/usuario/novo");
    }

    @GetMapping("/usuarios")
    public ModelAndView pesquisar(UsuarioFilter usuarioFilter){
        ModelAndView mv = new ModelAndView("pesquisas/pesquisa-usuario");
        mv.addObject("usuariosRepository", usuariosRepository.findByNomeContainingIgnoreCase(
                Optional.ofNullable(usuarioFilter.getNome()).orElse("%")));

        return mv;
    }
}
