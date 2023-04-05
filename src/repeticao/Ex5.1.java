package repeticao;

import javax.print.attribute.standard.NumberOfDocuments;
import javax.swing.JOptionPane;

public class Ex5.1 {
    /*5) Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses
    números. */
    public static void main(String[] args) {
        int soma = 0
        for (int i = 0 ; i< 10; i++);{
            string numero = Integer.parseInt(JOptionPane.showInputDialog("Digite seu numero"));
            soma += numero; 
        }
        System.out.println("total " + soma);
    }
}
