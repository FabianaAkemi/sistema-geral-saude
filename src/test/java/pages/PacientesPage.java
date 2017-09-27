package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PacientesPage {

    @FindBy(how = How.ID)
    public WebElement nome;

    @FindBy(how = How.ID)
    public WebElement cpf;

    @FindBy(how = How.ID)
    public WebElement telefone;

    @FindBy(how = How.ID)
    public WebElement email;

    @FindBy(how = How.ID)
    public WebElement logradouro;

    @FindBy(how = How.ID)
    public WebElement numero;

    @FindBy(how = How.ID)
    public WebElement complemento;

    @FindBy(how = How.ID)
    public WebElement cep;

    @FindBy(how = How.ID)
    public WebElement cidadeUf;

    @FindBy(how = How.ID)
    public WebElement salvar;


    public void ClickSalvar() {

        salvar.submit();

    }
}
