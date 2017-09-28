package steps;

import Base.BaseUtil;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import pages.PacientesPage;

import java.util.ArrayList;
import java.util.List;

public class ConsultaMedicaSteps extends BaseUtil {

    private BaseUtil base;

    public ConsultaMedicaSteps(BaseUtil base) {
        this.base = base;
    }

    public class Consulta {
        public String nomePaciente;
        public String nomeMedico;
        public String descricao;

        public Consulta(String nomePaciente, String nomeMedico, String descricao) {
            this.nomePaciente = nomePaciente;
            this.nomeMedico = nomeMedico;
            this.descricao = descricao;
        }
    }

    @Given("^eu estou na home do sistema$")
    public void eu_estou_na_home_do_sistema() throws Throwable {

    }

    @Given("^eu clicar no botão Cadastros$")
    public void eu_clicar_no_botão_Cadastros() throws Throwable {

    }

    @Given("^eu clicar no botão Cadastrar Consulta$")
    public void eu_clicar_no_botão_Cadastrar_Consulta() throws Throwable {

    }

    @Given("^eu digitar as informações completas$")
    public void eu_digitar_as_informações_completas(DataTable consulta) throws Throwable {

        // UM TESTE
        List<Consulta> consultas = new ArrayList<Consulta>();
        consultas = consulta.asList(Consulta.class);

        for (Consulta teste : consultas) {
            base.Driver.findElement(By.id("oi")).sendKeys(teste.descricao);
        }


    }

    @Given("^eu digitar as informações sem nome do medico$")
    public void eu_digitar_as_informações_sem_nome_do_medico(DataTable consulta) throws Throwable {

    }

    @Given("^eu digitar as informações sem nome do paciente$")
    public void eu_digitar_as_informações_sem_nome_do_paciente(DataTable consulta) throws Throwable {

    }

    @Given("^eu digitar as informações sem descricao$")
    public void eu_digitar_as_informações_sem_descricao(DataTable consulta) throws Throwable {

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

