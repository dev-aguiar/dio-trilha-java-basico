public class Produto {
    String nome; 
    String cor;
    String modelo;

    public void adicionarProduto(String nomeProduto, String corProduto, String modeloProduto) {
        nome = nomeProduto;
        cor = corProduto;
        modelo = modeloProduto;
    }

    public void consultarProdutoAtual(){
        System.out.println("O Produto atual é: " + nome + ", da cor " + cor + " e modelo " + modelo);
    }
}
