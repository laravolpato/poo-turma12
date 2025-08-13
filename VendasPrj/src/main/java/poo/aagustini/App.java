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
    
    }
}
