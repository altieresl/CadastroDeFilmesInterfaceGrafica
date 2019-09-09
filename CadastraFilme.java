package SistemaCadastro;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class CadastraFilme{
    private ArrayList<Filmes> lista;

    public CadastraFilme() 
    {
        this.lista = new ArrayList<>();
    }
    /*
        Sobrecarga na funcao de cadastrar, de acordo com os parametros recebidos, e definido se
        os dados sao gravados como filmes, filmes em midia digital ou fisica
    */
    String Cadastrar(String _nome, int _ano, String _genero, String _elenco)
    {
        Filmes filme = new Filmes(_nome, _ano, _genero, _elenco);
        lista.add(filme);
        return filme.getListaDeFilmes(lista, _nome);
       
    }
    String Cadastrar(String _nome, int _ano, String _genero, String _elenco, String _qualidadeDaImagem, boolean _possibilidadeDeStreaming)
    {
        Filmes filme = new FilmesEmMidiaDigital(_nome, _ano, _genero, _elenco, _qualidadeDaImagem, _possibilidadeDeStreaming);
        lista.add(filme);
        return filme.getListaDeFilmes(lista, _nome);
    }
    String Cadastrar(String _nome, int _ano, String _genero, String _elenco,  String _formato)
    {
        Filmes filme = new FilmesEmMidiaFisica(_nome, _ano, _genero, _elenco, _formato);
        lista.add(filme);
        return filme.getListaDeFilmes(lista, _nome);
    }
    void EscreveArq() throws FileNotFoundException, IOException
    {   
        try (FileWriter gravaArq = new FileWriter(Principal.getArquivoAux()))
        {
            for(Filmes filme : lista)
            {
                gravaArq.write(filme.getNome() + ";");
                gravaArq.write(filme.getAno() + ";");
                gravaArq.write(filme.getGenero() + ";");
                gravaArq.write(filme.getElenco() + ";");
                if (filme instanceof FilmesEmMidiaDigital)
                {
                    gravaArq.write(((FilmesEmMidiaDigital) filme).getQualidadeDaImagem() + ";");
                    if (((FilmesEmMidiaDigital) filme).isPossibilidadeDeStreaming()) {
                        gravaArq.write("Sim;");
                    }else
                    {
                        gravaArq.write("Nao;");
                    }
                }else if (filme instanceof FilmesEmMidiaFisica)
                {
                    gravaArq.write(((FilmesEmMidiaFisica) filme).getFormato() + ";");
                }
                gravaArq.write("\n");
            }
        }
    }
    public boolean Remove(String _informacaoParaRemover)
    {
        for (Filmes filme : lista)
        {
            if (_informacaoParaRemover.equals(filme.getNome())) //E necessario que o nome seja exatamente igual
            {
                lista.remove(filme);
                return true;
            }
        }
        return false;        
    }

    public ArrayList<Filmes> getLista() 
    {
        return lista;
    }

}