package com.project.controller;


import com.project.model.Cep;
import com.project.repository.CepRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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

}
