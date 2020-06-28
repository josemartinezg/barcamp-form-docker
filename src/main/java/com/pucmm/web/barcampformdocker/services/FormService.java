package com.pucmm.web.barcampformdocker.services;

import com.pucmm.web.barcampformdocker.models.Form;
import com.pucmm.web.barcampformdocker.repositories.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormService {
    private final FormRepository formRepository;
    public FormService(FormRepository formRepository){
        this.formRepository = formRepository;
    }
    public Form getByCodigo(Long codigo) {
        return formRepository.findById(codigo).get();
    }

    public List<Form> getAll() {
        return formRepository.findAll();
    }

    public Form guardar(Form formulario) {
        return formRepository.save(formulario);
    }

    public Integer contarRespuesta1() {
        return formRepository.countByResuesta1();
    }

    public Integer contarRespuesta2() {
        return formRepository.countByRespuesta2();
    }
    public Integer contarRespuesta3() {
        return formRepository.countByRespuesta3();
    }

}
