/**
 * @author NOME
A classe Arquibancada representa uma reserva em um tipo específico de um camarote em um evento esportivo ou outra ocasião.
Ela estende a classe Reserva e implementa a interface ValorIngresso.
 */
public class Camarote extends Reserva implements ValorIngresso{
    private String tipo;

    /**
     Cria uma instância da classe Camarote com o tipo, número da reserva e pessoa que está fazendo a reserva especificados.
     @param tipo o tipo do camarote (vip ou premium)
     @param numero o número da reserva
     @param p a pessoa que está fazendo a reserva.
     */
    public Camarote(String tipo, int numero, Pessoa p){
        super(numero, p);
        this.tipo = tipo;
    }

    /**
     Retorna o acréscimo de preço para o camarote, dependendo do tipo.
     @return o acréscimo de preço para o camarote
     */
    public double getAcrescimo() {
        int acrescimo = 0;
        if (tipo.equals("Camarote Vip")) {
            acrescimo = 30;
        } else if (tipo.equals("Camarote Premium")){
            acrescimo = 60;
        }
        return acrescimo;
    }

    /**
     Calcula o valor do ingresso para o camarote, baseado na idade da pessoa responsável pela reserva.
     @param idade a idade da pessoa responsável pela reserva
     @return o valor do ingresso para o camarote
     */
    @Override
    public double calcularIngresso(int idade){
        double valorBase = 200;
        if(idade < 12){
            return 0.5 * valorBase + getAcrescimo();
        } else {
            return valorBase + getAcrescimo();
        }
    }

}