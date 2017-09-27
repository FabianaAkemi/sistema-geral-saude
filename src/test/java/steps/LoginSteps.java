package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginSteps {

    WebDriver driver;

    @Given("^eu acessar a tela de login do sistema$")
    public void eu_acessar_a_tela_de_login_do_sistema() throws Throwable {



    }

    @Given("^eu digitar o e-mail do usuário corretamente$")
    public void eu_digitar_o_e_mail_do_usuário_corretamente() throws Throwable {

        driver.findElement(By.id("")).sendKeys("");
    }

    @Given("^eu digitar a senha do usuário corretamente$")
    public void eu_digitar_a_senha_do_usuário_corretamente() throws Throwable {

        driver.findElement(By.id("")).sendKeys("");
    }

    @Given("^eu clicar no botão Acessar$")
    public void eu_clicar_no_botão_Acessar() throws Throwable {

        driver.findElement(By.id("")).click();
    }

    @Then("^eu devo ser direcionado para a home do sistema$")
    public void eu_devo_ser_direcionado_para_a_home_do_sistema() throws Throwable {

    }

    @Given("^eu digitar o e-mail do usuário incorretamente$")
    public void eu_digitar_o_e_mail_do_usuário_incorretamente() throws Throwable {

        driver.findElement(By.id("")).sendKeys("");
    }

    @Then("^eu devo visualizar a mensagem ”E-mail e/ou senha incorretos” em forma de alert acima do botão Acessar$")
    public void eu_devo_visualizar_a_mensagem_E_mail_e_ou_senha_incorretos_em_forma_de_alert_acima_do_botão_Acessar() throws Throwable {

    }

    @Given("^eu digitar a senha do usuário incorretamente$")
    public void eu_digitar_a_senha_do_usuário_incorretamente() throws Throwable {

        driver.findElement(By.id("")).sendKeys("");
    }

    @Then("^eu devo visualizar a mensagem ”O campo e-mail é obrigatório” em forma de alert acima do botão Acessar$")
    public void eu_devo_visualizar_a_mensagem_O_campo_e_mail_é_obrigatório_em_forma_de_alert_acima_do_botão_Acessar() throws Throwable {

    }

    @Then("^eu devo visualizar a mensagem ”O campo senha é obrigatório” em forma de alert acima do botão Acessar$")
    public void eu_devo_visualizar_a_mensagem_O_campo_senha_é_obrigatório_em_forma_de_alert_acima_do_botão_Acessar() throws Throwable {

    }

    @Given("^eu digitar o e-mail do usuário com dados invalidos \\(sem o @ por exemplo\\)$")
    public void eu_digitar_o_e_mail_do_usuário_com_dados_invalidos_sem_o_por_exemplo() throws Throwable {

        driver.findElement(By.id("")).sendKeys("");

    }

    @Then("^eu devo visualizar a mensagem ”Email inválido” em forma de alert acima do botão Acessar \\(considerar mensagem padrão do thymeleaf\\)$")
    public void eu_devo_visualizar_a_mensagem_Email_inválido_em_forma_de_alert_acima_do_botão_Acessar_considerar_mensagem_padrão_do_thymeleaf() throws Throwable {

    }
}
