import java.util.Random;
public class Questao{
    private String enunciado;
    private int gabarito;
    private int idQuestao;//
    private static int totalQuestao;

    public  Questao(){
        totalQuestao++;
        idQuestao = totalQuestao;
        Random r = new Random();
        int num1 = r.nextInt(10);
        int num2 = r.nextInt(10);
        //System.out.printf("Questão " + totalQuestao + " - ");
        enunciado = "Quanto é " + num1 + " * " + num2 + " ?";
        gabarito = num1*num2;
    }

    public int getIdQuestao(){
        return idQuestao;
    }

    public String getEnunciado(){
        return enunciado;
    }
    public boolean acertou(int resposta){
        return gabarito == resposta;
    }
}