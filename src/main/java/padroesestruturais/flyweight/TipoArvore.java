package padroesestruturais.flyweight;

public class TipoArvore {

    private String especie;
    private String cor;

    public TipoArvore(String especie, String cor) {
        this.especie = especie;
        this.cor = cor;
    }

    public String getEspecie() {
        return especie;
    }

    public String getCor() {
        return cor;
    }
}
