package org.desviante.DiasDaSemana;
import java.util.InputMismatchException;
import java.util.Scanner;

enum DiaDaSemana {
    DOMINGO(1, "Domingo"),
    SEGUNDA_FEIRA(2, "Segunda-feira"),
    TERCA_FEIRA(3, "Terça-feira"),
    QUARTA_FEIRA(4, "Quarta-feira"),
    QUINTA_FEIRA(5, "Quinta-feira"),
    SEXTA_FEIRA(6, "Sexta-feira"),
    SABADO(7, "Sabado");

    private final int valor;
    private final String nomeFormatado;

    DiaDaSemana(int valor, String nomeFormatado) {
        this.valor = valor;
        this.nomeFormatado = nomeFormatado;
    }

    public int getValor(){
        return valor;
    }

    public String getNomeFormatado() {
        return nomeFormatado;
    }

    public static DiaDaSemana fromValor(int valor) throws IllegalAccessException {
        for (DiaDaSemana dia : DiaDaSemana.values()){
            if (dia.valor == valor) {
                return dia;
            }
        }
        throw new IllegalAccessException("Dia invalido");
    }

    @Override
    public String toString() {
        return this.nomeFormatado;
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Digite um número de 1 a 7 para o dia da semana:");
        Scanner scanner = new Scanner(System.in);
        try{
            int dia = scanner.nextInt();
            DiaDaSemana diaDaSemana = DiaDaSemana.fromValor(dia);
            System.out.println(diaDaSemana);
        } catch (InputMismatchException e) {
            System.err.print("Dia invalido");
            scanner.next(); // Limpa o buffer do scanner
        } catch (IllegalAccessException e) {
            System.err.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}