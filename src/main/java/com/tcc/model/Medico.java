package com.tcc.model;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by akemi on 02/03/17.
 */

@Entity
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    @NotBlank
    private String clinicas;

    @NotNull
    @Enumerated(EnumType.STRING)
    private TipoEspecialista especialista;

    private Long crm;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClinicas() {
        return clinicas;
    }

    public void setClinicas(String clinicas) {
        this.clinicas = clinicas;
    }

    public TipoEspecialista getEspecialista() {
        return especialista;
    }

    public void setEspecialista(TipoEspecialista especialista) {
        this.especialista = especialista;
    }

    public Long getCrm() {
        return crm;
    }

    public void setCrm(Long crm) {
        this.crm = crm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Medico medico = (Medico) o;

        return getId().equals(medico.getId());
    }

    @Override
    public int hashCode() {
        return getId().hashCode();
    }


}
