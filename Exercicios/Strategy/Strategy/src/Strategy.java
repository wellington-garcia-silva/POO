import java.util.Scanner;
public class Strategy {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        boolean simulacao;
        Scanner leitura = new Scanner(System.in);
        Investimento investimento;
        double resultado;
        int opcao;
        simulacao = true;
        while(simulacao==true){
            System.out.println("Entre com o valor do Investimento: ");
            //100
            double valorInvestimento = leitura.nextDouble();
            System.out.println("Entre com o tempo (meses) de Investimento: ");
            //10
            int tempoInvestimento = leitura.nextInt();
            System.out.println("Escolha o tipo de investidor: ");
            System.out.println("1 - Conservador  ");
            System.out.println("2 - Moderado  ");
            System.out.println("3 - Arrojado  ");
            System.out.println("Digite sua opção: ");
            //2
            opcao = leitura.nextInt();
            switch(opcao){
                case 1:
                    investimento = new Investimento(new Conservador());
                    resultado = investimento.calcularValorInvestimento(valorInvestimento,tempoInvestimento);
                    System.out.printf("Valor final esperado: "+resultado+"\n");
                    break;

                case 2:
                    investimento = new Investimento(new Moderado());
                    resultado = investimento.calcularValorInvestimento(valorInvestimento,tempoInvestimento);
                    System.out.printf("Valor final esperado: "+resultado+"\n");
                    break;
                case 3:
                    investimento = new Investimento(new Arrojado());
                    resultado = investimento.calcularValorInvestimento(valorInvestimento,tempoInvestimento);
                    System.out.printf("Valor final esperado: "+resultado+"\n");
                    break;
                default:
                    System.out.println("Opção inválida, tente outra!");
                    break;
            }
            //System.out.println("Valor final esperado:  ");
            //109.14
            System.out.println("Deseja realizar nova simulação(true - Sim/ false - Não)");
            simulacao = leitura.nextBoolean();

        }
    }
}

