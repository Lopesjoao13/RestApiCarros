package br.univille.poo2.api.controller;

import br.Univille.Carros.entity.Carro;
import br.Univille.Carros.service.CarroService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/pessoa")
public class CarroController {

    private CarroService carroService;

    public CarroController(CarroService pessoaService) {
        this.carroService = pessoaService;
    }


    @GetMapping
    public List<Carro> findAll(){
        return carroService.findAll();
    }


    @GetMapping
    @RequestMapping("/{id}")
    public Carro findAll(@PathVariable("id") Long id){
        return carroService.findById(id).get();
    }

    @PostMapping
    public Pessoa create(@RequestBody Pessoa pessoa){
        return pessoaService.insert(pessoa);
    }

    @PutMapping
    public Pessoa update(@RequestBody Pessoa pessoa){
        return pessoaService.update(pessoa);
    }

    @DeleteMapping
    public void delete(@RequestBody Pessoa pessoa){
        pessoaService.delete(pessoa);
    }



}
