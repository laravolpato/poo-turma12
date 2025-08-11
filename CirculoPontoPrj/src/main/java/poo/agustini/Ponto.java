package poo.agustini;

public class Ponto {
    private double cx;
    private double cy;

    public Ponto(double cx, double cy) {
        this.cx = cx;
        this.cy = cy;
    }

    public void mover(double novoX, double novoY) {
        this.cx = novoX;
        this.cy = novoY;
    }
    
    @Override
    public String toString() {
        return String.format("(%.1f, %.1f)", 
                             this.cx, 
                             this.cy);
    }
}
