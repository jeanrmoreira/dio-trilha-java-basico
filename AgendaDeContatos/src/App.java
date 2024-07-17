public class App {
    public static void main(String[] args) throws Exception {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("Ana", 98746378);
        agenda.adicionarContato("Karen", 95649545);
        agenda.adicionarContato("Pedro", 58694085);
        agenda.adicionarContato("Lucas", 93849670);
        agenda.adicionarContato("Igor", 38495830);
        agenda.adicionarContato("Bia", 939405942);

  
        agenda.pesquisarPorNome("Igor");
        agenda.atualizarNumeroContato("Igor", 98377212);
        agenda.pesquisarPorNome("Igor");





        
    }
}
