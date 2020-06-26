package com.pucmm.web.barcampformdocker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class FormController {
    @RequestMapping("/")
    public String getIndex(){ return "index"; }
}
