package aagustini.poo;

public class PilhaArrayStr implements IPilhaStr {

    private String[] pilha;
    private int count;

    private final int MAX = 100;

    public PilhaArrayStr() {
        pilha = new String[MAX];
        count = 0;
    }

    @Override
    public void Empilhar(String val) {
        // deveria testar se count < MAX
        pilha[count] = val;
        count = count + 1;
    }

    @Override
    public String Desempilhar() {
        // deveria testar de count > 0
        count = count - 1;
        return pilha[count];
    }

    @Override
    public String Topo() {
        // deveria testar de count > 0
        return pilha[count-1];    }

    @Override
    public Boolean Vazia() {
        //if (count == 0)
        //    return true;
        //else 
        //    return false;
        return (count == 0);
    }
    
}
