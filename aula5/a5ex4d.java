public class a5ex4d {
    public static void main(String[] args){
        float n1, soma=0;
        for (n1 = 1; n1 <= 50; n1++){
            soma += (n1/(51-n1));
        }
        System.out.printf("S = %.2f", soma);
    }
}