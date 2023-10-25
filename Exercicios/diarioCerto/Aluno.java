import java.util.ArrayList;
public class Aluno {
    private String nome;
    private int notaObtida;
    private int quantidadeFaltas;
    private String situacao;

    public Aluno(String nom,int  note,int falt){
        //alunos = new ArrayList<Diario>();//criar o array dentro da classe diario
        nome = nom;
        notaObtida= note;
        quantidadeFaltas=falt;
        if(notaObtida >= 60){
            if(quantidadeFaltas < 19)
                situacao = "Aprovado";
        }
        else situacao = "Reprovado";
    }
    public int getNota(){
        //for(int i = 0; i < alunos.size(); i++){
            
        //}
        return notaObtida;
    }
    public String getSituacao(){
        return situacao;
    }
    public int getFalta(){
        return quantidadeFaltas;
    }
    public String getNome(){
        return nome;
    }
        
}
 