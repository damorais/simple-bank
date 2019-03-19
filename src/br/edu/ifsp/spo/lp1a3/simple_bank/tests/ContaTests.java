package br.edu.ifsp.spo.lp1a3.simple_bank.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.edu.ifsp.spo.lp1a3.simple_bank.Conta;

class ContaTests {

	
	@Test
	void deve_conseguir_criar_uma_classe_conta_com_titular_e_numero() {
		// 1. Configura��o
		String titular = "Jo�o da Silva";
		String numeroConta = "001-002";
		
		// 2. Execu��o
		Conta conta = new Conta(titular, numeroConta);
		
		// 3. Valida��o / Asser��o
		assertNotNull(conta);
		assertEquals(titular, conta.getTitular());
		assertEquals(numeroConta, conta.getNumeroConta());
	}
	
	@Test
	void uma_nova_conta_deve_ter_saldo_zero() {
		//1. Configura��o
		Conta conta = new Conta("Jo�o da Silva", "123-456");
		
		//2. Execu��o
		double saldo = conta.getSaldo();
		
		//3. Valida��o / Asser��o
		assertEquals(0, saldo);
	}
	
	@Test
	void devo_conseguir_depositar_um_valor_na_conta() {
		//1. Configura��o
		Conta conta = new Conta("Jo�o da Silva", "123-456");
		double valorADepositar = 100;
		
		//2. Execu��o
		conta.depositar(valorADepositar);
		
		//3. Valida��o / Asser��o
		assertEquals(valorADepositar, conta.getSaldo());
	}
	
	@Test
	void devo_conseguir_retirar_um_valor_da_conta() {
		//1. Configura��o
		Conta conta = new Conta("Jo�o da Silva", "123-456");
		conta.depositar(100);
		double valorARetirar = 70;
		double saldoFinalEsperado = 30;
		
		//2. Execu��o
		double valorRetirado = conta.retirar(valorARetirar);
		
		//3. Valida��o / Asser��o
		assertEquals(valorARetirar, valorRetirado);
		assertEquals(saldoFinalEsperado, conta.getSaldo());
	}
}
