package com.example.examen.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.examen.entity.Tipo_pokemon;

@Repository
public interface tipoRepositorio extends JpaRepository<Tipo_pokemon, Integer>{
    
}
