import java.util.ArrayList;
public class Empresa {
    String nome;
    String cnpj;
    ArrayList<Funcionario> funcionarios;

    public Empresa(String nome,String cnpj){
        this.nome=nome;
        this.cnpj=cnpj;
        funcionarios = new ArrayList<>();
    }

    public void admitirFuncionario(Funcionario fun){
        funcionarios.add(fun);
    }
    
    public void gerarFolhaDePagamento() {
        for(Funcionario f: funcionarios) {
            System.out.println(f);
        }
    }
}
