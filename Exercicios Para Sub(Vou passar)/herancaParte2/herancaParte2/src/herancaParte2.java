import java.util.Scanner;;
public class herancaParte2 {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Agenda agenda = new Agenda();
        Scanner ler = new Scanner(System.in);
        int opcao,opcao2;
        boolean sim;
        String nome, endereco,email,cpf,cnpj,estadoCivil;
        int inscricaoEstadual;
        do{
            System.out.println("Qual opcao vc prefere: \n");
            System.out.println("1 - inserir contatos: \n");
            System.out.println("2 - remover contatos: \n");
            System.out.println("3 - visualizar contatos: \n");

            opcao=ler.nextInt();
            if(opcao==1){
                System.out.println("Qual tipo de Contato a inserir:1- Pessoa Fisica/ 2- PessoaJuridica \n");
                opcao2=ler.nextInt();
                if(opcao2==1){
                    System.out.println("Digite: nome, endereco, email,cpf,estado Civil");
                    nome=ler.nextLine();
                    endereco=ler.nextLine();
                    email=ler.nextLine();
                    cpf=ler.nextLine();
                    estadoCivil=ler.nextLine();
                    Contato pessoa = new PessoaFisica(nome,endereco,email,cpf,estadoCivil);
                    agenda.setContatos(pessoa);

                }
                else if(opcao2==2){
                    System.out.println("Digite: nome, endereco, email,cnpj,incrição estadual");
                    nome=ler.nextLine();
                    endereco=ler.nextLine();
                    email=ler.nextLine();
                    cnpj=ler.nextLine();
                    inscricaoEstadual=ler.nextInt();
                    Contato pessoa = new PessoaJuridica(nome,endereco,email,cnpj,inscricaoEstadual);
                    agenda.setContatos(pessoa);
                }
                else System.out.println("Opcao Invalida");
            }
            else if(opcao==3){
                agenda.gerarRelatorio();
            }
            System.out.println("Voc~e deseja continual? 1 - true / 0 - false \n");
            sim=ler.nextBoolean();
        }
        while(sim);
        
    }
}
