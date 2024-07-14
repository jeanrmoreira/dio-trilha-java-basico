public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone();

        iphone.ligar("00000000");
        iphone.atender();
        iphone.iniciarCorreioVoz();

       
        iphone.selecionarMusica("Stay");
        iphone.tocar();
        iphone.pausar();

        iphone.exibirPagina("google.com");
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();

    }
}
