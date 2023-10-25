import java.util.Scanner;
public class TesteDiabetes {
    public static void main(String[] args) throws Exception {
        double media;
        double n;


         //Scanner dados;
        Scanner ler = new Scanner(System.in);
        System.out.println("Quantas amostras serão inseridas? ");
        n = ler.nextDouble();
        int x = (int)n;

        //double[] vet = 3

        //double[] vet = {1,2,3,4,5};
        

        Paciente paciente1;
        paciente1 = new Paciente(x);
    
       

        //ler.Paciente(aux,vet[]); //chama construtor
        
        //System.out.println("Insira os dados do vetor");

        paciente1.inserirVetor(); //preenche vetor
        
        System.out.printf("O paciente: %s",paciente1.getnomePaciente());//imprime o nome do Paciente
        //System.out.println("O paciente: %s",ler.getnomePaciente());

        System.out.println("Digite uma amostra que vc quer visualizar: ");
        x = ler.nextInt();
        System.out.printf("A amostra tem o valor de: %d", paciente1.setAnaliseAmostra(x));

        media = paciente1.analiseMedia();

        //Diagnóstico
        System.out.println("############### RELATÓRIO FINAL ###############");
        System.out.printf("Resultado médio = %d",media);
        System.out.printf("Diagnostico = %s",paciente1.diagnosticoPaciente(media));

    }
}
