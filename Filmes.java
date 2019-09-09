package SistemaCadastro;

import java.util.ArrayList;

public class Filmes implements GetFilmesDoAtor {
    private String nome;
    private int ano;
    private String genero;
    private String elenco;
    public Filmes(String _nome, int _ano, String _genero, String _elenco) 
    {
        this.nome = _nome;
        this.ano = _ano;
        this.genero = _genero;
        this.elenco = _elenco;
        
    }
    Filmes()
    {
        
    }
    public String getNome() 
    {
        return nome;
    }
    public int getAno()
    {
        return ano;
    }

    public String getGenero() 
    {
        return genero;
    }
    public String getListaDeFilmes(ArrayList<Filmes> lista, String _nome)
    {
        String listagem = "";
        boolean existeOutro = false;
        for(Filmes filme : lista)
        {
            if (!filme.getNome().equals(_nome))
            {
                existeOutro = true;
            }
        }
        if(existeOutro)
        {
            listagem = "Lista de outros filmes, independente da midia\n";
            for(Filmes filme : lista)
            {
                if (!filme.getNome().equals(_nome))
                {
                    listagem += "Nome: " + filme.getNome() + "\n";
                }
            }
        }
        return listagem;
    }
    public String getElenco()
    {
            return elenco;
    }
    public String GetFilmesDoAtor(ArrayList<Filmes> lista, String _buscado)
    {
        String listagem = "";
        boolean existeFilmeDesseAtor = false;
        for (Filmes filme : lista)
        {
            if (filme.getElenco().contains(_buscado)) 
            {
                    existeFilmeDesseAtor = true;
            }
        }
        if (existeFilmeDesseAtor)
        {
            listagem = "Lista de filmes desse ator:\n";
            for (Filmes filme : lista)
            {
                if (filme.getElenco().contains(_buscado)) 
                {
                    listagem += filme.getNome() + "\n";
                }
            }
        }else
        {
            listagem = "Nao encontrado\n";
        }
        return listagem;
    }
}