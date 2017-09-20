package com.tcc.repository;

import com.tcc.model.ConsultaMedica;
import com.tcc.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * Created by akemi on 02/03/17.
 */
public interface ConsultasMedicasRepository extends JpaRepository <ConsultaMedica, Long> {

    public List<ConsultaMedica> findByNomeContainingIgnoreCase( String nome );
}
