import java.util.Scanner;
public class exer3{
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Scanner ler = new Scanner(System.in);
        int tam;
        int 
        tam = ler.nextInt();

    
        String[] frase= new String[tam];

        
        for(int i=0;i<=tam;i++){//ler a frase
            frase[i] = ler.nextLine();
        }

        String[] arrOfStr = frase.split("@", 2);

    }
}
