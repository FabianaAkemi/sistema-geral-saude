package com.tcc.model;


import javax.persistence.Entity;


/**
 * Created by akemi on 02/03/17.
 */
@Entity
public class Triagem {

        private Long id;

        private Medico medico;

        private Paciente paciente;

        private Boolean dorCabeca;

        private Boolean articulacao;

        private Boolean dorCorpo;

        private Boolean calafrio;

        private Boolean febre;

        private String temperaturaFebre;

        private Boolean sonolencia;

        private Boolean problemaRespiratorio;

        private String citacaoProblemaRespiratorio;

        private Boolean problemaNeurologico;

        private String citacaoProblemaNeurologico;

        private Boolean problemaCardiaco;

        private String citacaoProblemaCardiaco;

        private Boolean renal;

        private Boolean motor;

        private Boolean dst;

        private String citacaoDst;

        private Boolean cancer;

        private String citacaoCancer;

        private Boolean hepatite;

        private Boolean diabeletes;

        private Boolean hipertensao;

        private Boolean alergia;

        private String citacaoAlegria;

        private Boolean deficiencia;

        private Boolean medicacao;

        private String citacaoMedicacao;

        private Boolean outros;

        private String citacaoOutros;


        public Long getId() {

                return id;
        }


        public void setId( Long id ) {

                this.id = id;
        }


        public Medico getMedico() {

                return medico;
        }


        public void setMedico( Medico medico ) {

                this.medico = medico;
        }


        public Paciente getPaciente() {

                return paciente;
        }


        public void setPaciente( Paciente paciente ) {

                this.paciente = paciente;
        }


        public Boolean getDorCabeca() {

                return dorCabeca;
        }


        public void setDorCabeca( Boolean dorCabeca ) {

                this.dorCabeca = dorCabeca;
        }


        public Boolean getArticulacao() {

                return articulacao;
        }


        public void setArticulacao( Boolean articulacao ) {

                this.articulacao = articulacao;
        }


        public Boolean getDorCorpo() {

                return dorCorpo;
        }


        public void setDorCorpo( Boolean dorCorpo ) {

                this.dorCorpo = dorCorpo;
        }


        public Boolean getCalafrio() {

                return calafrio;
        }


        public void setCalafrio( Boolean calafrio ) {

                this.calafrio = calafrio;
        }


        public Boolean getFebre() {

                return febre;
        }


        public void setFebre( Boolean febre ) {

                this.febre = febre;
        }


        public String getTemperaturaFebre() {

                return temperaturaFebre;
        }


        public void setTemperaturaFebre( String temperaturaFebre ) {

                this.temperaturaFebre = temperaturaFebre;
        }


        public Boolean getSonolencia() {

                return sonolencia;
        }


        public void setSonolencia( Boolean sonolencia ) {

                this.sonolencia = sonolencia;
        }


        public Boolean getProblemaRespiratorio() {

                return problemaRespiratorio;
        }


        public void setProblemaRespiratorio( Boolean problemaRespiratorio ) {

                this.problemaRespiratorio = problemaRespiratorio;
        }


        public String getCitacaoProblemaRespiratorio() {

                return citacaoProblemaRespiratorio;
        }


        public void setCitacaoProblemaRespiratorio( String citacaoProblemaRespiratorio ) {

                this.citacaoProblemaRespiratorio = citacaoProblemaRespiratorio;
        }


        public Boolean getProblemaNeurologico() {

                return problemaNeurologico;
        }


        public void setProblemaNeurologico( Boolean problemaNeurologico ) {

                this.problemaNeurologico = problemaNeurologico;
        }


        public String getCitacaoProblemaNeurologico() {

                return citacaoProblemaNeurologico;
        }


        public void setCitacaoProblemaNeurologico( String citacaoProblemaNeurologico ) {

                this.citacaoProblemaNeurologico = citacaoProblemaNeurologico;
        }


        public Boolean getProblemaCardiaco() {

                return problemaCardiaco;
        }


        public void setProblemaCardiaco( Boolean problemaCardiaco ) {

                this.problemaCardiaco = problemaCardiaco;
        }


        public String getCitacaoProblemaCardiaco() {

                return citacaoProblemaCardiaco;
        }


        public void setCitacaoProblemaCardiaco( String citacaoProblemaCardiaco ) {

                this.citacaoProblemaCardiaco = citacaoProblemaCardiaco;
        }


        public Boolean getRenal() {

                return renal;
        }


        public void setRenal( Boolean renal ) {

                this.renal = renal;
        }


        public Boolean getMotor() {

                return motor;
        }


        public void setMotor( Boolean motor ) {

                this.motor = motor;
        }


        public Boolean getDst() {

                return dst;
        }


        public void setDst( Boolean dst ) {

                this.dst = dst;
        }


        public String getCitacaoDst() {

                return citacaoDst;
        }


        public void setCitacaoDst( String citacaoDst ) {

                this.citacaoDst = citacaoDst;
        }


        public Boolean getCancer() {

                return cancer;
        }


        public void setCancer( Boolean cancer ) {

                this.cancer = cancer;
        }


        public String getCitacaoCancer() {

                return citacaoCancer;
        }


        public void setCitacaoCancer( String citacaoCancer ) {

                this.citacaoCancer = citacaoCancer;
        }


        public Boolean getHepatite() {

                return hepatite;
        }


        public void setHepatite( Boolean hepatite ) {

                this.hepatite = hepatite;
        }


        public Boolean getDiabeletes() {

                return diabeletes;
        }


        public void setDiabeletes( Boolean diabeletes ) {

                this.diabeletes = diabeletes;
        }


        public Boolean getHipertensao() {

                return hipertensao;
        }


        public void setHipertensao( Boolean hipertensao ) {

                this.hipertensao = hipertensao;
        }


        public Boolean getAlergia() {

                return alergia;
        }


        public void setAlergia( Boolean alergia ) {

                this.alergia = alergia;
        }


        public String getCitacaoAlegria() {

                return citacaoAlegria;
        }


        public void setCitacaoAlegria( String citacaoAlegria ) {

                this.citacaoAlegria = citacaoAlegria;
        }


        public Boolean getDeficiencia() {

                return deficiencia;
        }


        public void setDeficiencia( Boolean deficiencia ) {

                this.deficiencia = deficiencia;
        }


        public Boolean getMedicacao() {

                return medicacao;
        }


        public void setMedicacao( Boolean medicacao ) {

                this.medicacao = medicacao;
        }


        public String getCitacaoMedicacao() {

                return citacaoMedicacao;
        }


        public void setCitacaoMedicacao( String citacaoMedicacao ) {

                this.citacaoMedicacao = citacaoMedicacao;
        }


        public Boolean getOutros() {

                return outros;
        }


        public void setOutros( Boolean outros ) {

                this.outros = outros;
        }


        public String getCitacaoOutros() {

                return citacaoOutros;
        }


        public void setCitacaoOutros( String citacaoOutros ) {

                this.citacaoOutros = citacaoOutros;
        }


        @Override public boolean equals( Object o ) {

                if ( this == o )
                        return true;
                if ( o == null || getClass() != o.getClass() )
                        return false;

                Triagem triagem = (Triagem) o;

                return getId() != null ? getId().equals( triagem.getId() ) : triagem.getId() == null;
        }


        @Override public int hashCode() {

                return getId() != null ? getId().hashCode() : 0;
        }
}
