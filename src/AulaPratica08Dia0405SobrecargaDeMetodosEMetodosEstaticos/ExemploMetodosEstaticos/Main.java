package AulaPratica08Dia0405SobrecargaDeMetodosEMetodosEstaticos.ExemploMetodosEstaticos;

public class Main {
    public static void main(String[] args) {
        System.out.println(CalculadoraEstatica.somar(5, 5));
        System.out.println(CalculadoraEstatica.somar(5.0, 5.0));
        System.out.println(CalculadoraEstatica.somar(5.00F, 5.00F));
    }
}
