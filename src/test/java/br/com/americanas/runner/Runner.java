package br.com.americanas.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import br.com.americanas.core.Driver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(glue = { "br.com.americanas" }, features = {
		"src/main/java/br/com/americanas/feature" }, plugin = { "pretty",
				"html:target/cucumber-reports" }, tags = { "~@ignore", "@geral" })

public class Runner {

	@AfterClass
	public static void encerraTeste() {
		Driver.encerraDriver();
	}

}
