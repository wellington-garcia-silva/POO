public class PessoaFisica extends Contatos{
    private String estadoCivil;
    private String cpf;

    public PessoaFisica(String nome,String endereco,String email,String cpf,String estadoCivil){
        super(nome,endereco,email);
        this.cpf=cpf;
        this.estadoCivil=estadoCivil;
    }
    public String getCpf(){
        return cpf;
    }
    public String getEstadoCivil(){
        return estadoCivil;
    }
    
    @Override
    public String toString(){
        return "\n nome: "+getNome()+"\n endereco: "+getEndereco()+"\n email: "+getEmail()+"\n Cpf: "+getCpf()+"\n Estado Civil: "+getEstadoCivil();
    }
}
