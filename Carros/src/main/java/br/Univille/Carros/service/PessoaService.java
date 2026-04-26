package br.Univille.Carros.service;

import br.Univille.Carros.entity.Carro;
import br.Univille.Carros.entity.Pessoa;
import br.Univille.Carros.repository.CarroRepository;
import br.Univille.Carros.repository.PessoaReposirory;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {

    private final PessoaReposirory repository;

    public PessoaService(PessoaReposirory repository){
        this.repository = repository;
    }

    public List<Pessoa> findAll() {
        return repository.findAll();
    }

    /*
    public Pessoa findById(Long id) {
        return null;
    }
    */

    public Pessoa insert(Pessoa pessoa) {
        if(Strings.isBlank(pessoa.getNome())){
            throw new RuntimeException("Nome não informado.");
        }
        if(Strings.isBlank(pessoa.getCpf())){
            throw new RuntimeException("Cpf não informado.");
        }
        return repository.save(pessoa);
    }

    public Pessoa update(Pessoa pessoa) {
        return repository.save(pessoa);
    }

    public void delete(Pessoa pessoa) {
        repository.delete(pessoa);
    }

}
