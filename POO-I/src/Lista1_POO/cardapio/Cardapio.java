package Lista1_POO.cardapio;
import java.util.HashMap;
import java.util.Map;

public class Cardapio {
    private Map<Integer, Item> itens = new HashMap<>();

    public Cardapio() {
        itens.put(100, new Item(100, "Cachorro Quente", 1.20));
        itens.put(101, new Item(101, "Bauru Simples", 1.30));
        itens.put(102, new Item(102, "Bauru com Ovo", 1.50));
        itens.put(103, new Item(103, "Hambúrguer", 1.20));
        itens.put(104, new Item(104, "Cheeseburguer", 1.30));
        itens.put(105, new Item(105, "Refrigerante", 1.00));
    }

    public Item getItem(int codigo) {
        return itens.get(codigo);
    }
}