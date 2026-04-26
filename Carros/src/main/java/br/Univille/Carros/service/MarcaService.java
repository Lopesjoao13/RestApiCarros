package br.Univille.Carros.service;

import br.Univille.Carros.entity.Marca;
import br.Univille.Carros.repository.MarcaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MarcaService {

    private final MarcaRepository repository;

    public MarcaService(MarcaRepository repository) {
        this.repository = repository;
    }

    public List<Marca> findAll() {
        return repository.findAll();
    }

    public Marca insert(Marca marca) {
        if(marca.getNome() == null || marca.getNome().isEmpty()){
            throw new RuntimeException("Nome da marca não informado.");
        }
        return repository.save(marca);
    }

    public Marca findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Marca não encontrada"));
    }
}