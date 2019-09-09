/*
    Trabalho de Paradigmas de Linguagens de Programacao
    Cadastro de Filmes
    Copyright 2018 by Altieres Luciano Pereira
    Principal e o main, trabalha com a parte principal do layout
    Filmes e a classe principal que sera utilizada pro cadastro, com alguns metodos
    FilmesEmMidiaDigital e FilmesEmMidiaFisica são complementares a classe Filmes, utilizando sobrescrita
    FormularioCadastro e uma classe utilizada para o formulario da do cadastro
    GetFilmesDoAtor e uma interface utilizada na classe Filmes para implementar 
a funcao de retornar os filmes de um ator
*/

package SistemaCadastro;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
public class Principal
{
    private static CadastraFilme cadastra = new CadastraFilme();
    private static String arquivoAux = "";
    public static CadastraFilme getCadastra()
    {
        return cadastra; //Utilizada na funcao de formulario
    }
    public static String getArquivoAux()
    {
        return arquivoAux; //Utilizada na funcao de cadastro
    }    
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
        JFrame window = new JFrame("Cadastro de Filmes"); //Cria a janela
        JLabel mensagem = new JLabel("<html><div style='text-align: center;width: 170px'>Menu</div></html>");
        JButton cadastrar = new JButton("Cadastrar");
        window.setSize(900,420);
        window.setLayout(new GridLayout(2,1));
        window.add(mensagem);
        window.add(cadastrar);
        cadastrar.addActionListener(new ActionListener() //Roda a funcao ao clicar no botao Cadastrar
        {
            public void actionPerformed(ActionEvent e)
            {
                String[] opcoes = {"Midia fisica", "Midia digital", "Nao especificado"};
                int x = JOptionPane.showOptionDialog(null, "Esse filme esta disponivel principalmente em: ", "Escolha da midia", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);

                FormularioCadastro formulario = new FormularioCadastro(x);
                formulario.setVisible(true); //Mostra o formulario de cadastrar filme
            }
        });
        JButton listar = new JButton("Listar");
        window.add(listar);
        listar.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                Lista();
            }
        });
        JButton remover = new JButton("Remover");
        window.add(remover);
        remover.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent e)
           {
                String informacaoParaRemover = JOptionPane.showInputDialog("Digite o nome do filme para remover: ");
                if (informacaoParaRemover == null)
                {
                    informacaoParaRemover = "";
                }
                if((cadastra.Remove(informacaoParaRemover)) == true) //A funcao de remocao remove um booleano indicando se foi removido
                {
                    JOptionPane.showMessageDialog(null, "Removido com sucesso");
                }else
                {
                    JOptionPane.showMessageDialog(null, "Nao encontrado para remocao");
                }
           }
        });
        JButton gravar = new JButton("Gravar em disco");
        window.add(gravar);
        gravar.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent e)
           {
               try //Tenta gravar no arquivo, senao, armazena o erro
               {
                    cadastra.EscreveArq();
               } catch (IOException ex)
               {
                   Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
        });
        JButton lerDoDisco = new JButton("Ler do disco");
        window.add(lerDoDisco);
        lerDoDisco.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent e)
           {
               try
               {
                   Recupera();
               } catch (IOException ex)
               {
                   Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
        });
        JButton buscar = new JButton("Buscar");
        window.add(buscar);
        buscar.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent e)
           {
                String buscado = JOptionPane.showInputDialog("Digite a informacao para buscar: ");
                if (buscado != null) //Apenas busca se o usuario digitou algo
                {
                    Busca(buscado);
                }
                
           }
        });
        JButton buscarFilmeDoAtor = new JButton("Listar filmes de um ator");
        window.add(buscarFilmeDoAtor);
        buscarFilmeDoAtor.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent e)
           {
                String buscado = JOptionPane.showInputDialog("Digite o nome do ator para buscar: ");
                Filmes filme = new Filmes();
                if (buscado != null)
                {
                    JOptionPane.showMessageDialog(null,filme.GetFilmesDoAtor(cadastra.getLista(), buscado));
                }
           }
        });
        Object opcoes[] = {"Existente","Novo"};
        boolean erroInformado = false;
        int menu = JOptionPane.showOptionDialog(null, "Deseja escolher um arquivo ja existente ou criar um novo?", "Arquivos", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
        switch (menu)
        {
            case 1:
                JFileChooser escolherNovo = new JFileChooser();
                escolherNovo.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
                int retornoNovo = escolherNovo.showOpenDialog(null);
                if(retornoNovo == JFileChooser.APPROVE_OPTION) 
                {
                    String nomeArquivo = JOptionPane.showInputDialog("Digite o nome do arquivo para criar");
                    arquivoAux = String.valueOf(escolherNovo.getSelectedFile()) + "/" + nomeArquivo;        
                }
                break;
            case 0:
                JFileChooser escolhaExistente = new JFileChooser();
                int retornoEscolha = escolhaExistente.showOpenDialog(null);
                if(retornoEscolha == JFileChooser.APPROVE_OPTION)
                {
                    arquivoAux = String.valueOf(escolhaExistente.getSelectedFile());
                }   
                break;
            default:
                JOptionPane.showMessageDialog(null, "Erro: voce deveria ter selecionado um arquivo para todas as funcionalidades do programa, caso precise gravar ou ler dados do arquivo, abra novamente");
                erroInformado = true;
                break;
        }
        /*  Se o usuario escolhe por criar um arquivo, ele escolhe a pasta e logo em seguida digita o
            nome do arquivo (sao armazenados numa String com a pasta / nomeDoArquivo)
            se senao, ele simplesmente escolhe o arquivo diretamente
        */
        if (arquivoAux.length() == 0 && !erroInformado)
        {
            JOptionPane.showMessageDialog(null, "Nenhum arquivo selecionado, caso queira usar arquivos reinicie o programa");
        }
        window.setVisible(true);
    }
    public static void Lista()
    {
        ArrayList<Filmes>lista = cadastra.getLista();
        String listagem = "";
        if (lista.size() > 0) 
        {
            listagem+= "Dados na lista:" + "\n";
        }
        for(Filmes filme : lista)
        {
            listagem+= "Nome: " + filme.getNome() + "\n";
            listagem+= "Ano: " + filme.getAno() + "\n";
            listagem+= "Genero:" + filme.getGenero() + "\n";
            listagem+= "Elenco: " + filme.getElenco() + "\n";
            if (filme instanceof FilmesEmMidiaDigital)
            {
                listagem+= "Encontrado nos formatos: "+ ((FilmesEmMidiaDigital) filme).getQualidadeDaImagem() + "\n";
                String possibilidadeDeStreaming;
                if (((FilmesEmMidiaDigital) filme).isPossibilidadeDeStreaming())
                {
                    possibilidadeDeStreaming = "Sim";
                }else
                {
                    possibilidadeDeStreaming = "Nao";
                }
                listagem+= "Encontrado em plataformas de streaming: " + possibilidadeDeStreaming + "\n";
            }else if (filme instanceof FilmesEmMidiaFisica)
            {
                listagem+= "Encontrado nos formatos: " + ((FilmesEmMidiaFisica) filme).getFormato() + "\n";
            }
            listagem+="\n";
        }
        if (lista.size() > 0)
        {
            JTextArea listagem1 = new JTextArea(listagem);
            JScrollPane scrollPane = new JScrollPane(listagem1);
            scrollPane.setPreferredSize( new Dimension( 500, 500 ) );
            JOptionPane.showMessageDialog(null, scrollPane, listagem, JOptionPane.INFORMATION_MESSAGE);
        }else
        {
            JOptionPane.showMessageDialog(null, "Lista vazia");
        }
    }
    public static void Recupera() throws FileNotFoundException, IOException
    {
        try
        {
            FileReader arquivo = new FileReader(arquivoAux);
            BufferedReader leArquivo = new BufferedReader(arquivo);
            int ano;
            String nome, genero, qualidadeDaImagem, formato, elenco;
            boolean disponivelEmStreaming;
            String linha;
            while ((linha = leArquivo.readLine()) != null) 
            {
                String[] auxiliar = linha.split(";");
                nome = auxiliar[0];
                ano = Integer.parseInt(auxiliar[1]);
                genero = auxiliar[2];
                elenco = auxiliar[3];
                switch (auxiliar.length)
                /*  De acordo com a quantidade de dados vindos da funcao split, 
                    define qual tipo de filme e para cadastrar
                */
                {
                    case 4:
                        cadastra.Cadastrar(nome, ano, genero, elenco);
                        break;
                    case 5:
                        formato = auxiliar[4];
                        cadastra.Cadastrar(nome, ano, genero, elenco, formato);
                        break;
                    case 6:
                        qualidadeDaImagem = auxiliar[4];
                        if (auxiliar[5].equals("Sim")) 
                        {
                            disponivelEmStreaming = true;
                        }else
                        {
                            disponivelEmStreaming = false;
                        }
                        cadastra.Cadastrar(nome, ano, genero, elenco, qualidadeDaImagem, disponivelEmStreaming);
                        break;
                }
            }
            leArquivo.close();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Erro ao abrir o arquivo");                    
        }
    }
    // Atualizar para busca dos dados das subclasses
    public static void Busca(String _buscado)
    {
        ArrayList<Filmes> lista = cadastra.getLista();
        boolean encontrado = false;
        String listagem = "";
        for (Filmes filme : lista)
        {
            if (_buscado.equals(filme.getNome()) || _buscado.equals(String.valueOf(filme.getAno())) || _buscado.equals(filme.getGenero()))
            {
                encontrado = true;
                listagem += "Nome: " + filme.getNome() + "\nAno: " + filme.getAno() + "\nGenero: " + filme.getGenero() + "\n";
                if (filme instanceof FilmesEmMidiaDigital)
                {
                    listagem+= "Qualidade da imagem: " + ((FilmesEmMidiaDigital) filme).getQualidadeDaImagem() + "\n";
                    if (((FilmesEmMidiaDigital) filme).isPossibilidadeDeStreaming()) {
                        listagem += "Disponivel em streaming" + "\n";
                    }else
                    {
                        listagem += "Nao disponivel em streaming" + "\n";
                    }
                    listagem += "\n";
                }else if (filme instanceof FilmesEmMidiaFisica) {
                    listagem += "Formato: " + ((FilmesEmMidiaFisica) filme).getFormato() + "\n";
                    listagem += "\n";
                }else
                {
                    listagem += "\n";
                }
            }else if (filme instanceof FilmesEmMidiaDigital) 
            {
                if (_buscado.equals(((FilmesEmMidiaDigital) filme).getQualidadeDaImagem())) 
                {
                    listagem += "Nome: " + filme.getNome() + "\nAno: " + filme.getAno() + "\nGenero: " + filme.getGenero() + "\n";
                    listagem += "Qualidade da imagem: " + ((FilmesEmMidiaDigital) filme).getQualidadeDaImagem() + "\n";
                    if (((FilmesEmMidiaDigital) filme).isPossibilidadeDeStreaming()) {
                        listagem += "Disponivel em streaming" + "\n";
                    }else
                    {
                        listagem += "Nao disponivel em streaming" + "\n";
                    }
                    listagem += "\n";
                    encontrado = true;
                }
            }else if (filme instanceof FilmesEmMidiaFisica)
            {
                if (_buscado.equals(((FilmesEmMidiaFisica) filme).getFormato())) 
                {
                    encontrado = true;
                    listagem += "Nome: " + filme.getNome() + "\nAno: " + filme.getAno() + "\nGenero: " + filme.getGenero() + "\n";
                    listagem += "Formato: " + ((FilmesEmMidiaFisica) filme).getFormato() + "\n\n";
                    listagem += "\n";
                }
            }
        }
        /*  O usuario deve digitar exatamente o texto como é no campo que deseja buscar, pois utilizamos
            a funcao equals, caso quisessemos buscar uma parte do texto e encontrar o proprio, usariamos
            contains
        */
        if (!encontrado)
        {
            listagem = "Nao encontrado\n";
        }
        JTextArea listagem1 = new JTextArea(listagem);
        JScrollPane scrollPane = new JScrollPane(listagem1);
        scrollPane.setPreferredSize(new Dimension( 300, 200));
        JOptionPane.showMessageDialog(null, scrollPane, listagem, JOptionPane.INFORMATION_MESSAGE);
    }
    public static void MostraNaTela(String _linha)
    {
        JOptionPane.showMessageDialog(null,_linha);
    }    
}