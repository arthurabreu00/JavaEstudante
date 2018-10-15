package Quest02;

public class Comparavel {

	/*
	 * 1. ESCREVA UMA CLASSE CHAMADA �COMPARAVEL� QUE TEM COMO ATRIBUTO UM VALOR
	 * INTEIRO, UM CONSTRUTOR PARA INICIALIZAR O ATRIBUTO E OS M�TODOS
	 * EHMAIOROUIGUAL, EHMENOROUIGUAL E EHDIFERENTEDE QUE RECEBEM UM VALOR DO TIPO
	 * INT COMO PAR�METRO E RETORNAM TRUE SE O VALOR ENCAPSULADO FOR,
	 * RESPECTIVAMENTE, MAIOR OU IGUAL, MENOR OU IGUAL OU DIFERENTE DO PASSADO COMO
	 * PAR�METRO. FA�A UMA CLASSE TESTACOMPARAVEL QUE VOC� POSSA DIGITAR UM N�MERO E
	 * UTILIZAR OS M�TODOS.
	 */

	int valor;

	public Comparavel(int x) {

		this.valor = x;

	}

	public boolean ehMaiorOuIgual(int x) {

		if (this.valor >= x) {
			System.out.println(x + " � maior ou igual a " + this.valor);
			return true;
		}
		return false;

	}

	boolean ehMenorOuIgual(int x) {

		if (this.valor <= x) {
			System.out.println(x + " � menor ou igual a " + this.valor);
			return true;
		}
		return false;

	}

	boolean ehDiferente(int x) {

		if (this.valor != x) {
			System.out.println(x + " � diferente a " + this.valor);
			return true;
		}
		return false;

	}

}
