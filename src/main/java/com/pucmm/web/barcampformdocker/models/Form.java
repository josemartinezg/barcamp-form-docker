package com.pucmm.web.barcampformdocker.models;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Form implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String pregunta1;
    private Integer respuesta1;
    private String pregunta2;
    private Integer respuesta2;
    private String pregunta3;
    private Integer respuesta3;
    private String pregunta4;
    private String respuesta4;

    @ManyToOne
    private Usuario usuario;

}
