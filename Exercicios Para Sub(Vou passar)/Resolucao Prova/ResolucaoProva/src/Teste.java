public class Teste {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Diario diario = new Diario();
        Aluno aluno1 = new AlunoRegular("Luiz","202211234",61,15);
        Aluno aluno2 = new AlunoEspecial("Paulo","202124321",52);
        Aluno aluno3 = new AlunoEspecial("Marco","202019876",49);
        Aluno aluno4 = new AlunoRegular("Ricardo","201826543",61,12);

        //diario.Remover("202211234");
        System.out.println("Hello, World!");
    }
}
