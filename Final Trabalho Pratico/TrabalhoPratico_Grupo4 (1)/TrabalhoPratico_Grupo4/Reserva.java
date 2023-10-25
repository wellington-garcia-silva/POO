/**
 * Classe abstrata Reserva, que representa uma reserva de assento num estádio.
 * @author Arthur
 */
import java.util.Date;
public class Reserva{
    private int numero;
    private Pessoa p;

    /**
     * Construtor que inicializa uma nova instância da classe Reserva.
     * @param numero Número do assento.
     * @param p Objeto Pessoa que representa o titular da reserva.
     */
    public Reserva(int numero, Pessoa p){
        this.numero = numero;
        this.p=p;
    }

    /**
     * Método que retorna o número do assento.
     * @return Número do assento.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Método que retorna o nome do titular da reserva.
     * @return Nome do titular da reserva.
     */
    public String getTitularReserva(){
        return p.getInformacaoPessoal();
    }

    /**
     * Método estático que retorna a data atual.
     * @return Data atual.
     */
    public static Date getData(){
        return new Date();
    }

    /**
     * Método que calcula o valor do ingresso com base na idade do titular.
     * @param idade Idade do titular da reserva.
     * @return Valor do ingresso.
     */
    public double calcularIngresso(int idade) {
        return 0;
    }
}