$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ConsultarProduto.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language:pt"
    },
    {
      "line": 2,
      "value": "#encoding UTF-8"
    }
  ],
  "line": 5,
  "name": "Consultar Produto",
  "description": "              Eu como usuario gostaria\r\n              de consultar um produto no site \r\n              da loja americanas",
  "id": "consultar-produto",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 4,
      "name": "@geral"
    }
  ]
});
formatter.scenario({
  "line": 10,
  "name": "Consultar produto no site",
  "description": "",
  "id": "consultar-produto;consultar-produto-no-site",
  "type": "scenario",
  "keyword": "Cenario"
});
formatter.step({
  "line": 11,
  "name": "que o usuario pesquise um produto",
  "keyword": "Dado "
});
formatter.step({
  "line": 12,
  "name": "eu clicar em pesquisar",
  "keyword": "Quando "
});
formatter.step({
  "line": 13,
  "name": "o site me traz o produto",
  "keyword": "Entao "
});
formatter.match({
  "location": "ConsultarProdutosSteps.que_o_usuario_pesquise_um_produto()"
});
formatter.result({
  "duration": 13850916200,
  "status": "passed"
});
formatter.match({
  "location": "ConsultarProdutosSteps.eu_clicar_em_pesquisar()"
});
formatter.result({
  "duration": 25100,
  "status": "passed"
});
formatter.match({
  "location": "ConsultarProdutosSteps.o_site_me_traz_o_produto()"
});
formatter.result({
  "duration": 15800,
  "status": "passed"
});
});