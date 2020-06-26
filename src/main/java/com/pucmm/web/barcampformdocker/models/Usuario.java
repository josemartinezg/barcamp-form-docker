package com.pucmm.web.barcampformdocker.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Usuario implements Serializable {
    @Id
    private String username;
    private String password;

}
