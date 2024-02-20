public class Sistema {
    public static void main(String[] args) throws Exception {

        Produto produto = new Produto();
        Estoque estoque = new Estoque();

        produto.adicionarProduto("Teclado", "Branco", "Mancer");
        
        produto.consultarProdutoAtual();

        estoque.modificarQuantidadeDoProduto(19);

        estoque.consultarEstoqueDoProduto();

        estoque.zerarEstoqueDoProduto();

        estoque.consultarEstoqueDoProduto();

        produto.adicionarProduto("Mouse", "Preto", "TRC");

        produto.consultarProdutoAtual();

    }
}
