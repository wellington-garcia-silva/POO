import java.util.Scanner;
public class testeAgenda{
    public static void main(String[] args) throws Exception {   
        //System.out.println("Hello, World!");
        int teste;
        int num;
        String nome,endereco,email,cpf,cnpj,estadoCivil,inscricaoEstadul;

        Agenda agenda = new Agenda("Domingo");
        //contatos cont = new contatos();

        /*contatos p1 = new pessoaFisica("well","RJPO","well.silva1","123","casado");
        contatos p2 = new pessoaJuridica("Siemens","AFo","bil.com","456","solteiro");*/
        teste = 1;
        num = 0;
        while(teste == 1){
            Scanner ler =  new Scanner(System.in);
            System.out.println("Digite: 1 - add pFisica; 2 - add pJuridica; 3 - remover pFisica; 4 - remover pJuridica" );

            num = ler.nextInt();

            switch(num) {
                case 1:
                  // code block
                  System.out.println("Digite: nome, endereco, cpf e estado civil " );
                  nome = ler.nextLine();
                  endereco = ler.nextLine(); 
                  email = ler.nextLine();
                  cpf = ler.nextLine(); 
                  estadoCivil = ler.nextLine(); 
                  contatos p1 = new pessoaFisica(nome,endereco,email,cpf,estadoCivil);
                  agenda.setContatos(p1);
                  break;
                case 2:
                  // code block
                  System.out.println("Digite: nome, endereco, cnpj e inscrição estadual" );
                  nome = ler.nextLine();
                  endereco = ler.nextLine(); 
                  email = ler.nextLine();
                  cnpj = ler.nextLine(); 
                  inscricaoEstadul = ler.nextLine(); 
                  contatos p2 = new pessoaJuridica(nome,endereco,email,cnpj,inscricaoEstadul);
                  agenda.setContatos(p2);
                  break;
                case 3:
                  // code block
                  System.out.println("Digite o CPF da pessoa a ser removida:" );
                  //cpf = ler.nextLine();
                  cpf = "123";
                  agenda.buscarConta(cpf);
                break;
                case 4:
                  // code block
                  System.out.println("Digite o CNPJ da pessoa a ser removida:" );
                  cnpj = ler.nextLine();
                  //agenda.remover();

                  
                break;
                default: teste = 0;

                  // code block
              }

        }


        //agenda.setContatos(p1);
        //agenda.setContatos(p2);
        agenda.relatorioAgenda();
    
    }
}
        /*contatos cont = new contatos();

        contatos p1 = new pessoaFisica("well","RJPO","well.silva1","123","casado");
        contatos p2 = new pessoaJuridica("Siemens","AFo","bil.com","456","solteiro");
        agenda.setContatos(p1);
        agenda.setContatos(p2);
        agenda.relatorioAgenda();
        */