import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();

    }

    public void adicionarConvidado(String nome, int codigo){
        convidadoSet.add(new Convidado(nome, codigo));
    }

    public void removerConvidadoPorCodigoConvite(int codigo){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet){
            if(c.getCodigo()==codigo){
                convidadoParaRemover = c;
                break;
            }
        }
    convidadoSet.remove(convidadoParaRemover);    
    }
    
    public int contarConvidado(){
        int cont=0;
        for(Convidado c : convidadoSet){
            cont ++;
        }
    return cont;    
    }
    public void exibirConvidado(){
        System.out.println(convidadoSet);  
    }
    
}
