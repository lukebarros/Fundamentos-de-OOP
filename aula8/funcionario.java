public class funcionario extends pessoa{
    private String setor;
    private boolean trabalho;

    public void mudaFuncao(String novoSetor){
        String setorantigo;
        setorantigo=this.setor;
        this.setor=novoSetor;
        System.out.printf("%n%nFunção atualizada com sucesso.%nAnterior: %s%nAtual: %s%n%n", setorantigo, this.setor);
    }

    public String getSetor(){
        return(setor);
    }

    public void setSetor(String setor){
        this.setor=setor;
    }

    public boolean getTrabalho(){
        return(trabalho);
    }

    public void setTrabalho(boolean trabalho){
        this.trabalho=trabalho;
    }

    @Override
    public void infpessoa(){
        System.out.println("----- Informação da pessoa -----");
        System.out.printf("Nome: %s%nIdade: %d%nSexo: %s%n",getNome(), getIdade(), getSexo());
        System.out.printf("Setor: %s%nTrabalho: %s%n", this.setor,this.trabalho);
    }

}