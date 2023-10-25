import java.util.Scanner;
public class Prova{
    //private Questao q;
    private Questao [] questao;
    private Correcao [] correcao;

    public Prova(){
        questao = new Questao [5];
        for(int i=0;i<5;i++){
            questao[i] = new Questao();
        }
        //q = new Questao();
    }

    public void gerarRelatorio(){
        for(int i=0;i<5;i++){
            System.out.print("Questao " + correcao[i].getQuestao());
            System.out.print("Situacao " + correcao[i].getNumeroTentetiva());
            System.out.println("Numero de tentativas " + correcao[i].getSituacao());
            
        }
    }

    public void aplicar(){
        int cont;
        Scanner ent = new Scanner(System.in);
        
            //System.out.println("Responda a questao" + q.getEnunciado());
        for(int i=0;i<5;i++){
            cont = 0;
            System.out.println("Responda a questao" + questao[i].getIdQuestao()+ ":\n" + questao[i].getEnunciado());
            int resp = ent.nextInt();
                
            if(questao[i].acertou(resp)){
                System.out.println("Acertou");
            }
            else{
                System.out.println("Errou");
                System.out.println("Você tem mais um chance!");
                resp = ent.nextInt();
                if(questao[i].acertou(resp)){
                    System.out.println("Acertou");
                }
                else{
                    System.out.println("Errou");
                }
                cont++;

            }
            cont++;
            correcao[i] = new Correcao(questao[i].getIdQuestao(),cont,situacao);
            //System.out.printf("Você tentou %d vez(es) e acertou a questão!",cont);
        }   
            
       
        
        ent.close();
         
    }

}