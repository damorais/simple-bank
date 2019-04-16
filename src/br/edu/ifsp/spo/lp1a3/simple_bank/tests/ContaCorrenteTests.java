package br.edu.ifsp.spo.lp1a3.simple_bank.tests;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasProperty;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.hamcrest.beans.HasProperty;
//import static org.junit.Assert.assertThat;
import org.junit.jupiter.api.Test;

import br.edu.ifsp.spo.lp1a3.simple_bank.Conta;
import br.edu.ifsp.spo.lp1a3.simple_bank.ContaCorrente;
import br.edu.ifsp.spo.lp1a3.simple_bank.LimiteInvalidoException;
import br.edu.ifsp.spo.lp1a3.simple_bank.SaldoInsuficienteException;

public class ContaCorrenteTests {
	
	@Test
	public void conta_corrente_deve_ser_uma_conta() {
		// 1. Configuração
		// 2. Execução
		
		// 3. Validação / Asserção
		assertThat(new ContaCorrente("João da Silva", "123-456"), instanceOf(Conta.class));
	}
	
	@Test
	public void conta_corrente_deve_ter_um_limite() {
		// 1. Configuração
		ContaCorrente conta = new ContaCorrente("João da Silva", "123-456");
		
		// 2. Execução
		// 3. Validação / Asserção
		assertThat(conta, hasProperty("limite"));
	}
	
	@Test
	public void conta_corrente_deve_permitir_um_limite_inicial() {
		// 1. Configuração
		double limiteInicial = 100;
		// 2. Execução
		ContaCorrente conta = new ContaCorrente("João da Silva", "123-456", limiteInicial);
		// 3. Verificação
		assertEquals(limiteInicial, conta.getLimite());
	}
	
	@Test
	public void conta_corrente_nao_deve_permitir_limite_negativo() {
		double limiteInicial = -1;
		
		assertThrows(LimiteInvalidoException.class, () -> {
			new ContaCorrente("João da Silva", "123-456", limiteInicial);
		});
		
	}
	
	@Test
	public void conta_corrente_nao_deve_permitir_saque_maior_que_limite_com_saldo() {
		// 1. Configuração
		double limiteInicial = 100;
		double saldoInicial = 100;
		ContaCorrente conta = new ContaCorrente("João da Silva", "123-456", limiteInicial);
		conta.depositar(saldoInicial);
		// 2. Execução
		// 3. Verificação
		//Se eu sacar 201 ele deve informar que a operação é inválida
		assertThrows(SaldoInsuficienteException.class, () -> {
			conta.retirar(limiteInicial + saldoInicial + 1);
		});	
	}
}
