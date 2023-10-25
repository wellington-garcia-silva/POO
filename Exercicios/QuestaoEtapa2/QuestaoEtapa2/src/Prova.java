import java.util.Scanner;

import java.util.Scanner;
public class Prova{
    private Questao q;
    public Prova(){
        q = new Questao();
    }

    public void aplicar(){
        int cont = 0;
        Scanner ent = new Scanner(System.in);
        System.out.println("Responda a questao" + q.getEnunciado());
        int resp = ent.nextInt();
        
        if(q.acertou(resp)){
            System.out.println("Acertou");
            cont++;
        }
        else{
            System.out.println("Errou");
            cont++;
        }
        
        while(q.acertou(resp) == false){
            System.out.println("Você tem mais uma chance!");
            resp = ent.nextInt();
            cont++;
        }
        System.out.printf("Você tentou %d vez(es) e acertou a questão!",cont);

        ent.close();
    }

}