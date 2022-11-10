
public class ContaPoupança extends Conta {
	
	@Override
	public void imprimirExtrato() {
		System.out.println("*** Extrarto Conta Poupança ***");
		super.imprimirInforsComuns();
		
	}

}
