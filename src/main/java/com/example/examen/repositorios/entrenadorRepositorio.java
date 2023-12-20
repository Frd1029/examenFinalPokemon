package com.example.examen.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.examen.entity.Entrenador;
import java.util.List;


@Repository
public interface entrenadorRepositorio extends JpaRepository<Entrenador, Integer>{
    List<Entrenador> findByEmail(String email);
}
