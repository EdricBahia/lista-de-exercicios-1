package Lista;

import javax.swing.JOptionPane;

public class clima {

	private int e;
	
	public void chuva() {
		e = Integer.parseInt(JOptionPane.showInputDialog("Qual a o nível de chuva que deseja? 0 (sem chuva), 1, 2, 3 e 4"));
		switch (e) {
		case 1:
			JOptionPane.showMessageDialog(null, "Está garoando");
		break;
		case 2:
			JOptionPane.showMessageDialog(null, "Está chovendo, melhor se abrigar");
		break;
		case 3:
			JOptionPane.showMessageDialog(null, "Está chovedo forte com trovões");
		break;
		case 4:
			JOptionPane.showMessageDialog(null, "Está tendo um dilúvio!");
		break;
		case 0:
			JOptionPane.showMessageDialog(null, "Sem chuva hoje");
		break;
		}
		}
		public void sol() {
			e = Integer.parseInt(JOptionPane.showInputDialog("O quão quente você quer que esteja? 1, 2, 3 e 4"));
		switch (e) {
		case 1:
			JOptionPane.showMessageDialog(null, "está nublado");
		break;
		case 2:
			JOptionPane.showMessageDialog(null, "O Sol está presente, mas não está quente");
		break;
		case 3:
			JOptionPane.showMessageDialog(null, "O Sol brilha e está quente");
		break;
		case 4:
			JOptionPane.showMessageDialog(null, "Você ta derrentendo nesse calor");
		break;
		}
		}
		public void desastrenat() {
			e = Integer.parseInt(JOptionPane.showInputDialog("Algum tipo de desastre natural? \n0 - nenhum \n1 - Terremoto \n2 - Furacão \n3 - Tsunami  \n4 - 4Erupção"));
		switch (e) {
		case 1:
			JOptionPane.showMessageDialog(null, "Está tendo um terremoto!!");
		break;
		case 2:
			JOptionPane.showMessageDialog(null, "Fuja por que há um fucarão em nossa direção!");
		break;
		case 3:
			JOptionPane.showMessageDialog(null, "Pegue sua prancha e vamos surfar esse tsunami!");
		break;
		case 4:
			JOptionPane.showMessageDialog(null, "O vulcão cai explodir!!");
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
		r = Integer.parseInt(JOptionPane.showInputDialog( "Hoje foi muito produtivo \nDeseja continuar continuar controlando o sistema? 1- sim e 2 - não"));
		}while (r == 1);
}
}
