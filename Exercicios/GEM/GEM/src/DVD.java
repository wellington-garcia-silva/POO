public class DVD extends item{
    private String diretor;

    public DVD(String titulo,int tempoReproducao, boolean tenhoCopia, String diretor){
        super(titulo,tempoReproducao,tenhoCopia);
        this.diretor=diretor;
    }

    public String getDiretor(){
        return diretor;
    }
    public String getDescricaoDvd(){
        String descri;
        descri = "diretor" + diretor + "\n" + "tempo de reproducao"  + "\n" ;
        return descri;
    }
}
