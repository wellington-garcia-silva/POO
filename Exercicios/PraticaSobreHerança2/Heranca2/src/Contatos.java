public class Contatos {
    private String nome;
    private String endereco;
    private String email;

    public Contatos(String nome,String endereco,String email){
        this.nome=nome;
        this.email=email;
        this.endereco=endereco;
    }
    public String getNome(){
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getEmail(){
        return email;
    }
    @Override
    public String toString(){
        return nome;
    }

}
