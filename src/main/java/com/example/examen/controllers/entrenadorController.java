package com.example.examen.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.repositorios.entrenadorRepositorio;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.examen.entity.Entrenador;

@RestController
@RequestMapping("/entrenadores")
public class entrenadorController {

    private entrenadorRepositorio entrenadorRepositorio;

    public entrenadorController(com.example.examen.repositorios.entrenadorRepositorio entrenadorRepositorio) {
        this.entrenadorRepositorio = entrenadorRepositorio;
    }

    @GetMapping
    public List<Entrenador> getEntrenadores() {
        return entrenadorRepositorio.findAll();
    }

    @PostMapping("/login")
    public String getUuidByEmail(@RequestBody String emailPeticion) throws JsonMappingException, JsonProcessingException{
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode jsonNode = objectMapper.readTree(emailPeticion);

            if (jsonNode.has("uuid")) { 
                String email = jsonNode.get("email").asText();
                return entrenadorRepositorio.findByEmail(email).get(0).getUuid();
            } 
            return null;
    }
}
