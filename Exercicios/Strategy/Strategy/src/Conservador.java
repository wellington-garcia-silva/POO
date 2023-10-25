public class Conservador implements Investidor {
    @Override
    public double calcularValor(double valorInvestimento,int tempoInvestimento){
        return valorInvestimento*tempoInvestimento*0.8;
    }
}
