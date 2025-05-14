package org.desviante.Calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        while (true) {
            int numero = scanner.nextInt();

            if (numero < 0) {
                break; // Sai do loop se o número for negativo
            }
            soma += numero;

        }

        System.out.println(soma);
        scanner.close();
    }

}
