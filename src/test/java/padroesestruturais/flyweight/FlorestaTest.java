package padroesestruturais.flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlorestaTest {

    Floresta criarFloresta() {
        Floresta floresta = new Floresta();
        floresta.plantar(1, 2, "Ipê", "Amarelo");
        floresta.plantar(5, 3, "Ipê", "Amarelo");
        floresta.plantar(8, 1, "Ipê", "Amarelo");
        floresta.plantar(4, 7, "Pau-brasil", "Verde");
        return floresta;
    }

    @Test
    void deveRetornarArvores() {
        List<String> saida = Arrays.asList(
                "Arvore{especie='Ipê', cor='Amarelo', x=1, y=2}",
                "Arvore{especie='Ipê', cor='Amarelo', x=5, y=3}",
                "Arvore{especie='Ipê', cor='Amarelo', x=8, y=1}",
                "Arvore{especie='Pau-brasil', cor='Verde', x=4, y=7}");

        assertEquals(saida, criarFloresta().obterArvores());
    }

    @Test
    void deveCompartilharTipoEntreArvoresDaMesmaEspecie() {
        Floresta floresta = criarFloresta();

        assertSame(floresta.getArvores().get(0).getTipo(), floresta.getArvores().get(1).getTipo());
        assertNotSame(floresta.getArvores().get(0).getTipo(), floresta.getArvores().get(3).getTipo());
    }

    @Test
    void deveRetornarTotalTipos() {
        criarFloresta();

        assertEquals(2, TipoArvoreFactory.getTotalTipos());
    }
}
