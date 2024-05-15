package ListInterface.Pesquisa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros 
{
    public static void main(String[] args) 
    {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.exibirNumeros();
        somaNumeros.adicionarNumero(13);
        somaNumeros.adicionarNumero(81);
        somaNumeros.adicionarNumero(34);
        somaNumeros.adicionarNumero(14);
        somaNumeros.exibirNumeros();
        somaNumeros.calcularSoma();
        somaNumeros.encontrarMaiorNumero();
        somaNumeros.encontrarMenorNumero();
    }

    //--------------------------------------------------Código------------------------------------------------

    private List<Integer> numeros;

    public SomaNumeros() 
    {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero)
    {
        numeros.add(numero);
    }

    public int calcularSoma()
    {
        int total = 0;
        for(Integer i:numeros)
        {
            total += i;
        }
        return total;
    }

    public void encontrarMaiorNumero()
    {
        Integer maiorNumero = Collections.max(numeros);
        System.out.println("O maior número da lista é: " + maiorNumero);
    }

    public void encontrarMenorNumero()
    {
        Integer menorNumero = Collections.min(numeros);
        System.out.println("O menor número da lista é: " + menorNumero);
    }

    public void exibirNumeros()
    {
        System.out.println(numeros);
    }
    
}
