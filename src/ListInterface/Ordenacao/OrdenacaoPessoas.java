package ListInterface.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas 
{
    //Testador
    public static void main(String[] args) 
    {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();
        ordenacaoPessoas.adicionarPessoa("Felipe", 23, 1.63);
        ordenacaoPessoas.adicionarPessoa("Alberto", 43, 1.80);
        ordenacaoPessoas.adicionarPessoa("Juliano", 32, 1.76);
        ordenacaoPessoas.adicionarPessoa("Ruberto", 19, 1.72);

        System.out.println(ordenacaoPessoas.ordenarPorAltura());
        System.out.println(ordenacaoPessoas.ordenarPorIdade());

        System.out.println(ordenacaoPessoas.listaDePessoas);
    }

    //-------------------------------------------Código-----------------------------------------

    //Atributo
    private List<Pessoa> listaDePessoas;

    //Contrutor
    public OrdenacaoPessoas() 
    {
        this.listaDePessoas = new ArrayList<>();
    }

    //Adiciona pessoas a lista de pessoas
    public void adicionarPessoa(String nome,int idade, double altura)
    {
        listaDePessoas.add(new Pessoa(nome, idade, altura));
    }

    //Ordena a lista de pessoas por idade usando o Comparable da classe Pessoa
    public List<Pessoa> ordenarPorIdade()
    {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaDePessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    //Ordena a lista de pessoas pela altura usando o Comparator da classe ComparatorPorAltura
    public List<Pessoa> ordenarPorAltura()
    {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaDePessoas);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }
    
}
