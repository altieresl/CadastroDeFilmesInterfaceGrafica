package SistemaCadastro;

import java.util.ArrayList;

public class FilmesEmMidiaDigital extends Filmes
{
    private String qualidadeDaImagem;
    private boolean possibilidadeDeStreaming;
    public FilmesEmMidiaDigital(String _nome, int _ano, String _genero, String _elenco, String _qualidadeDaImagem, boolean _possibilidadeDeStreaming)
    {
        super(_nome, _ano, _genero, _elenco);
        this.qualidadeDaImagem = _qualidadeDaImagem;
        this.possibilidadeDeStreaming = _possibilidadeDeStreaming;
    }

    @Override
    public String getListaDeFilmes(ArrayList<Filmes> lista, String _nome)
    {
        String listagem = "";
        boolean existeOutraMidiaDigital = false;
        for(Filmes filme : lista)
        {
            if (filme instanceof FilmesEmMidiaDigital)
            {
                if (!filme.getNome().equals(_nome))
                {
                    existeOutraMidiaDigital = true;
                }
            }
        }
        if (existeOutraMidiaDigital)
        {
            listagem = "Lista de outros filmes disponiveis em midia digital\n";
            for(Filmes filme : lista)
            {
                if (filme instanceof FilmesEmMidiaDigital)
                {
                    if (!filme.getNome().equals(_nome))
                    {
                        listagem += "Nome: " + filme.getNome() + "\n";
                    }
                }
            }
        }
        return listagem;
    }

    public String getQualidadeDaImagem()
    {
        return qualidadeDaImagem;
    }

    public boolean isPossibilidadeDeStreaming()
    {
        return possibilidadeDeStreaming;
    }

    
}
