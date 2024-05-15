package ListInterface.Ordenacao;

import java.util.ArrayList;
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

    public
    
}
