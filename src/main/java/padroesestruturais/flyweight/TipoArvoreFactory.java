package padroesestruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TipoArvoreFactory {

    private static Map<String, TipoArvore> tipos = new HashMap<>();

    public static TipoArvore getTipoArvore(String especie, String cor) {
        TipoArvore tipo = tipos.get(especie);
        if (tipo == null) {
            tipo = new TipoArvore(especie, cor);
            tipos.put(especie, tipo);
        }
        return tipo;
    }

    public static int getTotalTipos() {
        return tipos.size();
    }
}
