import java.util.ArrayList;
import java.util.Comparator;
public class Diario {
    private String codigoDisciplina;
    private ArrayList<Aluno> alunos;
    
    public Diario(String codigo){
        this.codigoDisciplina = codigo;
        alunos = new ArrayList<Aluno>();
    }
    public void adicionarAluno(Aluno pessoa){
        alunos.add(pessoa);//Grande sacada
    }
    
    public void gerarDiarioTurma(){
        //ArrayList<String> nomes = new ArrayList<>();
        Comparator<Aluno> comparador = new Comparator<Aluno>( ){
            @Override
            public int compare(Aluno nota1, Aluno nota2){
                return nota1.getNota() - nota2.getNota();
            }
        };
        alunos.sort(comparador);

        System.out.println(codigoDisciplina);
        ArrayList<String> nomes = new ArrayList<>();
            for(String item: nomes){
                System.out.println(item);
            }

        for(int i = 0; i < alunos.size(); i++){
            System.out.println(alunos.get(i));
            System.out.printf("Displiplina\n%s",codigoDisciplina);/////
            System.out.printf("Nome%s",alunos.getNome());
            System.out.printf("Nota%d",alunos.getNota());
            System.out.printf("Situação%s",alunos.getSituacao());
            System.out.printf("Faltas%d",alunos.getFalta());
            }
            
    }
    
}