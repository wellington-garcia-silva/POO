import java.util.*;
public abstract class Veiculo {
    String nome;
    String modelo;
    int anoFabricacao;
    public Veiculo(String nome,String modelo,int anoFabricacao){
        this.nome=nome;
        this.modelo=modelo;
        this.anoFabricacao=anoFabricacao;
    }
    public String getMarca(){
        return nome;
    }
    public String getModelo(){
        return modelo;
    }
    public int getAnoFabricacao(){
        return anoFabricacao;
    }
    public abstract String toString();
    

}
