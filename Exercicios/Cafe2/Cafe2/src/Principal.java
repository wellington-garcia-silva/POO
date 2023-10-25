public class Principal {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        
        System.out.println("Digite o código do tipo do café (0: Americano/1: Expresso/2: Sem Cafeína): ");
        Cafe cafe = new Cafe(1);
        
        

        System.out.println("Deseja adicionar algum complemento? (0: não ou 1: sim):");
        int i = 1;
        if(i == 1){
            System.out.println("Insira o código do 1º complemento desejado (0: leite, 1: chocolate, 2: canela):");
            cafe.setComplementos(0);
        }
        System.out.println("Deseja adicionar outro complemento? (0: não ou 1: sim):");
        i = 1;
        if(i == 1){
            System.out.println("Insira o código do 2º complemento desejado (0: leite, 1: chocolate, 2: canela):2");
            cafe.setComplementos(2);
        }

        System.out.println("Deseja adicionar outro complemento? (0: não ou 1: sim):");
        i = 0;
        if(i == 1){
            System.out.println("Deseja adicionar outro complemento? (0: não ou 1: sim): ");
            cafe.setComplementos(1);
        }

        //////////////////Impressão/////////////////////////////////

        double vetComp[] = new double[cafe.getQuantidadeComplementos()];
        double precoComplemento=0;
        double precoTipo=0;
        double total = 0;
        //int vetTipo[] = new int[cafe.getQuantidadeComplementos()];

        for(int j=0;j<cafe.getQuantidadeComplementos();j++){
            
            if(cafe.getCodigoComplementos(j) == 0){
                vetComp[j]= 5;
            }
            else if(cafe.getCodigoComplementos(j) == 1){
                vetComp[j]=8;
            }
            else vetComp[j]=2;
            precoComplemento += vetComp[j];
            
        }

        if(cafe.getTipoCafe() == 0){
            precoTipo= 7.5;
        }
        else if(cafe.getTipoCafe() == 1){
            precoTipo=4.30;
        }
        else precoTipo=10;

        total = precoTipo+precoComplemento;

        
        System.out.println("############### NOTA FISCAL ###############");
        
        System.out.printf("Preço do café = %f\n" ,precoTipo);

        System.out.printf("Preço dos Complementos = %f\n",precoComplemento);

        System.out.printf("Total = %f\n",total);


        



    }
}
