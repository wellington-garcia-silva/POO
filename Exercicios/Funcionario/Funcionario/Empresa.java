import java.util.*;
import java.util.ArrayList;
public class Empresa extends Objects{
    private String nome;
    private String cnpj;
    ArrayList<Funcionario> func;
    
    public Empresa(String nome,String cnpj){
        this.nome=nome;
        this.cnpj=cnpj;
        func = new ArrayList<Funcionario>();
    }
    public void getAdmitirFuncionario(Funcionario f){
        func.add(f);
    }
    public void gerarFolhaDePagamento() {
        for(Funcionario f: funcionarios) {
            System.out.println(f);
        }
    }
}