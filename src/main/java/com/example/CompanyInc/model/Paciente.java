package com.example.CompanyInc.model;
import jakarta.persistence.*;
import com.example.CompanyInc.model.Medico;
import java.time.LocalDate;

@Entity
@Table(name = "paciente")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false, unique = true)
    private String cedula;
    @ManyToOne
    @JoinColumn(name = "medico_id", nullable = false)
    private com.example.CompanyInc.model.Medico medico;
    @Column(name = "fecha_ultima_consulta")
    private LocalDate fechaUltimaConsulta;

    public Paciente() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }
    public com.example.CompanyInc.model.Medico getMedico() { return medico; }
    public void setMedico(Medico medico) { this.medico = medico; }
    public LocalDate getFechaUltimaConsulta() { return fechaUltimaConsulta; }
    public void setFechaUltimaConsulta(LocalDate fechaUltimaConsulta) { this.fechaUltimaConsulta = fechaUltimaConsulta; }
}
