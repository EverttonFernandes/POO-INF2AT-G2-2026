package Aula04Dia3003ResolucaoDosUltimosExercicios.ListaoPratico.Exercicio2;

public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void calcularMediaFinal() {
        System.out.println("################ CALCULANDO MÉDIA FINAL DO ALUNO ###############");
        double resultadoDaMedia = (this.nota1 + this.nota2) / 2;

        if (resultadoDaMedia > 6.0) {
            System.out.println("O aluno " + this.nome + " foi aprovado(a) com média final " + resultadoDaMedia);
        } else {
            System.out.println("O aluno " + this.nome + " foi reprovado(a) com média final " + resultadoDaMedia);
        }
    }
}
