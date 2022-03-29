package gft.avaliacao1;

public class Caixa {
	public static void main(String... args) {
		CartaoBandeiraMaster masterCredito = new CartaoBandeiraMaster();
		masterCredito.pagamentoCredito();
		CartaoBandeiraMaster masterDebito = new CartaoBandeiraMaster();
		masterDebito.pagamentoDebito();
		
		CartaoBandeiraVisa visaCredito = new CartaoBandeiraVisa();
		visaCredito.pagamentoCredito();
		CartaoBandeiraVisa visaDebito = new CartaoBandeiraVisa();
		visaDebito.pagamentoDebito();
		
		
	}
}
