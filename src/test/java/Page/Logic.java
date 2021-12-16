package Page;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Map.Pages;
import Setup.TestRule;


public class Logic extends Pages {
	static WebDriver driver;

	public static WebDriver getDriver() {
		return driver;
	}

	public Logic() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}

	public void acesseiHome() throws Throwable {
		homeDois.click();
		Thread.sleep(5000);
	}

	public void fazerLogin() throws Throwable {
		txtUser.sendKeys("roberto.nascimento@hotmail.com");
		Thread.sleep(5000);
		txtPass.sendKeys("Roberto");
		Thread.sleep(5000);
		btnLogin.click();
	}

	public void buscarProduto() throws InterruptedException {
		txtBusca.sendKeys("ingrid");
		txtBusca.submit();
	}

	public void clicoPrimeiroItemLista() throws InterruptedException {
		size.click();
		color.click();
		QTD.clear();
		QTD.sendKeys("2");
	}

	public void clicoEmComprar() throws Throwable {
		btnComprar.click();
		Thread.sleep(5000);
		carrinho.click();
		assertTrue(carrinho.isDisplayed());
	
	}

}
