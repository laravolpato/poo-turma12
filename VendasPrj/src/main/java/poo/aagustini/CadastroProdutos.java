package poo.aagustini;

import java.util.ArrayList;

public class CadastroProdutos {
    private ArrayList<Produto> lista;

    // ia funcionar assim, mas EU... não gosto...
    // private ArrayList<Produto> lista = new ArrayList<>();

    public CadastroProdutos() {
        lista = new ArrayList<>();
    }

    public void cadastrar(Produto prod) {
        lista.add(prod);
    }

    public void cadastrar(int codigo, String nnnn, double preco) {
        Produto prod = new Produto(codigo, nnnn, preco);
        lista.add(prod);

        // ou... sendo econômico... apenas:
        //lista.add( new Produto(codigo, nome, preco) );
    }

    public Produto pesquisa(int codigo) {
        return null;
    }

    public String relatorio() {
        StringBuilder rel = new StringBuilder();

        // forma tradicional
        for (int i=0; i<lista.size(); i++) {
            Produto prod = lista.get(i);
            rel.append(prod.toString());
            rel.append("\n");
        }

        // tema: reescrever com foreach

        return rel.toString();
    }

}


