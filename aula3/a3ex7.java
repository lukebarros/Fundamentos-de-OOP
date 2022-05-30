import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;
public class a3ex7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Float> notas = new ArrayList<Float>();
        float n1, n2, n3, med;
        String sit;
        System.out.print("Nota 1: ");
        n1 = input.nextFloat();
        notas.add(n1);
        System.out.print("Nota 2: ");
        n2 = input.nextFloat();
        notas.add(n2);
        System.out.print("Nota 3: ");
        n3 = input.nextFloat();
        notas.add(n3);
        Collections.sort(notas, Collections.reverseOrder());
        med = (notas.get(0)*4 + notas.get(1)*3 + notas.get(2)*3)/10;
        sit = (med >= 5 ? "Aprovado":"Reprovado");
        System.out.print(sit);
        input.close();
    }
}
