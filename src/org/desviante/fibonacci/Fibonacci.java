package org.desviante.fibonacci;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.nextLine();
        int numero = 0;
        try {
            numero = Integer.parseInt(entrada);
        } catch (NumberFormatException e) {
            return; // Sai do programa se a entrada não for um número inteiro
        }
        scanner.close(); // Fechar o scanner após a leitura

        if (numero <= 0) {
            return; // Não exibe nada para entrada não positiva
        }

        if (numero == 1) {
            System.out.println(0);
            return;
        }

        long primeiro = 0;
        long segundo = 1;

        System.out.print(primeiro + " " + segundo);

        for (int i = 3; i <= numero; i++) { // Correção: usar 'numero' em vez de 'n'
            long proximo = primeiro + segundo;
            System.out.print(" " + proximo);
            primeiro = segundo;
            segundo = proximo;
        }
        System.out.println(); // Adiciona uma quebra de linha ao final da saída
    }
}