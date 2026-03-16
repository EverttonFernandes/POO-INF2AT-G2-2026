package Aula02Dia0203PrimeirosPassosComJava.PrimeirosPassosComJava.Exercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int numeroInformado = scanner.nextInt();

        int quantidadeDePares = 0;

        for (int indice = 1; indice <= numeroInformado; indice++) {
            if(indice % 2 == 0){;
                quantidadeDePares++;
            }
        }

        System.out.println("A quantidade de pares de 1 até o numero informado e: " + quantidadeDePares);
    }
}
