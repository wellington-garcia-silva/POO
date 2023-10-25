public class chocolate extends adicionais {
    public chocolate(Sorvete s){
        super(s);
    }
    @Override
    public double preco(){
        return 2.5 + getSorvete().preco();
    }
}
