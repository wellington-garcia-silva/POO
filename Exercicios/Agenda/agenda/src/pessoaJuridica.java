public class pessoaJuridica extends contatos{
    private String cnpj;
    private String inscricaoEstadual;
    public pessoaJuridica(String nome, String endereco, String email, String cnpj,String inscricaoEstadual){
        super(nome, endereco, email);
        this.cnpj=cnpj;
        this.inscricaoEstadual=inscricaoEstadual;

    }
    public String getCnpj(){
        return cnpj;
    }
    public String getInscricaoEstadoual(){
        return inscricaoEstadual;
    }
    @Override
    public String retornaContato(){
        return getCnpj()  + " " + getInscricaoEstadoual() ;
    }
    

}
