package SetInterface.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas 
{

    public static void main(String[] args) 
    {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Cozinha");
        listaTarefas.adicionarTarefa("Sala");
        listaTarefas.adicionarTarefa("Banheiro");
        System.out.println(listaTarefas.contarTarefas());
        listaTarefas.exibirTarefas();
        
        System.out.println();
        listaTarefas.removerTarefa("Sala");
        System.out.println(listaTarefas.contarTarefas());
        listaTarefas.exibirTarefas();

        System.out.println();
        listaTarefas.marcarTarefaConcluida("Cozinha");
        listaTarefas.marcarTarefaConcluida("Banheiro");
        System.out.println(listaTarefas.contarTarefas());
        listaTarefas.exibirTarefas();

        System.out.println();
        listaTarefas.obterTarefasConcluidas();
        listaTarefas.marcarTarefaPendente("Banheiro");
        listaTarefas.obterTarefasPendentes();
        System.out.println(listaTarefas.contarTarefas());
        listaTarefas.exibirTarefas();
        
        System.out.println();
        listaTarefas.limparListaTarefas();
        System.out.println(listaTarefas.contarTarefas());
        listaTarefas.exibirTarefas();


    }
//----------------------------------------------------Código---------------------------------------------------

    Set<Tarefas> tarefasSet;

    public ListaTarefas() 
    {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao)
    {
        tarefasSet.add(new Tarefas(descricao, false));
    }

    public void removerTarefa(String descricao)
    {
        Tarefas tarefaRemover = null;
        {
            for(Tarefas t:tarefasSet)
            {
                if(t.getDescricao().equalsIgnoreCase(descricao))
                {
                    tarefaRemover = t;
                }
            }
            tarefasSet.remove(tarefaRemover);
        }
    }

    public void exibirTarefas()
    {
        System.out.println(tarefasSet);
    }

    public int contarTarefas()
    {
        return tarefasSet.size();
    }

    public Set<Tarefas> obterTarefasConcluidas()
    {
        Set<Tarefas> tarefasConcluidas = new HashSet<>();
        for(Tarefas t:tarefasSet)
        {
            if(t.isConclusao() == true)
            {
                tarefasConcluidas.add(t);
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefas> obterTarefasPendentes()
    {
        Set<Tarefas> tarefasPendentes = new HashSet<>();
        for(Tarefas t:tarefasSet)
        {
            if(t.isConclusao() == false)
            {
                tarefasPendentes.add(t);
            }
        }
        return tarefasPendentes;
    }
    
    public Tarefas marcarTarefaConcluida(String descricao)
    {
        Tarefas marcarConcluida = null;
        for(Tarefas t:tarefasSet)
        {
            if(t.getDescricao().equalsIgnoreCase(descricao))
            {
                t.setConclusao(true);
                marcarConcluida = t;
                break;
            }
        }
        return marcarConcluida;
    }

    public Tarefas marcarTarefaPendente(String descricao)
    {
        Tarefas marcarPendente = null;
        for(Tarefas t:tarefasSet)
        {
            if(t.getDescricao().equalsIgnoreCase(descricao))
            {
                t.setConclusao(false);
                marcarPendente = t;
                break;
            }
        }
        return marcarPendente;
    }

    public void limparListaTarefas()
    {
        tarefasSet.removeAll(tarefasSet);
    }

    
}
