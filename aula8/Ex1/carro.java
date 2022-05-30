package Ex1;

public class carro extends autos {
    private String modelo;
    private int qtdportas;
    private String tipdirecao;
    private String arcond;
    private boolean airbag;
    private String cambio;
    private String vidro;
    private double km;

    public void alterarkm(double km){
        this.km+=km;
    }
    
    public String getmodelo(){
        return(modelo);
    }

    public void setmodelo(String modelo){
        this.modelo=modelo;
    }

    public int getqtdportas(){
        return(qtdportas);
    }

    public void setqtdportas(int qtdportas){
        this.qtdportas=qtdportas;
    }

    public String gettipdirecao(){
        return(tipdirecao);
    }

    public void settipdirecao(String tipdirecao){
        this.tipdirecao=tipdirecao;
    }

    public String getarcond(){
        return(arcond);
    }

    public void setarcond(String arcond){
        this.arcond=arcond;
    }

    public boolean getairbag(){
        return(airbag);
    }

    public void setairbag(boolean airbag){
        this.airbag=airbag;
    }

    public String getcambio(){
        return(cambio);
    }

    public void setcambio(String cambio){
        this.cambio=cambio;
    }

    public String getvidro(){
        return(vidro);
    }

    public void setvidro(String vidro){
        this.vidro=vidro;
    }

    public double getkm(){
        return(km);
    }

    public void setkm(double km){
        this.km=km;
    }

    @Override
    public void infauto(){
        System.out.println("----- Informação do Automóvel -----");
        System.out.printf("Marca do Automóvel: %s%nModelo: %s%nLugares: %s%nRodas: %d%nCombustível: %s%nCV: %d%n", 
        getmarca(), getmodelo(), getlugares(), getrodas(), getcombustivel(), getcv());
        System.out.printf("KM atual: %.1f%n", this.km);
    }
}
