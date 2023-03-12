package repeticao;

import javax.swing.*;

public class Ex8 {
    /*8) Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade. */
    public static void main(String[] args) {
        int pessoasMaioresDeIdade = 0;
        for(int i = 0; i < 20; i++) {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade"));
            if(idade >= 18) {
                pessoasMaioresDeIdade++;
            }
        }
        System.out.println("Soma total de pessoas maiores de idade: " + pessoasMaioresDeIdade);
    }
}
