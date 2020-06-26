package com.pucmm.web.barcampformdocker.models;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

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
    int respuesta1;
    String pregunta2;
    int respuesta2;
    String pregunta3;
    int respuesta3;
    String pregunta4;
    int respuesta4;
    String pregunta5;
    int respuesta5;
}
