/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * cad_bairros.java
 *
 * Created on 06/11/2020, 15:51:55
 */

package cadastros;

/**
 *
 * @author Carlos
 */
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import utilitarios.conexao;
public class cad_bairros extends javax.swing.JFrame {
    int navega = 0;
    int inicia_combo = 0;
    String ordenacao = "nome";
    conexao con_cidade;
    
    /** Creates new form cad_bairro */
    public cad_bairros() 
    {
        initComponents();
        
        con_cidade = new conexao();
        con_cidade.conecta();
        atualiza_combo_box_cidade();
        con_cidade.executeSQL("Select * from bairro order by " + ordenacao);
        try
        {
          atualiza_combo_box_cidade(); 
          con_cidade.resultset.first();
          mostra_dados();
        }
        catch(SQLException erro)
        {
            JOptionPane.showMessageDialog(null,"N�o localizou dados "+erro);
        }
        preencher_jtable();//chama metodo para preencher o JTable  
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always rege}

    /** This method is called from within the constructor to
     * initialize the form.nerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo_ordenacao = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_codigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_nome = new javax.swing.JTextField();
        bt_primeiro = new javax.swing.JButton();
        bt_anterior = new javax.swing.JButton();
        bt_proximo = new javax.swing.JButton();
        bt_ultimo = new javax.swing.JButton();
        botao_gravar = new javax.swing.JButton();
        botao_excluir = new javax.swing.JButton();
        botao_alterar = new javax.swing.JButton();
        botao_inserir = new javax.swing.JButton();
        botao_saida = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        cb_pesquisa = new javax.swing.JComboBox();
        botao_pesquisa_cb = new javax.swing.JButton();
        botao_pesquisar = new javax.swing.JButton();
        tf_pesquisa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        rb_codigo = new javax.swing.JRadioButton();
        rb_nome = new javax.swing.JRadioButton();
        bt_filtrar_grade = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mautenção do Cadastro de Cidades");
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Manutenção do Cadastro de Bairros");

        jLabel2.setText("Código: ");

        tf_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_codigoActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome:");

        bt_primeiro.setIcon(new javax.swing.ImageIcon("C:\\Desenv\\Aulas_Java\\estoque\\Icones\\166.gif")); // NOI18N
        bt_primeiro.setToolTipText("Primeiro registro");
        bt_primeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_primeiroActionPerformed(evt);
            }
        });

        bt_anterior.setIcon(new javax.swing.ImageIcon("C:\\Desenv\\Aulas_Java\\estoque\\Icones\\167.gif")); // NOI18N
        bt_anterior.setToolTipText("Anterior");
        bt_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_anteriorActionPerformed(evt);
            }
        });

        bt_proximo.setIcon(new javax.swing.ImageIcon("C:\\Desenv\\Aulas_Java\\estoque\\Icones\\183.gif")); // NOI18N
        bt_proximo.setToolTipText("Próximo");
        bt_proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_proximoActionPerformed(evt);
            }
        });

        bt_ultimo.setIcon(new javax.swing.ImageIcon("C:\\Desenv\\Aulas_Java\\estoque\\Icones\\165.gif")); // NOI18N
        bt_ultimo.setToolTipText("Ultimo registro");
        bt_ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_ultimoActionPerformed(evt);
            }
        });

        botao_gravar.setIcon(new javax.swing.ImageIcon("C:\\Desenv\\Aulas_Java\\estoque\\Icones\\1.gif")); // NOI18N
        botao_gravar.setToolTipText("Gravar");
        botao_gravar.setMaximumSize(new java.awt.Dimension(60, 40));
        botao_gravar.setMinimumSize(new java.awt.Dimension(60, 40));
        botao_gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_gravarActionPerformed(evt);
            }
        });

        botao_excluir.setIcon(new javax.swing.ImageIcon("C:\\Desenv\\Aulas_Java\\estoque\\Icones\\7.gif")); // NOI18N
        botao_excluir.setToolTipText("Excluir");
        botao_excluir.setMaximumSize(new java.awt.Dimension(60, 40));
        botao_excluir.setMinimumSize(new java.awt.Dimension(60, 40));
        botao_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_excluirActionPerformed(evt);
            }
        });

        botao_alterar.setIcon(new javax.swing.ImageIcon("C:\\Desenv\\Aulas_Java\\estoque\\Icones\\10.gif")); // NOI18N
        botao_alterar.setToolTipText("Alterar");
        botao_alterar.setMaximumSize(new java.awt.Dimension(60, 40));
        botao_alterar.setMinimumSize(new java.awt.Dimension(60, 40));
        botao_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_alterarActionPerformed(evt);
            }
        });

        botao_inserir.setIcon(new javax.swing.ImageIcon("C:\\Desenv\\Aulas_Java\\estoque\\Icones\\6.gif")); // NOI18N
        botao_inserir.setToolTipText("Incluir");
        botao_inserir.setMaximumSize(new java.awt.Dimension(60, 40));
        botao_inserir.setMinimumSize(new java.awt.Dimension(60, 40));
        botao_inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_inserirActionPerformed(evt);
            }
        });

        botao_saida.setIcon(new javax.swing.ImageIcon("C:\\Desenv\\Aulas_Java\\estoque\\Icones\\59.gif")); // NOI18N
        botao_saida.setToolTipText("Desconectar Banco");
        botao_saida.setMaximumSize(new java.awt.Dimension(60, 40));
        botao_saida.setMinimumSize(new java.awt.Dimension(60, 40));
        botao_saida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_saidaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));

        cb_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_pesquisaActionPerformed(evt);
            }
        });

        botao_pesquisa_cb.setText("Pesquisar");
        botao_pesquisa_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_pesquisa_cbActionPerformed(evt);
            }
        });

        botao_pesquisar.setText("Pesquisar");
        botao_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_pesquisarActionPerformed(evt);
            }
        });

        tf_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pesquisaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("Pesquisar:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cb_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botao_pesquisar)
                            .addComponent(botao_pesquisa_cb)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_pesquisar)
                    .addComponent(tf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_pesquisa_cb))
                .addGap(0, 10, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Código", "Nome do bairro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        jLabel6.setText("Ordenação");

        grupo_ordenacao.add(rb_codigo);
        rb_codigo.setText("Código");
        rb_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_codigoActionPerformed(evt);
            }
        });

        grupo_ordenacao.add(rb_nome);
        rb_nome.setText("Nome");
        rb_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rb_nomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rb_nome)
                    .addComponent(jLabel6)
                    .addComponent(rb_codigo))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rb_codigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rb_nome)
                .addGap(0, 38, Short.MAX_VALUE))
        );

        bt_filtrar_grade.setText("Friltar na Grade");
        bt_filtrar_grade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_filtrar_gradeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1)))
                .addGap(0, 91, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_primeiro)
                                .addGap(17, 17, 17)
                                .addComponent(bt_anterior)
                                .addGap(18, 18, 18)
                                .addComponent(bt_proximo)
                                .addGap(18, 18, 18)
                                .addComponent(bt_ultimo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(botao_inserir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(botao_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botao_alterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(botao_gravar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botao_saida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_filtrar_grade, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bt_primeiro)
                        .addComponent(bt_anterior, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bt_proximo))
                    .addComponent(bt_ultimo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao_saida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(botao_gravar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(botao_alterar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botao_excluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botao_inserir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_filtrar_grade)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(530, 617));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bt_proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_proximoActionPerformed
        try
        {
            con_cidade.resultset.next();
            mostra_dados();
            navega = 2;
        }
        catch(SQLException erro)
        {
           JOptionPane.showMessageDialog(null, "Botão próximo falhou." + erro);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_proximoActionPerformed

    private void bt_primeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_primeiroActionPerformed
        try
        {
            con_cidade.resultset.first();
            mostra_dados();
            navega = 1;
        }
        catch(SQLException erro)
        {
           JOptionPane.showMessageDialog(null, "Botão primeiro falhou" + erro);
        }
    }//GEN-LAST:event_bt_primeiroActionPerformed

    private void bt_ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_ultimoActionPerformed
        try
        {
            con_cidade.resultset.last();
            mostra_dados();
        }
        catch(SQLException erro)
        {
           JOptionPane.showMessageDialog(null, "Botão ultimo falhou" + erro);
        }
    }//GEN-LAST:event_bt_ultimoActionPerformed

    private void bt_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_anteriorActionPerformed
        try
        {
            con_cidade.resultset.previous();
            mostra_dados();
            navega = 2;
       }
        catch(SQLException erro)
        {
           JOptionPane.showMessageDialog(null, "Botão voltar falhou" + erro);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_anteriorActionPerformed

    private void botao_inserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_inserirActionPerformed
        tf_codigo.setText("");
        tf_nome.setText("");
        tf_nome.requestFocus();
        tf_codigo.setEditable(false);
                
    }//GEN-LAST:event_botao_inserirActionPerformed

    private void botao_gravarActionPerformed(java.awt.event.ActionEvent evt) {                                             
    //c�digo para Gravar os dados no Banco de Dados
    try
    {
         //insert int bairro (nome,uf) values ('Carazinho','RS')
        
         String sqlinsert ="insert into bairro (nome) values ('"+
                     tf_nome.getText()+"')";
	con_cidade.statement.executeUpdate(sqlinsert);         
        JOptionPane.showMessageDialog(null,"Grava��o realizado com sucesso!");
       
       //atualiza o ResultSet
       //con_cidade.resultset = con_cidade.statement.executeQuery("Select * from cidade");
       atualiza_combo_box_cidade();
       con_cidade.executeSQL("select * from bairro order by " + ordenacao);
       con_cidade.resultset.first(); //posiciona no primeiro registro
       mostra_dados(); //ir� chamar a fun��o em que ir� mstrar os dados no form
    }
     catch (SQLException erro)
     {
	JOptionPane.showMessageDialog(null,"Erro a tentar Gravar o registro..."+erro);
     }    
    }                                                                                             

    private void botao_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_excluirActionPerformed
    // procedimento para exclus�o de registro
    try
    {
      	String sql = "select * from bairro Where cod = "+tf_codigo.getText();
   	con_cidade.executeSQL(sql); 
        con_cidade.resultset.first();
        String nome = "Deletar o bairro : "+con_cidade.resultset.getString("nome")+" ?";
        int opcao_escolhida = JOptionPane.showConfirmDialog(null,nome,"Exclus�o ",JOptionPane.YES_NO_OPTION);
        if (opcao_escolhida == JOptionPane.YES_OPTION)
   	{
   	    sql = "DELETE FROM bairro Where cod ="+tf_codigo.getText();
  	    int conseguiu_excluir = con_cidade.statement.executeUpdate(sql);
  	    if (conseguiu_excluir == 1)
            {
                JOptionPane.showMessageDialog(null,"Exclus�o realizada com sucesso");
                //atualiza o ResultSet
                atualiza_combo_box_cidade();
                con_cidade.executeSQL("Select * from bairro order by " + ordenacao);
                con_cidade.resultset.first(); //posiciona no primeiro registro
                mostra_dados(); //ir� chamar a fun��o em que ir� mstrar os dados no form
            }
         } 	
         else 
           return;  
    } 
    catch (SQLException erro)
    {
	JOptionPane.showMessageDialog(null,"Erro a tentar excluir o registro..."+erro);
     }      
    }                                             
//GEN-LAST:event_botao_excluirActionPerformed
    private void botao_pesquisarActionPerformed(java.awt.event.ActionEvent evt) {                                                
        try
            {
                   con_cidade.resultset.first();
                   String igual = "n";
                   int tamanho_pesquisa = tf_pesquisa.getText().length();
                   while(igual == "n")
                   {
                         String pesquisado = con_cidade.resultset.getString("nome").substring(0,(tamanho_pesquisa));

                            if (pesquisado.equals(tf_pesquisa.getText()))
                            {
                                 igual = "s";
                            }
                        else
                             con_cidade.resultset.next();
                    }                          
                   // nas linhas abaxo, mostra_conteudo_tabela();
                   tf_codigo.setText(con_cidade.resultset.getString("cod"));//Essas duas linhas � neces�ria                   
                   mostra_dados();                              
            }
        catch(Exception erro)
            {
                JOptionPane.showMessageDialog(null, "N�o conseguiu localizar via digita��o, erro = "+erro);
            }        // TODO add your handling code here:
    }                                                                                               

    private void tf_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_codigoActionPerformed

    private void botao_pesquisa_cbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_pesquisa_cbActionPerformed
                try
         {
                con_cidade.resultset.first();
                String igual = "n"; //inicia dizendo que n�o localizou a cidade                  
                while(igual == "n") //diz que enquanto n�o localizar � para ir executando
                {
                        if (con_cidade.resultset.getString("nome").equals(cb_pesquisa.getSelectedItem()))
                        {
                            igual = "s"; //indica que achou a cidade
                        }
                        else
                            con_cidade.resultset.next(); //enquanto n�o achar vai para o proximo                   
                    }
                   // nas linhas abaxo, mostra_conteudo_tabela();
                  tf_codigo.setText(con_cidade.resultset.getString("cod"));//Essas duas linhas s�o neces�rias                   
                   mostra_dados();
               }
        catch(Exception erro)
        {
            //JOptionPane.showMessageDialog(null, "N�o conseguiu localizar via Sele��o no JComboBox, erro = "+erro);
        }    }//GEN-LAST:event_botao_pesquisa_cbActionPerformed

    private void cb_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_pesquisaActionPerformed
        if (inicia_combo == 1 ) {
            
        try
         {
                con_cidade.resultset.first();
                String igual = "n"; //inicia dizendo que n�o localizou a cidade                  
                while(igual == "n") //diz que enquanto n�o localizar � para ir executando
                {
                        if (con_cidade.resultset.getString("nome").equals(cb_pesquisa.getSelectedItem()))
                        {
                            igual = "s"; //indica que achou a cidade
                        }
                        else
                            con_cidade.resultset.next(); //enquanto n�o achar vai para o proximo                   
                    }
                   // nas linhas abaxo, mostra_conteudo_tabela();
                  tf_codigo.setText(con_cidade.resultset.getString("cod"));//Essas duas linhas s�o neces�rias                   
                   mostra_dados();
               }
        catch(Exception erro)
        {
            //JOptionPane.showMessageDialog(null, "N�o conseguiu localizar via Sele��o no JComboBox, erro = "+erro);
        } 
        } else { inicia_combo = 1;}
     }//GEN-LAST:event_cb_pesquisaActionPerformed

    private void tf_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pesquisaActionPerformed
        try
            {
                   con_cidade.resultset.first();
                   String igual = "n";
                   int tamanho_pesquisa = tf_pesquisa.getText().length();
                   while(igual == "n")
                   {
                         String pesquisado = con_cidade.resultset.getString("nome").substring(0,(tamanho_pesquisa));

                            if (pesquisado.equals(tf_pesquisa.getText()))
                            {
                                 igual = "s";
                            }
                        else
                             con_cidade.resultset.next();
                    }                          
                   // nas linhas abaxo, mostra_conteudo_tabela();
                   tf_codigo.setText(con_cidade.resultset.getString("cod"));//Essas duas linhas � neces�ria                   
                   mostra_dados(); 
                   cb_pesquisa.setSelectedItem(tf_nome.getText());
            }
        catch(Exception erro)
            {
                JOptionPane.showMessageDialog(null, "N�o conseguiu localizar via digita��o, erro = "+erro);
            }        // TODO add your handling code here:
     }//GEN-LAST:event_tf_pesquisaActionPerformed

    private void botao_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_alterarActionPerformed
    try
    {
        String sql ="UPDATE cidade SET nome ='"+tf_nome.getText()+"' where cod = "+tf_codigo.getText();
        con_cidade.statement.executeUpdate(sql);
        JOptionPane.showMessageDialog(null,"Altera��o realizado com sucesso!");
       
       //atualiza o ResultSet
       atualiza_combo_box_cidade();
       con_cidade.executeSQL("Select * from bairro order by " + ordenacao);
       con_cidade.resultset.next(); //posiciona no primeiro registro
       mostra_dados(); //ir� chamar a fun��o em que ir� mstrar os dados no form
     }
     catch (SQLException erro)
     {
	JOptionPane.showMessageDialog(null,"Erro a tentar Alterar o registro..."+erro);
     }       
       
       
       
       
       
       
       
       
       
    }//GEN-LAST:event_botao_alterarActionPerformed

    private void botao_saidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_saidaActionPerformed
        con_cidade.desconecta();
        // TODO add your handling code here:
    }//GEN-LAST:event_botao_saidaActionPerformed

    private void rb_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_codigoActionPerformed
        ordem_visualizacao("cod");
    }//GEN-LAST:event_rb_codigoActionPerformed

    private void rb_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb_nomeActionPerformed
        ordem_visualizacao("nome");
    }//GEN-LAST:event_rb_nomeActionPerformed

    private void bt_filtrar_gradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_filtrar_gradeActionPerformed
        con_cidade.executeSQL("select * from bairro where nome like '%"+tf_pesquisa.getText()+"%' order by "+
                   ordenacao);
        preencher_jtable();

    }//GEN-LAST:event_bt_filtrar_gradeActionPerformed
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cad_bairros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_alterar;
    private javax.swing.JButton botao_excluir;
    private javax.swing.JButton botao_gravar;
    private javax.swing.JButton botao_inserir;
    private javax.swing.JButton botao_pesquisa_cb;
    private javax.swing.JButton botao_pesquisar;
    private javax.swing.JButton botao_saida;
    private javax.swing.JButton bt_anterior;
    private javax.swing.JButton bt_filtrar_grade;
    private javax.swing.JButton bt_primeiro;
    private javax.swing.JButton bt_proximo;
    private javax.swing.JButton bt_ultimo;
    private javax.swing.JComboBox cb_pesquisa;
    private javax.swing.ButtonGroup grupo_ordenacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rb_codigo;
    private javax.swing.JRadioButton rb_nome;
    private javax.swing.JTextField tf_codigo;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JTextField tf_pesquisa;
    // End of variables declaration//GEN-END:variables

    public void mostra_dados() {
        try
        {
            tf_codigo.setText(con_cidade.resultset.getString("cod"));
            tf_nome.setText(con_cidade.resultset.getString("nome"));
        }
        catch(SQLException erro)
        {
           if (navega == 1)
                    JOptionPane.showMessageDialog(null, "Você já esta n primeiro registro");
           else if (navega == 2)
                    JOptionPane.showMessageDialog(null, "Você já esta no ultimo registro");
           else
                    JOptionPane.showMessageDialog(null, "Não localizou bairro" + erro);
        }
    }
    
    public void atualiza_combo_box_cidade()
    {
        try
            {
                cb_pesquisa.removeAllItems();
                con_cidade.executeSQL("select * from bairro order by " + ordenacao);
                while (con_cidade.resultset.next())
                        cb_pesquisa.addItem(con_cidade.resultset.getString("nome"));
            }
        catch(SQLException erro)
            {
               JOptionPane.showMessageDialog(null, "Não localizou Bairro" + erro);
            }
    }
    
    public void preencher_jtable()
    {
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
         
        DefaultTableModel modelo = (DefaultTableModel)jTable1.getModel();
        modelo.setNumRows(0);
         
        try
        {
            
           while (con_cidade.resultset.next()) 
                 modelo.addRow(new Object [] {con_cidade.resultset.getString("Cod"),con_cidade.resultset.getString("nome")});
           con_cidade.resultset.first();
         }  
         catch (SQLException erro){
             JOptionPane.showMessageDialog(null,"Erro ao listar no JTable "+erro);
        }  
    }
    
        public void ordem_visualizacao(String Ordem)
    {
        ordenacao = Ordem;
        con_cidade.executeSQL("select * from bairro  order by "+ordenacao);           
        preencher_jtable();
        atualiza_combo_box_cidade();
        try
        {
            con_cidade.resultset.first();
        }
         catch (SQLException erro){
             JOptionPane.showMessageDialog(null,"Erro na ordena��o dos dados "+erro);
        }
        mostra_dados();
        
    }
    
}
