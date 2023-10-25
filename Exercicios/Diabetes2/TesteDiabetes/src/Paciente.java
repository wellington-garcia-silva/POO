public class Paciente {
    private String nome;
    private double exames[];
    public Paciente(String nome,int tamanho){
        this.nome=nome;
         exames= new double[tamanho];
    }
    public String getNomePaciente(){
        return nome;
    }
    public double getResultadoAnalise(){
        return 45;
    }
    public double getMediaResultados(){
        double media=0;
        for(int i=0;i<3;i++){
            media +=exames[i];
        }
        media= media/3;
        return media;
    }
    public String getDiagnosticoPaciente(double resultado){
        if(resultado<201){
            return "Glicemia Normal";
        }
        else if(resultado<199){
            return "Risco de Diabetes";
        }
        else return "Mellitus";
    }
    public void setInserirVetor(double valor,int posicao){
        exames[posicao]=valor;
    }
}
