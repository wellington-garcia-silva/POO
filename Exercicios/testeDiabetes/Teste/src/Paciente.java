import java.util.Scanner;
public class Paciente{
    //atributos
    private double[] exames;
    private String nome=null;
    private int n=0;
    
    //Construtor
    public Paciente(int n){
        this.nome = null;
        this.n = n;
        //this.exames[n] = exames[n];
        for(int i = 0;i<n;i++){
            this.exames[i]=i;
        }
    }

    //método para Inserir no vetor exames o resultado da análise de uma 
    public void inserirVetor(){
        //Scanner leitura;
        Scanner leitura = new Scanner(System.in);//System.in
        System.out.println("Digite o nome do paciente: ");
        this.nome = leitura.nextLine();//recebe o nome do paciente
        for(int i=0;i<exames.length;i++){
            System.out.printf("Insira o resultado do teste %d",i);
            this.exames[i] = leitura.nextDouble();//preenche o vetor com os dados
        }
    }

    //método retorna nome do Paciente
    public String getnomePaciente(){
        return nome;
    }

    //método retorna resultado análise das amostras
    public double setAnaliseAmostra(int amostra){
        return exames[amostra];
    }

    //método para retorno da média das análises
    public double analiseMedia(){
        double aux = 0;
        for(int i=0;i<5;i++){
            aux=+exames[i];
        }
        aux = aux/exames.length;
        return aux;
    }

    //método para retornar o diagnostico do paciente
    public String diagnosticoPaciente(double media){
        String retorna;
        if(media < 140){
            retorna = "Glicemia normal";
            return retorna;
        }
        else if(media >= 140 && media <= 199){
            retorna = "Risco de diabetes";
            return retorna;
        }
        else{
            retorna = "Diabetes Mellitus";
            return retorna;
        }

    }

}//Fim classe Paciente