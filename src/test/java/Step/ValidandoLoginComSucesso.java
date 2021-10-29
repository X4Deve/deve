package Step;

import Page.LoginPageComSucesso;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ValidandoLoginComSucesso {
	
	LoginPageComSucesso loginPage = new LoginPageComSucesso();
		
	
	@Given("que o usuario acesse a tela de login")
	public void que_o_usuario_estar_na_tela_de_login() throws Throwable {
		loginPage.validarSwagLabsHome();
	}
	
	
	@Given("que o usuario acesse a home da Swaglabs")
	public void que_o_usuario_acesse_a_home_da_swaglabs() throws Throwable {
		loginPage.validarSwagLabsHome();
		loginPage.EscreverUsuario();
		loginPage.EscreverSenha();
		loginPage.clicarBtnLogin();
		loginPage.validaLoginComSucesso();
	}
	

	@When("o usuario realizar login")
	public void o_usuario_realizar_login() throws Throwable {
		loginPage.EscreverUsuario();
		loginPage.EscreverSenha();
		loginPage.clicarBtnLogin();
	}
	

	@When("o usuario acessar o menu lateral")
	public void o_usuario_acessar_o_menu_lateral() throws Throwable {
		loginPage.clicarMenuLateral();
	}
	
	
	@When("o usuario filtrar menor para maior")
	public void o_usuario_filtrar_menor_para_maior() throws Throwable {
		loginPage.clicarOpcaoFiltro();
		loginPage.clicarMenorParaMaior();
	}
	

	@When("o usuario digitar a senha valida")
	public void o_usuario_digitar_a_senha_valida() throws Throwable {
		loginPage.digitarSenhaValida();
	}
	
	
	@Then("sera realizado o login bem sucedido")
	public void sera_realizado_login_com_sucesso() throws Throwable {
		loginPage.validaLoginComSucesso();
	}
	
	
	@Then("sera aberto o menu lateral")
	public void sera_aberto_o_menu_lateral() throws Throwable {
		loginPage.validarMenuBurguer();
	}
	
	
	@Then("sera realizado filtro nos produtos")
	public void sera_realizado_filtro_nos_produtos() throws Throwable {
		loginPage.validarFiltroMenorParaMaior();
	}
	
	
}
