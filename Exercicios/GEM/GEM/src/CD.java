public class CD extends item{
    private int numeroFaixas;
    private String artista;

    public CD(String titulo, int tempoReproducao,boolean tenhoCopia,String artista,int numeroFaixas){
        super(titulo, tempoReproducao,tenhoCopia);
        this.numeroFaixas=numeroFaixas;
        this.artista=artista;
    }

    public String getArtista(){
        return artista;
    }
    public int getNumeroFaixas(){
        return numeroFaixas;
    }
    public String getDescricaoCd(){
        String descricao = getDescricaoItem();
        descricao+= "Artista" + artista + "\n" + "numero de faixas" + numeroFaixas + "\n";
        return descricao;
    }
}
