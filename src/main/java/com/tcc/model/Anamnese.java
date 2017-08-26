package com.tcc.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;


/**
 * Created by akemi on 26/08/17.
 */

@Entity
public class Anamnese {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        private Paciente paciente;

        @NotNull
        private Boolean tratamento;

        private String tratamentoUso;

        @NotNull
        private Boolean alergico;

        private String alergicoTipo;

        @NotNull
        private Boolean gravidez;

        @NotNull
        private Boolean diabetes;

        @NotNull
        private Boolean cardico;

        @NotNull
        private Boolean hipertenso;

        private String afericao;

        @NotNull
        private Boolean febril;

        private String febrilMedicao;


        public Long getId() {

                return id;
        }


        public void setId( Long id ) {

                this.id = id;
        }


        public Paciente getPaciente() {

                return paciente;
        }


        public void setPaciente( Paciente paciente ) {

                this.paciente = paciente;
        }


        public Boolean getTratamento() {

                return tratamento;
        }


        public void setTratamento( Boolean tratamento ) {

                this.tratamento = tratamento;
        }


        public String getTratamentoUso() {

                return tratamentoUso;
        }


        public void setTratamentoUso( String tratamentoUso ) {

                this.tratamentoUso = tratamentoUso;
        }


        public Boolean getAlergico() {

                return alergico;
        }


        public void setAlergico( Boolean alergico ) {

                this.alergico = alergico;
        }


        public String getAlergicoTipo() {

                return alergicoTipo;
        }


        public void setAlergicoTipo( String alergicoTipo ) {

                this.alergicoTipo = alergicoTipo;
        }


        public Boolean getGravidez() {

                return gravidez;
        }


        public void setGravidez( Boolean gravidez ) {

                this.gravidez = gravidez;
        }


        public Boolean getDiabetes() {

                return diabetes;
        }


        public void setDiabetes( Boolean diabetes ) {

                this.diabetes = diabetes;
        }


        public Boolean getCardico() {

                return cardico;
        }


        public void setCardico( Boolean cardico ) {

                this.cardico = cardico;
        }


        public Boolean getHipertenso() {

                return hipertenso;
        }


        public void setHipertenso( Boolean hipertenso ) {

                this.hipertenso = hipertenso;
        }


        public String getAfericao() {

                return afericao;
        }


        public void setAfericao( String afericao ) {

                this.afericao = afericao;
        }


        public Boolean getFebril() {

                return febril;
        }


        public void setFebril( Boolean febril ) {

                this.febril = febril;
        }


        public String getFebrilMedicao() {

                return febrilMedicao;
        }


        public void setFebrilMedicao( String febrilMedicao ) {

                this.febrilMedicao = febrilMedicao;
        }


        @Override public boolean equals( Object o ) {

                if ( this == o )
                        return true;
                if ( o == null || getClass() != o.getClass() )
                        return false;

                Anamnese anamnese = (Anamnese) o;

                return getId() != null ? getId().equals( anamnese.getId() ) : anamnese.getId() == null;
        }


        @Override public int hashCode() {

                return getId() != null ? getId().hashCode() : 0;
        }
}
