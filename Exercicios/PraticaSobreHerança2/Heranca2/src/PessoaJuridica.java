public class PessoaJuridica extends Contatos{
    private int inscricaoEstadual;
    private String cnpj;

    public PessoaJuridica(String nome,String endereco,String email,String cnpj,int inscricaoEstadual){
        super(nome,endereco,email);
        this.cnpj=cnpj;
        this.inscricaoEstadual=inscricaoEstadual;
    }
    public String getCnpj(){
        return cnpj;
    }
    public int getInscricaoEstadual(){
        return inscricaoEstadual;
    }
    @Override
    public String toString(){
        return "\n nome: "+getNome()+"\n endereco: "+getEndereco()+"\n email: "+getEmail()+"\n Cnpj: "+getCnpj()+"\n Inscricao Estadual: "+getInscricaoEstadual();
    }
}
