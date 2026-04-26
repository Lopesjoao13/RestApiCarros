package br.Univille.Carros.repository;

import br.Univille.Carros.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaReposirory extends JpaRepository<Pessoa, Long> {
}