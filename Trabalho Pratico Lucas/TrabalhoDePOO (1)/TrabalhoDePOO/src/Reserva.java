/**
 * Classe Reserva, que representa uma reserva de assento num estádio.
 */
public class Reserva{
    private int numero;
    private Pessoa p;

    public Reserva(int numero,Pessoa p){
        this.numero = numero;
        this.p=p;
    }

    public Pessoa getP(){
        return p;
    }

    /**
     * Método que retorna o número do assento.
     * @return Número do assento.
     */
    public int getNumero() {
        return numero;
    }

    @Override
    public String toString(){
        return  p.getInformacaoPessoal()+"\n"+
                "Numero: "+getNumero()+"\n";
    }

    public String getTitularReserva(){
        return p.getInformacaoPessoal();
    }
}