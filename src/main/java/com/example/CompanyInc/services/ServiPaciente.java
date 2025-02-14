package com.example.CompanyInc.services;

import com.example.CompanyInc.model.Paciente;
import com.example.CompanyInc.repositories.ReposiPaciente;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class ServiPaciente {

    private final ReposiPaciente pacienteRepository;

    public ServiPaciente(ReposiPaciente pacienteRepository) {
        this.pacienteRepository = pacienteRepository;
    }

    // Obtener todos los pacientes
    public List<Paciente> getAllPacientes() {
        return pacienteRepository.findAll();
    }

    // Obtener un paciente por ID
    public Paciente getPacienteById(Long id) {
        return pacienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Paciente no encontrado con ID: " + id));
    }

    // Crear un nuevo paciente
    public Paciente createPaciente(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    // Actualizar un paciente existente
    public Paciente updatePaciente(Long id, Paciente pacienteActualizado) {
        Paciente pacienteExistente = pacienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Paciente no encontrado con ID: " + id));

        pacienteExistente.setNombre(pacienteActualizado.getNombre());
        pacienteExistente.setCedula(pacienteActualizado.getCedula());
        pacienteExistente.setMedico(pacienteActualizado.getMedico());
        pacienteExistente.setFechaUltimaConsulta(pacienteActualizado.getFechaUltimaConsulta());

        return pacienteRepository.save(pacienteExistente);
    }

    // Eliminar un paciente
    public void deletePaciente(Long id) {
        if (!pacienteRepository.existsById(id)) {
            throw new RuntimeException("Paciente no encontrado con ID: " + id);
        }
        pacienteRepository.deleteById(id);
    }
}

