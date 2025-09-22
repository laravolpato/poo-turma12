package aagustini.poo;

public class App {
    public static void main(String[] args) {
 
        
        Imovel.setVR(500);

        // imovel é abstact - nao posso dar new
        //Imovel i1 = new Imovel("hugo", 250, new Geo(1,2));

        try {
        Imovel ierro = new Residencial("",
                                   250, 
                                   new Geo(1,2), 
                                   1000);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        Imovel i1 = new Residencial("hugo",
                                   250, 
                                   new Geo(1,2), 
                                   1100);
        Imovel i2 = new Residencial("zeca",
                                   310, 
                                   new Geo(1,2), 
                                   700);
        Imovel i3 = new Comercial("hugo",
                                   350, 
                                   new Geo(1,2));
        Imovel i4 = new Comercial("pedro",
                                   350, 
                                   new Geo(1,2));
                    
        CadastroImoveis cadImoveis = new CadastroImoveis();

        cadImoveis.cadastrar(i4);
        cadImoveis.cadastrar(i1);
        cadImoveis.cadastrar(i2);
        cadImoveis.cadastrar(i3);     
        
        //cadImoveis.listarSOUT();

        //String relat = cadImoveis.listar();
        //System.out.println( relat );

        System.out.println( cadImoveis.listar() );

        cadImoveis.listar("hugo");
    
    }
}
