package AulaPratica10Dia010626EnumsNoJava.exemploPraticoDeEnumsComValores;

public class Camiseta {
    private String marca;
    private boolean temEstampa;
    private TamanhoCamiseta tamanhoCamiseta;

    public Camiseta(String marca, boolean temEstampa, TamanhoCamiseta tamanhoCamiseta) {
        this.marca = marca;
        this.temEstampa = temEstampa;
        this.tamanhoCamiseta = tamanhoCamiseta;
    }

    public String getMarca() {
        return marca;
    }

    public boolean isTemEstampa() {
        return temEstampa;
    }

    public TamanhoCamiseta getTamanhoCamiseta() {
        return tamanhoCamiseta;
    }

    public void exibirInformacoes() {
        System.out.println("####################################################");
        System.out.println("A marca da camiseta é: " + this.getMarca());
        System.out.println("O tamanho da camiseta é : " + this.getTamanhoCamiseta().getDescricao());

        if (this.temEstampa) {
            System.out.println("A camiseta possui estampa!");
        } else {
            System.out.println("A camiseta não possui estampa!");
        }
    }
}
