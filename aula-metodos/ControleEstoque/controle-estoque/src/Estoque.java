public class Estoque {
    int estoqueDoProduto = 10;
    int saidaDoEstoque = 0;

    public void adicionarEstoqueDoProduto() {
        estoqueDoProduto++;
    }

    public void modificarQuantidadeDoProduto(int novoEstoque) {
        estoqueDoProduto = novoEstoque;
    }

    public void zerarEstoqueDoProduto() {
        estoqueDoProduto = 0;
    }

    public void consultarEstoqueDoProduto() {
        System.out.println("O estoque total é " + estoqueDoProduto);
    }
}
