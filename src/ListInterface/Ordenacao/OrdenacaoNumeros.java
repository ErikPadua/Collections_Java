package ListInterface.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros 
{
    public static void main(String[] args) 
    {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(0);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(10);
        ordenacaoNumeros.adicionarNumero(9);
        ordenacaoNumeros.adicionarNumero(6);

        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }

    //----------------------------------------------Código---------------------------------------
    List<Numero> numeros;

    public OrdenacaoNumeros() 
    {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero)
    {
        numeros.add(new Numero(numero));
    }

    public List<Numero> ordenarAscendente()
    {
        List<Numero> numerosAscendente = new ArrayList<>(numeros);
        Collections.sort(numerosAscendente);
        return numerosAscendente;
    }

    public List<Numero> ordenarDescendente()
    {
        List<Numero> numerosDescendente = new ArrayList<>(numeros);
        Collections.sort(numerosDescendente);
        Collections.reverse(numerosDescendente);
        return numerosDescendente;
    }


    
}

class Numero implements Comparable<Numero>
{
    private int numero;

    public Numero(int numero) 
    {
        this.numero = numero;
    }


    public int getNumero() 
    {
        return numero;
    }

    @Override
    public int compareTo(Numero n) 
    {
        return Integer.compare(numero, n.getNumero());
    }


    @Override
    public String toString() {
        return "Numero [numero=" + numero + "]";
    }
    
}
