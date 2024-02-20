# README - Projeto Controle de Estoque

Este repositório contém três arquivos Java que compõem um projeto simples de um sistema ERP que adiciona produtos e controla o estoque utilizando conhecimentos adquiridos através do curso *Formação Java Developer* da DIO.

Os arquivos são:

***Produto.java***: Este arquivo contém a implementação da classe Produto, que representa os produtos do sistema. Ela possui métodos para adicionar e consultar o produto cadastrado, além de ser possivel adicionar o nome, cor e modelo do produto.

***Estoque.java***: Este arquivo contém a implementação da classe Estoque, que representa o estoque do produto que será adicionado. É possivel adicionar, modificar, consultar e zerar o estoque do produto adicionado.

***Sistema.java***: Arquivo com a classe Sistema, que contém o método main. No método main, uma instância do produto e estoque são criados, e diversas operações são realizadas, como adicionar um produto especificando o nome, cor e modelo, consultar e modificar o estoque do mesmo.

## Funcionalidades do Sistema:

*Produto:*

Método ***adicionarProduto(String nomeProduto, String corProduto, String modeloProduto)*** para adicionar o produto, especificando o nome do produto, a cor e o modelo.
Método ***consultarProdutoAtual()*** para consultar o produto cadastrado.

*Estoque:*

Método ***adicionarEstoqueDoProduto()*** para adicionar de 1 em 1 a quantidade do produto no estoque.
Método ***modificarQuantidadeDoProduto(int novoEstoque)*** para modificar a quantidade do estoque total.
Método ***zerarEstoqueDoProduto()*** para zerar o estoque do produto. 
Método ***consultarEstoqueDoProduto()*** para consultar a quantidade em estoque do produto..
