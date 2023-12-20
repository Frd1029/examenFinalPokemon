package com.example.examen.entity;

import java.sql.Date;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class pokemon {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private Integer descripcion;
    private Date fecha_descubrimiento;
    private Integer generacion;
    private String uuid;

    //Clave foraneas
    @ManyToOne
    @JoinColumn(name = "tipo_pokemon", nullable = false)
    private tipo_pokemon tipo_pokemon;
}
