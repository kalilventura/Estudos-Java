// Utilizando o open ele habilita o uso de reflection
open module app.calculo {
	exports br.com.coder.app.calculo;
	// O transitive passa para os que chamarem esse modulo acessarem o logger caso algum 
	// metodo de a referencia externalizada para ele
	requires transitive app.logging;
	
	// Exports ... To ... habilita que o modulo financeiro consiga enxergar o interno
	//Obs: Somente o financeiro vai conseguir acessar, caso outro modulo tente ele nao vai conseguir
	//Caso mais de um modulo precise acessar é só dividir por virgula
	//Ex: to app.financeiro, app.logging
	exports br.com.coder.app.calculo.interno to app.financeiro;
	
	// Outra maneira de abrir para utilizacao de reflection
	// opens br.com.coder.app.calculo.interno to app.financeiro, app.logging;

	requires app.api;
	
	// Nossa classe CalculadoraImpl é uma implementação da interface Calculadora
	provides br.com.coder.app.Calculadora with br.com.coder.app.calculo.CalculadoraImpl;
}