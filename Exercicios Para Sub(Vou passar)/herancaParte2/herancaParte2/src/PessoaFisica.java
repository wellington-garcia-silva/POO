public class PessoaFisica extends Contato{
    String cpf;
    String estadoCivil;
    public PessoaFisica(String nome,String endereco, String email, String cpf, String estadoCivil){
        super(nome,endereco,email);
        this.estadoCivil=estadoCivil;
        this.cpf=cpf;
    }
    public String getEstadoCivil(){
        return estadoCivil;
    }
    public String getCpf(){
        return cpf;
    }
}
