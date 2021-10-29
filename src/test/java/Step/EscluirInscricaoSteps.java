package Step;

import Page.EscluirInscriçaoLogic;
//import Page.LoginPageComSucesso;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;

public class EscluirInscricaoSteps {

	EscluirInscriçaoLogic escluirInscricao = new EscluirInscriçaoLogic();
	//LoginPageComSucesso loginPage = new LoginPageComSucesso();
	
	
	@Given("acessei a tela do youtube")
	public void acessei_A_Tela_Do_Youtube() throws Throwable {
		//loginPage.validarSwagLabsHome();
		escluirInscricao.colocoDadosAcesso();
		escluirInscricao.colocodadosuser();
	}
	
	@Then("clico em inscrição")
	public void clico_em_inscrição() {
		escluirInscricao.clicarGuiaInscricao();
	}
	
	@Then("clico em gerenciar")
	public void clico_Em_gerenciar() {
		escluirInscricao.gerenciarInscricao();
		escluirInscricao.clicarNoBotalCancelar();
		escluirInscricao.concluirCancelamento();
	}
}
