package com.example.examen.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.repositorios.entrenadorRepositorio;
import com.example.examen.entity.Entrenador;

@RestController
@RequestMapping("/entrenadores")
public class entrenadorController {

    private entrenadorRepositorio entrenadorRepositorio;

    public entrenadorController(com.example.examen.repositorios.entrenadorRepositorio entrenadorRepositorio) {
        this.entrenadorRepositorio = entrenadorRepositorio;
    }

    @GetMapping
    public List<Entrenador> getEntrenadores(){
        return entrenadorRepositorio.findAll();
    }

}
