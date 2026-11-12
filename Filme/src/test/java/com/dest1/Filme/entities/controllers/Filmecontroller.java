package com.dest1.Filme.entities.controllers;

import com.dest1.filme.entities.Filme;
import com.dest1.filme.entities.controllers.repositories.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/filmes")
public class Filmecontroller {

    @Autowired // injeção de dependencia
    FilmeRepository repository;

    @PostMapping
    public Filme m(@RequestBody Filme f){
        return repository.save(f);
    }

    @GetMapping
    public List<Filme> mostrar(){
        return repository.findAll();
    }
}

