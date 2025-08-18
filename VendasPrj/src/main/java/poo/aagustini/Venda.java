package poo.aagustini;

import java.util.ArrayList;

public class Venda {
    // tema (1) - alterar a classe para ter a
    //.           referência para o cliente
    // 
    // private Cliente cliente;
    
    private ArrayList<ItemVenda> itens;

    public Venda() {
        itens = new ArrayList<>();
    }

    public void inserir(Produto prod) {
        ItemVenda iv = new ItemVenda(1, prod);
        itens.add(iv);
    }

    public void inserir(int qtde, Produto prod) {
        ItemVenda iv = new ItemVenda(qtde, prod);
        itens.add(iv);
    }

    public double valorTotal() {
        double total = 0;

        // percorrendo com for each
        for (ItemVenda item : itens) {
            total = total + item.getValor();
        }

        return total;
    }

    public String fecharVenda() {
        StringBuilder notaF = new StringBuilder("\nPOO Vendas \t Nota fiscal...\n");

        for (ItemVenda item : itens) {
            notaF.append("\t");
            notaF.append(item.toString());
            notaF.append("\n");
        }
        return notaF.toString();
    }
}
