import java.util.*;
public abstract class Funcionario {
    String cpf;
    String nome;
    public Funcionario(String nome,String cpf){
        this.nome=nome;
        this.cpf=cpf;
    }
    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public abstract double calcularSalario();
    @Override
    public String toString() {
        return "Nome: "+ getNome()+"\nCPF: "+getCpf()+"\nSalario: "+calcularSalario();
    }
}
