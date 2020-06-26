package com.pucmm.web.barcampformdocker;

import com.pucmm.web.barcampformdocker.models.Usuario;
import com.pucmm.web.barcampformdocker.repositories.UsuarioRepository;
import com.pucmm.web.barcampformdocker.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class BarcampFormDockerApplication {
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    UsuarioService usuarioService;
    public static void main(String[] args) {
        SpringApplication.run(BarcampFormDockerApplication.class, args);
    }

    @Bean
    public CommandLineRunner cargarDatos() {
        return (args -> {
            Usuario usuario = new Usuario();
            usuario.setPassword("admin");
            usuario.setUsername("admin@gmail.com");
            usuarioService.guardar(usuario);
            Usuario usuarioAux = new Usuario();
            usuarioAux.setUsername("chema03@gmail.com");
            usuarioAux.setPassword("chema03");
            usuarioService.guardar(usuarioAux);
        });
    }

}
