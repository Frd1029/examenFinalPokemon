package com.example.examen.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.entity.Pueblo;
import com.example.examen.repositorios.puebloRepositorio;

@RestController
@RequestMapping("/pueblos")
public class puebloController {
    
    private puebloRepositorio puebloRepositorio;

    public puebloController(com.example.examen.repositorios.puebloRepositorio puebloRepositorio) {
        this.puebloRepositorio = puebloRepositorio;
    }

    @GetMapping
    public List<Pueblo> getPueblos(){
        return puebloRepositorio.findAll();
    }

}
