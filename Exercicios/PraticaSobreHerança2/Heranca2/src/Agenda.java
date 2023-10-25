import java.util.ArrayList;
import java.util.*;
public class Agenda {
    ArrayList<Contatos> agenda;

    public Agenda(){
        agenda = new ArrayList<>();
    }
    public void setContatos(Contatos c){
        agenda.add(c);
    }
    public void gerarRelatorio(String name){
        int i =0;
        for(Contatos c: agenda){
            i++;
            System.out.println(c.getNome());
            //if(cot.getCpf().equals(name)||cot.getCnpj().equals(name)){
                if(c.getCpf() == "123 "||c.getCnpj() == "123"){
                    c.remove(i);
                    System.out.println("Objeto removido!");
                    System.out.println("-----------------");
                }
        } 
    }

}
