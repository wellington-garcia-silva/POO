import java.util.Scanner;
public class Principal{
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        int tipoCafe, complemento, primeiroComplemento, segundoComplemento, terceiroComplemento;
        int cont = 0;
        int precocafe = 0;
        int total = 0;
        int precoComp= 0;
        
        Scanner ent = new Scanner(System.in);
        System.out.println("Digite o código do tipo do café (0: Americano/1: Expresso/2: Sem Cafeína):");
        tipoCafe = ent.nextInt();

        Cafe coffe = new Cafe(tipoCafe);
        
        System.out.println("Deseja adicionar algum complemento? (0: não ou 1: sim):");
        complemento = ent.nextInt();

        if(complemento == 1){

            System.out.println("Insira o código do 1º complemento desejado (0: leite, 1: chocolate, 2: canela):");
            primeiroComplemento=ent.nextInt();

            coffe.setInserirCodigo(primeiroComplemento);

            System.out.println("Deseja adicionar outro complemento? (0: não ou 1: sim): ");
            complemento = ent.nextInt();
            cont++;
            
            if(complemento == 1){
                System.out.println("Insira o código do 2º complemento desejado (0: leite, 1: chocolate, 2: canela):");
                segundoComplemento=ent.nextInt();

                coffe.setInserirCodigo(segundoComplemento);

                System.out.println("Deseja adicionar outro complemento? (0: não ou 1: sim): ");
                complemento = ent.nextInt();
                cont++;

                /*if(complemento == 1){
                    System.out.println("Insira o código do 3º complemento desejado (0: leite, 1: chocolate, 2: canela):");
                    terceiroComplemento=ent.nextInt();

                    coffe.setInserirCodigo(terceiroComplemento);

                    cont++;

                    //System.out.println("Deseja adicionar outro complemento? (0: não ou 1: sim): ");
                    //complemento = ent.nextInt();

                } //end primeiro if  */     
            }//end primeiro if

        }//end primeiro if

    //Nota Fiscal

    int comp = tipoCafe;
    if(comp == 0){
        precocafe =+ 2;
    }
    else if(comp == 1){
        precocafe =+ 4;
    }
    else precocafe =+ 6;

    int aux = 0;
    for(int i = 0;i<cont;i++){
        aux = coffe.getCodigoComplento(i);
        if(aux == 0){
            precoComp =+ 3;
        }
        else if(aux == 5){
            precoComp =+ 4;
        }
        else precoComp =+ 7;
    }
    total = precoComp + precocafe;
    System.out.println("############### NOTA FISCAL ###############");
    System.out.printf("Cafe: %s",coffe.getTipoCafe());//
    System.out.printf("\nPreço Café = %d", precocafe);//Preço do cafe 4.5 exp, 3coffe.getQuantidadeComplementos()
    System.out.printf("\nPreço dos Complementos = %d", precoComp);//s Complementos
    System.out.printf("\nTotal = %d",total);
    

    ent.close();//Fim Scanner
    }
}
