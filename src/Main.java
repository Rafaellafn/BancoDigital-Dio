
public class Main {

	public static void main(String[] args) {
		Cliente maria = new Cliente();
		maria.setNome("Maria");
		
		
		
		Conta cc = new ContaCorrente(maria);
		Conta poupança = new ContaPoupança(maria);
		
		cc.depositar(200);
		cc.transferir(200, poupança);
		
	    cc.imprimirExtrato();
	    poupança.imprimirExtrato();
	
	}
}
