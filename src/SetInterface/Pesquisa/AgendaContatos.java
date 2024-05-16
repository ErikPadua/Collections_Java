package SetInterface.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos 
{   //Testador
    public static void main(String[] args) 
    {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 0);
        agendaContatos.adicionarContato("Camila Cavalcante", 1111111);
        agendaContatos.adicionarContato("Camila DIO", 654987);
        agendaContatos.adicionarContato("Maria Silva", 1111111);
        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarPorNome("Camila"));
        System.out.println(agendaContatos.atualizarNumeroContato("Maria Silva", 5555555));
        agendaContatos.exibirContato();
    }
//-----------------------------------------------------Código----------------------------------------------------

    //Atributo
    private Set<Contato> contatoSet;

    //Construtor que inicia uma hash vazia
    public AgendaContatos() 
    {
        this.contatoSet = new HashSet<>();
    }

    //Método para adicionar contatos a hash
    public void adicionarContato(String nome, int numero)
    {
        contatoSet.add(new Contato(nome, numero));
    }

    //Método para exibir o set
    public void exibirContato()
    {
        System.out.println(contatoSet);
    }

    //Método para pesquisar um nome na lista hash
    public Set<Contato> pesquisarPorNome(String nome)
    {
        Set<Contato> contatoPorNome = new HashSet<>();
        for(Contato c:contatoSet)
        {
            if(c.getNome().startsWith(nome))
            {
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }

    //Método para mudar o numero de um contato
    public Contato atualizarNumeroContato(String nome, int novoNumero)
    {
        Contato contatoAtualizado = null;
        for(Contato c:contatoSet)
        {
            if(c.getNome().equalsIgnoreCase(nome))
            {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    } 
}