package com.tcc.repository;

import com.tcc.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by akemi on 04/03/17.
 */
public interface UsuariosRepository extends JpaRepository<Usuario, Long> {
}
