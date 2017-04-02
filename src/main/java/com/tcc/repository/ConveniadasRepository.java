package com.tcc.repository;

import com.tcc.model.Conveniada;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by akemi on 04/03/17.
 */
public interface ConveniadasRepository extends JpaRepository<Conveniada, Long> {

    public List<Conveniada> findByNomeContainingIgnoreCase(String nome );
}
