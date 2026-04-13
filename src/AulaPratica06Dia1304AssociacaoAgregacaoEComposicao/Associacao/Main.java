package AulaPratica06Dia1304AssociacaoAgregacaoEComposicao.Associacao;

public class Main {
    public static void main(String[] args) {
        Disciplina disciplina = new Disciplina("Programação Orientada a Objetos");
        Professor professorEverton = new Professor("Everton");
        Professor professorVanius = new Professor("Vanius");

        disciplina.setProfessor(professorEverton);

        disciplina.exibirDetalhesDaDisciplina();

        disciplina.setProfessor(professorVanius);

        disciplina.exibirDetalhesDaDisciplina();
    }
}
