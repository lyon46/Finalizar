package repeticao;

import javax.swing.*;

public class Ex13 {
    public static void main(String[] args) {
        /*13) Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e
              100. */
        int somaEntreZeroECem = 0;
        for(int i = 0; i < 20; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número"));
            if( num >= 0 && num <= 100){
                somaEntreZeroECem++;
            }
        }
        System.out.println("Soma total: " + somaEntreZeroECem);
    }
}
