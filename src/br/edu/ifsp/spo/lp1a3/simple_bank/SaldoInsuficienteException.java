package br.edu.ifsp.spo.lp1a3.simple_bank;

public class SaldoInsuficienteException extends RuntimeException {
	
	public SaldoInsuficienteException() {
		super("Saldo insuficiente para realizar a operação");
	}
	
	public SaldoInsuficienteException(String message) {
		super(message);
	}
	
	private static final long serialVersionUID = 6610745721503784134L;

}
