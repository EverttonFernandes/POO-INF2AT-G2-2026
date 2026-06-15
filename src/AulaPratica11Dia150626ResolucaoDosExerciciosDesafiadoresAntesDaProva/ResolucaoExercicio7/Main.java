package AulaPratica11Dia150626ResolucaoDosExerciciosDesafiadoresAntesDaProva.ResolucaoExercicio7;

public class Main {
    public static void main(String[] args) {
        Equipamento alicate = new Equipamento("Alicate", "313234", "Almoxarifado");
        Equipamento martelo = new Equipamento("Martelo", "12344", "Almoxarifado");
        Equipamento carrinhoDeMao = new Equipamento("Carrinho de Mão", "9999", "Almoxarifado");

        CadastroDeEquipamentos cadastroDeEquipamentos = new CadastroDeEquipamentos();

        cadastroDeEquipamentos.adicionarEquipamento(alicate);
        cadastroDeEquipamentos.adicionarEquipamento(martelo);
        cadastroDeEquipamentos.adicionarEquipamento(carrinhoDeMao);

        cadastroDeEquipamentos.listarTodosOsEquipamentos();
        cadastroDeEquipamentos.buscarEquipamentoPeloCodigo(carrinhoDeMao.getCodigoPatrimonio());
        cadastroDeEquipamentos.atualizarSetorDoEquipamento(carrinhoDeMao.getCodigoPatrimonio(), "Manutenção");
        cadastroDeEquipamentos.removerEquipamentoPeloCodigo(carrinhoDeMao.getCodigoPatrimonio());
    }
}
