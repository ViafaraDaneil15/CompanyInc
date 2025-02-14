package com.example.CompanyInc.services;

import com.example.CompanyInc.model.Usuario;
import com.example.CompanyInc.repositories.ReposiUsuario;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ServiUsuario {

    private final ReposiUsuario usuarioRepository;

    public ServiUsuario(ReposiUsuario usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuario getUsuarioById(Long id) {
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado con ID: " + id));
    }

    public Usuario createUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public void deleteUsuario(Long id) {
        if (!usuarioRepository.existsById(id)) {
            throw new RuntimeException("Usuario no encontrado con ID: " + id);
        }
        usuarioRepository.deleteById(id);
    }
}
