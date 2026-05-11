package AulaPratica09Dia110526ResolucaoDosExerciciosDaAulaAnterior.ResolucaoExerciciosMetodosEstaticos;

public class Main {
    public static void main(String[] args) {
        Item mouse = new Item(50.0, "Mouse");
        Cliente cliente = new Cliente("Maria");

        Pedido pedido = new Pedido(mouse, cliente);

        Resumo.mostrarResumoDoPedido(pedido);
    }
}
