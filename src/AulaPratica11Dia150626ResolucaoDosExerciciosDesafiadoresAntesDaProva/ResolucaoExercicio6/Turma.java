package AulaPratica11Dia150626ResolucaoDosExerciciosDesafiadoresAntesDaProva.ResolucaoExercicio6;

import java.util.ArrayList;

public class Turma {
    private String nome;
    private String turno;
    private ArrayList<Aluno> listaDeAlunos = new ArrayList<>();

    public Turma(String nome, String turno, ArrayList<Aluno> listaDeAlunos) {
        this.nome = nome;
        this.turno = turno;
        this.listaDeAlunos = listaDeAlunos;
    }

    public Turma(String nome, String turno) {
        this.nome = nome;
        this.turno = turno;
    }

    public Turma(String nome) {
        this.nome = nome;
    }

    public void adicionarAluno(Aluno alunoRecebido) {
        System.out.println("########## Adicionando um aluno a turma ##########");
        boolean alunoDuplicado = false;

        for (Aluno aluno : this.listaDeAlunos) {
            if (aluno.getMatricula().equals(alunoRecebido.getMatricula())) {
                System.out.println("ERROR: O (a) aluno(a) cuja sua matricula é " + alunoRecebido.getMatricula() + " já consta na lista!");
                alunoDuplicado = true;
                break;
            }
        }

        if (!alunoDuplicado) {
            this.listaDeAlunos.add(alunoRecebido);
            System.out.println("O(a) aluno(a) " + alunoRecebido.getNome() + " foi adicionado com sucesso!");
        }

        System.out.println("####################");
    }

    public int contarAlunosDaTurma() {
        return this.listaDeAlunos.size();
    }

    public void listarTodosOsAlunosDaTurma() {
        System.out.println("########## Listando todos os alunos da turma ##########");
        for (Aluno alunoDaLista : this.listaDeAlunos) {
            System.out.println("------------------------------------------");
            System.out.println("Nome: " + alunoDaLista.getNome());
        }
        System.out.println("####################");
    }

    public void mostrarAlunoEspecifico(Aluno alunoInformado) {
        System.out.println("########## Mostrando um aluno específico ##########");

        if (this.listaDeAlunos.contains(alunoInformado)) {
            System.out.println("Sucesso: o aluno " + alunoInformado.getNome() + " consta na lista!");
        } else {
            System.out.println("ERROR: O(a) aluno(a) " + alunoInformado.getNome() + " não consta na lista");
        }

        System.out.println("####################");
    }

    public void removerTodosOsAlunos() {
        // Podemos remover/limpar uma lista de 2 formas, usando o clear ou o removeAll
//        this.listaDeAlunos.clear();
        this.listaDeAlunos.removeAll(this.listaDeAlunos);
    }

    public void removerAlunoEspecificoDaTurma(Aluno alunoInformado) {
        System.out.println("########## Removendo um aluno específico ##########");

        if (this.listaDeAlunos.contains(alunoInformado)) {
            this.listaDeAlunos.remove(alunoInformado);
            System.out.println("SUCESSO: O(a) aluno(a) " + alunoInformado.getNome() + " foi removido da turma com sucesso!");
        } else {
            System.out.println("ERROR: O(a) aluno(a) " + alunoInformado.getNome() + " não foi removido da turma, pois não consta na lista!");
        }

        System.out.println("####################");
    }
}
