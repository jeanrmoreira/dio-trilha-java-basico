public class App {
    public static void main(String[] args) throws Exception {
        ListaTarefas ListaTarefa = new ListaTarefas();
        System.out.println("O número total de tarefas é " + ListaTarefa.obterNumeroTotalTarefas());
        ListaTarefa.adicionarTarefa("Tarefa 1");
        ListaTarefa.adicionarTarefa("Tarefa 1");
        ListaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de tarefas é " + ListaTarefa.obterNumeroTotalTarefas());
        ListaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O número total de tarefas é " + ListaTarefa.obterNumeroTotalTarefas());
        ListaTarefa.obterDescricoesTarefas();
    }
}

