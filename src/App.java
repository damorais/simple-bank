import br.edu.ifsp.spo.lp1a3.simple_bank.ContaCorrente;
import br.edu.ifsp.spo.lp1a3.simple_bank.SaldoInsuficienteException;

public class App {

	public static void main(String[] args) {

		ContaCorrente conta = new ContaCorrente("Asdf", "1234", 50);
		
		double valorARetirar = 20000000;
		
		try {
			
			//Alguma coisa antes
			double resultado = conta.retirar(valorARetirar);
			//alguma coisa depois
			
		}catch(SaldoInsuficienteException ex) {
			System.out.println(ex.getMessage());
		}
		
		
		if((conta.getLimite() + conta.getSaldo()) < valorARetirar) {
			System.out.println("Saldo insuficiente");
		}else {
			//Alguma coisa antes
			conta.retirar(valorARetirar);
			//alguma coisa depois			
		}
		
		
		

	}

}
