import java.util.*;
import java.util.ArrayList;
public class Diario {
    ArrayList<Aluno>aluno;

    public Diario(){
        aluno=new ArrayList<>();
    }
    public void setAluno(Aluno a){
        aluno.add(a);
    }

    public void gerarRelatorio(){
        for(Aluno al: aluno){
            System.out.println(al);
            System.out.println("-----------------");
        }
    }
    public void Remover(String matricula){
        int i=0;
        for(Aluno al: aluno){
            //if(getNumeroMatricula() == matricula){

            //}
        }
        aluno.remove(matricula);
    }
}
