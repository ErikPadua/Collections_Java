package MapInterface.Operaçõesbasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario 
{
    public static void main(String[] args) 
    {
        Dicionario dicionario = new Dicionario();
        dicionario.exibirPalavras();
        dicionario.adicionarPalavra("Garrafa", "objeto de armazenamento de liquidos");
        dicionario.adicionarPalavra("Caixa de som", "objeto usado para reproduzir música");
        dicionario.adicionarPalavra("Colher", "objeto com ponta concava utilizado para ingestão de alimentos");
        dicionario.adicionarPalavra("Doce", "alimento");
        dicionario.exibirPalavras();
        dicionario.removerPalavras("Caixa de som");
        dicionario.exibirPalavras();
        System.out.println("A definição da Palavra que vc pesquisou é : " + dicionario.pesquisarPorPalavra("Doce"));
    }
//-------------------------------------------------Código-------------------------------------------------

    private Map<String,String> dicionarioMap;

    public Dicionario() 
    {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao)
    {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavras(String palavra)
    {
        if(!dicionarioMap.isEmpty())
        {
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras()
    {
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra)
    {
        String definicaoPalavra = null;
        if(!dicionarioMap.isEmpty())
        {
           definicaoPalavra = dicionarioMap.get(palavra);
        }
        return definicaoPalavra;
    }

    
}
