package com.example.examen.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class entrenador {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String apellido;
    private Date fecha_nacimiento;
    private Date fecha_vinculacion;
    private String uuid;

    //Clave foraneas
    @ManyToOne
    @JoinColumn(name = "pueblo_id", nullable = false)
    private pueblo pueblo;
}
