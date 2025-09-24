package aagustini.poo;

public class App {
    public static void main(String[] args) {
        CadastroBagagens cad = new CadastroBagagens();

        cad.inserir(new BagagemNormal("Hugo", 23, Prioridade.NORMAL));
        cad.inserir(new BagagemNormal("Mika", 13, Prioridade.PRIORITARIA));
        cad.inserir(new BagagemFragil("Rosa", 22, Prioridade.NORMAL));
        cad.inserir(new BagagemNormal("Zeca", 22, Prioridade.PRIORITARIA));
        cad.inserir(new BagagemMao("Kiko", 5, Prioridade.NORMAL));
        cad.inserir(new BagagemMao("Juca", 6, Prioridade.NORMAL));
        cad.inserir(new BagagemNormal("Luis", 22, Prioridade.PRIORITARIA));

        System.out.println();
        System.out.println(cad.toString());
        System.out.println();

        System.out.println("Pesquisa Zeca => "+ cad.find("Zeca"));
        System.out.println("\nPesquisa Lucas => "+ cad.find("Lucas"));
        System.out.println();

        System.out.println(String.format("Bagagens de mão: %.1f%%", cad.percentualMao()*100));
        System.out.println();

        try {
            Bagagem erro = new BagagemNormal("", 10, Prioridade.NORMAL);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: "+e.getMessage());
        }

        System.out.println();
    }
}
