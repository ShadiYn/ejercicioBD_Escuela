package org.example;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Profesor {
    @Id
    @GeneratedValue
    private int Id;
    private String nombre;
    private String apellido;
    private int edad;
    private int A_Experiencia;

    @OneToMany(mappedBy = "profesor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Curso> cursos;
}
