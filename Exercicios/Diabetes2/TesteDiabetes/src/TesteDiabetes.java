public class TesteDiabetes {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Paciente paciente = new Paciente("Luis Henrique",3);
        paciente.setInserirVetor(134.6,0);
        paciente.setInserirVetor(147.2,1);
        paciente.setInserirVetor(134.5,2);

        System.out.println("############### RELATÓRIO FINAL ###############");
        System.out.printf("Nome do Paciente = %s\n",paciente.getNomePaciente());
        System.out.printf("Resultado médio = %f\n",paciente.getMediaResultados());
        System.out.printf("Diagnóstico: %s\n",paciente.getDiagnosticoPaciente(paciente.getMediaResultados()));


        
        
    }
}
