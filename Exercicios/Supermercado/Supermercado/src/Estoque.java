import java.util.ArrayList;
import java.util.Scanner;
public class Estoque {
    private String tipo;
    private ArrayList<Produto> produto;
    Scanner ent = new Scanner(System.in);
    public Estoque(){
        produto = new ArrayList<Produto>();
    }
    public void setTipoEstoque(){
        tipo = ent.nextLine();
    }
    public void setProdutos(){
        System.out.println("Voce quer add um pruduto? s/n");
        String c;
        //Scanner ent = new Scanner(System.in);
        c = ent.nextLine();
        while(c == "s"){
            System.out.println("Nome:");

            System.out.println("Marca:");
            System.out.println("Quantidade:");

        }
    }
    

}
