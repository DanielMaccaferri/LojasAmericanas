package br.com.americanas.steps;

import static br.com.americanas.core.Driver.getDriver;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class ConsultarProdutosSteps {
	
	String url = "https://www.americanas.com.br/";
	
	@Dado("^que o usuario pesquise um produto$")
	public void que_o_usuario_pesquise_um_produto() throws Throwable {
		getDriver().get(url);
	}

	@Quando("^eu clicar em pesquisar$")
	public void eu_clicar_em_pesquisar() throws Throwable {
	  
	}

	@Entao("^o site me traz o produto$")
	public void o_site_me_traz_o_produto() throws Throwable {
	  
	}

}
