package com.pucmm.web.barcampformdocker.controllers;

import com.pucmm.web.barcampformdocker.models.Form;
import com.pucmm.web.barcampformdocker.security.CurrentUser;
import com.pucmm.web.barcampformdocker.security.MainUser;
import com.pucmm.web.barcampformdocker.services.FormService;
import com.pucmm.web.barcampformdocker.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ChartsController {
    @Autowired
    FormService formService;
    @Autowired
    UsuarioService usuarioService;

    @RequestMapping("charts")
    public ModelAndView surveyDashboard(@CurrentUser MainUser mainUser, ModelAndView model){
        if (mainUser == null){
            model.setViewName("login");
            return model;
        }else if(!mainUser.getUsername().equals("admin@gmail.com")){
            model.setViewName("form");
            return model;
        }else {
            String plantilla = "charts.ftl";
            Integer p1 = formService.contarRespuesta1();
            Integer p2 = formService.contarRespuesta2();
            Integer p3 = formService.contarRespuesta3();
            model.addObject("p1",p1);
            model.addObject("p2", p2);
            model.addObject("p3", p3);
            model.addObject("plantilla", plantilla);
            model.setViewName("base");
            return model;
        }

    }
    @RequestMapping("respuestas")
    public ModelAndView surveySummary(@CurrentUser MainUser mainUser, ModelAndView model){
        String plantilla = "resumen.ftl";
        List<Form> respuestas = formService.getAnswers();
        model.addObject("plantilla", plantilla);
        model.addObject("preguntas", respuestas);
        model.setViewName("base");
        return model;
    }
}
