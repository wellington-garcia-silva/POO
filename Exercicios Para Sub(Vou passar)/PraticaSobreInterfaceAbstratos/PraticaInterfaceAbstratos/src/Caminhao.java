public class Caminhao extends Veiculo implements Tributavel{
    int numEixos;
    public Caminhao(String marca,String modelo,int anoFabricacao,int numEixos){
        super(marca,modelo,anoFabricacao);
        this.numEixos=numEixos;
    }
    public int getNumEixos() {
        return numEixos;
    }
    public String toString(){
        return "\n Marca: " + getMarca() + "\n Modelo: " + getModelo() + "\n ano de Fabricação: " + getAnoFabricacao() +"\n Num eixos: " +   getNumEixos() + "\n IPVA: " + calcularIpva();
    }
    public double calcularIpva(){
        return 200*getNumEixos()/(2023 - getAnoFabricacao());
    }
}
