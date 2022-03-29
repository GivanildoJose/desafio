package gft.avaliacao3;

public class Executor {
	public static void main(String... args) {
		Produto produto = new Produto("Celular", 1500.00);
		produto.aplicarOperacao(Operacao.ACRESCIMO, 10);
		
		produto.aplicarOperacao(Operacao.DESCONTO, 50);
	}
}
