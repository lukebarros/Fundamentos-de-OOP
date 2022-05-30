package Ex1;

public class caminhao extends autos {
    private String transmissao;
    private boolean carroceria;
    private String tracao;
    private String suspensao;
    private boolean carga;

    public void verificaCarga(){
        if (this.carroceria && this.carga == true)
            System.out.print("Carga: Possui carga.\n");
        else
            System.out.print("Carga: Não possui carga.\n");
    }

    public String gettransmissao(){
            return(transmissao);
    }

    public void settransmissao(String transmissao){
        this.transmissao=transmissao;
    }

    public String gettracao(){
            return(tracao);
    }

    public void settracao(String tracao){
        this.tracao=tracao;
    }
    
    public String getsuspensao(){
            return(suspensao);
    }

    public void setsuspensao(String suspensao){
        this.suspensao=suspensao;
    }

    public boolean getcarroceria(){
            return(carroceria);
    }

    public void setcarroceria(boolean carroceria){
        this.carroceria=carroceria;
    }

    public boolean getcarga(){
            return(carga);
    }

    public void setcarga(boolean carga){
        this.carga=carga;
    }

    @Override
    public void infauto(){
        System.out.println("----- Informação do Automóvel -----");
        System.out.printf("Marca do Automóvel: %s%nLugares: %s%nRodas: %d%nCombustível: %s%n", 
        getmarca(), getlugares(), getrodas(), getcombustivel());
        verificaCarga();
    }
}