package com.pucmm.web.barcampformdocker.repositories;

import com.pucmm.web.barcampformdocker.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
    public Usuario findByUsername(String username);
}
