package com.pucmm.web.barcampformdocker.repositories;

import com.pucmm.web.barcampformdocker.models.Form;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FormRepository extends JpaRepository<Form, Long> {
    @Query(nativeQuery = true, value = "SELECT SUM(f.respuesta1) FROM form as f GROUP BY f.pregunta1")
    public Integer countByResuesta1();

    @Query(nativeQuery = true, value = "SELECT SUM(f.respuesta2) FROM form as f GROUP BY f.pregunta2")
    public Integer countByRespuesta2();

    @Query(nativeQuery = true, value = "SELECT SUM(f.respuesta3) FROM form as f GROUP BY f.pregunta3")
    public Integer countByRespuesta3();

    public List<Form> findAll();
}
