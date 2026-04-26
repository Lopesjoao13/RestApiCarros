package br.Univille.Carros.controller;

import br.Univille.Carros.entity.Carro;
import br.Univille.Carros.service.CarroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carro")
public class CarroController {

    private CarroService carroService;

    public CarroController(CarroService carroService) {
        this.carroService = carroService;
    }


    @GetMapping
    public List<Carro> findAll(){
        return carroService.findAll();
    }


    /*
    @GetMapping
    @RequestMapping("/{id}")
    public Carro findAll(@PathVariable("id") Long id){
        return carroService.findById(id);
    }
    */

    @PostMapping
    public Carro create(@RequestBody Carro pessoa){
        return carroService.insert(pessoa);
    }

    @PutMapping
    public Carro update(@RequestBody Carro carro){
        return carroService.update(carro);
    }

    @DeleteMapping
    public void delete(@RequestBody Carro carro){
        carroService.delete(carro);
    }



}
