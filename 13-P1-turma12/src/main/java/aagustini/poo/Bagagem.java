package aagustini.poo;

// classe abstrata - não pode ser instanciada
public abstract class Bagagem { 
    private String nome;
    private double peso;
    private Prioridade prioridade;

    public Bagagem(String nome, double peso, Prioridade pri) {
        if ( nome == null || nome.isBlank())
            throw new IllegalArgumentException("Nome inválido.");
        
        this.nome = nome;
        this.peso = peso; 
        this.prioridade = pri;
    }

    public String getNome() { return nome; }
    public double getPeso() { return peso; }
    public Prioridade getPrioridade() { return prioridade; }

    // método abstrato - todas subclasses de Bagagem
    // devem implementar
    public abstract double calculaCusto();

    // estou sobrescrevendo o método toString
    @Override
    public String toString() {
        //return "Cliente: " + getNome();
        return String.format("Nome: %s Custo: %.2f Tipo: %s",
                        getNome(), calculaCusto(), prioridade);
    }
}
