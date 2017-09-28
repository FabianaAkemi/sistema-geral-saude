package steps;

import Base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class MedicoSteps extends BaseUtil
{

    private BaseUtil base;

    public MedicoSteps(BaseUtil base)
    {
        this.base = base;
    }

    public class Medico
    {
        public String nome;
        public Integer crm;
        public String especialidade;
        public String telefone;
        public String email;

        public Medico(String nome, Integer crm, String especialidade, String telefone, String email)
        {
            this.nome = nome;
            this.crm = crm;
            this.especialidade = especialidade;
            this.telefone = telefone;
            this.email = email;
        }
    }

    @Given("^eu clicar no botão Cadastrar MedicosThen eu devo visualizar a mensagem “Favor preencher o campo médico” em forma de alert no topo da página$")
    public void eu_clicar_no_botão_Cadastrar_MedicosThen_eu_devo_visualizar_a_mensagem_Favor_preencher_o_campo_médico_em_forma_de_alert_no_topo_da_página() throws Throwable {

    }

    @Given("^eu estar na pagina de cadastro do medico$")
    public void eu_estar_na_pagina_de_cadastro_do_medico() throws Throwable {

    }

    @Given("^eu digitar as informações de medico completas$")
    public void eu_digitar_as_informações_de_medico_completas(DataTable medico) throws Throwable {

        // UM TESTE
        List<Medico> medicos = new ArrayList<Medico>();
        medicos = medico.asList(Medico.class);

        for (Medico teste : medicos) {
            base.Driver.findElement(By.id("oi")).sendKeys(teste.email);
        }

    }

    @Then("^eu devo visualizar a mensagem “Médico salvo com sucesso”$")
    public void eu_devo_visualizar_a_mensagem_Médico_salvo_com_sucesso() throws Throwable {

    }

    @Given("^eu digitar todas  as informacoes exceto nome$")
    public void eu_digitar_todas_as_informacoes_exceto_nome(DataTable medico) throws Throwable {

    }

    @Then("^eu devo visualizar a mensagem “Favor preencher o campo nome” em forma de alert no topo da página$")
    public void eu_devo_visualizar_a_mensagem_Favor_preencher_o_campo_nome_em_forma_de_alert_no_topo_da_página() throws Throwable {

    }

    @Given("^eu digitar todas  as informacoes exceto CRM$")
    public void eu_digitar_todas_as_informacoes_exceto_CRM(DataTable medico) throws Throwable {

    }

    @Then("^eu devo visualizar a mensagem “Favor preencher o campo CRM” em forma de alert no topo da página$")
    public void eu_devo_visualizar_a_mensagem_Favor_preencher_o_campo_CRM_em_forma_de_alert_no_topo_da_página() throws Throwable {

    }

    @Given("^eu digitar todas  as informacoes exceto especialidade$")
    public void eu_digitar_todas_as_informacoes_exceto_especialidade(DataTable medico) throws Throwable {

    }

    @Then("^eu devo visualizar a mensagem “Favor preencher o campo especialidade” em forma de alert no topo da página$")
    public void eu_devo_visualizar_a_mensagem_Favor_preencher_o_campo_especialidade_em_forma_de_alert_no_topo_da_página() throws Throwable {

    }

    @Given("^eu digitar todas  as informacoes exceto telefone$")
    public void eu_digitar_todas_as_informacoes_exceto_telefone(DataTable medico) throws Throwable {

    }

    @Then("^eu devo visualizar a mensagem “Favor preencher o campo telefone” em forma de alert no topo da página$")
    public void eu_devo_visualizar_a_mensagem_Favor_preencher_o_campo_telefone_em_forma_de_alert_no_topo_da_página() throws Throwable {

    }

    @Given("^eu digitar todas  as informacoes exceto email$")
    public void eu_digitar_todas_as_informacoes_exceto_email(DataTable medico) throws Throwable {

    }

    @Then("^eu devo visualizar a mensagem “Favor preencher o campo email” em forma de alert no topo da página$")
    public void eu_devo_visualizar_a_mensagem_Favor_preencher_o_campo_email_em_forma_de_alert_no_topo_da_página() throws Throwable {

    }

    @Given("^eu clicar no botao salvar$")
    public void eu_clicar_no_botao_salvar() throws Throwable {

    }
}
