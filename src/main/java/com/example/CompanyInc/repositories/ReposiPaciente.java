package com.example.CompanyInc.repositories;

import com.example.CompanyInc.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReposiPaciente extends JpaRepository<Paciente, Long> {
    // No necesitas definir findAll() aquí, JpaRepository ya lo proporciona automáticamente
}