package heran�a;

public class Main {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		
		gerente.setNome("Jo�o");
		gerente.setCpf("020.938.020");
		gerente.setSalario(10000);
		
		System.out.println(gerente.getBonificacao());
	}

}
