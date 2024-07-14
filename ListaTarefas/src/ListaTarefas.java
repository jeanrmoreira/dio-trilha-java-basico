import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> lista;

public ListaTarefas() {
        this.lista = new ArrayList<>();
    }


public void adicionarTarefa(String descricao){
    lista.add(new Tarefa(descricao));
}

public void removerTarefa(String descricao){
    List<Tarefa> TarefasParaRemover = new ArrayList<>();
    for (Tarefa t : lista){
        if (t.getDescricao().equalsIgnoreCase(descricao)){
            TarefasParaRemover.add(t);

        }
    }
lista.removeAll(TarefasParaRemover);
}

public int obterNumeroTotalTarefas(){
    int cont = 0;
    for (Tarefa t : lista){
        cont++;
    }
    return cont;

}

public void obterDescricoesTarefas(){

    List<String> ListaDescricoes = new ArrayList<>();

    for (Tarefa t : lista){
        ListaDescricoes.add(t.getDescricao());
    }
 System.out.println(ListaDescricoes);
}
}

