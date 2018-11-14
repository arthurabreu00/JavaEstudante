package escola;

public class DataNasciemto {
	/*
	 * CRIE UMA CLASSE CHAMADA DATANASCIMENTO PARA DEFINIR DIA, M�S E ANO TODOS
	 * ESSES ATRIBUTOS SER�O DO TIPO INTEIRO.
	 * 
	 * EM CADA CLASSE DEVER� POSSUIR O M�TODO MOSTRARDETALHES QUE IR� IMPRIMIR
	 * OS VALORES DOS ATRIBUTOS.
	 */

	private int dia;
	private int mes;
	private int ano;

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void MostrarDetalhes() {
		System.out.println("=-=-=-=-=-=-=  DATA DE NASCIMENTO =-=-=-=-=-=-=");
		System.out.println("Data de nascimento: " + this.dia + "/" + this.mes + "/" + this.ano);
	}

	/*
	 * NA CLASSE DATANASCIMENTO DEVER� CONTER O M�TODO HOJEANIVERS�RIO ONDE
	 * DEVER� SER PASSADO COMO PAR�METROS OS VALORES DE DIA ATUAL E M�S ATUAL E
	 * COMPARAR COM OS VALORES QUE EST�O NOS RESPECTIVOS ATRIBUTOS CASO
	 */
	
	public boolean hojeAniversario(int diaAtual, int mesAtual){
		String niver = this.dia + "-" + this.mes;
		String hoje = diaAtual + "-" + mesAtual;
		if(niver.equalsIgnoreCase(hoje)){
			return true;
		}
		
		return false;
	}

}
