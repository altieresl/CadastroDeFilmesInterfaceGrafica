package SistemaCadastro;

import java.util.ArrayList;

public class FilmesEmMidiaFisica extends Filmes
{
    private String formato;
    public FilmesEmMidiaFisica(String _nome, int _ano, String _genero, String _elenco, String _formato)
    {
        super(_nome, _ano, _genero, _elenco);
        this.formato = _formato;
    }
    
    @Override
    public String getListaDeFilmes(ArrayList<Filmes> lista, String _nome)
    {
        String listagem = "";
        boolean existeOutraMidiaFisica = false;
        for(Filmes filme : lista)
        {
            if (filme instanceof FilmesEmMidiaFisica)
            {
                if (!filme.getNome().equals(_nome))
                {
                    existeOutraMidiaFisica = true;
                }
            }
        }
        if (existeOutraMidiaFisica)
        {
            listagem = "Lista de outros filmes disponiveis em midia fisica \n";
            for(Filmes filme : lista)
            {
                if (filme instanceof FilmesEmMidiaFisica)
                {
                    if (!filme.getNome().equals(_nome))
                    {
                        listagem +="Nome: " + filme.getNome() + "\n";
                    }
                }
            }
        }
        return listagem;
    }

    public String getFormato()
    {
        return formato;
    }
    
}
