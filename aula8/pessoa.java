public class pessoa {
    public String nome;
    public int idade;
    public String sexo;

    public void fazAniversario(){
        this.idade++;
    }

    public String getNome(){
        return(nome);
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public int getIdade(){
        return(idade);
    }

    public void setIdade(int idade){
        this.idade=idade;
    }

    public String getSexo(){
        return(sexo);
    }

    public void setSexo(String sexo){
        this.sexo=sexo;
    }

    public void infpessoa(){
        System.out.println("----- Informação da pessoa -----");
        System.out.printf("Nome: %s%nIdade: %d%nSexo: %s%n",this.nome, this.idade, this.sexo);
    }
}