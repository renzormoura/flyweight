package padroesestruturais.flyweight;

public class Arvore {

    private int x;
    private int y;
    private TipoArvore tipo;

    public Arvore(int x, int y, TipoArvore tipo) {
        this.x = x;
        this.y = y;
        this.tipo = tipo;
    }

    public TipoArvore getTipo() {
        return tipo;
    }

    public String obterArvore() {
        return "Arvore{" +
                "especie='" + this.tipo.getEspecie() + '\'' +
                ", cor='" + this.tipo.getCor() + '\'' +
                ", x=" + this.x +
                ", y=" + this.y +
                '}';
    }
}
