package Dia0203PrimeirosPassosComJava.PrimeirosPassosComJava.Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Usando a biblioteca Scanner, pegue 3 numeros inteiros do teclado e imprima na tela qual deles é o maior?
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o primeiro numero: ");
        int primeiroNumeroInformado = teclado.nextInt();

        System.out.println("Informe o segundo numero: ");
        int segundoNumeroInformado = teclado.nextInt();

        System.out.println("Informe o terceiro numero: ");
        int terceiroNumeroInformado = teclado.nextInt();

        if(primeiroNumeroInformado > segundoNumeroInformado && primeiroNumeroInformado > terceiroNumeroInformado){
            System.out.println("O maior numero informado foi o primeiro numero: " + primeiroNumeroInformado);
        }

        if(segundoNumeroInformado > primeiroNumeroInformado && segundoNumeroInformado > terceiroNumeroInformado){
            System.out.println("O maior numero informado foi o segundo numero: " + segundoNumeroInformado);
        }

        if(terceiroNumeroInformado > primeiroNumeroInformado && terceiroNumeroInformado > segundoNumeroInformado){
            System.out.println("O maior numero informado foi o terceiro numero: " + terceiroNumeroInformado);
        }

    }
}
