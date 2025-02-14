package com.example.CompanyInc.services;

import com.example.CompanyInc.model.Medico;
import com.example.CompanyInc.repositories.ReposiMedico;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ServiMedico {

    private final ReposiMedico medicoRepository;

    public ServiMedico(ReposiMedico medicoRepository) {
        this.medicoRepository = medicoRepository;
    }

    // Obtener todos los médicos
    public List<Medico> getAllMedicos() {
        return medicoRepository.findAll();
    }

    // Obtener un médico por ID
    public Medico getMedicoById(Long id) {
        return medicoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Médico no encontrado con ID: " + id));
    }

    // Crear un nuevo médico
    public Medico createMedico(Medico medico) {
        return medicoRepository.save(medico);
    }

    // Actualizar un médico existente
    public Medico updateMedico(Long id, Medico medicoActualizado) {
        Medico medicoExistente = medicoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Médico no encontrado con ID: " + id));

        medicoExistente.setNombre(medicoActualizado.getNombre());
        medicoExistente.setCedula(medicoActualizado.getCedula());
        medicoExistente.setEspecialidad(medicoActualizado.getEspecialidad());
        medicoExistente.setCiudad(medicoActualizado.getCiudad());

        return medicoRepository.save(medicoExistente);
    }

    // Eliminar un médico
    public void deleteMedico(Long id) {
        if (!medicoRepository.existsById(id)) {
            throw new RuntimeException("Médico no encontrado con ID: " + id);
        }
        medicoRepository.deleteById(id);
    }
}
