package Quest01;

public class TestarPorta {

	public static void main(String[] args) {

		/*
		 * CRIE UMA PORTA, ABRA E FECHE A MESMA, PINTE-A DE DIVERSAS CORES,
		 * ALTERE SUAS DIMENS�ES E USE O M�TODO: ESTAABERTA PARA VERIFICAR SE
		 * ELA EST� ABERTA OU N�O.
		 */
		
		Porta porta = new Porta();
		
		porta.abre();
		porta.fecha();
		String cor = "vermelho";
		porta.pinta(cor);
		porta.alteraDimensao(4,3);
		porta.estaAberta();
	
		porta.imprimir();
		

	}

}
