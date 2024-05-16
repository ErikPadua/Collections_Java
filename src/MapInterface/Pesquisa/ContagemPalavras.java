package MapInterface.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras 
{
    public static void main(String[] args) 
    {
        ContagemPalavras contagemPalavras = new ContagemPalavras();
        contagemPalavras.adicionarPalavra("Eu", 2);
        contagemPalavras.adicionarPalavra("Ele", 10);
        contagemPalavras.adicionarPalavra("Nós", 8);
        contagemPalavras.adicionarPalavra("Tu", 4);
        contagemPalavras.exibirContagemPalavras();
        contagemPalavras.removerPalavra("Tu");
        contagemPalavras.exibirContagemPalavras();
        System.out.println(contagemPalavras.encontrarPalavrasMaisFrequente());
    }

//------------------------------------------------Código--------------------------------------------

    private Map<String, Integer> palavrasMap;

    public ContagemPalavras() 
    {
        this.palavrasMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem)
    {
        palavrasMap.put(palavra, contagem);
    }
    
    public void removerPalavra(String palavra)
    {
        palavrasMap.remove(palavra);
    }

    public void exibirContagemPalavras()
    {
        System.out.println(palavrasMap);
    }

    public String encontrarPalavrasMaisFrequente() 
    {
        String linguagemMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : palavrasMap.entrySet()) 
        {
          if (entry.getValue() > maiorContagem) 
          {
            maiorContagem = entry.getValue();
            linguagemMaisFrequente = entry.getKey();
          }
        }
        return linguagemMaisFrequente;
    }
}
    

