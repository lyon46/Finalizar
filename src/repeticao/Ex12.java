package repeticao;

import javax.swing.*;

public class Ex12 {
    /*12) Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são
        pares */
    public static void main(String[] args) {
        int somaPares = 0;
        for(int i = 0; i < 20; i++) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número"));
            if( num%2 == 0){
                somaPares++;
            }
        }
        System.out.println("Soma total: " + somaPares);
    }
}
