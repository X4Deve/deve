package Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EscluirInscricaoPage {
	@FindBy(xpath = "//*[@id='endpoint']/tp-yt-paper-tooltip")
	protected WebElement guiaCancelar;

	protected By CancelarBtn = By.cssSelector(
			"#subscribe-button > ytd-subscribe-button-renderer > tp-yt-paper-button > yt-formatted-string");

	@FindBy(xpath = "//*[@id='text']")
	protected WebElement cancelarInscriçao;

	@FindBy(xpath = "//*[@id='text']['gerenciar']")
	protected WebElement btnGerenciar;

	@FindBy(xpath = "(//*[@class='style-scope ytd-button-renderer style-suggestive size-small'])")
	protected WebElement login;

	@FindBy(xpath = "//*[@id='view_container']/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div/div/ul/li[1]/div/div[1]/div/div[2]")
	protected WebElement clicarEmail;

	@FindBy(xpath = "//*[@id='password']/div[1]/div/div[1]/input")
	protected WebElement ddigitarSenha;

	@FindBy(xpath = "//*[@id=\"identifierId\"]")
	protected WebElement digitarEmail;

	@FindBy(xpath = "//*[@id='identifierNext']/div/button/span")
	protected WebElement proxima;
	
	@FindBy(xpath = "//*[@id='passwordNext']/div/button/span")
	protected WebElement logar;
}
