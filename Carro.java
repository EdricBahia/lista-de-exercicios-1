package Lista;

import javax.swing.JOptionPane;

public class Carro {

	private String modelo;
	private String cor;
	private int ano;
	private String marca;
	private int velocidade;
	private int c;
	
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public Carro (String marca) {
		this.velocidade = 0;
	}
	public Carro() {
		// TODO Auto-generated constructor stub
	}
	public void ctrlvelocidade() {	
		do {
		c = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para acelerar e -1 para desacelerar: (Se colocar outro número ele irá repetir)"));
		if (c == 1) {
			this.velocidade = this.velocidade + 5;
		}
		if (c == -1) {
			this.velocidade = this.velocidade - 5;
		}
		if (this.velocidade < 0) {
			JOptionPane.showMessageDialog(null, "Velocidade mínima alcançada");
			this.velocidade = 0;
		}
		if (this.velocidade >5) {
			JOptionPane.showMessageDialog(null, "Velocidade máxima alcançada");
			this.velocidade = 50;
		}
		}while (c != 1 && c != -1);
	}

	public void frear() {	
		do {
		c = Integer.parseInt(JOptionPane.showInputDialog("Deseja frear (1 pra sim e 2 para não)"));
		if (c == 1) {
			this.velocidade = 0;
		}
		if (c == 2) {
		JOptionPane.showMessageDialog(null, "Em movimento");
		}
		}while (c != 1 && c != 2);
	}
	public String admodelo() {
		modelo = JOptionPane.showInputDialog( "Digite o modelo do carro");
		return this.modelo;
	}
	public String admarca() {
		marca = JOptionPane.showInputDialog( "Digite o marca do carro");
		return this.marca;
	}
	public String adcor() {
		cor = JOptionPane.showInputDialog( "Digite a cor do carro");
		return this.cor;
	}
	public int adano() {
		ano = Integer.parseInt(JOptionPane.showInputDialog( "Digite o ano do carro"));
		return this.ano;
	}
	

@Override
	public String toString() {
		return "Carro modelo=" + modelo + "\ncor=" + cor + "\nano=" + ano + "\nmarca=" + marca + "\nvelocidade="
				+ velocidade;
	}
public static void main (String[]args) {
	int co;
	Carro c = new Carro ();
	do {
	c.ctrlvelocidade();
	System.out.println(c.toString());
	c.frear();
	co = Integer.parseInt(JOptionPane.showInputDialog( "Deseja continuar dirigindo? 1- sim e 2 - não"));
	}while (co == 1);
	c.admodelo();
	c.admarca();
	c.adcor();
	c.adano();
	JOptionPane.showMessageDialog (null, "Os status do carro estão como: 	\nModelo: "+c.getModelo() + "\nMarca:" + c.getMarca() +"\nAno: "+ c.getAno()+"\nCor: "+ c.getCor()+"\nVelocidade: "+ c.getVelocidade());
}
}