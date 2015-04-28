package torre;

import javax.swing.JOptionPane;

public class Torre {
	static int[] torre1 = new int[3];
	static int[] torre2 = new int[3];
	static int[] torre3 = new int[3];
	static int temp;
	static int tentativas;

	public static void main(String[] args) {
		int op;

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
		String torres = "";

		torres = torre1[2] + " " + torre2[2] + " " + torre3[2] + "\n";
		torres += torre1[1] + " " + torre2[1] + " " + torre3[1] + "\n";
		torres += torre1[0] + " " + torre2[0] + " " + torre3[0];

		JOptionPane.showMessageDialog(null, torres);
	}

	public static void jogada() {
		primeiratela();
		tentativas++;

		if (torre3[0] == 3 && torre3[1] == 2 && torre3[2] == 1) {
			JOptionPane.showMessageDialog(null, "Você ganhou amiguinho!"
					+"\n"+tentativas+" tentatitavas");
			reiniciar();
		}

	}

	public static void reiniciar() {
		torre1[0] = 3;
		torre1[1] = 2;
		torre1[2] = 1;

		torre2[0] = 0;
		torre2[1] = 0;
		torre2[2] = 0;

		torre3[0] = 0;
		torre3[1] = 0;
		torre3[2] = 0;
		
		tentativas =0;

	}

	public static void primeiratela() {
		boolean torrevazia = true;

		while (torrevazia) {
			int to = Integer.parseInt(JOptionPane
					.showInputDialog("Torre origem"));

			if (to == 1) {
				for (int i = 2; i > -1; i--) {
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
				for (int i = 2; i > -1; i--) {
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
				for (int i = 2; i > -1; i--) {
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

				for (int i = 0; i < 3; i++) {

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
				for (int i = 0; i < 3; i++) {
					
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
				for (int i = 0; i < 3; i++) {
					
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
