package aagustini.poo;

public class Comercial extends Imovel {
      public Comercial(String nome,
                  int areaC,
                  Geo geoLoc) {
        super(nome, areaC, geoLoc);

    }

    @Override
    public double calculaImposto() {
        return 777;
    }

    @Override
    public String toString() {
        return "Comercial - " + super.toString();
    }

}
