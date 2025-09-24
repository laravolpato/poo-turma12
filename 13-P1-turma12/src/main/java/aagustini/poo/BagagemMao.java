package aagustini.poo;

public class BagagemMao extends Bagagem {

 
    public BagagemMao(String nome, double peso, Prioridade pri) {
       super(nome, peso, pri);
    }
    
    @Override
    public double calculaCusto() {
        return 0;    
    }

    @Override
    public String toString() {
        return String.format("Mão - %s", 
                              super.toString());
    }

}