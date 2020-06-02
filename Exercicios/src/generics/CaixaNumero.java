package generics;

// Estou dizendo que obrigatoriamente o N devera herdar do Number
// Onde a responsabilidade do tipo tem restrições
public class CaixaNumero<N extends Number> extends Caixa<N> {

}
