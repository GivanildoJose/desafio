package gft.avaliacao1;

public class CartaoBandeiraMaster implements PagamentoCartao {

	public CartaoBandeiraMaster() {
		System.out.println("Pago com Master");	
	}
	
	@Override
	public void pagamentoDebito() {
	System.out.println("D�bito");
		
	}

	@Override
	public void pagamentoCredito() {
		System.out.println("Cr�dito");
		
	}

}
