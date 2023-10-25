import java.util.Scanner;
public abstract class TrasformacaoString {
    public final void transformacao(){
        String aux = transformaS();
        //inverter(aux);
        transformar(aux);

    }
    public abstract void transformar(String aux);
    //public abstract void inverter(String aux);
    public String transformaS(){
        System.out.println("Transformando a String");
        Scanner ler = new Scanner(System.in);
        String palavra = ler.nextLine();
        return palavra;
    }

}

