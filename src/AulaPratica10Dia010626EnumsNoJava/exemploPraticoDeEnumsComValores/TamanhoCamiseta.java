package AulaPratica10Dia010626EnumsNoJava.exemploPraticoDeEnumsComValores;

public enum TamanhoCamiseta {
    PP("muito pequeno", 1),
    P("pequeno", 2),
    M("médio", 3),
    G("grande", 4),
    GG("muito grande", 5);

    private final String descricao;
    private final int id;

    TamanhoCamiseta(String descricao, int id) {
        this.descricao = descricao;
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }
}
