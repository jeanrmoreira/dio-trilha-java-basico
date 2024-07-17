import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos{
    Set<Produto> produtosSet = new HashSet<>();

    public CadastroProdutos() {
        this.produtosSet = new HashSet<>();
    }

void adicionarProduto(int cod, String nome, double preco, int quantidade){
    produtosSet.add(new Produto(nome, cod, preco, quantidade));
}

public Set<Produto> exibirProdutosPorNome(){
    Set<Produto> produtosPorNome = new TreeSet<>(produtosSet);
    return produtosPorNome;
}

class ComparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}

public Set<Produto> exibirProdutosPorPreco(){
    Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
    produtosPorPreco.addAll(produtosSet);
    return produtosPorPreco;
}

}