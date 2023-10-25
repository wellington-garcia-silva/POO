public class AlunoEspecial extends Aluno{
    int qtdeFaltas;

    public AlunoEspecial(String nome,String numMatricula,double notaFinal){
        super(nome, numMatricula, notaFinal);

    }

    public int getQtdeFaltas(){
        return qtdeFaltas;
    }

    public String getSituacao(){
        if((getNotaFinal() >= 60) || (getQtdeFaltas() >=17)){
            return "Aprovado";
        }
        else return "Reprovado";
    } 

    @Override
    public String toString(){
        return "\n Nome: " + getNome() + "\n Matricula:  " + getNumMatricula() + "Situação: " + getSituacao();
    } 
    
 

}
