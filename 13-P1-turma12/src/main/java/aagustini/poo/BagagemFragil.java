package aagustini.poo;

public class BagagemFragil extends Bagagem {

 
   public BagagemFragil(String nome, double peso, Prioridade pri) {
       super(nome, peso, pri);
   }
    


    @Override
    public double calculaCusto() {
        return 500;    
    }

    @Override
    public String toString() {
        return String.format("Frágil - %s", 
                              super.toString());
    }


}

