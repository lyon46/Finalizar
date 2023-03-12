package exs_curso.sequenciais;

import javax.swing.JOptionPane;

public class Ex3 {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Qual o seu nome?");
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o seu salário?"));
		
		JOptionPane.showMessageDialog(null, "Olá " + nome + " é um prazer te conhecer!"
									  + "\nO salário digitado foi: " + salario);
	}
}
