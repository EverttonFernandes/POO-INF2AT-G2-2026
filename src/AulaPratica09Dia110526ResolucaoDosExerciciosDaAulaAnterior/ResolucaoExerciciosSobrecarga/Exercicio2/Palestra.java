package AulaPratica09Dia110526ResolucaoDosExerciciosDaAulaAnterior.ResolucaoExerciciosSobrecarga.Exercicio2;

public class Palestra {
    private String assunto;
    private String palestrante;
    private String dataDoEvento;
    private boolean possuiBrinde;

    public Palestra(String assunto) {
        this.assunto = assunto;
    }

    public Palestra(String assunto, String palestrante) {
        this.assunto = assunto;
        this.palestrante = palestrante;
    }

    public Palestra(String assunto, String palestrante, String dataDoEvento) {
        this.assunto = assunto;
        this.palestrante = palestrante;
        this.dataDoEvento = dataDoEvento;
    }

    public Palestra(String assunto, String palestrante, String dataDoEvento, boolean possuiBrinde) {
        this.assunto = assunto;
        this.palestrante = palestrante;
        this.dataDoEvento = dataDoEvento;
        this.possuiBrinde = possuiBrinde;
    }

    public void exibirDetalhesDaPalestra() {
        System.out.println("########################################");
        System.out.println("Assunto da palestra: " + this.assunto);
        System.out.println("Palestrante: " + this.palestrante);
        System.out.println("Data do evento: " + this.dataDoEvento);

        if (this.possuiBrinde) {
            System.out.println("A palestra possui brinde!");
        } else {
            System.out.println("A palestra NÃO possui brinde!");
        }
    }
}
