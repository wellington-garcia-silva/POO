import java.util.*;
public class contatos {
    private String nome;
    private String endereco;
    private String email;
    public contatos(String nome,String endereco,String email){
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }
    public String getNome(){
        return nome;
    }
    public String getEndereco(){
        return endereco;
    }
    public String getEmail(){
        return email;
    }
    public String getCpf(){
        return getCpf();
    }

    public String retornaContato(){
        return " ";
    } 
    @Override
    public String toString(){
        return getNome() + " " + getEndereco() + " " + getEmail() + " " + retornaContato();
    } 
}
