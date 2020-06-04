//Um modulo agrupa pacotes
module app.financeiro {
	// Implicito - vem por padrao
	requires java.base;
	
	// Declarando nosso modulo para utilizarmos as classes dele
	requires app.calculo;
}