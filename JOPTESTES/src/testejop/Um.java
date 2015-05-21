package testejop;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Um {
	public static void main(String[] args) {
		
		//respostas em forma de botão
		Object[] options = { "Sim ", "Não ", "Talvez " };
		int a = JOptionPane.showOptionDialog(null,
				"Você sabe o caminho da roça?", "Ei, você!",
				JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null,
				options, options[0]);
		JOptionPane.showMessageDialog(null, options[a]);

		// int
		int um = JOptionPane.showConfirmDialog(null, "choose one",
				"choose one", JOptionPane.YES_NO_OPTION);

		JOptionPane.showMessageDialog(null, um);

		// Lista de respostas à serem selecionadas.
		Object[] possibleValues = { "First", "Second", "Third" };
		Object selectedValue = JOptionPane.showInputDialog(null, "Choose one",
				"Input", JOptionPane.QUESTION_MESSAGE, null, possibleValues,
				possibleValues[0]);

		JOptionPane.showMessageDialog(null, selectedValue);

		// boolean
		boolean voceEhLegal = false;

		int confirmacaoDeLegalidade = JOptionPane.showConfirmDialog(null,
				"Você é legal?", "Selecione um", JOptionPane.YES_NO_OPTION,
				JOptionPane.WARNING_MESSAGE);
		System.out.println("result from entry " + confirmacaoDeLegalidade);

		if (confirmacaoDeLegalidade == 0)
			voceEhLegal = true;
		else if (confirmacaoDeLegalidade == 1)
			voceEhLegal = false;

		//retornando o boolean com custom icon
		
		Icon icon = new ImageIcon("C:\\guitarra.jpg"); //caminho para uma imagem... que exista.
		Icon icon1 = new ImageIcon("C:\\dango.png");
		
		if (voceEhLegal)
			JOptionPane.showMessageDialog(null, "Você é! Parabéns",
					"E a resposta é...", JOptionPane.INFORMATION_MESSAGE,icon);
		else
			JOptionPane.showMessageDialog(null, "É não", "E a resposta é...",
					JOptionPane.INFORMATION_MESSAGE,icon1);

	}
}
