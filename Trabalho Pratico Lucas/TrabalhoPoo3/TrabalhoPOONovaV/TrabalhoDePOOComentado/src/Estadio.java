/**
 * @author NOME
 A class Estadio representa um estádio com opções de administração, reservas e relatórios de cadeiras de diferentes
 tipos de assentos. O estádio tem um nome, capacidade e partida.
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
public class Estadio {

    private ArrayList<Reserva> reserva;
    private String nomeEstadio;
    private String Partida;
    private int Capacidade;
    private double auxCancelamento;
    private double contagemArquibancada;
    private double contagemCamarote;
    private double contagemCadArquibancada;
    private double contagemCadCamarote;


    /**
     * Constrói um objeto Estadio com os parâmetros de nome, partida e capacidade.
     *
     * @param nomeEstadio O nome do estádio.
     * @param Partida A partida que será realizada.
     * @param Capacidade A capacidade de espectadores do estádio.
     */
    public Estadio(String nomeEstadio, String Partida, int Capacidade, int auxCancelamento, int contagemArquibancada, int contagemCamarote, int contagemCadArquibancada, int contagemCadCamarote) {
        this.nomeEstadio = nomeEstadio;
        this.Partida = Partida;
        this.Capacidade = Capacidade;
        reserva = new ArrayList<>();
        this.auxCancelamento = auxCancelamento;
        this.contagemArquibancada = contagemArquibancada;
        this.contagemCamarote = contagemCamarote;
        this.contagemCadArquibancada = contagemCadArquibancada;
        this.contagemCadCamarote = contagemCadCamarote;
    }

    /**
     * Mostra o menu principal que permite o acesso às opções de administração, reservas, relatórios e saída.
     */
    public void menu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - Área Administrativa");
            System.out.println("2 - Área de Reservas");
            System.out.println("3 - Sair");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    menuAdministracao();
                    break;
                case 2:
                    menuReservas();
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
     * Mostra o menu de administração que permite o acesso às opções de cadastro de reserva, remoção de reserva, e verificação de
     * reservas cadastradas.
     */
    public void menuAdministracao() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o código de acesso: ");
        int senha = scanner.nextInt();
        if (senha == 103) {
            System.out.println("Acesso como administrador permitido!");
            while (true) {
                System.out.println("1 - Cadastrar reserva");
                System.out.println("2 - Remover reserva cadastrada");
                System.out.println("3 - Ver reservas cadastradas");
                System.out.println("4 - Salvar reservas cadastradas");
                System.out.println("5 - Carregar reservas cadastradas");
                System.out.println("6 - Relatórios");
                System.out.println("7 - Voltar");
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
                        salvarCadastro();
                        break;
                    case 5:
                        carregarCadastro();
                        break;
                    case 6:
                        menuRelatorios();
                        break;
                    case 7:
                        return;
                    default:
                        System.out.println("Opção inválida");
                        break;
                }
            }
        } else
            System.out.println("Acesso como administrador negado!");
            System.out.println("Voltando para área de seleção de usuário:");
    }

    /**
     * Permite cadastrar uma nova reserva escolhendo o tipo de assento desejado.
     */
    public void cadastrarReserva() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o tipo da reserva que será cadastrada: \n");
        System.out.println("1 - Arquibancada");
        System.out.println("2 - Camarote");
        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                divisaoArquibancada();
                int numeroa = scanner.nextInt();
                if (numeroa < 1 || numeroa > (getCapacidade() * 0.8)) {
                    System.out.println("Número de reserva inválido. Digite um número entre 1 e " + ((int) ((getCapacidade() * 0.8))) + ".");
                    break;
                }
                boolean reservaExisteA = false;
                for (Reserva r : reserva) {
                    if (r instanceof Arquibancada && r.getNumero() == numeroa) {
                        System.out.println("Essa reserva já foi cadastrada.");
                        reservaExisteA = true;
                        break;
                    }
                }
                if (!reservaExisteA) {
                    reserva.add(new Arquibancada(null, numeroa, null));
                    System.out.println("Reserva cadastrada com sucesso!");
                    contagemCadArquibancada = contagemCadArquibancada +1;
                }
                break;
            case 2:
                divisaoCamarote();
                int numeroc = scanner.nextInt();
                if (numeroc < (getCapacidade() * 0.8) + 1 || numeroc > getCapacidade()) {
                    System.out.println("Número de reserva inválido. Digite um número entre " + ((int) ((getCapacidade() * 0.8) + 1)) + " e " + getCapacidade() + ".");
                    break;
                }
                boolean reservaExisteC = false;
                for (Reserva r : reserva) {
                    if (r instanceof Camarote && r.getNumero() == numeroc) {
                        System.out.println("Essa reserva já foi cadastrada.");
                        reservaExisteC = true;
                        break;
                    }
                }
                if (!reservaExisteC) {
                    reserva.add(new Camarote(null, numeroc, null));
                    System.out.println("Reserva cadastrada com sucesso!");
                    contagemCadCamarote = contagemCadCamarote +1;
                }
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
        System.out.print("Informe o número da reserva que será removido do cadastro: ");
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
     Método para ver todas as reservas cadastradas
     */
    public void verReservas() {
        System.out.println("Reservas cadastradas:");
        for (Reserva reserva : reserva) {
            System.out.println(reserva.getNumero());
        }
    }

    public void carregarCadastro() {
        int contador = 0;
        try {
            Scanner scanner = new Scanner(new File("br.ufla.gac103.grupo4.txt"));
            while (scanner.hasNextLine()) {
                int numero = Integer.parseInt(scanner.nextLine());
                reserva.add(new Reserva(numero,null));
                if (numero < 1 || numero > (getCapacidade() * 0.8)) {
                    contagemCadArquibancada++;
                } else if (numero < (getCapacidade() * 0.8) + 1 || numero > getCapacidade()){
                    contagemCadCamarote++;
                }
            }
            scanner.close();
            System.out.println("Reservas carregadas com sucesso \n");
        } catch (IOException e) {
            System.out.println("Erro ao carregar as reservas");
        }
    }


    public void salvarCadastro() {
        try {
            FileWriter writer = new FileWriter("br.ufla.gac103.grupo4.txt");
            for (Reserva r : reserva) {
                writer.write(r.getNumero() + "\n");
            }
            writer.close();
            System.out.println("Cadastro salvo com sucesso");
        } catch (IOException e) {
            System.out.println("Erro ao salvar o cadastro");
        }
    }

    /**
     Método que exibe um menu de usuário com opções para as reservas
     */
    public void menuReservas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo a área de reservas!");
        while (true) {
            System.out.println("1 - Ver reservas disponíveis");
            System.out.println("2 - Fazer reserva");
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
        System.out.println("Reservas disponíveis para adquirir:");
        for (int i = 0; i < reserva.size() - 1; i++) {
            Integer currentItem = reserva.get(i).getNumero();
            for (int j = i + 1; j < reserva.size(); j++) {
                Integer compareItem = reserva.get(j).getNumero();
                if (currentItem.equals(compareItem)) {
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

                if (numeroa < 1 || numeroa > (getCapacidade() * 0.8)) {
                    System.out.println("Número de reserva inválido. Digite um número entre 1 e " + ((int) ((getCapacidade() * 0.8))) + ".");
                    break;
                }
                boolean reservaExisteA = false;
                for (Reserva r : reserva) {
                    if (r instanceof Arquibancada && r.getNumero() == numeroa) {
                        System.out.println("Essa reserva já foi feita.");
                        reservaExisteA = true;
                        break;
                    }
                }
                if (!reservaExisteA) {
                    if (getDisponibilidade(numeroa)) {
                        String setor = null;
                        if (numeroa < getCapacidade() * 0.2) {
                            setor = "Arquibancada Norte";
                        } else if (((numeroa >= getCapacidade() * 0.2)) & (numeroa < getCapacidade() * 0.4)) {
                            setor = "Arquibancada Sul";
                        } else if (((numeroa >= getCapacidade() * 0.4)) || (numeroa < getCapacidade() * 0.6)) {
                            setor = "Arquibancada Oeste";
                        } else if (((numeroa >= getCapacidade() * 0.6)) || (numeroa < getCapacidade() * 0.8)) {
                            setor = "Arquibancada Leste";
                        }

                        System.out.print("Por favor digite seu nome: ");
                        String nome = scanner.next();
                        System.out.print("Por favor digite seu cpf: ");
                        String cpf = scanner.next();
                        System.out.print("Por favor digite seu telefone: ");
                        String telefone = scanner.next();
                        System.out.print("Por favor digite sua idade: ");
                        int idade = scanner.nextInt();

                        Pessoa p = new Pessoa(nome, cpf, telefone, idade);

                        System.out.println("Reserva cadastrada com sucesso!");
                        Arquibancada arquibancada = new Arquibancada(setor, numeroa, p);
                        System.out.printf("O valor a ser pago será de: " + arquibancada.calcularIngresso(idade) + "\n");


                        reserva.add(new Arquibancada(setor, numeroa, p));
                        auxCancelamento = numeroa;
                        contagemArquibancada = contagemArquibancada + 1;

                    } else {
                        System.out.println("Cadeira não disponível. Por favor, escolha outra.");
                    }

                    break;
                }
            case 2:
                divisaoCamarote();
                int numeroc = scanner.nextInt();

                if (numeroc <= getCapacidade() * 0.8 || numeroc > (getCapacidade())) {
                    System.out.println("Número de reserva inválido. Digite um número entre " + ((int) ((getCapacidade() * 0.8))) +" e " + ((int) ((getCapacidade()))) + ".");
                    break;
                }

                boolean reservaExisteC = false;
                for (Reserva r : reserva) {
                    if (r instanceof Camarote && r.getNumero() == numeroc) {
                        System.out.println("Essa reserva já foi cadastrada.");
                        reservaExisteC = true;
                        break;
                    }
                }
                if (!reservaExisteC) {
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

                    System.out.println("Reserva cadastrada com sucesso!");
                    Camarote camarote = new Camarote(tipo, numeroc, p2);

                    System.out.printf("O valor a ser pago será de: " + camarote.calcularIngresso(idade2));

                    reserva.add(new Camarote(tipo ,numeroc,p2));
                    auxCancelamento = numeroc;
                    contagemCamarote = contagemCamarote + 1;
                }
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }

    /**
     Método para remover uma reserva feita.
     */
    public void cancelarReserva() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o número da cadeira que será cancelada: ");

        int numero = scanner.nextInt();

        if (auxCancelamento == numero) {
            if (numero < 1 || numero > (getCapacidade() * 0.8)) {
                reserva.add(new Arquibancada(null, numero, null));
                System.out.println("Reserva cancelada");
            } else if (numero < (getCapacidade() * 0.8) + 1 || numero > getCapacidade()) {
                reserva.add(new Camarote(null, numero, null));
                System.out.println("Reserva cancelada");
            }
        } else
            System.out.println("Opção inválida");
    }

    /**
     * Método que exibe um menu de relatórios e permite ao usuário escolher uma opção.
     */
    public void menuRelatorios() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1 - Cadeiras mais reservadas");
            System.out.println("2 - Quantidade total e parcial de reservas feitas");
            System.out.println("3 - Voltar");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    cadeirasMaisReservadas();
                    break;
                case 2:
                    numeroReservas();
                    break;
                case 3:
                    numeroCadastros();
                    break;
                case 4:
                    percentualReservas();
                    break;
                case 5:
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
    public void cadeirasMaisReservadas() {
        System.out.println("Foram reservadas " + contagemArquibancada + " cadeiras na Arquibancada!" );
        System.out.println("Foram reservadas " + contagemCamarote + " cadeiras no Camarote!" );
        if (contagemArquibancada > contagemCamarote) {
            double razao = contagemArquibancada / contagemCamarote;
            System.out.println("Portanto, foram reservadas " + razao + " vezes mais cadeiras na Arquibancada que no Camarote");
        }
        else if (contagemArquibancada < contagemCamarote) {
            double razao = contagemCamarote / contagemArquibancada;
            System.out.println("Portanto, foram reservadas " + razao + " vezes mais cadeiras no Camarote que na Arquibancada");
        }
        else
            System.out.println("Portanto, foram reservadas a mesma quantidade de cadeiras na Arquibancada e cadeiras no Camarote");
    }

    public void numeroReservas() {
        double soma = contagemArquibancada + contagemCamarote;
        System.out.println("Foram reservadas " + soma + " cadeiras no Total, contando cadeiras na Arquibancada e cadeiras no Camarote");
        System.out.println("Foram reservadas " + contagemArquibancada + " cadeiras na Arquibancada!");
        System.out.println("Foram reservadas " + contagemCamarote + " cadeiras no Camarote!");
    }

    public void numeroCadastros() {
        double soma = contagemCadArquibancada + contagemCadCamarote;
        System.out.println("Foram cadastradas " + soma + " cadeiras no Total, contando cadeiras na Arquibancada e cadeiras no Camarote");
        System.out.println("Foram cadastradas " + contagemCadArquibancada + " cadeiras na Arquibancada!" );
        System.out.println("Foram cadastradas " + contagemCadCamarote + " cadeiras no Camarote!" );
    }

    public void percentualReservas() {
        double soma1 = contagemArquibancada + contagemCamarote;
        double soma2 = contagemCadArquibancada + contagemCadCamarote;
        double percentual = (soma1 / soma2) * 100;
        double percentualArq = (contagemArquibancada / contagemCadArquibancada) * 100;
        double percentualCam = (contagemCamarote / contagemCadCamarote) * 100;
        System.out.println(soma1);
        System.out.println(soma2);
        System.out.println(percentual);
        System.out.println(percentualArq);
        System.out.println(percentualCam);
        System.out.println("Foram reservadas " + percentual + "% das cadeiras cadastradas");
        System.out.println("Foram reservadas " + percentualArq + "% das cadeiras cadastradas da Arquibancada" );
        System.out.println("Foram reservadas " + percentualCam + "% das cadeiras cadastradas do Camarote" );

    }

    /**
     * Método que exibe o período com mais reservas no estádio.
     */
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
        Estadio estadio = new Estadio("Bernabeu","Real x Barça", 50000, 0, 0,0,0,0);
        estadio.menu();
    }
}






