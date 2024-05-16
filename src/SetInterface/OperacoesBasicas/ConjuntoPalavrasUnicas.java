package SetInterface.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas 
{
    public static void main(String[] args) 
    {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavras("Cigarro");
        conjuntoPalavrasUnicas.adicionarPalavras("Garrafa");
        conjuntoPalavrasUnicas.adicionarPalavras("Bateia");
        conjuntoPalavrasUnicas.adicionarPalavras("Ouro");
        conjuntoPalavrasUnicas.adicionarPalavras("Ouro");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("Garrafa");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("Bacia"));
        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("Ouro"));
    }
    //-------------------------------------------Código--------------------------------------------------

    private Set<String> palavraSet;

    public ConjuntoPalavrasUnicas() 
    {
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalavras(String palavraString)
    {
        palavraSet.add(palavraString);
    }

    public void removerPalavra(String palavra)
    {
        String palavraRemover = null;
        for(String p:palavraSet)
        {
            if(p == palavra)
            {
                palavraRemover = p;
            }
        }
        palavraSet.remove(palavraRemover);
    }

    public boolean verificarPalavra(String palavra)
    {
        boolean condicao = false;
        for(String p:palavraSet)
        {
            if(p == palavra)
            {
                condicao = true;
            }
        }
        return condicao;
    }

    public void exibirPalavrasUnicas()
    {
        System.out.println(palavraSet);
    }


}
