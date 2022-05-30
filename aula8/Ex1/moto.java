package Ex1;

public class moto extends autos {
    private String tipo;
    private String freio;
    private String barEscapamento;
    private String tipopneu;

    public void trocapneu(String novopneu){
        this.tipopneu = novopneu;

    }

    public String gettipo(){
        return(tipo);
    }

    public void settipo(String tipo){
        this.tipo=tipo;
    }

    public String getfreio(){
        return(freio);
    }

    public void setfreio(String freio){
        this.freio=freio;
    }

    public String getbarEscapamento(){
        return(barEscapamento);
    }

    public void setbarEscapamento(String barEscapamento){
        this.barEscapamento=barEscapamento;
    }

    public String gettipopneu(){
        return(tipopneu);
    }

    public void settipopneu(String tipopneu){
        this.tipopneu=tipopneu;
    }
    
    @Override
    public void infauto(){
        System.out.println("----- Informação do Automóvel -----");
        System.out.printf("Marca do Automóvel: %s%nLugares: %s%nRodas: %d%nCombustível: %s%n", 
        getmarca(), getlugares(), getrodas(), getcombustivel());
        System.out.printf("Tipo do pneu: %s%n", this.tipopneu);
    }
}
