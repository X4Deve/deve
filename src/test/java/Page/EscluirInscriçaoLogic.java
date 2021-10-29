package Page;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Map.EscluirInscricaoPage;
import Setup.Configuracao;

public class EscluirInscriçaoLogic extends EscluirInscricaoPage {
//Static WebDriver driver;

//public static WebDriver getDriver() {
	//return driver;
//}

	public EscluirInscriçaoLogic() {
		PageFactory.initElements(Configuracao.getDriver(), this);
	}

	public void colocoDadosAcesso() {
		login.click();
			}
	
	public void colocodadosuser() throws InterruptedException {
		digitarEmail.sendKeys("fagner.d.mesio@gmail.com");
		proxima.click();
		ddigitarSenha.sendKeys("vpml9614");
		logar.click();
	}
	public void gerenciarInscricao() {
		btnGerenciar.click();
	}

	public void clicarGuiaInscricao() {
		guiaCancelar.click();
	}

	public void clicarNoBotalCancelar() {
		cancelarInscriçao.click();
	}

	public void concluirCancelamento() {
		cancelarInscriçao.click();
	}
}
