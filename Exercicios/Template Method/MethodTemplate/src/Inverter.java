public class Inverter extends TrasformacaoString{
    @Override
    public void transformar(String s){
        System.out.println("Transformando a String: ");
        StringBuilder sb = new StringBuilder(s);
        String textoInvertido = sb.reverse().toString();
        System.out.println("String Invertida: " + textoInvertido);
    }
}
