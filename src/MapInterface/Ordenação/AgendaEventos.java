package MapInterface.Ordenação;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos 
{
    //Testador
    public static void main(String[] args) 
    {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2024, 6, 15), "Evento 1", "Fresno");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 12, 18), "Evento 2", "Dejavu");
        agendaEventos.adicionarEvento(LocalDate.of(2026, 8, 24), "Evento 3", "Whinderson");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 6, 16), "Evento 4", "Pópó");
        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();

    }

//---------------------------------------------------Código----------------------------------------------------

    //Atributo
    private Map<LocalDate,Evento> eventosMap;

    //Construtor
    public AgendaEventos()
    {
        this.eventosMap = new HashMap<>();
    }
    
    //Método para adicionar eventos
    public void adicionarEvento(LocalDate data, String nome, String atracao)
    {
        eventosMap.put(data, new Evento(nome, atracao));
    }

    //Método para exibir os eventos em ordem crescente no TreeMap
    public void exibirAgenda()
    {
        Map<LocalDate,Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }
    

    //Método para informar o proximo evento levando em conta a data atual
    public void obterProximoEvento()
    {
      LocalDate dataAtual = LocalDate.now();
      Map<LocalDate,Evento> eventosTreeMap = new TreeMap<>(eventosMap);
      for(Map.Entry<LocalDate,Evento> entry: eventosTreeMap.entrySet())
      {
        if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual))
        {
            System.out.println("O proximo evento; " + entry.getValue() + " acontecera na data " + entry.getKey());
            break;
        }
      }
    }
}