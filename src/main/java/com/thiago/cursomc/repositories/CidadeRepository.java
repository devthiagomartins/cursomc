package com.thiago.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiago.cursomc.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

}
