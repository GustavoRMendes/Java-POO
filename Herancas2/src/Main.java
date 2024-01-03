public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        Professor professor1 = new Professor();

        aluno1.setNome("NOME: Gustavo");
        professor1.setNome("NOME: Maria");
        aluno1.setCpf("CPF: 939498332-000");
        aluno1.setCurso("CURSO: Sistemas");

        professor1.setCpf("CPF: 82983921-000");
        aluno1.setTelefone("TELEFONE: 992378778");
        professor1.setTelefone("TELEFONE: 998297272");
        professor1.setsalario("SALÁRIO: R$1200.00");

        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getCpf());
        System.out.println(aluno1.getTelefone());
        System.out.println(aluno1.getCurso());

        System.out.println(professor1.getNome());
        System.out.println(professor1.getCpf());
        System.out.println(professor1.getTelefone());
        System.out.println(professor1.getsalario());
    }
}