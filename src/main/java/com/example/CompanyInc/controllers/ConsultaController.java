package com.example.CompanyInc.controllers;

import com.example.CompanyInc.model.Consulta;
import com.example.CompanyInc.services.ServiConsulta;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {

    private final ServiConsulta consultaService;

    public ConsultaController(ServiConsulta consultaService) {
        this.consultaService = consultaService;
    }

    // Obtener todas las consultas
    @GetMapping
    public List<Consulta> obtenerConsultas() {
        return consultaService.getAllConsultas();
    }

    // Obtener una consulta por ID
    @GetMapping("/{id}")
    public ResponseEntity<Consulta> obtenerConsultaPorId(@PathVariable Long id) {
        return ResponseEntity.ok(consultaService.getConsultaById(id));
    }

    // Crear una consulta
    @PostMapping
    public ResponseEntity<Consulta> crearConsulta(@RequestBody Consulta consulta) {
        return ResponseEntity.ok(consultaService.createConsulta(consulta));
    }

    // Eliminar una consulta
    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarConsulta(@PathVariable Long id) {
        consultaService.deleteConsulta(id);
        return ResponseEntity.ok("Consulta eliminada correctamente");
    }
}

