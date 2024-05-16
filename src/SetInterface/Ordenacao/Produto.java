package SetInterface.Ordenacao;

import java.util.Comparator;

public class Produto implements Comparable<Produto>
{
    //Atributos
    private String nome;
    private long codigo;
    private double preco;
    private int quantidade;
    
    //Construtor
    public Produto(String nome, long codigo, double preco, int quantidade) 
    {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Metodos get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    //Sobrescreve o método to String
    @Override
    public String toString() {
        return  nome + " " + codigo + " " + preco + " " + quantidade;
    }

    //Sobrescreve o método hashCode e equals para não aceitar produtos com o código repetido
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (codigo ^ (codigo >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Produto other = (Produto) obj;
        if (codigo != other.codigo)
            return false;
        return true;
    }

    //Sobrescreve o método compareTo da class Comparable
    @Override
    public int compareTo(Produto p) 
    {
       return nome.compareToIgnoreCase(p.getNome());
    } 
}

//Cria uma class para usar o Comparator para comparar a lista Set por preço
class ComparatorPorPreco implements Comparator<Produto>
{

    @Override
    public int compare(Produto p1, Produto p2) 
    {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }

}
