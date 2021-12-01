package Lista;

public class Computador {
	
			//atributos
			String marca;
			//estados
			boolean energia ;
			boolean navegador;
			
			public Computador (String marca) {
				this.marca = marca;
				this.energia = false;
				this.navegador = false;
			}
			public String ligando() {
				if (!energia) {
					this.energia = true;
					return  "Bem vindo, o computador está ligando";
				} else {
					return "O computador já está ligado";
				}
			}
			public String desligando() {
				if (energia) {
					this.energia = false;
					this.navegador = false;
					return  "Computador desligado";
				} else {
					return "O computador está ligado";
				}
			}
			public String abrirnavegador() {
				if (this.energia = true & this.navegador == false) {
					this.navegador = true;
					return  "abrindo navegador";
				} else {
					return "navegador já aberto ou computador desligado";
			}
			}
			public String fecharnavegador() {
				if (this.energia = false & this.navegador == false) {
					this.navegador = true;
					return  "fechando navegador";
				} else {
					return "fechando navegador";
			}
			}
			@Override
			public String toString() {
				return "Computador [marca=" + marca + ", energia=" + energia + ", navegador=" + navegador + "]";
		}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				Computador co = new Computador ("LOGIN");
				System.out.println("Computador desligado");
				System.out.println(co.ligando());
				System.out.println(co.abrirnavegador());
				System.out.println(co.fecharnavegador());
				System.out.println(co.desligando());
				
				System.out.println("_______________________________________________________________________");
				
				Computador co1 = new Computador ("LOGIN");
				System.out.println(co1);
				System.out.println(co1.ligando());
				System.out.println(co1);
				System.out.println(co1.desligando());
				System.out.println(co1);
				System.out.println(co1.ligando());
				System.out.println(co1);
				System.out.println(co1.desligando());
				System.out.println(co1);
			
			}
}