package com.example.CompanyInc.model;

import jakarta.persistence.*;
import com.example.CompanyInc.model.Paciente;

import java.time.LocalDate;

@Entity
@Table(name = "consultas")
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "paciente_id", nullable = false)
    private com.example.CompanyInc.model.Paciente paciente;
    @Column(nullable = false)
    private LocalDate fecha;

    public Consulta() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public com.example.CompanyInc.model.Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }
    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }
}

