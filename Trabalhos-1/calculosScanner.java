import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class calculosScanner {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Float> floats = new ArrayList<Float>();
        float NUM1, NUM2, NUM3, RESULT;
    
        System.out.print("== CALCULO DE VALORES ==\n\n");
    
        System.out.print("Numero 1: ");
        NUM1 = input.nextFloat();
        floats.add(NUM1);
        System.out.print("Numero 2: ");
        NUM2 = input.nextFloat();
        floats.add(NUM2);
        System.out.print("Numero 3: ");
        NUM3 = input.nextFloat();
        floats.add(NUM3);
        Collections.sort(floats, Collections.reverseOrder());

        System.out.printf("\nSoma: %.2f %n",NUM1+NUM2+NUM3);
    
        System.out.printf("Subtracao: %.2f %n",NUM1-NUM2-NUM3);
    
        System.out.printf("Multiplicacao: %.2f %n",NUM1*NUM2*NUM3);
        
        RESULT=NUM1/NUM2/NUM3;

        System.out.printf("Divisao: %.2f %n",RESULT);

        if (floats.get(0) % floats.get(1) == 0 & floats.get(0) % floats.get(2) == 0 & floats.get(1) % floats.get(2) == 0){
            System.out.printf("%.2f, %.2f e %.2f são multiplos", NUM1,NUM2,NUM3);
        }
        else{ 
            System.out.printf("%.2f, %.2f e %.2f não são multiplos",NUM1,NUM2,NUM3);
        }
        input.close();
    }    
}