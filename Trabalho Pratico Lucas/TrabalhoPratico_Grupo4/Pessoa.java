/**
 * Classe Pessoa que representa uma pessoa e seus atributos básicos: nome, CPF, telefone e idade.
 * @author Sarah
 */
public class Pessoa {
    private String nome;
    private String cpf;
    private String telefone;
    private int idade;

    /**
     * Construtor para inicializar os atributos da classe Pessoa.
     * @param nome Nome da pessoa.
     * @param cpf CPF da pessoa.
     * @param telefone Telefone da pessoa.
     * @param idade Idade da pessoa.
     */
    public Pessoa(String nome, String cpf, String telefone, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.idade = idade;
    }

    /**
     * Método que retorna o nome da pessoa.
     * @return Nome da pessoa.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método que retorna o CPF da pessoa.
     * @return CPF da pessoa.
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * Método que retorna o telefone da pessoa.
     * @return Telefone da pessoa.
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Método que retorna a idade da pessoa.
     * @return Idade da pessoa.
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Método que retorna uma string com as informações pessoais da pessoa.
     * @return String com informações pessoais da pessoa.
     */
    public String getInformacaoPessoal(){
        return "-------------------------------------------"+"\n"+
                "Informacoes Pessoais do Titular da Reserva"+"\n"+
                "Nome: "+getNome()+"\n"+
                "CPF: "+getCpf()+"\n"+
                "Telefone: "+getTelefone()+"\n"+
                "Idade: "+getIdade()+"\n"+
                "-------------------------------------------";
    }
}