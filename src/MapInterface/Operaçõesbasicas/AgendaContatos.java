package MapInterface.Operaçõesbasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos 
{//Testador
    public static void main(String[] args) 
    {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContatos();
        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 5665);
        agendaContatos.adicionarContato("Camila Cavalcante", 1111111);
        agendaContatos.adicionarContato("Camila DIO", 654987);
        agendaContatos.adicionarContato("Maria Silva", 1111111);
        agendaContatos.adicionarContato("Camila", 44444);
        agendaContatos.exibirContatos();
        agendaContatos.removerContato("Maria Silva");
        agendaContatos.exibirContatos();
        System.out.println("O numero desse contato é: " + agendaContatos.pesquisarPorNome("Camila DIO"));
    }
//--------------------------------------------------Código-------------------------------------------------

    //Atributo
    private Map<String, Integer> agendaContatoMap;

    //Construtor
    public AgendaContatos() 
    {
        this.agendaContatoMap = new HashMap<>();
    }

    //Método para adicionar contato no HashMap da agendaContatoMap
    public void adicionarContato(String name,Integer telefone)
    {
        agendaContatoMap.put(name, telefone);
    }

    //Método para remover contato do HashMap da agendaContatoMap
    public void removerContato(String nome)
    {
        if(!agendaContatoMap.isEmpty())
        {
            agendaContatoMap.remove(nome);
        }
    }

    //Método para exibir os elementos dentro do HashMap da agendaContatoMap
    public void exibirContatos()
    {
        System.out.println(agendaContatoMap);
    }

    //Método para retorna o value de uma key no HashMap, no caso retorna um número após enviar uma key
    public Integer pesquisarPorNome(String nome)
    {
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty())
        {
           numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    
}
