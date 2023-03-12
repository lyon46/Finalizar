package repeticao;

import javax.swing.*;

public class Ex7 {
    /*7) Leia a idade de 20 pessoas e exiba a média das idades. */
    public static void main(String[] args) {
        int somaIdades = 0;
        for(int i = 0; i < 20; i++) {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade"));
            somaIdades += idade;
        }
        System.out.println("Média total: " + (somaIdades / 20));
    }
}
