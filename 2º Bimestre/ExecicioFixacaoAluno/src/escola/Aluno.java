package escola;

public class Aluno {
	/*
	 * CRIE UMA CLASSE CHAMADA ALUNO PARA DEFINIR OS OBJETOS QUE REPRESENTAR�O
	 * OS ALUNOS DE UMA ESCOLA. NESSA CLASSE, DECLARE OS ATRIBUTOS: O PRIMEIRO
	 * PARA O NOME, O SEGUNDO PARA O RG E O TERCEIRO PARA A DATA DE NASCIMENTO
	 * DOS ALUNOS E O QUARTO PARA TURMA.
	 * 
	 * EM CADA CLASSE DEVER� POSSUIR O M�TODO MOSTRARDETALHES QUE IR� IMPRIMIR
	 * OS VALORES DOS ATRIBUTOS.
	 * 
	 */

	private String nome;
	private String rg;
	private DataNasciemto dataNasc;
	private Turma turma;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public DataNasciemto getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(DataNasciemto dataNasc) {
		this.dataNasc = dataNasc;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public void mostrarDetalhes() {
		System.out.println("=-=-=-=-=-=-=   =-=-=-=-=-=-=");
		System.out.println("Nome: " + this.nome);
		System.out.println("RG: " + this.rg);
	}

	/*
	 * NA CLASSE ALUNO DEVER� CONTER O M�TODO VERIFICARIDADE ONDE ESSE M�TODO
	 * RECEBER� O ANO ATUAL E SUBTRAIR� O ATRIBUTO ANO E ASSIM RETORNAR� A IDADE
	 * DO ALUNO.
	 */

	public int verificaridade(int anoAtual) {
		return dataNasc.getAno() - anoAtual;
	}
	
	/*
	 * AINDA NA CLASSE ALUNO CRIAR UM M�TODO PARA ASSOCIAR ALUNO A TURMA, ESSE
	 * M�TODO DEVER� VERIFICAR SE O ALUNO J� FOI ASSOCIADO A UMA TURMA CASO N�O
	 * DEVER� SER ASSOCIADO CASO SIM N�O PODER� SER ASSOCIADO NOVAMENTE.
	 */

	public void associarAluno(Turma turma) {
		
		if (this.turma == null) {
			this.turma = turma;
			System.out.println("Aluno associado com sucesso !");
		}else{
			System.out.println("Aluno j� associado a uma turma !");
		}
		
	}
	
	

}
