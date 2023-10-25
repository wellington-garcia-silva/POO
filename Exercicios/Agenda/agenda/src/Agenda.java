import java.util.*;
import java.util.ArrayList;
public class Agenda {
    String nomeAgenda;
    ArrayList <contatos> agenda;
    public Agenda(String nomeAgenda){
        this.nomeAgenda = nomeAgenda;
         agenda = new ArrayList<>();
    }
    /*public void remover(String n){
        agenda.remove(n);
    }*/
    public void setContatos(contatos c){
        agenda.add(c);
    }
    public void buscarConta(String cpf){
        int i = 0;
        int posicao;
        for(contatos cont: agenda){
            if(cont.getCpf() == cpf) {
                posicao = get(i);
                remove(i);
                //return c;
            }
             i++;
         }
         System.out.println("Pessoa não encontrada!");
    }
    public void relatorioAgenda(){
        for(contatos c: agenda){
            System.out.println(c);
        }
    }
   
}
