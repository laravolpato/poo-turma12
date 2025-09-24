package aagustini.poo;

public class BagagemNormal extends Bagagem {

    private final int numero;

    private static int proxNumeroBagagem = 1000;

    public BagagemNormal(String nome, double peso, Prioridade pri) {
        // problema - a ativação do construtor da superclasse
        // deve ser o primeiro comando, então a validação 
        // do nome deve ser na classe Bagagem
        super(nome, peso, pri);
        proxNumeroBagagem++;
        numero = proxNumeroBagagem;
    }
    
    public static int getProxNumBagagem() {
        return proxNumeroBagagem;
    }

    @Override
    public double calculaCusto() {
        double custo = 0;
        if (getPeso() > 20) {
            custo += (getPeso()-20)*30;
        }
        if (getPrioridade() == Prioridade.PRIORITARIA)
            custo += 200;
        return custo;
    }

    @Override
    public String toString() {
        return String.format("Normal: %d  - %s", 
                             numero, super.toString());
    }
    
}
