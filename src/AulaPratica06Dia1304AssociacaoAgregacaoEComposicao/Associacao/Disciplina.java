package AulaPratica06Dia1304AssociacaoAgregacaoEComposicao.Associacao;

public class Disciplina {
    private String nomeDaDisciplina;
    private Professor professor;

    public Disciplina(String nomeDaDisciplina) {
        this.nomeDaDisciplina = nomeDaDisciplina;
    }

    public String getNomeDaDisciplina() {
        return nomeDaDisciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    // ESSE SETTER FICA AQUI DISPONIVEL PARA ASSOCIAÇÃO ENTRE O PROFESSOR E A DISCIPLINA!
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void exibirDetalhesDaDisciplina() {
        System.out.println("############ DETALHES DA DISCIPLINA ############");
        System.out.println("Nome da disciplina: " + nomeDaDisciplina);
        if (professor == null) {
            System.out.println("Disciplina está sem um professor associado.");
        } else {
            System.out.println("Professor associado à disciplina: " + professor.getNomeDoProfessor());
        }
    }
}
