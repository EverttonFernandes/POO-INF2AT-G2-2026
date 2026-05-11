package AulaPratica09Dia110526ResolucaoDosExerciciosDaAulaAnterior.ResolucaoExerciciosMetodosEstaticos;

public class Pedido {
    private Item item;
    private Cliente cliente;

    public Pedido(Item item, Cliente cliente) {
        this.item = item;
        this.cliente = cliente;
    }

    public Item getItem() {
        return item;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
