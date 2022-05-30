public class aluno2 {
    private int periodo = 1;
    private int maxperiodo = 8;
    public aluno2(int i, double nota){
        System.out.printf("Aluno %d Criado, nota: %.2f", i, nota);
    } 
    public int getperiodo(){
        return(this.periodo);
    }
    public void setperiodo(int periodo){
        if (periodo > maxperiodo){
            this.periodo=maxperiodo;
        }
        else{
            this.periodo=periodo;
        }
    }
}