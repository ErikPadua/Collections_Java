package MapInterface.Ordenação;

public class Evento 
{
    //Atributos
    private String nome;
    private String atracao;
    
    //Constructor
    public Evento(String nome, String atracao) 
    {
        this.nome = nome;
        this.atracao = atracao;
    }

    //Método set e get
    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getAtracao() 
    {
        return atracao;
    }

    public void setAtracao(String atracao) 
    {
        this.atracao = atracao;
    }

    //Sobrescreve o método toString
    @Override
    public String toString() 
    {
        return "Evento [nome=" + nome + ", atracao=" + atracao + "]";
    }

    
}
