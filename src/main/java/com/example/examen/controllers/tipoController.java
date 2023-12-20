package com.example.examen.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.entity.Tipo_pokemon;
import com.example.examen.repositorios.tipoRepositorio;

@RestController
@RequestMapping("/tipos_pokemon")
public class tipoController {
    private tipoRepositorio tipoRepositorio;

    public tipoController(com.example.examen.repositorios.tipoRepositorio tipoRepositorio) {
        this.tipoRepositorio = tipoRepositorio;
    }

    @GetMapping
    public List<Tipo_pokemon> getTipos(){
        return tipoRepositorio.findAll();
    }
}
