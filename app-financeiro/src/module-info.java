
//Um modulo agrupa pacotes
module app.financeiro {
	// Implicito - vem por padrao
	requires java.base;
	
	// Declarando nosso modulo para utilizarmos as classes dele
	requires app.api;
	
	// Estamos utilizando a Interface e ele ira carregar a implementação
	uses br.com.coder.app.Calculadora;
}