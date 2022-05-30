package Ex1;

public class modelojogo{
    public static void main(String[] args){
        carro carro1 = new carro();
        carro lotus98t = new carro();
        caminhao caminhao1 = new caminhao();
        moto moto1 = new moto();
        
        carro1.setmarca("VOLKSWAGEN");
        caminhao1.setmarca("MERCEDES");
        moto1.setmarca("YAMAHA");

        carro1.setcombustivel("TANQUE CHEIO");
        caminhao1.setcombustivel("TANQUE VAZIO");
        moto1.setcombustivel("TANQUE CHEIO");

        carro1.setrodas(4);
        caminhao1.setrodas(4);
        moto1.setrodas(2);

        carro1.setlugares(4);
        caminhao1.setlugares(2);
        moto1.setlugares(2);

        carro1.setkm(10);
        carro1.alterarkm(60);
        carro1.setcv(60);
        carro1.setmodelo("FOX");
        
        caminhao1.setcarroceria(true);
        caminhao1.setcarga(true);

        moto1.settipopneu("STREET");
        moto1.trocapneu("SLICK");


        carro1.infauto();
        caminhao1.infauto();
        moto1.infauto();

        lotus98t.setmarca("LOTUS - FORMULA 1 RACING TEAM");
        lotus98t.setmodelo("98T | 1986");
        lotus98t.setcombustivel("30 LITROS");
        lotus98t.setrodas(4);
        lotus98t.setlugares(1);
        lotus98t.setkm(320);
        lotus98t.setcv(1200);

        lotus98t.infauto();

    }
}


