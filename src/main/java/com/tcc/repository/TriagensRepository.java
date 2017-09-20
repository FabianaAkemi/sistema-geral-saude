package com.tcc.repository;

import com.tcc.model.ConsultaMedica;
import com.tcc.model.Triagem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * Created by akemi on 02/03/17.
 */
public interface TriagensRepository extends JpaRepository <Triagem, Long> {

    public List<Triagem> findByNomeContainingIgnoreCase( String nome );
}
