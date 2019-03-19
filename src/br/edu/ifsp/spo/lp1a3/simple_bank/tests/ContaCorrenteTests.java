package br.edu.ifsp.spo.lp1a3.simple_bank.tests;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

import br.edu.ifsp.spo.lp1a3.simple_bank.Conta;
import br.edu.ifsp.spo.lp1a3.simple_bank.ContaCorrente;

public class ContaCorrenteTests {
	
	@Test
	public void conta_corrente_deve_ser_uma_conta() {
		// 1. Configura��o
		// 2. Execu��o
		
		// 3. Valida��o / Asser��o
		assertThat(new ContaCorrente("Jo�o da Silva", "123-456"), instanceOf(Conta.class));
	}

}
