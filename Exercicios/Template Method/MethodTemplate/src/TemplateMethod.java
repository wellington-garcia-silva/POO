public class TemplateMethod {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        TrasformacaoString inverte= new Inverter();
        TrasformacaoString maior = new Maiuscula();

        maior.transformacao();

        inverte.transformacao();
    }
}
