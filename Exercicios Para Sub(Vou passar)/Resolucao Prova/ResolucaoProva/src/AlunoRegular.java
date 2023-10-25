public class AlunoRegular extends Aluno{
    int qtdeFaltas;

    public AlunoRegular(String nome,String numMatricula,double notaFinal,int qtdeFaltas){
        super(nome, numMatricula, notaFinal);
        this.qtdeFaltas=qtdeFaltas;

    }

    public int getQtdeFaltas(){
        return qtdeFaltas;
    }

    @Override
    public String toString(){
        return "\n Nome: " + getNome() + "\n Matricula:  " + getNumMatricula() + "Situação: " + getSituacao();
    }
    @Override
    public String getSituacao(){
        if((getNotaFinal() >= 60) || (getQtdeFaltas() >=17)){
            return "Aprovado";
        }
        else return "Reprovado";
    } 

}
