package com.pucmm.web.barcampformdocker.models;

import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Usuario implements Serializable {
    @Id
    private String username;
    private String password;
    @OneToMany(mappedBy = "usuario")
    private  List<Form> formularios;

}
