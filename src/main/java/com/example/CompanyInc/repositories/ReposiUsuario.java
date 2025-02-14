package com.example.CompanyInc.repositories;

import com.example.CompanyInc.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReposiUsuario extends JpaRepository<Usuario, Long> {
    // No necesitas definir findAll() aquí, JpaRepository ya lo proporciona automáticamente
}
