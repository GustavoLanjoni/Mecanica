package com.mecanica.repository;

import com.mecanica.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findByEmail(String email);
    // Você pode adicionar métodos customizados de consulta se precisar
}