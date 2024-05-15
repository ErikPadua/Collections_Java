package ListInterface.Ordenacao;

public class Pessoa implements Comparable<Pessoa>
{
    //Atributos
    private String nome;
    private int idade;
    private double altura;
    
    //Contrutor
    public Pessoa(String nome, int idade, double altura) 
    {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    //Sobrescrevendo o metodo do Comparable
    @Override
    public int compareTo(Pessoa p) 
    {
        
        return Integer.compare(idade, p.getIdade());
    }


    //Metodos get
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    //Sobrescrevendo toString
    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", idade=" + idade + ", altura=" + altura + "]";
    }

}
