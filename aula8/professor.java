public class professor extends pessoa{

    private String especialidade;
    private double salario;

    public void recebeAumento(double aumento){
        double salarioantigo;
        salarioantigo = this.salario;
        this.salario+=aumento;
        System.out.printf("%n%nSalário atualizado com sucesso.%nAnterior: %.2f%nAtual: %.2f%n%n", salarioantigo, this.salario);
    }
    
    public String getEspecialidade(){
        return(especialidade);
    }

    public void setEspecialidade(String especialidade){
        this.especialidade=especialidade;
    }

    public double getSalario(){
        return(salario);
    }

    public void setSalario(double salario){
        this.salario=salario;
    }

    @Override
    public void infpessoa(){
        System.out.println("----- Informação da pessoa -----");
        System.out.printf("Nome: %s%nIdade: %d%nSexo: %s%n",getNome(), getIdade(), getSexo());
        System.out.printf("Especialidade: %s%nSalário: %.2f%n", this.especialidade, this.salario);
    }
}