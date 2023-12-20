package com.example.examen.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.examen.entity.Pokemon;
import com.example.examen.entity.Tipo_pokemon;
import com.example.examen.repositorios.pokemonRepositorio;

@RestController
@RequestMapping("/pokemons")
public class pokemonController {
    
    private pokemonRepositorio pokemonRepositorio;

    public pokemonController(com.example.examen.repositorios.pokemonRepositorio pokemonRepositorio) {
        this.pokemonRepositorio = pokemonRepositorio;
    }

    @GetMapping
    public List<Pokemon> getPokemons(){
        return pokemonRepositorio.findAll();
    }

    @GetMapping("/tipo/{tipo}")
    public List<Pokemon> getPokemonByTipo(@PathVariable Tipo_pokemon tipo){
        return pokemonRepositorio.findByTipoPokemon(tipo);
    }


    @PostMapping()
    public Pokemon postPokemon(@RequestBody Pokemon pokemon){
        pokemonRepositorio.save(pokemon);
        return pokemon;
    } 
}
