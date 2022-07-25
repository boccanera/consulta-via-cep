package com.example.demo.controller;


import com.example.demo.model.Cep;
import com.example.demo.repository.CepRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cep")
@AllArgsConstructor
public class CepController {

    private CepRepository cepRepository;

    @GetMapping
    public List<Cep> getAll() {
        return cepRepository.findAll();
    }

    @PostMapping
    public Cep salvar(@RequestBody Cep cep){
        return cepRepository.save(cep);
    }
}
