public class App {
    public static void main(String[] args) throws Exception {
        CadastroProdutos cadastro = new CadastroProdutos();
        cadastro.adicionarProduto(9, "caneta", 3.00, 2);
        cadastro.adicionarProduto(5, "borracha", 2.00, 1);
        cadastro.adicionarProduto(5, "lapiseira", 7.00, 1);
        cadastro.adicionarProduto(5, "fichario", 70.00, 1);

        System.out.println(cadastro.exibirProdutosPorNome());
        System.out.println(cadastro.exibirProdutosPorPreco());



    }
}
