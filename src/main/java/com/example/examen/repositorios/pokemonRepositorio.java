package com.example.examen.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.examen.entity.Pokemon;
import com.example.examen.entity.Tipo_pokemon;

import java.util.List;

@Repository
public interface pokemonRepositorio extends JpaRepository<Pokemon, Integer> {
    List<Pokemon> findByTipoPokemon(Tipo_pokemon tipoPokemon);
}
