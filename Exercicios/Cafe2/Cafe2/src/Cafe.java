import java.util.ArrayList;
public class Cafe {
    private int tipoCafe;
    ArrayList<Integer> complementos;

    public Cafe(int tipoCafe){
        this.tipoCafe = tipoCafe;
        complementos = new ArrayList<Integer>();
    }
    public int getTipoCafe(){
        return tipoCafe;
    }
    public int getQuantidadeComplementos(){
        return complementos.size();
    }
    public int getCodigoComplementos(int posicao){
        return complementos.get(posicao);
    }
    public void setComplementos(int comp){
        complementos.add(comp);
    }

}
