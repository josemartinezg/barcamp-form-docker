package com.pucmm.web.barcampformdocker.services;

import com.pucmm.web.barcampformdocker.models.Usuario;
import com.pucmm.web.barcampformdocker.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    public Optional<Usuario> getUsuario(String usuario) {
        return usuarioRepository.findById(usuario);
    }

    public Usuario guardar(Usuario usuario) {
        usuario.setPassword(bCryptPasswordEncoder.encode(usuario.getPassword()));
        return usuarioRepository.save(usuario);
    }
}
