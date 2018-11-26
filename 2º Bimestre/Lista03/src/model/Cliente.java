package model ;

public class Cliente extends Pessoa {

	private int numeroContrato;

	public int getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(int numeroContrato) {
		this.numeroContrato = numeroContrato;
	}
	
	@Override
	public void imprimirInformacoes(){
		super.imprimirInformacoes();
		System.out.println("--------------- CLIENTE ---------------");
		System.out.println("N�mero do contrato " + this.numeroContrato);
	}
	
}
