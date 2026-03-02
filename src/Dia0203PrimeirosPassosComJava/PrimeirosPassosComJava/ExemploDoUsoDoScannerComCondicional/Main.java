package Dia0203PrimeirosPassosComJava.PrimeirosPassosComJava.ExemploDoUsoDoScannerComCondicional;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tecladoVirtual = new Scanner(System.in);
        System.out.println("Ola, informe o seu nome?");
        String meuNome = tecladoVirtual.nextLine();

        System.out.println("Agora informe a sua idade: ");
        int idade = tecladoVirtual.nextInt();

        System.out.println("Bem vindo " + meuNome + " ao seu primeiro contato com a linguagem Java!");

        System.out.println("Olá " + meuNome + ", você tem " + idade + " anos de idade!");

        if (idade > 18) {
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade!");
        }

    }
}
