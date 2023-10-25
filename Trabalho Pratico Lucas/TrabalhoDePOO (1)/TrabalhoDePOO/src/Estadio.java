import java.util.ArrayList;
import java.util.Scanner;

public class Estadio {

    private ArrayList<Reserva> reserva;
    private String nomeEstadio;
    private String Partida;
    private int Capacidade;

    public Estadio(String nomeEstadio, String Partida, int Capacidade) {
        this.nomeEstadio = nomeEstadio;
        this.Partida = Partida;
        this.Capacidade = Capacidade;
        reserva = new ArrayList<>();
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
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
                    return;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }

    public void menuAdministracao() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - Cadastrar reserva");
            System.out.println("2 - Remover reserva");
            System.out.println("3 - Ver reservas cadastradas");
            System.out.println("4 - Voltar");
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
                    return;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }

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
                reserva.add(new Arquibancada(null,numeroa,  null));
                break;
            case 2:
                divisaoCamarote();
                int numeroc = scanner.nextInt();
                reserva.add(new Camarote(null,numeroc,  null));
                break;
            default:
                System.out.println("Opção inválida");
                break;
            }
        }

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
        if (!encontrou) {
            System.out.println("Cadeira não encontrada");
        }
    }

    public void verReservas() {
        for (Reserva reserva : reserva) {
            System.out.println(reserva.getNumero());
        }
    }

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
                String setor = null;
                if (numeroa < getCapacidade()*0.2) {
                    setor = "Arquibancada Norte";
                } else if (((numeroa >= getCapacidade()*0.2)) & (numeroa < getCapacidade()*0.4)) {
                    setor = "Arquibancada Sul";
                } else if (((numeroa >= getCapacidade()*0.4)) || (numeroa < getCapacidade()*0.6)) {
                    setor = "Arquibancada Oeste";
                } else if (((numeroa >= getCapacidade()*0.6)) || (numeroa < getCapacidade()*0.8)) {
                    setor = "Arquibancada Leste";
                }

                System.out.print("Por favor digite seu nome: ");
                String nome=scanner.next();
                System.out.print("Por favor digite seu cpf: ");
                String cpf=scanner.next();
                System.out.print("Por favor digite seu telefone: ");
                String telefone=scanner.next();
                System.out.print("Por favor digite sua idade: ");
                int idade=scanner.nextInt();
                Pessoa p=new Pessoa(nome,cpf,telefone,idade);

                reserva.add(new Arquibancada(setor, numeroa,p));
                break;
            case 2:
                divisaoCamarote();
                int numeroc = scanner.nextInt();
                String tipo = null;
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
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

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
    public void cadeirasMaisReservadas() {

    }
    public void periodoMaisReservas() {
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
     * Método que adiciona reserva.
     * void .
     */


    /**
     * Método que remove reserva.
     * void .
     */

    /**
     * Método que imprimi todas as reservas
     * void
     */
    public void imprimirReservas(){
        for(Reserva r: reserva){
            System.out.println(r);
        }
    }

    public String titularReserva(Reserva rx){
        for(Reserva r: reserva) {
            if (r.getNumero() == rx.getNumero()) {
                return r.getTitularReserva();
            }
        }
        return "Não existe está reserva";
    }

    public void divisaoArquibancada() {
        System.out.println("A seguir apresentaremos as regras para reservar lugares...");
        System.out.println("Disponibilizamos 4 tipos de lugares, digite o número da reserva: ");
        System.out.println("Arquibancada Norte: numeros disponiblizados "+0+" até "+(getCapacidade()*0.2));
        System.out.println("Arquibancada Sul: numeros disponiblizados "+((getCapacidade()*0.2)+1)+" até "+(getCapacidade()*0.4));
        System.out.println("Arquibancada Oeste: numeros disponiblizados "+((getCapacidade()*0.4)+1)+" até "+(getCapacidade()*0.6));
        System.out.println("Arquibancada Leste: numeros disponiblizados "+((getCapacidade()*0.6)+1)+" até "+(getCapacidade()*0.8));
    }

    public void divisaoCamarote() {
        System.out.println("A seguir apresentaremos as regras para reservar lugares...");
        System.out.println("Disponibilizamos 2 tipos de lugares, digite o número da reserva: ");
        System.out.println("Camarote Vip: numeros disponiblizados "+((getCapacidade()*0.8)+1)+" até "+(getCapacidade()*0.9));
        System.out.println("Camarote Premium: numeros disponiblizados "+((getCapacidade()*0.9)+1)+" até "+getCapacidade());
    }

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

