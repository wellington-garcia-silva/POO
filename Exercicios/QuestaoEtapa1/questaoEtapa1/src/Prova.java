import java.util.Scanner;

import java.util.Scanner;
public class Prova{
    private Questao q;
    public Prova(){
        q = new Questao();
    }

    public void aplicar(){
        Scanner ent = new Scanner(System.in);
        System.out.println("Responda a questao" + q.getEnunciado());
        int resp = ent.nextInt();
        ent.close();
        if(q.acertou(resp)){
            System.out.println("Acertou");
        }
        else{
            System.out.println("Errou");
        }
    }

}