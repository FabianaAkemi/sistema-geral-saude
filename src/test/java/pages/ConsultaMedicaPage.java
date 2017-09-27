package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ConsultaMedicaPage {

    @FindBy(how = How.ID)
    public WebElement home;

    @FindBy(how = How.NAME)
    public WebElement teste;

    @FindBy(how = How.ID)
    public WebElement btnLogin;

    public void Clicklogin() {
       btnLogin.click();
    }

}
