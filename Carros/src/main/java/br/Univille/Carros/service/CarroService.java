package br.Univille.Carros.service;

import br.Univille.Carros.entity.Carro;
import br.Univille.Carros.repository.CarroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {

    private final CarroRepository repository;

    public CarroService(CarroRepository repository){
        this.repository = repository;
    }

    public List<Carro> findAll() {
        return repository.findAll();
    }

    public Carro findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Carro com ID " + id + " não encontrado."));
    }

    public Carro insert(Carro carro) {
        return repository.save(carro);
    }

    public Carro update(Carro carro) {
        return repository.save(carro);
    }

    public void delete(Carro carro) {
        repository.delete(carro);
        System.out.println("Carro deletado com Sucesso!");
    }

}
