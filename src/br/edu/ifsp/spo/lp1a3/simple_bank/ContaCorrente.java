package br.edu.ifsp.spo.lp1a3.simple_bank;

public class ContaCorrente extends Conta {
	
	private double limite;
	
	public double getLimite() {
		return this.limite;
	}
	
	public ContaCorrente(String titular, String numeroConta) {
		super(titular, numeroConta);
	}

	public ContaCorrente(String titular, String numeroConta, double limiteInicial) {
		this(titular, numeroConta);
		
		if(limiteInicial < 0)
			throw new LimiteInvalidoException("O limite não pode ser um valor negativo");
		
		this.limite = limiteInicial;
	}
	
	@Override
	public double retirar(double valor){
		
		if(valor + this.getLimite() > this.getSaldo() + this.getLimite())
			throw new SaldoInsuficienteException();
		
		return super.retirar(valor);
	}
	
}
