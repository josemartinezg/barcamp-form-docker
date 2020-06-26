package com.pucmm.web.barcampformdocker.controllers;

import com.pucmm.web.barcampformdocker.models.Form;
import com.pucmm.web.barcampformdocker.models.Usuario;
import com.pucmm.web.barcampformdocker.security.CurrentUser;
import com.pucmm.web.barcampformdocker.security.MainUser;
import com.pucmm.web.barcampformdocker.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @Autowired
    UsuarioService usuarioService;
    @Autowired
    AuthenticationManager authenticationManager;
    @GetMapping("/")
    public ModelAndView index(@CurrentUser MainUser currentUser){
        ModelAndView modelAndView = new ModelAndView();

        if (currentUser == null) {
            Usuario user = new Usuario();
            modelAndView.addObject("usuario", user);
            modelAndView.setViewName("login");
        } else {
            modelAndView.setViewName("formulario");
            modelAndView.addObject("usuario", currentUser);
            Form form = new Form();
            modelAndView.addObject("formulario", form);
        }
        return modelAndView;
    }
    @GetMapping("/login")
    public ModelAndView login() {
        ModelAndView mav = new ModelAndView();
        Usuario user = new Usuario();
        mav.addObject("usuario", user);
        mav.setViewName("login");
        return mav;
    }
    @PostMapping("/logon")
    public String login(@RequestParam String user, @RequestParam String password) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(user, password));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        System.out.println(user + " " + password);
        Usuario userExists = usuarioService.getUsuario(user);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", userExists);
        modelAndView.setViewName("formulario");
        return "redirect:/formulario";
    }

}
