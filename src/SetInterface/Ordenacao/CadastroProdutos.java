package SetInterface.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos 
{//Testador
    public static void main(String[] args) 
    {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(1L, "Produto 5", 15d, 5);
        cadastroProdutos.adicionarProduto(2L, "Produto 0", 20d, 10);
        cadastroProdutos.adicionarProduto(1L, "Produto 3", 10d, 2);
        cadastroProdutos.adicionarProduto(9L, "Produto 9", 2d, 2);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirPorPreco());
    }
//--------------------------------------------------Código------------------------------------------------

    //Atributos
    private Set<Produto> produtoSet;

    //Construtor
    public CadastroProdutos() 
    {
        this.produtoSet = new HashSet<>();
    }

    //Método para adicionar produtos no set produtoSet
    public void adicionarProduto(long codigo,String nome, double preco, int quantidade )
    {
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    //Método para exibir produtos dentro do set pelo parametro nome
    public Set<Produto> exibirProdutosPorNome()
    {
        //o TreeSet deixa organizado diferente do HashSet
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    //Método para exibir produtos dentro do set pelo parametro preço
    public Set<Produto> exibirPorPreco()
    {
        //o TreeSet deixa organizado diferente do HashSet
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }
    
}
