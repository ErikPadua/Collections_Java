package ListInterface.OperaçõesBasicas;

public class Tarefa 
{
//Atributo
    private String descricao;

//Construtor
    public Tarefa(String descricao) 
    {
        this.descricao = descricao;
    }

//Metodo Get
    public String getDescricao() 
    {
        return descricao;
    }

    @Override
    public String toString() 
    {
        return descricao;
    }

}