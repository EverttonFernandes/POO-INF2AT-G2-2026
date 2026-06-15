package AulaPratica11Dia150626ResolucaoDosExerciciosDesafiadoresAntesDaProva.ResolucaoExercicio7;

import AulaPratica11Dia150626ResolucaoDosExerciciosDesafiadoresAntesDaProva.ResolucaoExercicio6.Aluno;

import java.util.ArrayList;

public class CadastroDeEquipamentos {
    private ArrayList<Equipamento> listaDeEquipamentos = new ArrayList<>();

    public void adicionarEquipamento(Equipamento equipamento) {
        this.listaDeEquipamentos.add(equipamento);
    }

    public void listarTodosOsEquipamentos() {
        System.out.println("########## Listando todos os equipamentos ##########");
        for (Equipamento equipamentoDaLista : this.listaDeEquipamentos) {
            System.out.println("------------------------------------------");
            System.out.println("Nome: " + equipamentoDaLista.getNome());
        }
        System.out.println("####################");
    }

    public void buscarEquipamentoPeloCodigo(String codigoDePatrimonioInformado) {
        System.out.println("########## Buscando equipamento pelo código ##########");
        boolean encontrouEquipamento = false;

        for (Equipamento equipamento : this.listaDeEquipamentos) {
            if (equipamento.getCodigoPatrimonio().equals(codigoDePatrimonioInformado)) {
                System.out.println("SUCESSO: O equipamento " + equipamento.getNome() + " com o código de patrimonio " + codigoDePatrimonioInformado + " foi encontrado!");
                encontrouEquipamento = true;
                break;
            }
        }

        if (!encontrouEquipamento) {
            System.out.println("ERROR: O equipamento com o código de patrimonio " + codigoDePatrimonioInformado + " não foi encontrado!");
        }

        System.out.println("####################");
    }

    public void atualizarSetorDoEquipamento(String codigoDePatrimonioInformado, String novoSetor) {
        System.out.println("########## Atualizando o setor do equipamento pelo código ##########");
        boolean encontrouEquipamento = false;
        String antigoSetor = "";

        for (Equipamento equipamento : this.listaDeEquipamentos) {
            if (equipamento.getCodigoPatrimonio().equals(codigoDePatrimonioInformado)) {
                antigoSetor = equipamento.getSetor();
                equipamento.setSetor(novoSetor);
                encontrouEquipamento = true;

                System.out.println("SUCESSO: O equipamento " + equipamento.getNome()
                        + " com o código de patrimonio "
                        + codigoDePatrimonioInformado
                        + " teve seu setor alterado de "
                        + antigoSetor + " para " + novoSetor);

                break;
            }
        }

        if (!encontrouEquipamento) {
            System.out.println("ERROR: O equipamento com o código de patrimonio " + codigoDePatrimonioInformado + " não foi encontrado!");
        }

        System.out.println("####################");
    }

    public void removerEquipamentoPeloCodigo(String codigoDePatrimonioInformado) {

        // DA PARA FAZER ESSA REGRA MANUALMENTE USANDO UM FOR, OU SE QUISER USAR O removeIf
//        for (Equipamento equipamento : this.listaDeEquipamentos){
//            if (equipamento.getCodigoPatrimonio().equals(codigoDePatrimonioInformado)){
//                this.listaDeEquipamentos.remove(equipamento);
//            }
//        }

        if (this.listaDeEquipamentos.removeIf(equipamentoDaLista -> equipamentoDaLista.getCodigoPatrimonio().equals(codigoDePatrimonioInformado))) {
            System.out.println("SUCESSO: O equipamento com o código de patrimônio " + codigoDePatrimonioInformado + " foi removido com sucesso!");
        } else {
            System.out.println("ERROR: O equipamento com o código de patrimônio " + codigoDePatrimonioInformado + " foi removido com sucesso!");
        }
    }

}
