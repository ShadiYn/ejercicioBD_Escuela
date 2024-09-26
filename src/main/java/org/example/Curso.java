package org.example;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
public class Curso {
    @Id
    @GeneratedValue
    private int Id;


    private String nombre;
    private Date fecha_inicio;
    private int precio;

    @ManyToOne
   // @JoinColumn(name = "profesor_id", nullable = false)
    private Profesor profesor;
}
