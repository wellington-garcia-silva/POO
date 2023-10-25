public class Investimento {
    private Investidor tipo;

    public Investimento(Investidor tipo){
        this.tipo=tipo;
    }

    public double calcularValorInvestimento(double valorInvestimento,int tempoInvestimento){
        return tipo.calcularValor(valorInvestimento,tempoInvestimento);
    }
}
