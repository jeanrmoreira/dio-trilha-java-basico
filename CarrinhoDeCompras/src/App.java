

public class App {
    public static void main(String[] args) throws Exception {

        CarrinhoDeCompras cart = new CarrinhoDeCompras();
        cart.adicionarItem("livro", 20, 1);
        cart.adicionarItem("perfume", 300, 1);
        cart.adicionarItem("caneta", 7, 4);
        cart.adicionarItem("camiseta", 70, 1);
        cart.removerItem("perfume");
        cart.calcularValorTotal();
        cart.exibirItems();


    }
}
