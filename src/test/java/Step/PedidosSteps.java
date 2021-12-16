package Step;

import Page.Logic;
import Setup.Utils;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class PedidosSteps {
	Logic logic = new Logic();

	@Dado("acesso home")
	public void acesso_Home() throws Throwable {
		logic.fazerLogin();
		logic.acesseiHome();
	}

	@Quando("busco o produto por nome")
	public void busco_O_Produto_Por_Nome() throws Throwable {
		logic.buscarProduto();
	}

	@Então("clico em comprar")
	public void clico_Em_Comprar() throws Throwable {
		logic.clicoPrimeiroItemLista();
	}

	@Então("valido compra")
	public void valido_compra() throws Throwable {
		logic.clicoEmComprar();
		Utils.logPrint("Carrinho com Produtos");
	}
}
