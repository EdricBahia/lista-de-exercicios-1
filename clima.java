package Lista;

import javax.swing.JOptionPane;

public class clima {

	private int e;
	
	public void chuva() {
		e = Integer.parseInt(JOptionPane.showInputDialog("Qual a o n�vel de chuva que deseja? 0 (sem chuva), 1, 2, 3 e 4"));
		switch (e) {
		case 1:
			JOptionPane.showMessageDialog(null, "Est� garoando");
		break;
		case 2:
			JOptionPane.showMessageDialog(null, "Est� chovendo, melhor se abrigar");
		break;
		case 3:
			JOptionPane.showMessageDialog(null, "Est� chovedo forte com trov�es");
		break;
		case 4:
			JOptionPane.showMessageDialog(null, "Est� tendo um dil�vio!");
		break;
		case 0:
			JOptionPane.showMessageDialog(null, "Sem chuva hoje");
		break;
		}
		}
		public void sol() {
			e = Integer.parseInt(JOptionPane.showInputDialog("O qu�o quente voc� quer que esteja? 1, 2, 3 e 4"));
		switch (e) {
		case 1:
			JOptionPane.showMessageDialog(null, "est� nublado");
		break;
		case 2:
			JOptionPane.showMessageDialog(null, "O Sol est� presente, mas n�o est� quente");
		break;
		case 3:
			JOptionPane.showMessageDialog(null, "O Sol brilha e est� quente");
		break;
		case 4:
			JOptionPane.showMessageDialog(null, "Voc� ta derrentendo nesse calor");
		break;
		}
		}
		public void desastrenat() {
			e = Integer.parseInt(JOptionPane.showInputDialog("Algum tipo de desastre natural? \n0 - nenhum \n1 - Terremoto \n2 - Furac�o \n3 - Tsunami  \n4 - 4Erup��o"));
		switch (e) {
		case 1:
			JOptionPane.showMessageDialog(null, "Est� tendo um terremoto!!");
		break;
		case 2:
			JOptionPane.showMessageDialog(null, "Fuja por que h� um fucar�o em nossa dire��o!");
		break;
		case 3:
			JOptionPane.showMessageDialog(null, "Pegue sua prancha e vamos surfar esse tsunami!");
		break;
		case 4:
			JOptionPane.showMessageDialog(null, "O vulc�o cai explodir!!");
		break;
		case 0:
			JOptionPane.showMessageDialog(null, "Sem desastres hoje!!");
		break;
		}
		}
	public static void main (String[]args) {
		int r;
		clima c = new clima();
		do {
			c.chuva();
			c.sol();
			c.desastrenat();
		r = Integer.parseInt(JOptionPane.showInputDialog( "Hoje foi muito produtivo \nDeseja continuar continuar controlando o sistema? 1- sim e 2 - n�o"));
		}while (r == 1);
}
}
