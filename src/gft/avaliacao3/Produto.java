package gft.avaliacao3;

public class Produto {
	private String descricao;
	private Double valorReal;
	private Operacao operacao;
	private Integer percentual;
	private Double valorFinal;
	
	public Produto(String descricao, Double valorReal) {
		this.descricao = descricao;
		this.valorReal = valorReal;
	}
	
	
	public void aplicarOperacao(Operacao operacao, Integer percentual) {
		if (percentual > 0) {
			Double valorComPorcentagem =  this.valorReal * (percentual/100.0);
			switch (operacao) {
				case ACRESCIMO:
					this.valorFinal = this.valorReal + valorComPorcentagem;
					break;
				case DESCONTO:
					this.valorFinal = this.valorReal - valorComPorcentagem;
					break;
			}
		} else {
			this.valorFinal = this.valorReal;
		}
		
		System.out.println(this.valorFinal);
	}
	

	
}
