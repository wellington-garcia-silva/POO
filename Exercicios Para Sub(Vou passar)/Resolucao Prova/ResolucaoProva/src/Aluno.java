import java.util.*;
public abstract class Aluno {
    double notaFinal;
    String nome;
    String numMatricula;

    public Aluno(String nome,String numMatricula,double notaFinal){
        this.nome=nome;
        this.numMatricula=numMatricula;
        this.notaFinal=notaFinal;

    }

    public String getNome(){
        return nome;
    }
     public String getNumMatricula(){
        return numMatricula;
     }
     public double getNotaFinal(){
        return notaFinal;
     }

     public abstract String toString();
     public abstract String getSituacao();


}
