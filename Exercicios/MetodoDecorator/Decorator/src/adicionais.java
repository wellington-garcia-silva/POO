public abstract class adicionais extends Sorvete{
    private Sorvete s;

    public adicionais(Sorvete s){
        this.s=s;
        setDescricao(s.getDescricao());
    }
    public Sorvete getSorvete(){
        return s;
    }
}
