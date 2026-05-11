package AulaPratica09Dia110526ResolucaoDosExerciciosDaAulaAnterior.ResolucaoExerciciosSobrecarga.Exercicio1;

public class Main {
    public static void main(String[] args) {
        Laboratorio laboratorio15 = new Laboratorio("Lab 15");
        Laboratorio laboratorio16 = new Laboratorio("Lab 16", 20);
        Laboratorio laboratorio17 = new Laboratorio("Lab 17", 30, true);

        laboratorio15.exibirInformacoesDoLaboratorio();
        laboratorio16.exibirInformacoesDoLaboratorio();
        laboratorio17.exibirInformacoesDoLaboratorio();
    }
}
