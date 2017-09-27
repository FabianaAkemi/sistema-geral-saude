package steps;

import Base.BaseUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.PacientesPage;

public class ConsultaMedicaSteps extends BaseUtil {

    private BaseUtil base;

    public ConsultaMedicaSteps(BaseUtil base) {
        this.base = base;
    }

    @Given("^eu estou na home do sistema$")
    public void eu_estou_na_home_do_sistema() throws Throwable {

        PacientesPage pacientes = new PacientesPage();

    }

    @Given("^eu clicar no botão Cadastros$")
    public void eu_clicar_no_botão_Cadastros() throws Throwable {

    }

    @Given("^eu clicar no botão Cadastrar Consulta$")
    public void eu_clicar_no_botão_Cadastrar_Consulta() throws Throwable {

    }

    @Given("^eu digitar o nome do paciente$")
    public void eu_digitar_o_nome_do_paciente() throws Throwable {

    }

    @Given("^eu digitar o nome do medico$")
    public void eu_digitar_o_nome_do_medico() throws Throwable {

    }

    @Given("^eu digitar a descrição da consulta$")
    public void eu_digitar_a_descrição_da_consulta() throws Throwable {

    }

    @Given("^eu clicar no botão Salvar$")
    public void eu_clicar_no_botão_Salvar() throws Throwable {

    }

    @Then("^eu devo visualizar a mensagem “Consulta salva com sucesso”$")
    public void eu_devo_visualizar_a_mensagem_Consulta_salva_com_sucesso() throws Throwable {

    }

    @Then("^eu devo visualizar a mensagem “Favor preencher o campo médico” em forma de alert no topo da página$")
    public void eu_devo_visualizar_a_mensagem_Favor_preencher_o_campo_médico_em_forma_de_alert_no_topo_da_página() throws Throwable {

    }

    @Then("^eu devo visualizar a mensagem “Favor preencher o campo paciente” em forma de alert no topo da página$")
    public void eu_devo_visualizar_a_mensagem_Favor_preencher_o_campo_paciente_em_forma_de_alert_no_topo_da_página() throws Throwable {

    }

    @Then("^eu devo visualizar a mensagem “Favor preencher o campo descrição da consulta” em forma de alert no topo da página$")
    public void eu_devo_visualizar_a_mensagem_Favor_preencher_o_campo_descrição_da_consulta_em_forma_de_alert_no_topo_da_página() throws Throwable {

    }

}

