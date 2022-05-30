package Ex1;

public class autos {
    public int lugares;
    public String marca;
    public int cv;
    public int rodas;
    public String combustivel;
    public double velocidade;
    public boolean ligado;

    public void aceleracao(){
        this.velocidade++;
    }

    public void freio(){
        this.velocidade--;
    }

    public void ligado(){
        this.ligado=true;
    }

    public void desligado(){
        this.ligado=false;
    }

    public int getlugares(){
            return(lugares);
    }

    public void setlugares(int lugares){
        this.lugares=lugares;
    }
    
    public String getmarca(){
            return(marca);
    }

    public void setmarca(String marca){
        this.marca=marca;
    }

    public int getcv(){
            return(cv);
    }

    public void setcv(int cv){
        this.cv=cv;
    }

    public int getrodas(){
            return(rodas);
    }

    public void setrodas(int rodas){
        this.rodas=rodas;
    }

    public String getcombustivel(){
            return(combustivel);
    }

    public void setcombustivel(String combustivel){
        this.combustivel=combustivel;
    }

    public double getvelocidade(){
            return(velocidade);
    }

    public void setvelocidade(double velocidade){
        this.velocidade=velocidade;
    }

    public boolean getligado(){
        return(ligado);
    }

    public void setligado(boolean ligado){
        this.ligado=ligado;
    }

    public void infauto(){
        System.out.println("----- Informação do Automóvel -----");
        System.out.printf("Marca do Automóvel: %s%nLugares: %s%nRodas: %d%nCombustível: %s%n", 
         this.marca, this.lugares, this.rodas, this.combustivel);
    }
}
