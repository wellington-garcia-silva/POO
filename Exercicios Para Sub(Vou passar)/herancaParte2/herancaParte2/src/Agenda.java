import java.util.ArrayList;
public class Agenda {
    ArrayList<Contato> agenda;

    public Agenda(){
        agenda = new ArrayList<>();
    }
    public void setContatos(Contato c){
        agenda.add(c);
    }
    /*public removeContato(String id){
        int i = 0;
        for(Contato cont: agenda){
            if((cont.getCpf() == id || cont.getCnpj())){
                cont.remove(i);
            }
            i++;
        }
    }*/
    public void gerarRelatorio(){
        //int i =0;
        for(Contato cont: agenda){
            
            //System.out.println(c.getNome());
            //if(cot.getCpf().equals(name)||cot.getCnpj().equals(name)){
                System.out.println(cont);
        } 
    }

}
