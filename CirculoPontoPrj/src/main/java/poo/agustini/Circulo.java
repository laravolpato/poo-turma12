package poo.agustini;


public class Circulo {
    //private double coordX;
    //private double coordY;
    private Ponto centro;
    private double raio;

    public Circulo() {
        //this.coordX = 0;
        //this.coordY = 0;
        
        this.raio = 1;
        this.centro = new Ponto(0,0);
 
    }
    
        public Circulo(double umX, double umY, double umRaio) {
        //this.coordX = umX;
        //this.coordY = umY;
        centro = new Ponto(umX, umY);
        this.raio = umRaio;
    }

    public void mover(double novoX, double novoY ) {
        this.coordX = novoX;
        this.coordY = novoY;
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
        return "centro: " + this.coordX +
               ", "       + this.coordY +
               " raio: "  + this.raio   +
               " area: "  + this.area();

    }
    
}
