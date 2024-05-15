package ListInterface.Pesquisa;

public class Livro 
{
    //Atributos
    private String titulo;
    private String autor;
    private int ano;
    
    //Construtor
    public Livro(String titulo, String autor, int ano) 
    {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    //Retorna o titulo
    public String getTitulo() {
        return titulo;
    }
    
    //Retorna o autor
    public String getAutor() {
        return autor;
    }

    //Retorna o ano de publicação
    public int getAno() {
        return ano;
    }

    //Sobrescrevendo toString
    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", ano=" + ano + "]";
    }

  
}
