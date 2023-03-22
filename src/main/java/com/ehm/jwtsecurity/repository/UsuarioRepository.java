package com.ehm.jwtsecurity.repository;

import com.ehm.jwtsecurity.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository <Usuario, Long> {

    Usuario findByLogin(String login);
}
