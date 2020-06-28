package com.pucmm.web.barcampformdocker.controllers;

import com.pucmm.web.barcampformdocker.PublicForm;
import com.pucmm.web.barcampformdocker.models.Form;
import com.pucmm.web.barcampformdocker.security.MainUser;
import com.pucmm.web.barcampformdocker.services.FormService;
import com.pucmm.web.barcampformdocker.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.pucmm.web.barcampformdocker.security.CurrentUser;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
    @Autowired
    FormService formService;
    @Autowired
    UsuarioService usuarioService;

    @RequestMapping("form")
    public ModelAndView indice(@CurrentUser MainUser usuarioPrincipal, ModelAndView model) {
        PublicForm form = new PublicForm();
        String plantilla = "form.ftl";
        model.addObject("form", form);
        model.addObject("plantilla", plantilla);
        model.addObject("usuario", usuarioPrincipal);
        model.setViewName("base");
        return model;
    }

    @RequestMapping("submit")
    public String submitForm(@CurrentUser MainUser currentUser,
                             @RequestParam("respuesta1") String r1,
                             @RequestParam("respuesta2") String r2,
                             @RequestParam("respuesta3") String r3,
                             @RequestParam("respuesta4") String r4){
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

        System.out.println("Conteo pregunta1: " + this.formService.contarRespuesta1());
        Form form = new Form();
        form.setRespuesta1(Integer.parseInt(r1));
        form.setRespuesta2(Integer.parseInt(r2));
        form.setRespuesta3(Integer.parseInt(r3));
        form.setRespuesta4(r4);
        form.setPregunta1("1");
        form.setPregunta2("2");
        form.setPregunta3("3");
        form.setPregunta4("4");
        formService.guardar(form);
        return "redirect:/formulario";
    }

}
