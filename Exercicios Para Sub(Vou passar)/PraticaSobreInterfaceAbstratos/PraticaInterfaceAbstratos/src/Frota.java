import java.util.*;
import java.util.ArrayList;
public class Frota{
    ArrayList<Veiculo>veiculos;
    public Frota(){
        veiculos=new ArrayList<>();
    }
    public void inserirVeiculo(Veiculo v){
        veiculos.add(v);
    }
    public void gerarRelatorio(){
        for(Veiculo v: veiculos){
            System.out.println(v);
            System.out.println("-----------------");
        }
    }
}
