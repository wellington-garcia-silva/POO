import java.util.ArrayList;
import java.util.Comparator;
public class Estoque {
    private String tipo;
    private ArrayList<Produto>estoque;
    Estoque(String tipo){
        this.tipo=tipo;
        estoque = new ArrayList<Produto>();
    }
    public void setProduto(Produto p){
         estoque.add(p);
    }
    public void getGerarRelatorio(){
        System.out.printf("Tipo do estoque : ",tipo);
        System.out.println("Nome "+ "Marca"+"quantidade");
        for(Produto e:estoque){
            System.out.printf("%s %s %d",e.getNome(),e.getMarca(),e.getQuantidade());
        }

    }
    public Comparator<Produto> getComparator(){
        Comparator<Produto> c = new Comparator <Produto>(){
            @Override
            public int compare(Produto p1,Produto p2){
                if(p1.getNome().equals(p2.getNome())){
                    return p1.getMarca().compareTo(p2.getMarca());
                }    
                else{
                    return p1.getNome().compareTo(p2.getNome());
                }
            }                          
        };
        return c;
    }
}
