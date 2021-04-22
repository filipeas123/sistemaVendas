package com.example.demo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.entity.Servico;

public interface ServicoReposiroty extends JpaRepository<Servico, Integer> {

}
