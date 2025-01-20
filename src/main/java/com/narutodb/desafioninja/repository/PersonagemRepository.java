package com.narutodb.desafioninja.repository;

import com.narutodb.desafioninja.model.Personagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonagemRepository extends JpaRepository<Personagem, Long> {
}

