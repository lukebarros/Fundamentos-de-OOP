public class projetofaculdade {
    public static void main(String[] args){
        pessoa p1 = new pessoa();
        aluno3 p2 = new aluno3(); 
        professor p3 = new professor();
        funcionario p4 = new funcionario();

        p1.setNome("Lucas");
        p1.setIdade(25);
        p1.setSexo("M");

        p2.setNome("Lucas");
        p2.setIdade(25);
        p2.setSexo("M");
        p2.setMatricula(202102);
        p2.setCurso("ADS");

        p3.setNome("Professor1");
        p3.setIdade(54);
        p3.setSexo("F");
        p3.setEspecialidade("Informática");
        p3.setSalario(20000.20);

        p4.setNome("Funcionario1");
        p4.setIdade(40);
        p4.setSexo("M");
        p4.setSetor("Atendimento");
        p4.setTrabalho(true);

        p1.infpessoa();
        p2.infpessoa();
        p3.infpessoa();
        p4.infpessoa();

        p3.recebeAumento(2000);
        p4.mudaFuncao("Coordenação");

        p3.infpessoa();
        p4.infpessoa();
    }
}