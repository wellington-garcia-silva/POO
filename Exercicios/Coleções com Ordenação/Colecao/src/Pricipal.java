public class Pricipal{
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Estoque estoque = new Estoque("Fluxo");
        Produto produto = new Produto("Arroz","Tio João",250);
        estoque.setProduto(produto);
        produto = new Produto("Arroz","Prato Fino",125);
        estoque.setProduto(produto);
        produto = new Produto("Sabonete","Dove",50);
        estoque.setProduto(produto);
        produto = new Produto("Sabonete","nívea",25);
        estoque.setProduto(produto);
        produto = new Produto("Sabonete","Palmolive",40);
        estoque.setProduto(produto);
    }
}
