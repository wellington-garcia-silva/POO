public class morango extends adicionais {
    public morango(Sorvete s){
        super(s);
    }
    @Override
    public double preco(){
        return 1.5 + getSorvete().preco();
    }
}
