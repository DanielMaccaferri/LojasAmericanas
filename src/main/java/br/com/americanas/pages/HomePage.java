package br.com.americanas.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.americanas.core.Driver;
import br.com.americanas.core.BasePage;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(id = "h_search-input")
	WebElement campoPesquisar;

	public HomePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	public WebElement getCampoPesquisar() {
		return campoPesquisar;
	}

	public void setCampoPesquisar(WebElement campoPesquisar) {
		this.campoPesquisar = campoPesquisar;
	}

}
