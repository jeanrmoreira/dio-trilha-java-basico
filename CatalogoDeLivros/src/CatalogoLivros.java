import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros{
    private List<Livros> listaLivros;

    public CatalogoLivros(){
        this.listaLivros = new ArrayList<>();
    }

    public void adicionarLivro(int ano, String autor, String titulo){
        listaLivros.add(new Livros(ano, autor, titulo));
    }

    public void pesquisarPorAutor(String autor){
        List<Livros> livrosEncontrados = new ArrayList<>();
        for (Livros l : listaLivros){
            if(l.getAutor().equalsIgnoreCase(autor)){
                livrosEncontrados.add(l);
            }
        }
        if(livrosEncontrados.size()==0){
            System.out.println("Não há resultado");
        }
        else{
            System.out.println("Livros encontrados: ");
            for (Livros l : livrosEncontrados){
                System.out.println(l.getTitulo());
            }
        }
    }

    public List<Livros> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livros> livrosPorAnoEncontrados = new ArrayList<>();
        for (Livros l : listaLivros){
            if(l.getAno() >= anoInicial && l.getAno() <= anoFinal){
                livrosPorAnoEncontrados.add(l);
            }
        }
    return livrosPorAnoEncontrados;
    }

    public Livros pesquisarPorTitulo(String titulo){
        Livros livroPorTitulo = null;
        if(!listaLivros.isEmpty()){
            for (Livros l : listaLivros){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo=l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }





}