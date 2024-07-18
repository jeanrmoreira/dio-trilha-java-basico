
public class Main {

	public static void main(String[] args) {
		Cliente pedro = new Cliente();
		pedro.setNome("Pedro");
        pedro.setCpf("94859384672");
        pedro.setEmail("pedro@email.com");
        pedro.setGenero("Masculino");
        pedro.setTel("98847586");

		
		Conta cc = new ContaCorrente(pedro);
		Conta poupanca = new ContaPoupanca(pedro);

		cc.depositar(100);
		cc.sacar(20);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		cc.bloquearConta();
		poupanca.bloquearConta();
		cc.depositar(50);
		cc.sacar(10);
	}

}