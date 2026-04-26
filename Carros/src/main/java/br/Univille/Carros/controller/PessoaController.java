package br.Univille.Carros.controller;

import br.Univille.Carros.entity.Pessoa;
import br.Univille.Carros.service.PessoaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaController {

    private PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }


    @GetMapping
    public List<Pessoa> findAll(){
        return pessoaService.findAll();
    }


    /*
    @GetMapping
    @RequestMapping("/{id}")
    public Pessoa findAll(@PathVariable("id") Long id){
        return pessoaService.findById(id).get();
    }
     */

    @PostMapping
    public Pessoa create(@RequestBody Pessoa pessoa){
        return pessoaService.insert(pessoa);
    }

    @PutMapping
    public Pessoa update(@RequestBody Pessoa carro){
        return pessoaService.update(carro);
    }

    @DeleteMapping
    public void delete(@RequestBody Pessoa carro){
        pessoaService.delete(carro);
    }



}
