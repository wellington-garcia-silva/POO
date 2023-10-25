import java.util.*;
import java.util.ArrayList;
public class Frota{
    //public Frota(Veiculo v){
        //this.v=v;
    //}
    ArrayList<Veiculo> veiculos;//=new ArrayList<>()
    public Frota(){
        veiculos = new ArrayList<>();
    }
    public void inserirVeiculo(Veiculo veio){
        veiculos.add(veio);
    }
    public void gerarRelatorio(){
        for(Veiculo v: veiculos){
            System.out.println(v);
            System.out.println("-----------------");
        }
    }
}