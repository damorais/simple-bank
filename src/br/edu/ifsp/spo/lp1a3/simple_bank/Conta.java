package br.edu.ifsp.spo.lp1a3.simple_bank;

public class Conta {
	
	private String titular;
	private String numeroConta;
	
	public String getTitular() {
		return this.titular;
	}
	
	public String getNumeroConta() {
		return this.numeroConta;
	}
	
	public Conta(String titular, String numeroConta) {
		this.titular = titular;
		this.numeroConta = numeroConta;
	}
}
