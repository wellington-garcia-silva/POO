/**
 * @author NOME
 A class Estadio representa um estádio com opções de administração, reservas e relatórios de cadeiras de diferentes
 tipos de assentos. O estádio tem um nome, capacidade e partida.
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Estadio {

    private ArrayList<Reserva> reserva;
    private String nomeEstadio;
    private String Partida;
    private int Capacidade;


    /**
     * Constrói um objeto Estadio com os parâmetros de nome, partida e capacidade.
     *
     * @param nomeEstadio O nome do estádio.
     * @param Partida A partida que será realizada.
     * @param Capacidade A capacidade de espectadores do estádio.
     */
    public Estadio(String nomeEstadio, String Partida, int Capacidade) {
        this.nomeEstadio = nomeEstadio;
        this.Partida = Partida;
        this.Capacidade = Capacidade;
        reserva = new ArrayList<>();
    }

    /**
     * Mostra o menu principal que permite o acesso às opções de administração, reservas, relatórios e saída.
     */
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        boolean condicao = true;
        while (condicao == true) {
            System.out.println("1 - Administração");
            System.out.println("2 - Reservas");
            System.out.println("3 - Relatórios");
            System.out.println("4 - Sair");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    menuAdministracao();
                    break;
                case 2:
                    menuReservas();
                    break;
                case 3:
                    menuRelatorios();
                    break;
                case 4:
                    condicao = false;
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        System.out.println("Fim do programa!");
    }

    /**
     * Mostra o menu de administração que permite o acesso às opções de cadastro de reserva, remoção de reserva, e verificação de
     * reservas cadastradas.
     */
    public void menuAdministracao() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - Cadastrar reserva");
            System.out.println("2 - Remover reserva");
            System.out.println("3 - Ver reservas cadastradas");
            System.out.println("4 - Ver informação Pessoal");
            System.out.println("5 - Voltar");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    cadastrarReserva();
                    break;
                case 2:
                    removerReserva();
                    break;
                case 3:
                    verReservas();
                    break;
                case 4:
                    getInformacaoPessoal();
                    break;//return;
                case 5:
                    return ;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }

    /**
     * Permite cadastrar uma nova reserva escolhendo o tipo de assento desejado.
     */
    public void cadastrarReserva() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o tipo da reserva: \n");
        System.out.println("1 - Arquibancada");
        System.out.println("2 - Camarote");
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                divisaoArquibancada();
                int numeroa = scanner.nextInt();
                //String localArq = scanner.nextLine();//Adicionei ...
                reserva.add(new Arquibancada("V",numeroa,null));///Tem um erro aqui, tem que ver se o lugar ja foi cadastrado
                System.out.println("Cadeira cadastrada com sucesso!");
                break; //Dar um jeito de mostrar para o usuario os lugares já cadastrados2
            case 2:
                divisaoCamarote();
                int numeroc = scanner.nextInt();
                //String localCam = scanner.nextLine();//Adicionei ...
                reserva.add(new Camarote("V",numeroc,null));///Tem um erro aqui, tem que ver se o lugar ja foi cadastrado
                System.out.println("Cadeira cadastrada com sucesso!");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

    /**
     Método para remover o cadastro de uma reserva.
     */
    public void removerReserva() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o número da cadeira: ");
        int numero = scanner.nextInt();
        boolean encontrou = false;
        for (Reserva cadeira : reserva) {
            if (cadeira.getNumero() == numero) {
                reserva.remove(cadeira);
                System.out.println("Cadeira removida com sucesso");
                encontrou = true;
                break;
            }
        }
        if (encontrou == false) {
            //encontrou = false;
            System.out.println("Cadeira não encontrada");

        }
    }

    /**
     Método para ver todas as reservas cadastradas
     */
    public void verReservas() {
        for (Reserva reserva : reserva) {
            System.out.println(reserva.getNumero());
            System.out.println("Cadeira existe e foi removida");
        }
    }

    public void getInformacaoPessoal(){
        System.out.println("Trabalhando aqui...");//saber o numero, nome de uma reserva especifica
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o número da cadeira: ");
        int numero = scanner.nextInt();
        boolean encontrou = false;
        for (Reserva cadeira : reserva) {
            if (cadeira.getNumero() == numero) {
                //reserva.remove(cadeira);
                
                System.out.println("O numero da cadeira é: " + reserva.getNumero());
                encontrou = true;
                break;
            }
        }
        if (!encontrou) {
            System.out.println("Cadeira não encontrada");
        }*/
    }

    /**
     Método que exibe um menu de usuário com opções para as reservas
     */
    public void menuReservas() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - Ver cadeiras disponíveis");
            System.out.println("2 - Reservar cadeira");
            System.out.println("3 - Cancelar reserva");
            System.out.println("4 - Voltar");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    verReservasDisponiveis();
                    break;
                case 2:
                    adicionarReserva();
                    break;
                case 3:
                    cancelarReserva();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }

    /**
     Método que exibe as reservas disponíveis
     */
    public void verReservasDisponiveis() {
        for (int i = 0; i < reserva.size() - 1; i++) {
            for (int j = i + 1; j < reserva.size(); j++) {
                if (reserva.get(i).equals(reserva.get(j))) {
                    reserva.remove(i);
                    reserva.remove(j - 1);
                    i--;
                    break;
                }
            }
        }
        for (Reserva reserva : reserva) {
            System.out.println(reserva.getNumero());
        }
    }

    /**
     * Método que retorna a disponibilidade da reserva
     * @return boolean .
     */
    public boolean getDisponibilidade(int numero){
        for(Reserva rdisponivel: reserva){
            if(numero==rdisponivel.getNumero()){
                return true;
            }
        }
        return false;
    }

    /**
     Método que adiciona uma nova reserva ao estádio.
     */
    public void adicionarReserva(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o tipo da reserva: \n");
        System.out.println("1 - Arquibancada");
        System.out.println("2 - Camarote");
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                divisaoArquibancada();
                int numeroa = scanner.nextInt();
                String setor = "Norte";
                if (numeroa < getCapacidade()*0.2) {
                    setor = "Arquibancada Norte";
                } else if (((numeroa >= getCapacidade()*0.2)) & (numeroa < getCapacidade()*0.4)) {
                    setor = "Arquibancada Sul";
                } else if (((numeroa >= getCapacidade()*0.4)) || (numeroa < getCapacidade()*0.6)) {
                    setor = "Arquibancada Oeste";
                } else if (((numeroa >= getCapacidade()*0.6)) || (numeroa < getCapacidade()*0.8)) {
                    setor = "Arquibancada Leste";
                }

                System.out.print("foi adicionado setor norte");

                System.out.print("Por favor digite seu nome: ");
                String nome=scanner.next();
                System.out.print("Por favor digite seu cpf: ");
                String cpf=scanner.next();
                System.out.print("Por favor digite seu telefone: ");
                String telefone=scanner.next();
                System.out.print("Por favor digite sua idade: ");
                int idade=scanner.nextInt();

                System.out.printf("O valor a ser pago será de: " + reserva.toString());

                Pessoa p=new Pessoa(nome,cpf,telefone,idade);

                reserva.add(new Arquibancada(setor, numeroa,p));
                break;
            case 2:
                divisaoCamarote();
                int numeroc = scanner.nextInt();
                String tipo = "setor";
                if (((numeroc >= getCapacidade()*0.8)) || (numeroc < getCapacidade()*0.9))  {
                    tipo = "Camarote Vip";
                } else if (((numeroc >= getCapacidade()*0.9)) || (numeroc < getCapacidade())) {
                    tipo = "Camarote Premium";
                }

                System.out.print("Por favor digite seu nome: ");
                String nome2=scanner.next();
                System.out.print("Por favor digite seu cpf: ");
                String cpf2=scanner.next();
                System.out.print("Por favor digite seu telefone: ");
                String telefone2=scanner.next();
                System.out.print("Por favor digite sua idade: ");
                int idade2=scanner.nextInt();
                Pessoa p2=new Pessoa(nome2,cpf2,telefone2,idade2);

                reserva.add(new Camarote(tipo ,numeroc,p2));
                //getCalcularIngresso();
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

    /**
     Método para remover uma reserva feita.
     */
    public void cancelarReserva(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o número da cadeira: ");
        int numero = scanner.nextInt();
        boolean encontrou = false;
        for (Reserva cadeira : reserva) {
            if (cadeira.getNumero() == numero) {
                reserva.remove(cadeira);
                System.out.println("Cadeira removida com sucesso");
                encontrou = true;
                break;
            }
        }
        if (!encontrou) {
            System.out.println("Cadeira não encontrada");
        }
    }

    /**
     * Método que exibe um menu de relatórios e permite ao usuário escolher uma opção.
     */
    public void menuRelatorios() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - Cadeiras mais reservadas");
            System.out.println("2 - Período com mais reservas");
            System.out.println("3 - Voltar");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    cadeirasMaisReservadas();
                    break;
                case 2:
                    periodoMaisReservas();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }

    /**
     * Método que exibe as cadeiras mais reservadas no estádio.
     */
    public void cadeirasMaisReservadas() {//não faz sentido

    }

    /**
     * Método que exibe o período com mais reservas no estádio.
     */
    public void periodoMaisReservas() {
        Data data = new Data();
    }

    /**
     * Método que retorna nome do estádio.
     * @return nome do estádio
     */
    public String getNomeEstadio(){
        return nomeEstadio;
    }

    /**
     * Método que retorna a partida
     * @return partida
     */
    public String getPartida(){
        return Partida;
    }

    /**
     * Método que retorna capacidade do estádio
     * @return capacidade
     */
    public int getCapacidade(){
        return Capacidade;
    }


    /**
     * Método que imprime todas as reservas
     * void
     */
    public void imprimirReservas(){
        for(Reserva r: reserva){
            System.out.println(r);
        }
    }

    /**
     * Método que retorna o titular de uma reserva.
     *
     * @param reserva a reserva da qual se deseja saber o titular
     * @return o titular da reserva ou "Não existe esta reserva" caso a reserva não seja encontrada
     */
    public String titularReserva(Reserva rx){
        for(Reserva r: reserva) {
            if (r.getNumero() == rx.getNumero()) {
                return r.getTitularReserva();
            }
        }
        return "Não existe está reserva";
    }

    /**
     * Método que divide a arquibancada em seções e exibe as regras para reservar assentos em cada seção.
     */
    public void divisaoArquibancada() {
        System.out.println("A seguir apresentaremos as regras para reservar lugares...");
        System.out.println("Disponibilizamos 4 tipos de lugares, digite o número da reserva: ");
        System.out.println("Arquibancada Norte: numeros disponiblizados "+0+" até "+(getCapacidade()*0.2));
        System.out.println("Arquibancada Sul: numeros disponiblizados "+((getCapacidade()*0.2)+1)+" até "+(getCapacidade()*0.4));
        System.out.println("Arquibancada Oeste: numeros disponiblizados "+((getCapacidade()*0.4)+1)+" até "+(getCapacidade()*0.6));
        System.out.println("Arquibancada Leste: numeros disponiblizados "+((getCapacidade()*0.6)+1)+" até "+(getCapacidade()*0.8));
    }

    /**
     * Método que divide o camarote em seções e exibe as regras para reservar assentos em cada seção.
     */
    public void divisaoCamarote() {
        System.out.println("A seguir apresentaremos as regras para reservar lugares...");
        System.out.println("Disponibilizamos 2 tipos de lugares, digite o número da reserva: ");
        System.out.println("Camarote Vip: numeros disponiblizados "+((getCapacidade()*0.8)+1)+" até "+(getCapacidade()*0.9));
        System.out.println("Camarote Premium: numeros disponiblizados "+((getCapacidade()*0.9)+1)+" até "+getCapacidade());
    }

    /**
     * Método que retorna o tipo de reserva com base no número do assento.
     *
     * @param numero o número do assento
     * @return o tipo de reserva (Norte, Sul, Oeste, Leste, Vip, Premium)
     */
    public String getTipoReserva(int numero) {
        if (numero > (getCapacidade() * 0.9)) {
            return "Premium";
        } else if (numero > (getCapacidade() * 0.8)) {
            return "Vip";
        } else if (numero > (getCapacidade() * 0.6)) {
            return "Leste";
        } else if (numero > (getCapacidade() * 0.4)) {
            return "Oeste";
        } else if (numero > (getCapacidade() * 0.2)) {
            return "Sul";
        } else {
            return "Norte";
        }
    }

    public static void main(String[] args) {
        Estadio estadio = new Estadio("Bernabeu","Real x Barça", 50000);
        estadio.menu();
    }
}






