public class calculos {
    public static void main(String[] args){
        float NUM1=100, NUM2=10, NUM3=20, RESULT;
    
        System.out.print("== CALCULO DE VALORES ==\n\n");
    
        System.out.printf("Numeros 1, 2 e 3: %.2f, %.2f e %.2f %n",NUM1,NUM2,NUM3);
        
        System.out.printf("Soma: %.2f %n",NUM1+NUM2+NUM3);
    
        System.out.printf("Subtracao: %.2f %n",NUM1-NUM2-NUM3);
    
        System.out.printf("Multiplicacao: %.2f %n",NUM1*NUM2*NUM3);
    
        RESULT=NUM1/NUM2/NUM3;
    
        System.out.printf("Divisao: %.2f %n",RESULT);
    }    
}