package MapInterface.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos 
{
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
    
        // Exibe o estoque vazio
        estoque.exibirProdutos();
    
        // Adiciona produtos ao estoque
        estoque.adicionarProduto(1L, "Notebook", 1, 1500.0);
        estoque.adicionarProduto(2L, "Mouse", 5, 25.0);
        estoque.adicionarProduto(3L, "Monitor", 10, 400.0);
        estoque.adicionarProduto(4L, "Teclado", 2, 40.0);
    
        // Exibe os produtos no estoque
        estoque.exibirProdutos();
    
        // Calcula e exibe o valor total do estoque
        System.out.println("Valor total do estoque: R$" + estoque.calcularValorTotalEstoque());
    
        // Obtém e exibe o produto mais caro
        Produto produtoMaisCaro = estoque.obterProdutoMaisCaro();
        System.out.println("Produto mais caro: " + produtoMaisCaro);
    
        // Obtém e exibe o produto mais barato
        Produto produtoMaisBarato = estoque.obterProdutoMaisBarato();
        System.out.println("Produto mais barato: " + produtoMaisBarato);
    
        // Obtém e exibe o produto com a maior quantidade em valor no estoque
        Produto produtoMaiorQuantidadeValorTotal = estoque.obterProdutoMaiorQuantidadeValorTotalNoEstoque();
        System.out.println("Produto com maior quantidade em valor no estoque: " + produtoMaiorQuantidadeValorTotal);
      }

//-------------------------------------------Código---------------------------------------------------------
 
    //Atributo que leva uma key long e value da classe Produto
    private Map<Long, Produto> estoqueMap;

    //Construtor
    public EstoqueProdutos() 
    {
        this.estoqueMap = new HashMap<>();
    }

    //Método para adicionar produtos no HashMap estoqueMap
    public void adicionarProduto(Long codigo, String nome, int quantidade, double preco)
    {
        estoqueMap.put(codigo, new Produto(nome, preco, quantidade));
    }

    //Método para exibir o contéudo do HashMap
    public void exibirProdutos()
    {
        System.out.println(estoqueMap);
    }

    //Método que calcula o valor total do estoque
    public double calcularValorTotalEstoque()
    {
        double valorTotal = 0;
        if(!estoqueMap.isEmpty())
        {
            for(Produto p:estoqueMap.values())
            {
               valorTotal =  p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotal;
    }

    //Método que procura no HashMap o produto com maior preço
    public Produto obterProdutoMaisCaro()
    {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_NORMAL;
        if(!estoqueMap.isEmpty())
        {
            for(Produto p:estoqueMap.values())
            {
                if(p.getPreco() > maiorPreco)
                {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    //Método que procura no HashMap o produto com menor preço
    public Produto obterProdutoMaisBarato()
    {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if(!estoqueMap.isEmpty())
        {
            for(Produto p:estoqueMap.values())
            {
                if(p.getPreco() < menorPreco)
                {
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() 
    {
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0d;
        if (!estoqueMap.isEmpty()) 
        {
          for (Map.Entry<Long, Produto> entry : estoqueMap.entrySet()) 
          {
            double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
            if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) 
            {
              maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
              produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
            }
          }
        }
        return produtoMaiorQuantidadeValorNoEstoque;
      }
    
    
} 