import java.util.HashSet;
import java.util.Set;

public class AgendaContatos{
    Set <Contato> contatoset;

    public AgendaContatos() {
        this.contatoset = new HashSet<>();
    }

    void adicionarContato(String nome, int tel){
        contatoset.add(new Contato(nome,tel));
    }

    void exibirContato(){
        System.out.println(contatoset);
    }
    
    void pesquisarPorNome(String nome){
        Set contatosEncontrados = new HashSet<>();
        for(Contato c : contatoset){
            if(c.getNome()==nome){
                contatosEncontrados.add(c);
            }
        }
        if (contatosEncontrados.size() != 0){
            System.out.println("Contatos encontrados: " + contatosEncontrados);
        }
        else{
            System.out.println("Contato não encontrado");
        }      
    }

    void atualizarNumeroContato(String nome, int novoNumero){

        for(Contato c : contatoset){
            if(c.getNome()== nome){
                c.setTel(novoNumero);
            }
        }
    }














}
