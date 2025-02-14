package com.example.CompanyInc.repositories;


import com.example.CompanyInc.model.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReposiConsulta extends JpaRepository<Consulta, Long> {
    // No necesitas definir findAll() aquí, JpaRepository ya lo proporciona automáticamente
}