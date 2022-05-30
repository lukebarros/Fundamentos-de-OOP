public class a5ex3 {
    public static void main(String[] args){
        float n1, mult=0;
        for (n1 = 0; n1 <= 1000; n1++){
            mult+=(n1*5);
        }
        System.out.printf("S = %.2f", mult);
    }
}
