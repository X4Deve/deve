package Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pages {

	@FindBy(xpath = ("//*[@class='icon-login icons']"))
	protected WebElement login;

	@FindBy(xpath = ("//*[@id='username']"))
	protected WebElement txtUser;

	@FindBy(xpath = ("//*[@id='password']"))
	protected WebElement txtPass;

	@FindBy(xpath = ("//*[@id='customer_login']/div[1]/form/input[3]"))
	protected WebElement btnLogin;

	@FindBy(xpath = ("//*[@id=\"tbay-header\"]/div[2]/div/div/div/div[2]/div/form/div/div/input[1]"))
	protected WebElement txtBusca;

	@FindBy(xpath = ("//*[@id='product_cat']/option[2]"))
	protected WebElement option;

	@FindBy(xpath = ("//*[@id='tbay-header']/div[2]/div/div/div/div[2]/div/form/div/div/div[2]/button"))
	protected WebElement search;

	@FindBy(xpath = ("//*[@id='content']/div[2]/div/div[1]/div/div[1]/figure/a/img[2]"))
	protected WebElement primeiroProduto;
	
	@FindBy(xpath = ("//*[@class='variable-item button-variable-item button-variable-item-XS']"))
	protected WebElement size;
	
	@FindBy(xpath = ("//*[@class='variable-item button-variable-item button-variable-item-Orange']"))
	protected WebElement  color;
	
	@FindBy(xpath = ("//*[@class='single_add_to_cart_button button alt']"))
	protected WebElement btnComprar;
	
	@FindBy(xpath = ("//*[@class='input-text qty text']"))
	protected WebElement QTD;
	
	@FindBy(css = ("#primary-menu > li.dropdown.menu-item-536.aligned-left > a"))
	protected WebElement homeDois;

	@FindBy(xpath = ("//*[@id='cart']/a"))
	protected WebElement carrinho;
	
	
	
}
