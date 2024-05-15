package ListInterface.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas 
{
    //Atributo
    private List<Pessoa> listaDePessoas;

    //Contrutor
    public OrdenacaoPessoas() 
    {
        this.listaDePessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome,int idade, double altura)
    {
        listaDePessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade()
    {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaDePessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura()
    {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaDePessoas);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }
    
}
