package Aula02Dia0203PrimeirosPassosComJava.PrimeirosPassosComJava.ExemploSobreTiposDeDados;

public class Main {
    public static void main(String[] args) {
        // Principais tipos de dados no Java
        // String usamos para armazenar texto, ou seja, palavras, frases, etc.
        // int usamos para armazenar números inteiros, ou seja, sem casas decimais.
        // double usamos para armazenar números decimais, ou seja, com casas decimais (altura, cm e coisas nesse sentido)
        // Float usamos geralmente para armazenar numero monetarios, ou seja, com casas decimais (preço de um produto, salário, etc)
        // boolean usamos para armazenar valores de verdadeiro ou falso, ou seja, true ou false

        String texto = "Meu primeiro texto";
        int meuPrimeiroNumeroInteiro = 10;
        double meuPrimeiroNumeroDecimal = 3.14;
        Float meuPrimeiroNumeroDecimalComFloat = 150.50f;
        boolean meuPrimeiroValorBooleano = true;

        System.out.println("O valor da variável texto é: " + texto);
        System.out.println("O valor da variável meuPrimeiroNumeroInteiro é: " + meuPrimeiroNumeroInteiro);
        System.out.println("O valor da variável meuPrimeiroNumeroDecimal é: " + meuPrimeiroNumeroDecimal);
        System.out.println("O valor da variável meuPrimeiroNumeroDecimalComFloat é: " + meuPrimeiroNumeroDecimalComFloat);
        System.out.println("O valor da variável meuPrimeiroValorBooleano é: " + meuPrimeiroValorBooleano);

    }
}
