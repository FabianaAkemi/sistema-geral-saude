package com.tcc.repository;

import com.tcc.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by akemi on 02/03/17.
 */
public interface PacientesRepository extends JpaRepository <Paciente, Long> {
}
