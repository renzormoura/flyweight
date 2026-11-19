package padroesestruturais.flyweight;

public class Main {

    public static void main(String[] args) {
        Floresta floresta = new Floresta();
        floresta.plantar(1, 2, "Ipê", "Amarelo");
        floresta.plantar(5, 3, "Ipê", "Amarelo");
        floresta.plantar(8, 1, "Ipê", "Amarelo");
        floresta.plantar(4, 7, "Pau-brasil", "Verde");

        for (String arvore : floresta.obterArvores()) {
            System.out.println(arvore);
        }
        System.out.println("Árvores plantadas: " + floresta.getArvores().size());
        System.out.println("Tipos criados na memória: " + TipoArvoreFactory.getTotalTipos());
    }
}
