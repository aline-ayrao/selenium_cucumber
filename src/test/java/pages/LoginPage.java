package pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    String EMAIL = "//input[@placeholder='Informe seu e-mail']";
    String SENHA = "//input[@placeholder='Informe sua senha']";
    String ACESSAR = "//button[contains(text(),'Acessar')]";

    public LoginPage(WebDriver driver){ //esse driver vem do teste
        this.driver = driver; //esse.drive recebe= drive que vem do teste
    }

    public void preencherEmail (String email){
        driver.findElement(By.xpath(EMAIL)).sendKeys(email);
    }

    public void preencherSenha (String senha){
        driver.findElement(By.xpath(SENHA)).sendKeys(senha);
    }

    public void clicarAcessar (){
        driver.findElement(By.xpath(ACESSAR)).click();
    }
}