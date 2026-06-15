package AulaPratica11Dia150626ResolucaoDosExerciciosDesafiadoresAntesDaProva.ResolucaoExercicio6;

public class Main {
    public static void main(String[] args) {
        Aluno vinicius = new Aluno("Vinicius", "1234ch2026", "vinicius@ifsul.edu.br");
        Aluno mayte = new Aluno("Mayte", "3412ch2026", "mayte@ifsul.edu.br");
        Aluno joaoVictorMedeiros = new Aluno("João Victor", "9831ch2026", "joaomedeiros@ifsul.edu.br");
        Aluno joaoVictorLopes = new Aluno("João Victor", "9831ch2026", "joaolopes@ifsul.edu.br");

        Turma turma = new Turma("INF2AT", "Tarde");

        turma.adicionarAluno(vinicius);
        turma.adicionarAluno(mayte);
        turma.adicionarAluno(joaoVictorMedeiros);
        turma.adicionarAluno(joaoVictorLopes);

        turma.listarTodosOsAlunosDaTurma();
        System.out.println("A quantidade total de alunos na turma é: " + turma.contarAlunosDaTurma());
        turma.mostrarAlunoEspecifico(mayte);

        turma.removerAlunoEspecificoDaTurma(vinicius);
        turma.removerTodosOsAlunos();
        System.out.println("A quantidade total de alunos na turma é: " + turma.contarAlunosDaTurma());
    }
}
