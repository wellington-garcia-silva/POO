import java.util.Scanner;
public class exer1{
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Scanner ler = new Scanner(System.in);

        double quantidade;
        double preco;
        double compra;
        double desconto;
        double precofinal;
        double codigo;

        codigo = ler.nextDouble();
        quantidade = ler.nextDouble();
        
        /*preco = ler.nextDouble();
        compra = ler.nextDouble();
        desconto = ler.nextDouble();
        novopreco = ler.nextDouble();
        */
        

        if(codigo >= 1 && codigo <= 10){
            preco = 10;
        }
        else if(codigo >= 11 && codigo <= 20){
            preco = 15;
        }
        else if(codigo >= 21 && codigo <= 30){
            preco = 20;
        }
        else {
            preco = 30;
        }

        compra = quantidade*preco;

        if (compra < 250){
            desconto = compra*0.05;
            precofinal = compra*0.95;
        }
        else if (compra >= 250 && compra <= 500){
            desconto = compra*0.10;
            precofinal = compra*0.90;
        }
        else{
            desconto = compra*0.15;
            precofinal = compra*0.80;
        }

        System.out.println(preco);
        System.out.println(compra);
        System.out.println(desconto);
        System.out.println(precofinal);
        
    }
}
