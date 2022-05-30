public class classe2 {
    public static void main(String[] args){
        int num=0;
        aluno2 alu1 = new aluno2(++num, 7.5);
        alu1.setperiodo(10);
        System.out.printf(" - Período %d\n", alu1.getperiodo());
        aluno2 alu2 = new aluno2(++num, 10);
        alu2.setperiodo(3);
        System.out.printf(" - Período %d\n", alu2.getperiodo());
        aluno2 alu3 = new aluno2(++num, 5.5);
        alu3.setperiodo(2);
        System.out.printf(" - Período %d\n", alu3.getperiodo());
    }
}
