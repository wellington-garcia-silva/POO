public class Principal {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Estoque estoque = new Estoque("fluxo");
        Produto produto = new Produto("Arroz","Tio João",125);
        estoque.setProduto(produto);
        produto = new Produto("Arroz","Prato Fino",250);
        estoque.setProduto(produto);
        produto = new Produto("Sabonete","Dove",50);
        estoque.setProduto(produto);
        produto = new Produto("Sabonete","Nívea",25);
        estoque.setProduto(produto);
        produto = new Produto("Sabonete","Palmolive",40);
        estoque.setProduto(produto);
        estoque.gerarRelatorioEstoque();
    }
}
