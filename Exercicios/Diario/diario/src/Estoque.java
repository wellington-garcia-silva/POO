import java.util.ArrayList;
import java.util.Comparator;
public class Estoque{
    String tipo;
    ArrayList<Produto> estoque;
    public Estoque (String tipo){
        this.tipo=tipo;
        estoque = new ArrayList<Produto>();
    }
    public String getTipo(){
        return tipo;
    }
    void adicinarNoEstoque(Produto p){
        estoque.add(p);
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
    public void gerarRelatorioEstoque(){
        estoque.sort(getComparator());
        System.out.printf("tipo de estoque\n" + tipo );
        //System.out.printf("tipo de estoque" + tipo + "\n") ;
        //System.out.printf("-15%s,-15%s-15%d\n","Nome"+"Marca""Quantidade");
        for(Produto p: estoque){
            System.out.printf("%s,%s,%d\n",p.getNome(),p.getMarca(),p.getQuantidade());
        }

    }

}