package Aula02Dia0203PrimeirosPassosComJava.PrimeirosPassosComJava.Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int numeroInformado = scanner.nextInt();

        int somaTotal = 0;

        for (int indice = 1; indice <= numeroInformado; indice++) {
            somaTotal += indice;
        }

        System.out.println("A soma total de 1 até o numero informado e: " + somaTotal);
    }
}
