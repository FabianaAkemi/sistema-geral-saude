package com.tcc.repository;

import com.tcc.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by akemi on 02/03/17.
 */
public interface MedicosRepository extends JpaRepository<Medico, Long> {

    public List<Medico> findByNomeContainingIgnoreCase( String nome );
}
