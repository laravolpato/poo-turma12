# 13-P1-turma12

Projeto Maven criado automaticamente com Java 21 e JUnit 5.

## Como compilar e rodar

```bash
mvn compile
mvn exec:java -Dexec.mainClass="aagustini.poo.App"
```

## Como rodar testes

```bash
mvn test
```

## Solução exemplo da prova P1


Para todas as questões considere os trechos de código que seguem:

```java
public enum Prioridade {
     NORMAL, PRIORITARIA;
}

public abstract class Bagagem { 
    private String nome;
    private double peso;
    private Prioridade prioridade;

    public Bagagem(String nome, double peso, Prioridade pri) {
        this.nome = nome;
        this.peso = peso; 
        this.prioridade = pri;
    }

    public String getNome() { return nome; }
    public double getPeso() { return peso; }
    public Prioridade getPrioridade() { return prioridade; }

    public abstract double calculaCusto();

    @Override
    public String toString() {
        return "Cliente: " + getNome();
    }
}
1) (4 pontos)
Sabendo que a classe BagagemNormal é derivada da classe Bagagem, apresente o código da classe BagagemNormal, sabendo que:

a. O construtor da classe deve verificar se o nome fornecido – no caso de ser null gerar uma exceção do tipo IllegalArgumentException;
b. Ainda no construtor dessa classe deve ser gerado um número de bagagem, sequencial, a cada nova bagagem criada (os números iniciam a partir do número 1000). Não esqueça de declarar, na classe, os atributos necessários e acrescentar um seletor (getter) que retorna o próximo número de bagagem que será gerado.
c. Para bagagens normais o custo é calculado da seguinte forma: os primeiros 20kg são gratuitos e é pago um adicional de R$ 30,00 por quilograma excedente. Bagagens PRIORITÁRIAS pagam uma taxa extra de R$ 200,00.
d. O método toString deve incluir o nome do proprietário, número da Bagagem e o valor do custo.

2) (4 pontos)
Suponha a classe CadastroBagagens, contendo um atributo declarado da seguinte forma:

java
Copiar código
ArrayList<Bagagem> bagagens = new ArrayList<>();
Suponha também que foram armazenados neste atributo dados de bagagens correspondentes às subclasses da classe Bagagem (BagagemNormal, BagagemDeMao, BagagemFragil). Considerando esta situação escreva os métodos abaixo:

a. Adicionar uma nova bagagem à lista de bagagens;
b. Retornar uma String contendo o nome do proprietário e custo de todas as bagagens cadastradas, e ao final adicionar o valor total cobrado de bagagens;
c. Retornar o percentual de bagagens de mão do cadastro (dado pelo número de bagagens de mão dividido pelo número de bagagens do cadastro);
d. Escreva um método de pesquisa que retorne os dados de uma bagagem a partir do nome do seu proprietário, ou null caso a bagagem não esteja no cadastro.

3) (2 pontos)
Escreva um trecho de código do método main, da classe App, que permita testar tudo que foi solicitado nas questões anteriores.

4) (1 ponto)
Responda sucintamente (explique/exemplifique suas respostas):

a) Neste problema pode ser observado polimorfismo?
b) Neste problema pode ser observado sobrecarga?
c) Neste problema pode ser observado sobrescrita?
d) Qual a implicação da classe Bagagem ser abstract?
e) Qual a implicação do método calculaCusto ser abstract?

