package poo.aagustini;

public class ItemVenda {
    private int quantidade;
    private Produto prod;

    public ItemVenda(Produto umProduto) {
        this.quantidade = 1;
        this.prod = umProduto;
    }

    public ItemVenda(int qtde, Produto umProduto) {
        this.quantidade = qtde;
        this.prod = umProduto;
    }

    public double getValor() {
        return quantidade * prod.getPreco();
    }

    @Override
    public String toString() {
        return String.format("%15s \t %d \t %.2f",
                              prod.getNome(),
                              this.quantidade,
                              this.getValor() );

    }

}
