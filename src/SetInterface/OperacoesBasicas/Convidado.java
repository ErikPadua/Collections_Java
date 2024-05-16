package SetInterface.OperacoesBasicas;

public class Convidado 
{
    //Atributos
    private String nome;
    private int codigoConvite;
    
    //Contrutor
    public Convidado(String nome, int codigoConvite) 
    {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    //método get
    public String getNome() 
    {
        return nome;
    }

    public int getCodigoConvite() 
    {
        return codigoConvite;
    }

    //Sobrescrevendo o toString
    @Override
    public String toString() {
        return "Convidado [" + nome + ", codigoConvite=" + codigoConvite + "]";
    }


    //Sobrescreve os métodos hashCode e equals para que não conte objetos com o codigoConvite repetido
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + codigoConvite;
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
        Convidado other = (Convidado) obj;
        if (codigoConvite != other.codigoConvite)
            return false;
        return true;
    }

    

    

    
}
