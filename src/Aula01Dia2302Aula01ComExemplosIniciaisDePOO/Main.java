package Aula01Dia2302Aula01ComExemplosIniciaisDePOO;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindos alunos da INF2AT!, vamos criar um carro em POO!");
        Carro carro = new Carro("ITC-2211", "Preto", "Chevrolet Onix", 2020);
        System.out.println("A placa do carro e: " + carro.placa);
        System.out.println("A cor do carro e: " + carro.cor);
        System.out.println("O modelo do carro e: " + carro.modelo);
        System.out.println("O ano de fabricacao do carro e: " + carro.anoDeFabricacao);
    }
}