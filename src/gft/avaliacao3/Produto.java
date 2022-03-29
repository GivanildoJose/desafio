package gft.avaliacao3;

public class Produto {
	private String descricao;
	private Double valorReal;
	private Operacao operacao;
	private Integer percentual;
	private Double valorFinal;
	
	public Produto(String descricao, Double valorReal) {
		this.descricao = descricao;
		this.valorFinal = valorReal;
	}
	
	
	public void aplicarOperacao(Operacao operacao, Integer percentual) {
		if (percentual > 0) {
			switch (operacao) {
			case ACRESCIMO:
				this.valorFinal = this.valorReal + ()
				break;
			case DESCONTO:
				
				break;
			}
		} else {
			this.valorFinal = this.valorReal;
		}
		
		System.out.println(this.valorFinal);
	}
	

	
}
