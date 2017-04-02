package com.tcc.repository;

import com.tcc.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by akemi on 02/03/17.
 */
public interface PacientesRepository extends JpaRepository <Paciente, Long> {

    public List<Paciente> findByNomeContainingIgnoreCase(String nome );
}
