public class Maiuscula extends TrasformacaoString{
    @Override
    public void transformar(String s){
        System.out.println("Transformando a String ");
        s = s.toUpperCase();
        System.out.println("String Maiuscula: " + s);
    }
}
