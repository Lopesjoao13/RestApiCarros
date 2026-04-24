package br.Univille.Carros.service;

import br.Univille.Carros.entity.Carro;
import br.Univille.Carros.repository.CarroRepository;

import java.util.List;

public class CarroService {

    private CarroRepository repository;

    public CarroService(CarroRepository repository){
        this.repository = repository;
    }

    public List<Carro> findAll() {return repository.findAll().get();
    }

    public ClassValue<Object> findById(Long id) {
        return null;
    }
}
