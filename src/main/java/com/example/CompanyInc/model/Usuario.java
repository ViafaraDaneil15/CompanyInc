package com.example.CompanyInc.model;
import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @Enumerated(EnumType.STRING)
    private com.example.CompanyInc.model.Usuario.Rol rol;
    public enum Rol { MEDICO, ADMIN }

    public Usuario() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public com.example.CompanyInc.model.Usuario.Rol getRol() { return rol; }
    public void setRol(com.example.CompanyInc.model.Usuario.Rol rol) { this.rol = rol; }
}
