package com.tcc.repository;

import com.tcc.model.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by akemi on 02/03/17.
 */
public interface MedicosRepository extends JpaRepository<Medico, Long> {
}
