package com.example.CompanyInc.services;

import com.example.CompanyInc.model.Consulta;
import com.example.CompanyInc.repositories.ReposiConsulta;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ServiConsulta {

    private final ReposiConsulta consultaRepository;

    public ServiConsulta(ReposiConsulta consultaRepository) {
        this.consultaRepository = consultaRepository;
    }

    // Obtener todas las consultas
    public List<Consulta> getAllConsultas() {
        return consultaRepository.findAll();
    }

    // Obtener una consulta por ID
    public Consulta getConsultaById(Long id) {
        return consultaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Consulta no encontrada con ID: " + id));
    }

    // Crear una nueva consulta
    public Consulta createConsulta(Consulta consulta) {
        return consultaRepository.save(consulta);
    }

    // Eliminar una consulta
    public void deleteConsulta(Long id) {
        if (!consultaRepository.existsById(id)) {
            throw new RuntimeException("Consulta no encontrada con ID: " + id);
        }
        consultaRepository.deleteById(id);
    }
}

