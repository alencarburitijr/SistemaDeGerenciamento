/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Cad_grupo.java
 *
 * Created on 15/04/2011, 00:44:10
 */
package br.com.medicalpharm.view;

import br.com.medicalpharm.dao.GrupoDAO;
import br.com.medicalpharm.model.GrupoModel;
import br.com.medicalpharm.model.SubGrupoModel;
import br.com.medicalpharm.util.ItemDbGrid;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alencar
 */
public class GrupoGUI extends javax.swing.JFrame {

    public TelaPrincipal janelapai;
    Integer i;
    String tipoCadatro;
    List<GrupoModel> grupos;

    /** Creates new form Cad_grupo */
    public GrupoGUI() {
        initComponents();
        listarGrupo();
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            // UIManager.setLookAndFeel("com.sun.java.swing.plaf.smoothmetal.SmoothmetalLookAndAndFeel");
            //UIManager.setLookAndFeel("com.birosoft.liquid.LiquidLookAndFeel");
            //UIManager.setLookAndFeel(seta_look);
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
    }

    public void setTela(String permissao) {
        if (permissao.equals("usuario")) {
            jb_novo.setEnabled(false);
            jb_alterar.setEnabled(false);
            jb_excluir.setEnabled(false);
        } else {
        }
    }
    DefaultTableModel tmGrupo = new DefaultTableModel(null, new String[]{"Código", "Descrição"});
    ListSelectionModel lsmGrupo;

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jtf_pesquisa = new javax.swing.JTextField();
        jrb_codigo = new javax.swing.JRadioButton();
        jrb_descricao = new javax.swing.JRadioButton();
        jrb_especifica = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jb_novo = new javax.swing.JButton();
        jb_alterar = new javax.swing.JButton();
        jb_excluir = new javax.swing.JButton();
        jb_sair = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jtf_sub = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento de grupos");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 269, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultas"));
        jPanel3.setName("jPanel3"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel3.setText("Parâmetro");
        jLabel3.setName("jLabel3"); // NOI18N

        jtf_pesquisa.setName("jtf_pesquisa"); // NOI18N
        jtf_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtf_pesquisaActionPerformed(evt);
            }
        });

        buttonGroup1.add(jrb_codigo);
        jrb_codigo.setFont(new java.awt.Font("Dialog", 0, 12));
        jrb_codigo.setSelected(true);
        jrb_codigo.setText("Código");
        jrb_codigo.setName("jrb_codigo"); // NOI18N

        buttonGroup1.add(jrb_descricao);
        jrb_descricao.setFont(new java.awt.Font("Dialog", 0, 12));
        jrb_descricao.setText("Descrição");
        jrb_descricao.setName("jrb_descricao"); // NOI18N

        buttonGroup1.add(jrb_especifica);
        jrb_especifica.setFont(new java.awt.Font("Dialog", 0, 12));
        jrb_especifica.setText("Específica");
        jrb_especifica.setName("jrb_especifica"); // NOI18N

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/ok.png"))); // NOI18N
        jButton1.setText("Ir");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jrb_codigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrb_descricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrb_especifica))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrb_codigo)
                    .addComponent(jrb_descricao)
                    .addComponent(jrb_especifica))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jb_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/novo_registro.gif"))); // NOI18N
        jb_novo.setText("Novo");
        jb_novo.setName("jb_novo"); // NOI18N
        jb_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_novoActionPerformed(evt);
            }
        });
        getContentPane().add(jb_novo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jb_alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/alterar_registro.gif"))); // NOI18N
        jb_alterar.setText("Alterar");
        jb_alterar.setName("jb_alterar"); // NOI18N
        jb_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_alterarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_alterar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        jb_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/delete.gif"))); // NOI18N
        jb_excluir.setText("Excluir");
        jb_excluir.setName("jb_excluir"); // NOI18N
        jb_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_excluirActionPerformed(evt);
            }
        });
        getContentPane().add(jb_excluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, -1, -1));

        jb_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/exit.png"))); // NOI18N
        jb_sair.setText("Sair");
        jb_sair.setName("jb_sair"); // NOI18N
        jb_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_sairActionPerformed(evt);
            }
        });
        getContentPane().add(jb_sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, 33));

        jScrollPane2.setName("jScrollPane2"); // NOI18N

        jTable1.setUpdateSelectionOnSort(false);
        jTable1.setVerifyInputWhenFocusTarget(false);
        jTable1.setDefaultEditor(Object.class, null);
        jTable1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                if(e.getClickCount() == 1){
                    listarItem();
                }}});
                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    new Object [][] {

                    },
                    new String [] {
                        "Código", "Grupo"
                    }
                ) {
                    Class[] types = new Class [] {
                        java.lang.String.class, java.lang.Object.class
                    };
                    boolean[] canEdit = new boolean [] {
                        false, false
                    };

                    public Class getColumnClass(int columnIndex) {
                        return types [columnIndex];
                    }

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                    }
                });
                jTable1.setName("jTable1"); // NOI18N
                jTable1.getTableHeader().setReorderingAllowed(false);
                jScrollPane2.setViewportView(jTable1);
                jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
                jTable1.getColumnModel().getColumn(1).setPreferredWidth(380);

                getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 540, 130));

                jScrollPane3.setName("jScrollPane3"); // NOI18N

                jTable1.setUpdateSelectionOnSort(false);
                jTable1.setVerifyInputWhenFocusTarget(false);
                jTable1.setDefaultEditor(Object.class, null);
                jTable1.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e){
                        if(e.getClickCount() == 2){
                            alterar();

                        }}});
                        jTable2.setModel(new javax.swing.table.DefaultTableModel(
                            new Object [][] {

                            },
                            new String [] {
                                "Código", "Sub-Grupo"
                            }
                        ) {
                            Class[] types = new Class [] {
                                java.lang.String.class, java.lang.Object.class
                            };
                            boolean[] canEdit = new boolean [] {
                                false, false
                            };

                            public Class getColumnClass(int columnIndex) {
                                return types [columnIndex];
                            }

                            public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                            }
                        });
                        jTable2.setName("jTable2"); // NOI18N
                        jTable2.getTableHeader().setReorderingAllowed(false);
                        jScrollPane3.setViewportView(jTable2);
                        jTable2.getColumnModel().getColumn(0).setPreferredWidth(10);
                        jTable2.getColumnModel().getColumn(1).setPreferredWidth(380);

                        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 540, 130));

                        jButton2.setText("Excluir");
                        jButton2.setName("jButton2"); // NOI18N
                        jButton2.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                            }
                        });
                        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, -1, -1));

                        jtf_sub.setName("jtf_sub"); // NOI18N
                        getContentPane().add(jtf_sub, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 300, -1));

                        jLabel4.setText("Descrição");
                        jLabel4.setName("jLabel4"); // NOI18N
                        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

                        jButton3.setText("Adicionar");
                        jButton3.setName("jButton3"); // NOI18N
                        jButton3.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
                            }
                        });
                        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, -1, -1));

                        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
                        setBounds((screenSize.width-608)/2, (screenSize.height-541)/2, 608, 541);
                    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jtf_pesquisa.requestFocus();
        // TODO add your handling code here:


        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jb_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_novoActionPerformed
        GrupoCadastroGUI grup = new GrupoCadastroGUI();
        grup.setVisible(true);
        grup.janelapai = this;
        this.setEnabled(false);
        // TODO add your handling code here:
}//GEN-LAST:event_jb_novoActionPerformed

    private void jb_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_alterarActionPerformed
        alterar();
        // TODO add your handling code here:
}//GEN-LAST:event_jb_alterarActionPerformed
    public void alterar() {
        GrupoModel grup = tbGrupoLinhaSelecionada(jTable1);
        SubGrupoModel sub = tbSubGrupoSelecionado(jTable2);
        if (grup != null && sub != null) {
            GrupoAlterarGUI grupoAltera = new GrupoAlterarGUI(grup,sub);
            grupoAltera.janelapai = this;
            grupoAltera.setVisible(true);
            this.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um grupo e um sub-grupo");
            jtf_pesquisa.requestFocus();
        }
    }
    private void jb_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_sairActionPerformed
        setVisible(false);
        telaPrincipal.setStatusTela(true);
        // TODO add your handling code here:
}//GEN-LAST:event_jb_sairActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jrb_codigo.isSelected() == true) {
            listarGrupoCodigo();
        } else if (jrb_descricao.isSelected() == true) {
            listarDestinoDescricao();
        } else if (jrb_especifica.isSelected() == true) {
            listarGrupo();
        } else {
            listarGrupo();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jtf_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtf_pesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_pesquisaActionPerformed

    private void jb_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_excluirActionPerformed
        excluiGrupo();
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_excluirActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        telaPrincipal.setStatusTela(true);
        setVisible(false);
    }//GEN-LAST:event_formWindowClosed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        excluiSubGrupo();
    // TODO add your handling code here:
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    if(jtf_sub.getText().equals("")){
        JOptionPane.showMessageDialog(null, "Informe o sub-grupo a ser adicionado");
    }else{
        adicionar();
        
    }
    // TODO add your handling code here:
}//GEN-LAST:event_jButton3ActionPerformed
    public void adicionar() {
        GrupoModel grup = tbGrupoLinhaSelecionada(jTable1);
      //  SubGrupoModel sub = tbSubGrupoSelecionado(jTable2);
        if (grup != null) {
            GrupoDAO controlGrupo1 = new GrupoDAO();
            sub.setDescSubGrupo(jtf_sub.getText().trim());
            controlGrupo1.cadastraSubGrupoItem(sub, grup);
            listarItem();
            jtf_sub.setText("");
            
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um grupo ");
            jtf_pesquisa.requestFocus();
        }
    }    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new GrupoGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jb_alterar;
    private javax.swing.JButton jb_excluir;
    private javax.swing.JButton jb_novo;
    private javax.swing.JButton jb_sair;
    private javax.swing.JRadioButton jrb_codigo;
    private javax.swing.JRadioButton jrb_descricao;
    private javax.swing.JRadioButton jrb_especifica;
    private javax.swing.JTextField jtf_pesquisa;
    private javax.swing.JTextField jtf_sub;
    // End of variables declaration//GEN-END:variables
    private TelaPrincipal_Interface telaPrincipal;
    //Recebendo tela como parametro para atualização apos pesquisa

    public void setTelaPrincipal(TelaPrincipal_Interface telaPrincipal) {
        this.telaPrincipal = telaPrincipal;
    }

    public void request() {
        jtf_pesquisa.requestFocus();
    }

    public void listarGrupo() {
        GrupoDAO grup = new GrupoDAO();
        grupos = grup.listarGrupo("%" + jtf_pesquisa.getText().trim() + "%");
        mostraGrupos(grupos);

    }

    public void listarGrupoCodigo() {
        if (jtf_pesquisa.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe um código");
        } else {
            GrupoDAO grup = new GrupoDAO();
            grupos = grup.listarGrupoCodigo(jtf_pesquisa.getText().trim());
            mostraGrupos(grupos);
        }
    }

    public void listarDestinoDescricao() {
        GrupoDAO grup = new GrupoDAO();
        grupos = grup.listarGrupoDescricao(jtf_pesquisa.getText().trim() + "%");
        mostraGrupos(grupos);
    }

    public void mostraGrupos(List<GrupoModel> grupo) {
//      while (tmGrupo.getRowCount()>0){
//                tmGrupo.removeRow(0);
//            }
        ((DefaultTableModel) jTable1.getModel()).setRowCount(0);
        jTable1.updateUI();

        if (grupo.size() == 0) {
            JOptionPane.showMessageDialog(this, "Nenhum grupo encontrado");

        } else {


            //String [] campos = new String []{null, null};
            for (int i = 0; i < grupo.size(); i++) {
                GrupoModel grupoModel = new GrupoModel();
                grupoModel.setCod_grupo(grupo.get(i).getCod_grupo());
                grupoModel.setDesc_grupo(grupo.get(i).getDesc_grupo());

                DefaultTableModel row = (DefaultTableModel) jTable1.getModel();
                ItemDbGrid hashDbGrid = new ItemDbGrid(grupoModel, grupoModel.getDesc_grupo());
                row.addRow(new Object[]{grupoModel.getCod_grupo(), hashDbGrid});

//                tmGrupo.addRow(campos);
//
//                tmGrupo.setValueAt(grupo.get(i).getCod_grupo(), i, 0);
//                tmGrupo.setValueAt(grupo.get(i).getDesc_grupo(), i, 1);
            }
        }

    }

    public GrupoModel tbGrupoLinhaSelecionada(JTable tb) {
        GrupoModel grup = null;
        if (tb.getSelectedRow() != -1) {
            grup = new GrupoModel();
            grup.setCod_grupo(grupos.get(tb.getSelectedRow()).getCod_grupo());
            grup.setDesc_grupo(grupos.get(tb.getSelectedRow()).getDesc_grupo());
        }
        return grup;
    }
    GrupoModel grupo = new GrupoModel();

    private void excluiGrupo() {
        removeGrupo(jTable1);
    }

    public GrupoModel removeGrupo(JTable tb) {
        DefaultTableModel row = (DefaultTableModel) jTable1.getModel();
        if (tb.getSelectedRow() != -1) {
            int selectedOption = JOptionPane.showConfirmDialog(this, "Deseja excluir ?", "Atenção", JOptionPane.YES_NO_OPTION);
            if (selectedOption == JOptionPane.YES_NO_OPTION) {
                GrupoDAO grupoControl = new GrupoDAO();
                grupo.setCod_grupo(grupos.get(tb.getSelectedRow()).getCod_grupo());
                if (grupoControl.excluirGrupo(grupo)) {
                    row.removeRow(tb.getSelectedRow());
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um grupo");
        }
        return grupo;
    }
    List<SubGrupoModel> subgrupos;
        public void listarItem() {
            GrupoModel grupo = tbGrupoSelecionado(jTable1);
            if (grupo != null) {
            GrupoDAO controlGrupo = new GrupoDAO();
            Integer codgrupo;
            codgrupo = grupo.getCod_grupo();
            //controlEntrada.listarItens(entrada.getIdEntrada());
            subgrupos = controlGrupo.listarItens(codgrupo);
            mostrarItens(subgrupos);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um grupo");
            jtf_pesquisa.requestFocus();
        }
    }
        
        public void mostrarItens(List<SubGrupoModel> subgrupos) {
        ((DefaultTableModel) jTable2.getModel()).setRowCount(0);
        jTable2.updateUI();

        if (subgrupos.size() == 0) {
            JOptionPane.showMessageDialog(this, "Nenhum subgrupo encontrado");

        } else {

            String preço = null;

            for (int i = 0; i < subgrupos.size(); i++) {
              
                    //ou i<destino.size() para retornar todos
                    SubGrupoModel subGrupo = new SubGrupoModel();
                    subGrupo.setIdSubGrupo(subgrupos.get(i).getIdSubGrupo());
                    subGrupo.setDescSubGrupo(subgrupos.get(i).getDescSubGrupo());
                    
                    DefaultTableModel row = (DefaultTableModel) jTable2.getModel();                  
                    row.addRow(new Object[]{subGrupo.getIdSubGrupo(),subGrupo.getDescSubGrupo()});
                 

            }
            //   JOptionPane.showMessageDialog(null, preço);
        }

    }
        
    public GrupoModel tbGrupoSelecionado(JTable tb) {
        GrupoModel grupo = null;
        if (tb.getSelectedRow() != -1) {
            grupo = new GrupoModel();
            grupo.setCod_grupo(grupos.get(tb.getSelectedRow()).getCod_grupo());
            
        }
        return grupo;

    }
    private void excluiSubGrupo() {
        removeSubGrupo(jTable2);
    }
    SubGrupoModel sub = new SubGrupoModel();
    
    
    public SubGrupoModel removeSubGrupo(JTable tb) {
        DefaultTableModel row1 = (DefaultTableModel) jTable2.getModel();
        if (tb.getSelectedRow() != -1) {
            int selectedOption = JOptionPane.showConfirmDialog(this, "Deseja excluir ?", "Atenção", JOptionPane.YES_NO_OPTION);
            if (selectedOption == JOptionPane.YES_NO_OPTION) {
                
                GrupoDAO grupoControl = new GrupoDAO();
         //       JOptionPane.showMessageDialog(null,subgrupos.get(tb.getSelectedRow()).getIdSubGrupo());
                sub.setIdSubGrupo(subgrupos.get(tb.getSelectedRow()).getIdSubGrupo());
                
                if (grupoControl.excluirSubGrupo(sub)) {
                    row1.removeRow(tb.getSelectedRow());
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um sub-grupo");
        }
        return sub;
    }
    
    public SubGrupoModel tbSubGrupoSelecionado(JTable tb) {
        SubGrupoModel sub = null;

        if (tb.getSelectedRow() != -1) {
            sub = new SubGrupoModel();
            sub.setIdSubGrupo(subgrupos.get(tb.getSelectedRow()).getIdSubGrupo());
            sub.setDescSubGrupo(subgrupos.get(tb.getSelectedRow()).getDescSubGrupo());
        }
        return sub;

    }
}
