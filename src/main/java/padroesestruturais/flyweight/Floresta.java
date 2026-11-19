package padroesestruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Floresta {

    private List<Arvore> arvores = new ArrayList<>();

    public void plantar(int x, int y, String especie, String cor) {
        TipoArvore tipo = TipoArvoreFactory.getTipoArvore(especie, cor);
        arvores.add(new Arvore(x, y, tipo));
    }

    public List<Arvore> getArvores() {
        return arvores;
    }

    public List<String> obterArvores() {
        List<String> saida = new ArrayList<String>();
        for (Arvore arvore : this.arvores) {
            saida.add(arvore.obterArvore());
        }
        return saida;
    }
}
