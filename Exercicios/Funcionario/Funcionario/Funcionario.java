public class Funcionario {
    private String nome;
    private String cpf;

    public Funcionario(String nome,String cpf){
        this.nome=nome;
        this.cpf=nome;
        
    }

    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public double calcularSalario(){
        
        return 0;
    }

    @Override//verifica se objeto é funH ou funC dependadno criar objetos para retornar objetos de Func e colocar nos metodos abaixo ex: funH.getNome ou funC.getNome;
    public String toString() {
        return "Nome: "+ getNome()+"\nCPF: "+getCpf()+"\nSalario: "+calcularSalario();
    }
}