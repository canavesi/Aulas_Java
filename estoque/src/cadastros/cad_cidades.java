/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * cad_cidades.java
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
import utilitarios.conexao;
public class cad_cidades extends javax.swing.JFrame {
    int navega = 0;
    int inicia_combo = 0;
    conexao con_cidade;
    
    /** Creates new form cad_cidades */
    public cad_cidades() {
        initComponents();
        
        con_cidade = new conexao();
        con_cidade.conecta();
        atualiza_combo_box_cidade();
        con_cidade.executeSQL("Select * from cidade order by cod");
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_codigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tf_nome = new javax.swing.JTextField();
        cb_uf = new javax.swing.JComboBox();
        bt_primeiro = new javax.swing.JButton();
        bt_anterior = new javax.swing.JButton();
        bt_proximo = new javax.swing.JButton();
        bt_ultimo = new javax.swing.JButton();
        botao_gravar = new javax.swing.JButton();
        botao_excluir = new javax.swing.JButton();
        botao_alterar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tf_pesquisa = new javax.swing.JTextField();
        cb_pesquisa = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        botao_inserir = new javax.swing.JButton();
        botao_pesquisar = new javax.swing.JButton();
        botao_pesquisa_cb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mautenção do Cadastro de Cidades");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Manutenção do Cadastro de Cidades");

        jLabel2.setText("Código: ");

        tf_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_codigoActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome:");

        jLabel4.setText("UF:");

