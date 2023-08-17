package br.senai.sp.joquempo;

import java.util.Random;
import java.util.Scanner;

/**
 * Joquempo
 * Data: 17/08/2023
 * Autor: Halana Augusto
 */


public class Joquempo {

    public static void main(String[] args) {

        /** Declarar as variáveis */
        int userChoice, choiceRandom;
        boolean continuar = true;

        /** Instanciar Scanner */
        Scanner teclado = new Scanner(System.in);

        /** Instanciar Random */
        Random random = new Random();

        /** Coletar Dados */
        System.out.println("========================================================");
        System.out.println("---------------- Bem Vindo ao Joquempo -----------------");

        while (continuar) {

            System.out.print("\n Digite sua escolha [1- Pedra, 2- Papel, 3- Tesoura]: ");
            userChoice = teclado.nextInt();
            choiceRandom = random.nextInt(3) + 1;

            System.out.println("Você escolheu: " + userChoice);
            System.out.println("O pc escolheu: " + choiceRandom);

            switch (choiceRandom) {

                case 1:
                    System.out.println("O pc escolheu Pedra!");
                    break;

                case 2:
                    System.out.println("O pc escolheu Papel!");
                    break;

                case 3:
                    System.out.println("O pc escolheu Tesoura!");
                    break;
            }

            if (userChoice == choiceRandom) {
                System.out.println("Empate!");
            } else if ((userChoice == 1 && choiceRandom == 2) ||
                    (userChoice == 2 && choiceRandom == 3) ||
                    (userChoice == 3 && choiceRandom == 1)) {
                System.out.println("Você perdeu!!");
            } else {
                System.out.println("Você ganhou!!");
            }
        }
    }
}
