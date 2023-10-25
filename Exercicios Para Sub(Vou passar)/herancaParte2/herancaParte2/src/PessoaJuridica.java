import java.util.*;
public class PessoaJuridica extends Contato{ 
    String cnpj;
    int inscricaoEstadual;

    public PessoaJuridica(String nome,String endereco, String email, String cnpj, int inscricaoEstadual){
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


}
