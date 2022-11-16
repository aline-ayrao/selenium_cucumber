package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CadastroPage {
    WebDriver driver;

    String EMAIL = "//input[@id='inputEmail']";  //nome em maiusculo significa que é uma variavel q não vai sofrer alteração, por isso deixamos em maisculo
    String NOME = "//input[@id='inputName']";
    String SENHA = "//input[@id='inputPassword']";
    String CONFIRM_SENHA = "//input[@id='inputPasswordConfirmation']";
    String CRIAR_SALDO = "//input[@id='toggleAddBalance']";
    String CADASTRAR = "//a[@id='btnRegister']";
    String FECHAR = "a[contains(text(),'fechar')]";

    public CadastroPage(WebDriver driverParametro){
        this.driver = driverParametro;
    }

    public void preencherEmail(String email){
        driver.findElement(By.xpath(EMAIL)).sendKeys(email);
    }

    public void preencherNome(String nome){
        driver.findElement(By.xpath(NOME)).sendKeys(nome);
    }

    public void preencherSenha(String senha){
        driver.findElement(By.xpath(SENHA)).sendKeys(senha);
    }

    public void preencherConfirmaSenha(String confirma){
        driver.findElement(By.xpath(CONFIRM_SENHA)).sendKeys(confirma);;
    }

    public void clicarCriarComSaldo(){
        driver.findElement(By.xpath(CRIAR_SALDO)).click();
    }

    public void clicarCadastrar(){
        driver.findElement(By.xpath(CADASTRAR)).click();
    }

    public void clicarFechar(){
        driver.findElement(By.xpath(FECHAR)).click();
    }

}