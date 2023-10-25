/**
 * @author NOME
 * Classe Data que representa uma data com seus atributos hora, dia, mês e ano.
 */
public class Data {
    private int hora;
    private int dia;
    private int mes;
    private int ano;

    /**
     * Construtor para inicializar os atributos da classe Data.
     * @param hora Hora da data.
     * @param dia Dia da data.
     * @param mes Mês da data.
     * @param ano Ano da data.
     */
    public Data(int hora, int dia, int mes, int ano) {
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    /**
     * Método que retorna a hora da data.
     * @return Hora da data.
     */
    public int getHora() {
        return hora;
    }

    /**
     * Método que retorna o dia da data.
     * @return Dia da data.
     */
    public int getDia() {
        return dia;
    }

    /**
     * Método que retorna o mês da data.
     * @return Mês da data.
     */
    public int getMes() {
        return mes;
    }

    /**
     * Método que retorna o ano da data.
     * @return Ano da data.
     */
    public int getAno() {
        return ano;
    }

    /**
     * Método que retorna a data completa com hora, dia, mês e ano.
     * @return Data completa.
     */
    public String getData() {
        return hora + ":" + dia + "/" + mes + "/" + ano;
    }
}