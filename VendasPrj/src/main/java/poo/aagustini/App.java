package poo.aagustini;

public class App {
    public static void main(String[] args) {
        Produto p1 = new Produto(123,"Caneta", 4.5);
        System.out.println(p1.toString());

        CadastroProdutos cadProd = new CadastroProdutos();

        cadProd.cadastrar(p1);
        cadProd.cadastrar(124, "Lapis preto", 2);
        cadProd.cadastrar(125, "Lapis azul", 0.2);
        cadProd.cadastrar(126, "Lapis vermelho", 12);
        cadProd.cadastrar(127, "Caneta vermelha", 5);
    
        System.out.println("Cadastro de Produtos: ");
        System.out.println(cadProd.relatorio());

        Produto prod = cadProd.pesquisa(200);
        if (prod == null)
           System.out.println("produto 200 nao existe");
        else 
            System.out.println("Achou: "+prod.toString());

        prod = cadProd.pesquisa(125);
        if (prod == null)
           System.out.println("produto 125 nao existe");
        else 
            System.out.println("Achou: "+prod.toString());
    
        ItemVenda iv1 = new ItemVenda(10, prod);
        System.out.println("\nItemVenda: " + iv1.toString());


        Venda venda1 = new Venda();

        venda1.inserir(10,prod);
        // cuidado... só funciona se os produtos estiverem no cadastro
        // caso contrário dará um erro de Null pointer...
        venda1.inserir(cadProd.pesquisa(127));
        venda1.inserir(cadProd.pesquisa(126));

        System.out.println(venda1.fecharVenda());
        
    }
}
