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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
    @RequestMapping(value = "/logon", method = RequestMethod.GET)
    public String login(@RequestParam("user") String user, @RequestParam("password") String password) {
//        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken("admin@gmail.com", "admin"));
//        SecurityContextHolder.getContext().setAuthentication(authentication);
        System.out.println(user + " " + password);
        Usuario userExists = usuarioService.getUsuario(user);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user", userExists);
        modelAndView.setViewName("charts");

        return "redirect:/charts";
    }

}
