package ListInterface.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros 
{//Testador
    public static void main(String[] args) 
    {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarPorIntevaloAnos(2020, 2022));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
    
    //------------------------------------------------Código----------------------------------------------------------
   
    //Cria uma lista de livros
    private List<Livro> listaDeLivros;

    //Construtor que instância uma lista vazia
    public CatalogoLivros() 
    {
        this.listaDeLivros = new ArrayList<>();
    }

    //Adiciona um livro a lista
    public void adicionarLivro(String titulo,String autor,int ano)
    {
        listaDeLivros.add(new Livro(titulo, autor, ano));
    }

    //Seleciona um ou mais livros pelo autor,
    //caso a lista estiver vazia o código não executara
    public List<Livro> pesquisarPorAutor(String autor)
    {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!listaDeLivros.isEmpty())
        {
            for(Livro l:listaDeLivros)
            {
                if(l.getAutor().equals(autor))
                {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    //Seleciona um ou mais livro por um escopo de ano inicial e ano final, 
    //caso a lista estiver vazia o código mão executara
    public List<Livro> pesquisarPorIntevaloAnos(int anoInicial, int anoFinal)
    {
        List<Livro> livrosPorAno = new ArrayList<>();
        if(!listaDeLivros.isEmpty())
        {
            for(Livro l:listaDeLivros)
            {
            if(l.getAno() >= anoInicial && l.getAno() <= anoFinal)
                {
                    livrosPorAno.add(l);
                }
            }
        }
        return livrosPorAno;
    }

    //Seleciona um livro pelo titulo, caso a lista estiver vazia o código mão executara
    public Livro pesquisarPorTitulo(String titulo)
    {
        Livro livro = null;
        if(!listaDeLivros.isEmpty())
        {
            for(Livro l:listaDeLivros)
            {
                if(l.getTitulo().equalsIgnoreCase(titulo))
                {
                    livro = l;
                    break;
                }
            }
        }
        return livro;
    }

    
}
