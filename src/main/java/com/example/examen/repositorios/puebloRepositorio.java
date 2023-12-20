package com.example.examen.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.examen.entity.Pueblo;

@Repository
public interface puebloRepositorio extends JpaRepository<Pueblo, Integer>{
    
}
