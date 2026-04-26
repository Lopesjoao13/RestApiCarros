package br.Univille.Carros.controller;

import br.Univille.Carros.entity.Marca;
import br.Univille.Carros.service.MarcaService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/marca")
public class MarcaController {

    private final MarcaService marcaService;

    public MarcaController(MarcaService marcaService) {
        this.marcaService = marcaService;
    }

    @GetMapping
    public List<Marca> findAll() {
        return marcaService.findAll();
    }

    @GetMapping("/{id}")
    public Marca findById(@PathVariable("id") Long id) {
        return marcaService.findById(id);
    }

    @PostMapping
    public Marca create(@RequestBody Marca marca) {
        return marcaService.insert(marca);
    }
}