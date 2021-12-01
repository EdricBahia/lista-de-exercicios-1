package Lista;

import javax.swing.JOptionPane;

public class Aluno {

	long matricula;
	String nome;
	double nota1;
	double nota2;
	double trabalho;
	double media;
	boolean aprovacao;
	public Aluno() {
		this.nota1 = 0;
		this.nota2 = 0;
		this.trabalho = 0;
	}
	public String adnome () {
			this.nome = JOptionPane.showInputDialog("Digite seu nome: ");
			return nome;
	}
	public long	admatricula () {
			this.matricula = Long.parseLong(JOptionPane.showInputDialog("Digite sua matrícula: "));
			return matricula;
	}
	public void adnota1 () {
		do {
			this.nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua primeira nota: "));
		}while (nota1<0  || nota1>10);
	}
	public void adnota2 () {
		do {
			this.nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite sua segundo nota: "));
		}while (nota2<0 || nota2>10);
	}
	public void trabalho () {
		do {
			this.trabalho = Double.parseDouble(JOptionPane.showInputDialog("Digite sua trabalho nota: "));
		} while (this.trabalho<0 || this.trabalho>10);
	}
	public double media () {
		this.media = ((nota1*2.5 + nota1*2.5 +trabalho*2)/7);
		return media;
	}
	public boolean getaprovado () {
		if (this.media < 6) {
			this.aprovacao = false;
			return this.aprovacao;
		}
		else {
			this.aprovacao = true;
			return this.aprovacao;
		}
}
	@Override
	public String toString() {
		return "Matricula = " + matricula + " \nNome = " + nome + " \nNota1 = " + nota1 + " \nNota2 = " + nota2
				+ "\nTrabalho = " + trabalho + " \nMedia = " + media + " \nAprovacao = " + aprovacao + "";
	}
	public static void main (String[] args) {
		Aluno a1 = new Aluno ();
		a1.adnome();
		a1.admatricula();
		a1.adnota1();
		a1.adnota2();
		a1.trabalho();
		a1.media();
		a1.getaprovado();
		System.out.println(a1);
		
	}
}	