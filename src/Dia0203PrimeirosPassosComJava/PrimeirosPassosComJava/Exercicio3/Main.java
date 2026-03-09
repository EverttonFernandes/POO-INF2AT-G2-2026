package Dia0203PrimeirosPassosComJava.PrimeirosPassosComJava.Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a primeira nota");
        float primeiraNotaInformada = scanner.nextFloat();
        System.out.println("Informe a segunda nota");
        float segundaNotaInformada = scanner.nextFloat();
        System.out.println("Informe a terceira nota");
        float terceiraNotaInformada = scanner.nextFloat();

        float media = (primeiraNotaInformada + segundaNotaInformada + terceiraNotaInformada) / 3;

        System.out.printf("A media das notas informadas e %.1f: ", media);
    }
}
