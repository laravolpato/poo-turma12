package aagustini.poo;

public class Residencial extends Imovel {
    
    private int areaTerreno;

    public Residencial(String nome,
                  int areaC,
                  Geo geoLoc,
                  int areaTerreno) {
        super(nome, areaC, geoLoc);
        this.areaTerreno = areaTerreno;
    }

    @Override
    public double calculaImposto() {
        double imposto;
        double areaC = getAreaConstruida();

        if (areaC <= 200) {
            imposto = 0;
        } else {
            imposto = (areaC - 200) * Imovel.getVR();
        }
        // imposto extra de terreno
        if ( areaTerreno > 1000) {
            imposto = imposto + 100 * Imovel.getVR();
        }
        return imposto;
    }

    @Override
    public String toString() {
        String res = "Residencial - " + 
                super.toString();
        
        if ( areaTerreno > 1000)
            res = res +  " Imposto terreno: " +
                100 * Imovel.getVR();

        return res;
    }

}
