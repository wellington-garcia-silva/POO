/**
 * @author NOME
 Classe abstrata Reserva, que representa uma reserva de assento num estádio.
 */
public abstract class Reserva{
    private int numero;
    private Pessoa p;

    /**
     Construtor que inicializa uma nova instância da classe Reserva.
     @param numero Número do assento.
     @param p Objeto Pessoa que representa o titular da reserva.
     */
    public Reserva(int numero,Pessoa p){
        this.numero = numero;
        this.p=p;
    }

    /**
     Método que retorna o objeto Pessoa que representa o titular da reserva.
     @return Objeto Pessoa que representa o titular da reserva.
     */
    public Pessoa getP(){
        return p;
    }

    /**
     Método que retorna o número do assento.
     @return Número do assento.
     */
    public int getNumero() {
        return numero;
    }

    /**
     Método abstrato que deve ser implementado nas subclasses da classe Reserva.
     @return Representação em string da reserva.
     */
    public abstract String toString();
    /**

     Método que retorna o nome do titular da reserva.
     @return Nome do titular da reserva.
     */
    public String getTitularReserva(){
        return p.getInformacaoPessoal();
    }
}