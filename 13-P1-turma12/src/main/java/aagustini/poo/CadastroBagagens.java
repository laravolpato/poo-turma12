package aagustini.poo;

import java.util.ArrayList;

public class CadastroBagagens {
    // cadastro é de bagagens e por polimorfismo podemos 
    // inserir na lista bagagens Normais, de Mão e Frágeis
    ArrayList<Bagagem> bagagens;

    public CadastroBagagens() {
        bagagens = new ArrayList<>();
    }

    public void inserir(Bagagem aluno) {
        bagagens.add(aluno);
    }

    public double percentualMao() {
        int countMao = 0;
        for (Bagagem bag : bagagens) {
            if ( bag instanceof BagagemMao ) {
                countMao++;
            }
        }
        // dará erro se lista estiver vazia
        return (double) countMao / bagagens.size();
    }

    // deveria (?) ter previsto que um cliente
    // pode ter uma lista de bagagens...
    public Bagagem find(String nome) {
        for (Bagagem bag : bagagens) 
            if (bag.getNome().equals(nome))
                return bag;
        return null;
    }

    @Override
    public String toString() {
        double total = 0;
        StringBuilder sb = new StringBuilder("Cadastro de bagagens\n");
        for (Bagagem bag : bagagens) {
            sb.append(bag.toString());
            sb.append("\n");
            total += bag.calculaCusto();
        }
        sb.append("Custo total bagagens: ");
        sb.append(total);
        return sb.toString();
    }
}
