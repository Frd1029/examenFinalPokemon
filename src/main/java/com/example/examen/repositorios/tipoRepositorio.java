package com.example.examen.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.examen.entity.Tipo_pokemon;

public interface tipoRepositorio extends JpaRepository<Tipo_pokemon, Integer>{
    
}
