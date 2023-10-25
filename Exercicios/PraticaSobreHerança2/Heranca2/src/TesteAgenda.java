public class TesteAgenda {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");
       Contatos pessoa1 = new PessoaFisica("wellington","jpo","wellington.silva1","123","solteiro");
       Agenda agenda1 = new Agenda();
       agenda1.setContatos(pessoa1);

       Contatos pessoa2 = new PessoaJuridica("alphabet","semEndereco","Alphabet.4","321",123);
       //Agenda agenda2 = new Agenda();
       agenda1.setContatos(pessoa2);
       agenda1.gerarRelatorio("123");
    }
}
