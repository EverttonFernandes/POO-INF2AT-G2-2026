package AulaPratica09Dia110526ResolucaoDosExerciciosDaAulaAnterior.ResolucaoExerciciosMetodosEstaticos;

public class Resumo {

    public static void mostrarResumoDoPedido(Pedido pedido) {
        System.out.println("############################# RESUMO DO PEDIDO #############################");
        System.out.println("Nome do cliente " + pedido.getCliente().getNome());
        System.out.println("Nome do item comprado " + pedido.getItem().getNome());
        System.out.println("Valor total do pedido " + pedido.getItem().getPreco());
        System.out.println("Obrigado pela sua preferencia!");
    }
}
