package Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginElementMap {

	@FindBy(id =  "login-button")
	protected WebElement BtnLogin;
	
	@FindBy(id =  "react-burger-menu-btn")
	protected WebElement BtnMenuLateral;
	
	@FindBy(id =  "inventory_sidebar_link")
	protected WebElement BtnAllItens;
	
	@FindBy(xpath =  "//select")
	protected WebElement BtnFiltro;
	
	@FindBy(xpath =  "//option[contains(text(),'Price (low to high)')]")
	protected WebElement BtnMenorParaMaior;
	
	@FindBy(xpath =  "(//div[@class='inventory_item_price'])[1]")
	protected WebElement txtProdutoMenorPreco;
	
	@FindBy(name =  "nationality")
	protected WebElement RdbNacionalidade;
	
	@FindBy(id =  "user-name")
	protected WebElement UserName;
	
	@FindBy(id =  "password")
	protected WebElement UserPassword;
	
	@FindBy(name =  "cpf")
	protected WebElement TxtCpf;
	
	@FindBy(id =  "senha")
	protected WebElement TxtSenha;
	
	@FindBy(id =  "login-button")
	protected WebElement BtnLoginModal;
	
	@FindBy(xpath =  "//h4")
	protected WebElement LoginLogo;
	
	@FindBy(xpath =  "//span[contains(text(),'Products')]")
	protected WebElement TxtProducts;
	
	@FindBy(xpath = "//*[@id=\"form-login\"]/div[1]/div/div/div[2]/div")
	protected WebElement nameLogin;
	
	
}
