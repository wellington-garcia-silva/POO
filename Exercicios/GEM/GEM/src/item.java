public class item {
    private String titulo;
    private int tempoReproducao;
    private boolean tenhoCopia;
    private String comentario;

    public item(String titulo,int tempoReproducao,boolean tenhoCopia){
        this.titulo = titulo;
        this.tempoReproducao =tempoReproducao;
        this.tenhoCopia = tenhoCopia;
        comentario = " ";

    }

    public void setComentario(String comentario){
        this.comentario = comentario;
    }
    public String getComentario(){
        return comentario;
    }
    public boolean getTenhoCopia(){
        return tenhoCopia;
    }
    
    public String getDescricaoItem(){
        String resposta;
        if(getTenhoCopia()) resposta = "sim";
        else resposta = "não";
        return "titulo"+titulo + "\n" +  "tempo de reproducao" + tempoReproducao + "tenho copia" + "\n" + "comentario" + "\n"  + "tenho copia?"+ tenhoCopia;  

    }
}

    

