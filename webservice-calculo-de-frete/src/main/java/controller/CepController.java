package controller;


import lombok.AllArgsConstructor;
import model.Cep;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.CepRepository;


import java.util.List;

@RestController
@RequestMapping ("/cep")
@AllArgsConstructor
public class CepController {

    private CepRepository cepRepository;

    @GetMapping
    public List<Cep> getAll() {
        return cepRepository.findAll();
    }

}
