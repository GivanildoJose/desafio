package gft.avaliacao1;

public class CartaoBandeiraVisa implements PagamentoCartao {

	public CartaoBandeiraVisa() {
		System.out.println("Pago com Visa");
	}
	
	@Override
	public void pagamentoDebito() {
		System.out.println("Débito");
		
	}

	@Override
	public void pagamentoCredito() {
		System.out.println("Crédito");
		
	}

}
