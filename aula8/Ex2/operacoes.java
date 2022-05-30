package Ex2;
public class operacoes extends numero {
    
    private int op;

    public void setOp(int op) {
        this.op=op;
    }

    public int getOp() {
        return this.op;
    }

    public void resultado(double n1, double n2){
        switch(this.op) {
            case 1:
                System.out.printf("Resultado da Soma: %.2f", n1+n2);
                break;
            case 2:
                System.out.printf("Resultado da Subtração: %.2f", n1-n2);
                break;
            case 3:
                System.out.printf("Resultado da Multiplicação: %.2f", n1*n2);
                break;
            case 4:
                System.out.printf("Resultado da Divisão: %.2f", n1/n2);
                break;
        }
    }
}