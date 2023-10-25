public class pessoaFisica extends contatos{
    private  String cpf;
    private String estadoCivil;
    public pessoaFisica(String nome, String endereco, String email,String cpf,String estadoCivil){
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
    public String retornaContato(){
        return getCpf()  + " " + getEstadoCivil();
    }
    
}
