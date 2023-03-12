package repeticao;

import javax.swing.*;

public class Ex14 {
    /*14) Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e
          100, quantos estão entre 101 e 200 e quantos são maiores de 200. */
    public static void main(String[] args) {
        int somaEntreZeroECem = 0;
        int somaEntreCemmEDuzentos = 0;
        int somaMaioresQueDuzentos = 0;
        for(int i = 0; i < 20; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número"));
            if( num >= 0 && num <= 100){
                somaEntreZeroECem++;
            }
            if( num > 100 && num <= 200){
                somaEntreCemmEDuzentos++;
            }
            else somaMaioresQueDuzentos++;
        }
        System.out.println("Soma entre 0 e 100: " + somaEntreZeroECem);
        System.out.println("Soma entre 100 e 200: " + somaEntreZeroECem);
        System.out.println("Soma maiores que 200: " + somaEntreZeroECem);
    }
}
