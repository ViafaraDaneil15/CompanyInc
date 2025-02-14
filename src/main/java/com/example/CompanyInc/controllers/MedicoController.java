package com.example.CompanyInc.controllers;

import com.example.CompanyInc.model.Medico;
import com.example.CompanyInc.services.ServiMedico;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    private final ServiMedico medicoService;

    public MedicoController(ServiMedico medicoService) {
        this.medicoService = medicoService;
    }

    // Obtener todos los médicos
    @GetMapping
    public List<Medico> obtenerMedicos() {
        return medicoService.getAllMedicos();
    }

    // Obtener un médico por ID
    @GetMapping("/{id}")
    public ResponseEntity<Medico> obtenerMedicoPorId(@PathVariable Long id) {
        return ResponseEntity.ok(medicoService.getMedicoById(id));
    }

    // Crear un médico
    @PostMapping
    public ResponseEntity<Medico> crearMedico(@RequestBody Medico medico) {
        return ResponseEntity.ok(medicoService.createMedico(medico));
    }

    // Actualizar un médico
    @PutMapping("/{id}")
    public ResponseEntity<Medico> actualizarMedico(@PathVariable Long id, @RequestBody Medico medico) {
        return ResponseEntity.ok(medicoService.updateMedico(id, medico));
    }

    // Eliminar un médico
    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarMedico(@PathVariable Long id) {
        medicoService.deleteMedico(id);
        return ResponseEntity.ok("Médico eliminado correctamente");
    }
}