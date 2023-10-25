import java.util.Scanner;
public class exer2 {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double pedro, joao;
        int cont;
        cont = 0;
        joao = ler.nextDouble();
        pedro = ler.nextDouble();

        joao = joao*1.025;
        pedro = pedro*1.005;

        while(pedro >= joao){
            joao = joao*1.025;
            cont=cont+1;
       }
       System.out.println(cont);
    }
}
