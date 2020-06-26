package com.pucmm.web.barcampformdocker.services;

import com.pucmm.web.barcampformdocker.models.Form;
import com.pucmm.web.barcampformdocker.repositories.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormService {
    @Autowired
    private FormRepository formRepository;
    public Form getByCodigo(Long codigo) {
        return formRepository.findById(codigo).get();
    }

    public List<Form> getAll() {
        return formRepository.findAll();
    }

    public Form guardar(Form formulario) {
        return formRepository.save(formulario);
    }

    public Integer contarResultado1() {
        return formRepository.countByResuesta1();
    }

    public Integer contarResultado2() {
        return formRepository.countByRespuesta2();
    }
    public Integer contarResultado3() {
        return formRepository.countByRespuesta3();
    }
    public Integer contarResultado4() {
        return formRepository.countByRespuesta4();
    }
}
