public class FuncionarioHorista extends Funcionario{
    double salarioHora;
    double horasTrabalhadas;
    public FuncionarioHorista(String nome,String cpf,double salarioHora,double horasTrabalhadas){
        super(nome,cpf);
        this.salarioHora=salarioHora;
        this.horasTrabalhadas=horasTrabalhadas;
    }
    public double getSalarioHora(){
        return 0;
    }
    public double getHorasTrabalhadas(){
        return 0;
    }
    public double calcularSalario(){
        return getSalarioHora()*getHorasTrabalhadas();
    }
}
