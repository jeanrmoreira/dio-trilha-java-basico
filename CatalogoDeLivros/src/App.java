public class App {
    public static void main(String[] args) throws Exception {
        CatalogoLivros catalogo = new CatalogoLivros();

   
        catalogo.adicionarLivro(2014,"Autor 1","Livro 1");
        catalogo.adicionarLivro(2015,"Autor 1","Livro 2");
        catalogo.adicionarLivro(2016,"Autor 1","Livro 3");
        catalogo.adicionarLivro(2011,"Autor 2","Livro A");

        catalogo.pesquisarPorAutor("Autor 1");
        System.out.println(catalogo.pesquisarPorIntervaloAnos(2011,2015));
        System.out.println(catalogo.pesquisarPorTitulo("Livro 1"));





    }
}
