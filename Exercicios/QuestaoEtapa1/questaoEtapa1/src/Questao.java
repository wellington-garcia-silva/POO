import java.util.Random;
public class Questao{
    private String enunciado;
    private int gabarito;
    public Questao(){
        Random r = new Random();
        int num1 = r.nextInt(10);
        int num2 = r.nextInt(10);
        enunciado = "Quanto é" + num1 + "*" + num2 + "?";
        gabarito = num1*num2;
    }
    public String getEnunciado(){
        return enunciado;
    }
    public boolean acertou(int resposta){
        return gabarito == resposta;
    }
}