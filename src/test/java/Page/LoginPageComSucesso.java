package Page;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Map.LoginElementMap;
import Setup.TestRule;

public class LoginPageComSucesso extends LoginElementMap{
	static WebDriver driver;
	
	public LoginPageComSucesso() {
PageFactory.initElements(TestRule.getDriver(), this);
	}
	
	
	public void clicarBtnLogin() {
		BtnLogin.click();
	}
	
	public void clicarMenuLateral() {
		BtnMenuLateral.click();
	}
	
	public void clicarOpcaoFiltro() {
		BtnFiltro.click();
	}
	
	public void clicarMenorParaMaior() {
		BtnMenorParaMaior.click();
	}
	
	public void EscreverUsuario() throws InterruptedException {
		UserName.sendKeys("standard_user");
	}
	
	public void EscreverSenha() throws InterruptedException {
		UserPassword.sendKeys("secret_sauce");
	}

	public void digitarCpfValido() {
		TxtCpf.sendKeys("18816364530");
	}
	
	public void digitarSenhaValida() {
		TxtSenha.sendKeys("123456");
	}
	
	
	public void validaLoginComSucesso() throws Exception {
		TxtProducts.isDisplayed();
	}
	
	
	public void validarMenuBurguer() throws Exception {
		BtnAllItens.isDisplayed();
	}
	
	
	public void validarFiltroMenorParaMaior() throws Exception {
		String getMenorPreco = txtProdutoMenorPreco.getText();
		assertEquals("$7.99", getMenorPreco);
	}
	
	
	public void validarSwagLabsHome() throws Exception {
		//String getLogo = LoginLogo.getText();
		//assertEquals("Accepted usernames are:", getLogo);
		LoginLogo.isDisplayed();
//		String LoginLogo = driver.findElement(By.xpath("login_logo")).getText();
//        assertEquals("texto-esperado", LoginLogo);
		
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
}
