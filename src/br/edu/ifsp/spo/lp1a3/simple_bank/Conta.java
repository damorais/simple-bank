package br.edu.ifsp.spo.lp1a3.simple_bank;

public class Conta {
	
	private String titular;
	private String numeroConta;
	private double saldo;
	
	public String getTitular() {
		return this.titular;
	}
	
	public String getNumeroConta() {
		return this.numeroConta;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public Conta(String titular, String numeroConta) {
		this.titular = titular;
		this.numeroConta = numeroConta;
	}

	public void depositar(double valor) { 
		this.saldo = this.saldo + valor;
	}

	public double retirar(double valor) {
		this.saldo = this.saldo - valor;	
		return valor;
	}

	public void transferirPara(Conta contaDestino, double valorATransferir) throws SaldoInsuficienteException {
		double valor = this.retirar(valorATransferir);
		contaDestino.depositar(valor);
	}
}
