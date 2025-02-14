package com.example.CompanyInc.repositories;

import com.example.CompanyInc.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReposiMedico extends JpaRepository<Medico, Long> {
    // No necesitas definir findAll() aquí, JpaRepository ya lo proporciona automáticamente
}
