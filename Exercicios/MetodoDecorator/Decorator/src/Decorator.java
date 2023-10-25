public class Decorator {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Sorvete sorvete = new cestinha("napolitano");
        gerarRelatorio(sorvete);
        sorvete = new chocolate(sorvete);
        sorvete = new chocolate(sorvete);
        sorvete = new creme(sorvete);
        sorvete = new morango(sorvete);
        sorvete = new morango(sorvete);
        gerarRelatorio(sorvete);


    }
    public static void gerarRelatorio(Sorvete s){
        System.out.println("Tipo de recipiente: " + s.getDescricao() +"\tPreço: " + s.preco());
    }
}
