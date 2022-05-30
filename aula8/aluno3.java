public class aluno3 extends pessoa{
    private int matricula;
    private String curso;

    public void cancelarMatricula(){
        System.out.print("A matrícula será cancelada");
        this.matricula=0;
    }

    public int getMatricula(){
            return(matricula);
    }

    public void setMatricula(int matricula){
        this.matricula=matricula;
    }

    public String getcurso(){
        return(curso);
    }

    public void setCurso(String curso){
        this.curso=curso;
    }

    public void infpessoa(){
        System.out.println("----- Informação da pessoa -----");
        System.out.printf("Nome: %s%nIdade: %d%nSexo: %s%n",getNome(), getIdade(), getSexo());
        System.out.printf("Matricula: %d%nCurso: %s%n", this.matricula, this.curso);
    }
}