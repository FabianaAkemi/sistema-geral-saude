package com.tcc.repository;


import com.tcc.model.Anamnese;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * Created by akemi on 04/03/17.
 */
public interface AnamneseRepository extends JpaRepository<Anamnese, Long> {

    public List<Anamnese> findByNomeContainingIgnoreCase( String nome );
}
