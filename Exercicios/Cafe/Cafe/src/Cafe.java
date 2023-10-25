import java.util.ArrayList;
public class Cafe {
    private String tipoCafe;
    private ArrayList<Integer> codigos;

    public Cafe(int cafe){
        //this.tipoCafe = tipoCafe;
        if(cafe == 0){
            tipoCafe = " Americano";
        }
        else if(cafe == 1){
            tipoCafe = "Expresso";
        }
        else tipoCafe = "Sem Cafeína";
        codigos = new ArrayList<Integer>();

    }

    public String getTipoCafe(){
        return tipoCafe;
    }
    public int getQuantidadeComplementos(){
        int n =0;
        for(int i = 0; i < codigos.size(); i++){
            n++;
        }
        return n;
        
    }
    public int getCodigoComplento(int n){
        //int n=0;
        //for(int i = 0; i < codigos.size(); i++){
            //System.out.println(item);
            //n++;
            return codigos.get(n);
        //}
        //return n;
    }
    public void setInserirCodigo(int n){
        codigos.add(n);
    }

}
