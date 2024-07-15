import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    
    private List<Item> lista;

    public CarrinhoDeCompras(){
        this.lista = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        lista.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome){
        List<Item> listaremover = new ArrayList<>();
        for (Item i : lista){
            if(i.getNome().equalsIgnoreCase(nome)){
                listaremover.add(i);
            }
        }
        lista.removeAll(listaremover);
    }

    public void calcularValorTotal(){
        double total = 0;
        for (Item i : lista){
            double valor = i.getQuantidade()*i.getPreco();
            total = total + valor;
        }
        System.out.println("Valor total: " + total);
    }

    public void exibirItems(){
        for (Item i : lista){
            System.out.println(i);
        }
    }


}
