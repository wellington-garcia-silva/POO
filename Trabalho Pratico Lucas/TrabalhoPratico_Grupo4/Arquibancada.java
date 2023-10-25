/**
 * A classe Arquibancada representa uma reserva em um setor específico de uma arquibancada em um evento esportivo ou outra ocasião.
 * Ela estende a classe Reserva.
 * @author Sarah
 */
public class Arquibancada extends Reserva{
    private String setor;

    /**
     * Cria uma instância da classe Arquibancada com o setor, número da reserva e pessoa que está fazendo
     * a reserva especificados.
     * @param setor o setor da arquibancada em que a reserva está sendo feita.
     * @param numero o número da reserva.
     * @param p a pessoa que está fazendo a reserva.
     */
    public Arquibancada(String setor, int numero, Pessoa p){
        super(numero, p);
        this.setor = setor;
    }

    /**
     * Retorna o valor adicional a ser adicionado ao preço do ingresso com base no setor da arquibancada.
     * @return o valor adicional a ser adicionado ao preço do ingresso.
     */
    public double getAcrescimo(){
        int acrescimo = 0;
        if(setor.equals("Arquibancada Norte")){
            acrescimo = 5;
        } else if(setor.equals("Arquibancada Sul")){
            acrescimo = 10;
        } else if(setor.equals("Arquibancada Leste")){
            acrescimo = 15;
        } else if(setor.equals("Arquibancada Oeste")){
            acrescimo = 20;
        }
        return acrescimo;
    }

    /**
     * Calcula o preço do ingresso com base na idade da pessoa que está fazendo a reserva e no setor da arquibancada.
     * @param idade a idade da pessoa que está fazendo a reserva.
     * @return o preço do ingresso.
     */
    @Override
    public double calcularIngresso(int idade){
        double valorBase = 100;
        if(idade > 65){
            return 0.5 * valorBase + getAcrescimo();
        } else if(idade < 12){
            return getAcrescimo();
        } else if(idade > 12 && idade < 18){
            return 0.7 * valorBase + getAcrescimo();
        } else {
            return valorBase + getAcrescimo();
        }
    }
}