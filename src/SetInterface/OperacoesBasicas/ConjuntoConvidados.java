package SetInterface.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados
{
    //Testador
    public static void main(String[] args) 
    {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Numero de convidados: " + conjuntoConvidados.contarConvidados());

        conjuntoConvidados.adicionarConvidado("Juliano", 1234);
        conjuntoConvidados.adicionarConvidado("Henrique", 1235);
        conjuntoConvidados.adicionarConvidado("David", 1235);
        conjuntoConvidados.adicionarConvidado("Maycon", 1236);
        conjuntoConvidados.adicionarConvidado("Zé Neto", 1237);
        System.out.println("Numero de convidados: " + conjuntoConvidados.contarConvidados());

        conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Numero de convidados: " + conjuntoConvidados.contarConvidados());
        conjuntoConvidados.exibirConvidados();

    }
//--------------------------------------------------------Código-----------------------------------------------------

    //Atributo
    private Set<Convidado> convidadoset;

    //Construtor
    public ConjuntoConvidados() 
    {
        this.convidadoset = new HashSet<>();
    }

    //Método para adicionar convidados da classe Convidado no Hashset
    public void adicionarConvidado(String nome, int codigoConvite)
    {
        convidadoset.add(new Convidado(nome, codigoConvite));
    }

    //Método para remover do Hashset o convidado usando o codigo de convite
    public void removerConvidadoPorCodigoConvite(int codigoConvite)
    {
        Convidado convidadoParaRemover = null;
        for(Convidado c:convidadoset)
        {
            if(c.getCodigoConvite() == codigoConvite)
            {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoset.remove(convidadoParaRemover);
    }

    //Retorna o numero de convidados
    public int contarConvidados()
    {
        return convidadoset.size();
    }
    
    //Exibe os convidados
    public void exibirConvidados()
    {
        System.out.println(convidadoset);
    }
}