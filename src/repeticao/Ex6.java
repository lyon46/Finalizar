package repeticao;

import javax.swing.*;

public class Ex6 {
    /*6) Leia a idade de 20 pessoas e exiba a soma das idades. */
    public static void main(String[] args) {
        int somaIdades = 0;
        for(int i = 0; i < 10; i++) {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade"));
            somaIdades += idade;
        }
        System.out.println("Soma total: " + somaIdades);
    }
}
