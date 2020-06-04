module app.calculo {
	exports br.com.coder.app.calculo;
	// O transitive passa para os que chamarem esse modulo acessarem o logger caso algum 
	// metodo de a referencia externalizada para ele
	requires transitive app.logging;
}