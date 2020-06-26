package com.pucmm.web.barcampformdocker.services;

import com.pucmm.web.barcampformdocker.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
}
