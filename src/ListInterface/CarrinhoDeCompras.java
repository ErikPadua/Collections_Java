package ListInterface;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras 
{
    public static void main(String[] args) 
    {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.adicionarItem("Água", 2.50, 4);
        carrinhoDeCompras.exibirItens();
        System.out.println("Valor total:  R$" + carrinhoDeCompras.calcularValortotal());
        carrinhoDeCompras.removerItem("Água");
        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.adicionarItem("Arroz", 25.99, 3);
        carrinhoDeCompras.adicionarItem("Pequi", 5.00, 2);
        carrinhoDeCompras.adicionarItem("Picanha", 50, 1);
        carrinhoDeCompras.exibirItens();
        System.out.println("Valor total:  R$" + carrinhoDeCompras.calcularValortotal());
        carrinhoDeCompras.removerItem("Picanha");
        System.out.println("Valor total:  R$" + carrinhoDeCompras.calcularValortotal());
    }

    //---------------------------------------------Código--------------------------------------------------------
    private List<Item> listaDeItens;

    public CarrinhoDeCompras() 
    {
        this.listaDeItens = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade)
    {
        listaDeItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome)
    {
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item i:listaDeItens)
        {
            if(i.getNome().equalsIgnoreCase(nome))
            {
                itensParaRemover.add(i);
            }
        }

        listaDeItens.removeAll(itensParaRemover);
    }

    public double calcularValortotal()
    {
        double precoTotal = 0;
        for(Item i:listaDeItens)
        {
            double valor = i.getPreco() * i.getQuantidade();
            precoTotal += valor;
        }

        return precoTotal;
    }

    public void exibirItens()
    {
        System.out.println(listaDeItens);
    }
    
}
