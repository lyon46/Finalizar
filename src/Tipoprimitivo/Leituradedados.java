package Tipoprimitivo;

import java.util.Scanner;

public class Leituradedados {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();

        System.out.println("Digite o tamanho da largura do seu terreno: ");
        double largura = scan.nextDouble();

        System.out.println("Você digitou: " + largura);
    }
}