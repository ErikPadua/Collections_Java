package ListInterface.OperaçõesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa 
{
    //Testador
    public static void main(String[] args) 
    {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        
        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }

    //------------------------------------------------Código--------------------------------------------------------
    //Atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() 
    {
        this.tarefaList = new ArrayList<>();
    }

    //Adiciona uma tarefa a lista de tarefas com uma descrição
    public void adicionarTarefa(String descricao)
    {
        tarefaList.add(new Tarefa(descricao));
    }

    /*Remove uma tarefa da lista de tarefas por meio de uma comparação que adiciona tarefas semelhantes
    numa outra lista e depois usa um metodo remove que leva essa lista como parametro**/
    public void removerTarefa(String descricao)
    {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefaList)
        {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        
        tarefaList.removeAll(tarefasParaRemover);
    }

    //Retorna o numero de tarefas na lista
    public int obterNumeroTotalTarefas()
    {
        return tarefaList.size();
    }

    //Retorna a descriçoes das tarefas na lista
    public void obterDescricoesTarefas()
    {
        System.out.println(tarefaList);
    }

}
