package repeticao;

import javax.swing.*;

public class Ex10 {
    /*10) Crie um algoritmo leia um número do usuário e exiba a sua tabuada de
        multiplicação. */

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        String tabuada = "";
        for(int i = 1; i <= 10; i++){
            tabuada += num + " X " + i + "=" + (num*i) + "\n";
        }
        JOptionPane.showMessageDialog(null, tabuada);
    }
}
