public class TesteDecorator {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Veiculo pas = new Passeio("Carro de passeio");
        gerarRelatorio(pas);
        pas = new ArCondicionado(pas);
        gerarRelatorio(pas);

    }
    public static void gerarRelatorio(Veiculo v){
        System.out.println("Tipo" + v.getDescricao()+"\tPreço: "+v.preco());
    }
}
