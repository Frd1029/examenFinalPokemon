package com.example.examen.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.examen.entity.Pokemon;
import com.example.examen.entity.Tipo_pokemon;

import java.util.List;


public interface pokemonRepositorio extends JpaRepository<Pokemon, Integer> {
    List<Pokemon> findByTipo_pokemon(Tipo_pokemon tipo_pokemon);
}
