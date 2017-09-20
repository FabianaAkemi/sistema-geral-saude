package com.tcc.controller;


import com.tcc.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * Created by akemi on 20/09/17.
 */
@Controller
public class SegurancaController {

        @GetMapping("/login")
        public String login(@AuthenticationPrincipal Usuario user) {
                if (user != null) {
                        return "redirect:/saude";
                }

                return "Login";
        }

}