        cb_uf.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SP", "MG", "RS", "PR", "TO" }));
        cb_uf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_ufActionPerformed(evt);
            }
        });

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
        botao_gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_gravarActionPerformed(evt);
            }
        });

        botao_excluir.setIcon(new javax.swing.ImageIcon("C:\\Desenv\\Aulas_Java\\estoque\\Icones\\7.gif")); // NOI18N
        botao_excluir.setToolTipText("Excluir");
        botao_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_excluirActionPerformed(evt);
            }
        });

        botao_alterar.setIcon(new javax.swing.ImageIcon("C:\\Desenv\\Aulas_Java\\estoque\\Icones\\10.gif")); // NOI18N
        botao_alterar.setToolTipText("Alterar");
        botao_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_alterarActionPerformed(evt);
            }
        });

        jLabel5.setText("Pesquisar:");

        tf_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pesquisaActionPerformed(evt);
            }
        });

        cb_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_pesquisaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        botao_inserir.setIcon(new javax.swing.ImageIcon("C:\\Desenv\\Aulas_Java\\estoque\\Icones\\6.gif")); // NOI18N
        botao_inserir.setToolTipText("Incluir");
        botao_inserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_inserirActionPerformed(evt);
            }
        });

        botao_pesquisar.setText("Pesquisar");
        botao_pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_pesquisarActionPerformed(evt);
            }
        });

        botao_pesquisa_cb.setText("Pesquisar");
        botao_pesquisa_cb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_pesquisa_cbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(41, 41, 41)
                                        .addComponent(cb_uf, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(tf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botao_pesquisar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(cb_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(botao_pesquisa_cb)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bt_primeiro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bt_anterior))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botao_inserir)
                                .addGap(18, 18, 18)
                                .addComponent(botao_excluir)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_proximo)
                            .addComponent(botao_alterar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botao_gravar)
                            .addComponent(bt_ultimo))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botao_pesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_pesquisa_cb))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cb_uf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_primeiro)
                    .addComponent(bt_anterior)
                    .addComponent(bt_proximo)
                    .addComponent(bt_ultimo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao_alterar)
                    .addComponent(botao_excluir)
                    .addComponent(botao_inserir)
                    .addComponent(botao_gravar))
                .addGap(88, 88, 88))
        );

        setSize(new java.awt.Dimension(500, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cb_ufActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_ufActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_ufActionPerformed

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
        cb_uf.setSelectedItem("SP");
        tf_nome.requestFocus();
        tf_codigo.setEditable(false);
                
    }//GEN-LAST:event_botao_inserirActionPerformed

    private void botao_gravarActionPerformed(java.awt.event.ActionEvent evt) {                                             
    //c�digo para Gravar os dados no Banco de Dados
    try
    {
         //insert int cidade (nome,uf) values ('Carazinho','RS')
        
         String sqlinsert ="insert into cidade (nome,uf) values ('"+
                     tf_nome.getText()+"','"+
                     cb_uf.getSelectedItem()+"')";
	con_cidade.statement.executeUpdate(sqlinsert);         
        JOptionPane.showMessageDialog(null,"Grava��o realizado com sucesso!");
       
       //atualiza o ResultSet
       //con_cidade.resultset = con_cidade.statement.executeQuery("Select * from cidade");
       atualiza_combo_box_cidade();
       con_cidade.executeSQL("select * from cidade  order by cod");
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
      	String sql = "select * from cidade Where cod = "+tf_codigo.getText();
   	con_cidade.executeSQL(sql); 
        con_cidade.resultset.first();
        String nome = "Deletar a Cidade : "+con_cidade.resultset.getString("nome")+" ?";
        int opcao_escolhida = JOptionPane.showConfirmDialog(null,nome,"Exclus�o ",JOptionPane.YES_NO_OPTION);
        if (opcao_escolhida == JOptionPane.YES_OPTION)
   	{
   	    sql = "DELETE FROM cidade Where cod ="+tf_codigo.getText();
  	    int conseguiu_excluir = con_cidade.statement.executeUpdate(sql);
  	    if (conseguiu_excluir == 1)
            {
                JOptionPane.showMessageDialog(null,"Exclus�o realizada com sucesso");
                //atualiza o ResultSet
                atualiza_combo_box_cidade();
                con_cidade.executeSQL("Select * from cidade  order by cod");
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
        String sql ="UPDATE cidade SET nome ='"+tf_nome.getText()+"',"+
                     "uf = '"+cb_uf.getSelectedItem()+"' where cod = "+tf_codigo.getText();
        con_cidade.statement.executeUpdate(sql);
        JOptionPane.showMessageDialog(null,"Altera��o realizado com sucesso!");
       
       //atualiza o ResultSet
       atualiza_combo_box_cidade();
       con_cidade.executeSQL("Select * from cidade  order by cod");
       con_cidade.resultset.next(); //posiciona no primeiro registro
       mostra_dados(); //ir� chamar a fun��o em que ir� mstrar os dados no form
     }
     catch (SQLException erro)
     {
	JOptionPane.showMessageDialog(null,"Erro a tentar Alterar o registro..."+erro);
     }       
       
       
       
       
       
       
       
       
       
    }//GEN-LAST:event_botao_alterarActionPerformed
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cad_cidades().setVisible(true);
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
    private javax.swing.JButton bt_anterior;
    private javax.swing.JButton bt_primeiro;
    private javax.swing.JButton bt_proximo;
    private javax.swing.JButton bt_ultimo;
    private javax.swing.JComboBox cb_pesquisa;
    private javax.swing.JComboBox cb_uf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tf_codigo;
    private javax.swing.JTextField tf_nome;
    private javax.swing.JTextField tf_pesquisa;
    // End of variables declaration//GEN-END:variables

    public void mostra_dados() {
        try
        {
            tf_codigo.setText(con_cidade.resultset.getString("cod"));
            tf_nome.setText(con_cidade.resultset.getString("nome"));
            cb_uf.setSelectedItem(con_cidade.resultset.getString("uf"));
        }
        catch(SQLException erro)
        {
           if (navega == 1)
                    JOptionPane.showMessageDialog(null, "Você já esta n primeiro registro");
           else if (navega == 2)
                    JOptionPane.showMessageDialog(null, "Você já esta no ultimo registro");
           else
                    JOptionPane.showMessageDialog(null, "Não localizou cidade" + erro);
        }
    }
    
    public void atualiza_combo_box_cidade()
    {
        try
            {
                cb_pesquisa.removeAllItems();
                con_cidade.executeSQL("select * from cidade  order by cod");
                while (con_cidade.resultset.next())
                        cb_pesquisa.addItem(con_cidade.resultset.getString("nome"));
            }
        catch(SQLException erro)
            {
               JOptionPane.showMessageDialog(null, "Não localizou cidade" + erro);
            }
    }
    
}
