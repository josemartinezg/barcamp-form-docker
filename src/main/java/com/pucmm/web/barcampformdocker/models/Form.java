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
    Long id;
    String pregunta1;
    Integer respuesta1;
    String pregunta2;
    Integer respuesta2;
    String pregunta3;
    Integer respuesta3;
    String pregunta4;
    String respuesta4;

}
