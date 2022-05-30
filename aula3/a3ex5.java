import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;
public class a3ex5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        List<Integer> ints = new ArrayList<Integer>();
        int n1, n2, n3;
        System.out.print("Número 1: ");
        n1 = input.nextInt();
        ints.add(n1);
        System.out.print("Número 2: ");
        n2 = input.nextInt();
        ints.add(n2);
        System.out.print("Número 3: ");
        n3 = input.nextInt();
        ints.add(n3);
        Collections.sort(ints, Collections.reverseOrder());
        System.out.print(ints.get(0) + ", " + ints.get(1) + ", " + ints.get(2));
        input.close();
    }
}