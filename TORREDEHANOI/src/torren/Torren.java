package torren;

import javax.swing.JOptionPane;

public class Torren {

	static int temp;
	static int tentativas;
	static int n;
	static int[] torre1;
	static int[] torre2;
	static int[] torre3;

	public static void main(String[] args) {
		int op;

		n = Integer.parseInt(JOptionPane.showInputDialog("Defina o Numero de Argolas"));
		
		torre1 = new int[n];
		torre2 = new int[n];
		torre3 = new int[n];

		reiniciar();
		
		
		do {
			op = Integer.parseInt(JOptionPane
					.showInputDialog("1-Imprimir Torres \n2-Realizar Jogada"
							+ "\n3-Reiniciar\n4-Tentativas Usadas\n\n0-Sair"));

			if (op == 1)
				imprimir();
			if (op == 2)
				jogada();
			if (op == 3)
				reiniciar();
			if(op==4)
				JOptionPane.showMessageDialog(null, "Tentativas: "+tentativas);
		} while (op != 0);
	}

	public static void imprimir() {
		int l =(n-1);
		String torres = "";
		
		for(int i=l;i>-1;i--){		
			torres += torre1[i] + " " + torre2[i] + " " + torre3[i] + "\n";
		}

		JOptionPane.showMessageDialog(null, torres);
	}

	public static void jogada() {
		primeiratela();
		tentativas++;

		if (torre3[0] == n && torre3[n-1] == 1) {
			JOptionPane.showMessageDialog(null, "Você ganhou amiguinho!"
					+"\n"+tentativas+" tentatitavas");
			reiniciar();
		}

	}

	public static void reiniciar() {
		int l =n;
		for(int i = 0; i < n; i++) {
		torre1[i] = l;
		l--;
		torre2[i]=0;
		torre3[i]=0;
		}
		
	
		
		tentativas =0;

	}

	public static void primeiratela() {
		boolean torrevazia = true;
		int l= (n-1);
		while (torrevazia) {
			int to = Integer.parseInt(JOptionPane
					.showInputDialog("Torre origem"));

			if (to == 1) {
				for (int i = l; i > -1; i--) {
					if (torre1[i] != 0) {
						torrevazia = false;
						temp = torre1[i];
						if (segundatela()==1)
							torre1[i] = 0;

						break;
					}
				}
			}
			if (to == 2) {
				for (int i = l; i > -1; i--) {
					if (torre2[i] != 0) {
						torrevazia = false;
						temp = torre2[i];
						if (segundatela()==1)
							torre2[i] = 0;
						break;
					}
					
				}
				
			}
			if (to == 3) {
				for (int i = l; i > -1; i--) {
					if (torre3[i] != 0) {
						torrevazia = false;
						temp = torre3[i];
						if (segundatela()==1)
							torre3[i] = 0;
						break;
					}
				}
			}
			if(torrevazia)
				JOptionPane.showMessageDialog(null, "Torre Vazia, escolha outra!");
				
		}

	}

	public static int segundatela() {

		int possivel = 0;

		while (possivel == 0) {
			int destino = Integer.parseInt(JOptionPane
					.showInputDialog("Torre Destino"));

			// torre1
			if (destino == 1) {

				for (int i = 0; i < n; i++) {

					if (torre1[i] == temp) {
						possivel=2;
						break;
						
					} else

						if (i == 0) {
							if (torre1[i] == 0) {
								torre1[i] = temp;
								possivel = 1;
								break;
							}
						} else if (torre1[i] == 0 && torre1[i - 1] > temp) {
							torre1[i] = temp;
							possivel = 1;
						break;
					}
				}
			}
			// torre2
			if (destino == 2) {
				for (int i = 0; i < n; i++) {
					
					if (torre2[i] == temp) {
						possivel=2;
						break;
					} else
					
					if (i == 0) {
						if (torre2[i] == 0) {
							torre2[i] = temp;
							possivel = 1;
							break;
						}
					} else if (torre2[i] == 0 && torre2[i - 1] > temp) {
						torre2[i] = temp;
						possivel = 1;
						break;
					}
				}
			}
			// torre3
			if (destino == 3) {
				for (int i = 0; i < n; i++) {
					
					if (torre3[i] == temp) {
						possivel=2;
						break;
					} else
					
					if (i == 0) {
						if (torre3[i] == 0) {
							torre3[i] = temp;
							possivel = 1;
							break;
						}
					} else if (torre3[i] == 0 && torre3[i - 1] > temp) {
						torre3[i] = temp;
						possivel = 1;
						break;
					}
				}
			}
			if(possivel==0)
				JOptionPane.showMessageDialog(null, "Jogada Impssível! \nEscolha outra torre destino.");
		}
		//retornando 2, o valor voltará para a torre origem.	
		return possivel;

	}

}
