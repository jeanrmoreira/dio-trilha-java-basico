

public class App {
    public static void main(String[] args) throws Exception {
        ConjuntoConvidados conjunto = new ConjuntoConvidados();
        conjunto.adicionarConvidado("Ana", 2);
        conjunto.adicionarConvidado("Pedro", 22);
        conjunto.adicionarConvidado("Julia", 7);
        conjunto.adicionarConvidado("Hannah", 1);
        System.out.println(conjunto.contarConvidado());
        conjunto.removerConvidadoPorCodigoConvite(7);
        System.out.println(conjunto.contarConvidado());
        conjunto.exibirConvidado();


    }
}
