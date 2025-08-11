package poo.agustini;


public class Circulo {
    // refatorando para usar uma classe Ponto
   // private double coordX;
   // private double coordY;
    private Ponto centro;
    private double raio;

    public Circulo() {
        //this.coordX = 0;
        //this.coordY = 0;

        this.centro = new Ponto(0,0); 
        this.raio = 1; 
    }
    
    public Circulo(double umX, double umY, double umRaio) {
        //this.coordX = umX;
        //this.coordY = umY;
        
        this.centro = new Ponto(umX, umY);
        this.raio = umRaio;
    }

    public Circulo(Ponto umPonto, double umRaio) {
        //this.coordX = umX;
        //this.coordY = umY;
        
        this.centro = umPonto;
        this.raio = umRaio;
    }

    public void mover(double novoX, double novoY ) {
        //this.coordX = novoX;
        //this.coordY = novoY;

        // opcao 1. criar um novo ponto para o centro
        centro = new Ponto(novoX, novoY);

        // opcao 2. mover o ponto
        centro.mover(novoX, novoY);

    }

    public void zoom(double fator){
        this.raio = this.raio * fator;
    }

    public double area() {
        double area = Math.PI * Math.pow(raio, 2);

        return area;
    }

    @Override
    public String toString(){
        return "centro: " + centro.toString() +
               " raio: "  + this.raio   +
               " area: "  + this.area();

    }
    
}
