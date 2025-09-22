package aagustini.poo;

public abstract class Imovel {
    private String proprietario;
    private int areaConstruida;
    private Geo geoLocalizacao;

    private static double VR = 1000;

    public static void setVR(double val) {
        Imovel.VR = val;
    }

    public static double getVR() {
        return Imovel.VR;
    }

    public Imovel(String nome,
                  int areaC,
                  Geo geoLoc) {
        if ( nome == null || nome == "" )
            throw new IllegalArgumentException("nome nao pode ser nulo");
        this.proprietario = nome;
        this.areaConstruida = areaC;
        this.geoLocalizacao = geoLoc;
    }

    public String getProprietario() {
        return proprietario;
    }

    public double getAreaConstruida() {
        return this.areaConstruida;
    }
    
    public abstract double calculaImposto();

    
    @Override
    public String toString() {
        return String.format("Proprietario: %s  Imposto: R$ %.2f",
                            this.proprietario,
                            this.calculaImposto());

    }
}   
