import java.util.*;
public class Carro extends Veiculo implements Tributavel{
    String categoria;
    public Carro(String marca,String modelo,int anoFabricacao,String categoria){
        super(marca,modelo,anoFabricacao);
        this.categoria=categoria;
    }
    public String getCategoria() {
        return categoria;
    }
    @Override
    public String toString(){
        return "\n Marca: " + getMarca() + "\n Modelo: " + getModelo() + "\n ano de Fabricação: " + getAnoFabricacao() + "\n Categoria: " + getCategoria() + "\n IPVA: " + calcularIpva();
    }
    public double calcularIpva(){
        if(getCategoria()=="passeio"){
            return 1500/(2023 - getAnoFabricacao());
        }
        else if (getCategoria()=="utilitario"){
            return 1000/(2023 - getAnoFabricacao());
        }
        else return 0;

    }
}
