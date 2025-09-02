package Desafio;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String id;
    private List<String> itens = new ArrayList<>();
    private double valorTotal;

    public Pedido(String id) {
        this.id = id;
    }

    public void adicionarItem(String item, double preco) {
        itens.add(item);
        valorTotal += preco;
    }

    public String getId() {
        return id;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id: '" + id + '\'' +
                ", itens: " + itens +
                ", valorTotal: " + valorTotal +
                '}';
    }
}
