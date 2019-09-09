package SistemaCadastro;

public class FormularioCadastro extends javax.swing.JFrame
{
    private static int fisicaDigitalOuNormal;

    public FormularioCadastro(int fisicaDigitalOuNormal)
    {
        this.fisicaDigitalOuNormal = fisicaDigitalOuNormal;
        /*
            De acordo com o que o construtor da classe recebe, ele define quais campos serao mostrados
            e qual sera a funcao chamada na hora de cadastrar
        */
        initComponents();
        switch (fisicaDigitalOuNormal)
        {
            case 0:
                Resolucao.setVisible(false);
                Streaming.setVisible(false);
                break;
            case 1:
                Formato.setVisible(false);
                break;
            case 2:
                Resolucao.setVisible(false);
                Streaming.setVisible(false);
                Formato.setVisible(false);
                break;
            default:
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollBar1 = new javax.swing.JScrollBar();
        Nome = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        nome = new javax.swing.JTextField();
        Ano = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ano = new javax.swing.JTextField();
        Elenco = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        elenco = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Genero = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        genero = new javax.swing.JTextField();
        Salvar = new javax.swing.JButton();
        Formato = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        formato = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Resolucao = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        resolucao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Streaming = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        sim = new javax.swing.JCheckBox();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setSize(new java.awt.Dimension(0, 1000));
        addMouseWheelListener(new java.awt.event.MouseWheelListener()
        {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt)
            {
                formMouseWheelMoved(evt);
            }
        });

        Nome.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));

        jLabel1.setText("Digite o nome:");

        javax.swing.GroupLayout NomeLayout = new javax.swing.GroupLayout(Nome);
        Nome.setLayout(NomeLayout);
        NomeLayout.setHorizontalGroup(
            NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        NomeLayout.setVerticalGroup(
            NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NomeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        Ano.setBorder(javax.swing.BorderFactory.createTitledBorder("Ano"));

        jLabel2.setText("Digite o ano:");

        javax.swing.GroupLayout AnoLayout = new javax.swing.GroupLayout(Ano);
        Ano.setLayout(AnoLayout);
        AnoLayout.setHorizontalGroup(
            AnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AnoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AnoLayout.setVerticalGroup(
            AnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AnoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        Elenco.setBorder(javax.swing.BorderFactory.createTitledBorder("Elenco"));
        Elenco.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                ElencoMouseClicked(evt);
            }
        });

        jLabel4.setText("Digite o elenco:");

        jLabel9.setText("(separado por virgula)");

        javax.swing.GroupLayout ElencoLayout = new javax.swing.GroupLayout(Elenco);
        Elenco.setLayout(ElencoLayout);
        ElencoLayout.setHorizontalGroup(
            ElencoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ElencoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ElencoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ElencoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(elenco, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ElencoLayout.setVerticalGroup(
            ElencoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ElencoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ElencoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(elenco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(22, 22, 22))
        );

        Genero.setBorder(javax.swing.BorderFactory.createTitledBorder("Genero"));

        jLabel3.setText("Digite o genero:");

        genero.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                generoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GeneroLayout = new javax.swing.GroupLayout(Genero);
        Genero.setLayout(GeneroLayout);
        GeneroLayout.setHorizontalGroup(
            GeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GeneroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        GeneroLayout.setVerticalGroup(
            GeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GeneroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(GeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        Salvar.setText("Salvar");
        Salvar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                SalvarActionPerformed(evt);
            }
        });

        Formato.setBorder(javax.swing.BorderFactory.createTitledBorder("Formato"));
        Formato.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                FormatoMouseClicked(evt);
            }
        });

        jLabel5.setText("Digite o formato:");

        jLabel10.setText("(Dvd, blu-ray e etc)");

        javax.swing.GroupLayout FormatoLayout = new javax.swing.GroupLayout(Formato);
        Formato.setLayout(FormatoLayout);
        FormatoLayout.setHorizontalGroup(
            FormatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FormatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormatoLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(formato, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FormatoLayout.setVerticalGroup(
            FormatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FormatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(formato))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(22, 22, 22))
        );

        Resolucao.setBorder(javax.swing.BorderFactory.createTitledBorder("Resolucao"));
        Resolucao.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                ResolucaoMouseClicked(evt);
            }
        });

        jLabel6.setText("Digite a resolucao:");

        jLabel8.setText("(HD, SD e etc)");

        javax.swing.GroupLayout ResolucaoLayout = new javax.swing.GroupLayout(Resolucao);
        Resolucao.setLayout(ResolucaoLayout);
        ResolucaoLayout.setHorizontalGroup(
            ResolucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResolucaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ResolucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ResolucaoLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resolucao, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ResolucaoLayout.setVerticalGroup(
            ResolucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ResolucaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ResolucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(resolucao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(29, 29, 29))
        );

        Streaming.setBorder(javax.swing.BorderFactory.createTitledBorder("Streaming"));
        Streaming.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                StreamingMouseClicked(evt);
            }
        });

        jLabel7.setText("Esta disponivel em plataformas de streaming?");

        sim.setText("Sim");

        javax.swing.GroupLayout StreamingLayout = new javax.swing.GroupLayout(Streaming);
        Streaming.setLayout(StreamingLayout);
        StreamingLayout.setHorizontalGroup(
            StreamingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StreamingLayout.createSequentialGroup()
                .addGroup(StreamingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(StreamingLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7))
                    .addGroup(StreamingLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(sim)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        StreamingLayout.setVerticalGroup(
            StreamingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StreamingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(sim)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Ano, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Elenco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Genero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Formato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Resolucao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Streaming, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(Salvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Elenco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Formato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Resolucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Streaming, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Salvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generoActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_generoActionPerformed
    {//GEN-HEADEREND:event_generoActionPerformed
        
    }//GEN-LAST:event_generoActionPerformed

    private void SalvarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_SalvarActionPerformed
    {//GEN-HEADEREND:event_SalvarActionPerformed
        String linha;
        switch (fisicaDigitalOuNormal)
        {
                case 0:
                linha = Principal.getCadastra().Cadastrar(nome.getText(), Integer.parseInt(ano.getText()), genero.getText(), elenco.getText(), formato.getText());
                    if (linha.length() > 1)
                    {
                        Principal.MostraNaTela(linha);
                    }

                dispose();
                break;
            case 1:
                boolean streamingOuNao;
                if (sim.isSelected())
                {
                    streamingOuNao = true;
                }else
                {
                    streamingOuNao = false;
                }
                linha = Principal.getCadastra().Cadastrar(nome.getText(), Integer.parseInt(ano.getText()), genero.getText(), elenco.getText(), resolucao.getText(), streamingOuNao);
                if (linha.length() > 1)
                {
                    Principal.MostraNaTela(linha);
                }
                dispose();
                break;
            case 2:
                linha = Principal.getCadastra().Cadastrar(nome.getText(), Integer.parseInt(ano.getText()), genero.getText(), elenco.getText());
                if (linha.length() > 1)
                {
                    Principal.MostraNaTela(linha);
                }
                dispose();
                break;
            default:
                break;
        }
    }//GEN-LAST:event_SalvarActionPerformed

    private void ElencoMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_ElencoMouseClicked
    {//GEN-HEADEREND:event_ElencoMouseClicked
        
    }//GEN-LAST:event_ElencoMouseClicked

    private void FormatoMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_FormatoMouseClicked
    {//GEN-HEADEREND:event_FormatoMouseClicked

    }//GEN-LAST:event_FormatoMouseClicked

    private void ResolucaoMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_ResolucaoMouseClicked
    {//GEN-HEADEREND:event_ResolucaoMouseClicked

    }//GEN-LAST:event_ResolucaoMouseClicked

    private void StreamingMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_StreamingMouseClicked
    {//GEN-HEADEREND:event_StreamingMouseClicked

    }//GEN-LAST:event_StreamingMouseClicked

    private void formMouseWheelMoved(java.awt.event.MouseWheelEvent evt)//GEN-FIRST:event_formMouseWheelMoved
    {//GEN-HEADEREND:event_formMouseWheelMoved

    }//GEN-LAST:event_formMouseWheelMoved

    public static void main(String args[])
    {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(FormularioCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(FormularioCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(FormularioCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(FormularioCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new FormularioCadastro(fisicaDigitalOuNormal).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Ano;
    private javax.swing.JPanel Elenco;
    private javax.swing.JPanel Formato;
    private javax.swing.JPanel Genero;
    private javax.swing.JPanel Nome;
    private javax.swing.JPanel Resolucao;
    private javax.swing.JButton Salvar;
    private javax.swing.JPanel Streaming;
    private javax.swing.JTextField ano;
    private javax.swing.JTextField elenco;
    private javax.swing.JTextField formato;
    private javax.swing.JTextField genero;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField resolucao;
    private javax.swing.JCheckBox sim;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JTextField getAno()
    {
        return ano;
    }

    public javax.swing.JTextField getElenco()
    {
        return elenco;
    }

    public javax.swing.JTextField getGenero()
    {
        return genero;
    }

    public javax.swing.JTextField getNome()
    {
        return nome;
    }
}
