package SetInterface.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos 
{
    public static void main(String[] args) 
    {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        gerenciadorAlunos.exibirAlunos();
        System.out.println();
        gerenciadorAlunos.adicionarAluno("Matheus", 213, 6.0);
        gerenciadorAlunos.adicionarAluno("Douglas", 123, 7.5);
        gerenciadorAlunos.adicionarAluno("Plinio", 456, 8.0);
        gerenciadorAlunos.adicionarAluno("Everton", 151, 9.0);
        gerenciadorAlunos.adicionarAluno("Felipe", 90, 2.0);
        gerenciadorAlunos.adicionarAluno("Lucas", 57, 1.0);
        gerenciadorAlunos.exibirAlunos();
        System.out.println();
        gerenciadorAlunos.removerAluno(213);
        gerenciadorAlunos.exibirAlunos();
        System.out.println();
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println();
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
    }
//------------------------------------------------Código------------------------------------------------------

    Set<Aluno> alunoSet;

    public GerenciadorAlunos() 
    {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome,long matricula, double nota)
    {
        alunoSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula)
    {
        Aluno alunoRemover = null;
        for(Aluno a:alunoSet)
        {
            if(a.getMatricula() == matricula)
            {
                alunoRemover = a;
                break;
            }
        }
        alunoSet.remove(alunoRemover);
    }

    public Set<Aluno> exibirAlunosPorNome()
    {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;
    }
    
    public Set<Aluno> exibirAlunosPorNota()
    {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        alunosPorNota.addAll(alunoSet);
        return alunosPorNota;

    }

    public void exibirAlunos()
    {
        System.out.println(alunoSet);
    }
    
}
