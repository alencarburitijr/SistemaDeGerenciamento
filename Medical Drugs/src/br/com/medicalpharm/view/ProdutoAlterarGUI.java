/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ProdutoAlterarGUI.java
 *
 * Created on 26/05/2011, 08:37:47
 */
package br.com.medicalpharm.view;

import br.com.medicalpharm.dao.GrupoDAO;
import br.com.medicalpharm.dao.ProdutoDAO;
import br.com.medicalpharm.dao.UnidadeDAO;
import br.com.medicalpharm.model.GrupoModel;
import br.com.medicalpharm.model.ProdutoModel;
import br.com.medicalpharm.model.SubGrupoModel;
import br.com.medicalpharm.model.UnidadeModel;
import br.com.medicalpharm.util.ItemDbGrid;
import br.com.medicalpharm.util.LimitadorTexto;
import br.com.medicalpharm.util.S20BinaryLookup;
import br.com.medicalpharm.util.UnaccentedDocument;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author ALENCAR
 */
public class ProdutoAlterarGUI extends javax.swing.JFrame {

    public ProdutoGUI janelapai;
    public ProdutoModel objproduto;
    public List<ProdutoModel> produtos;

    /** Creates new form ProdutoAlterarGUI */
    public ProdutoAlterarGUI() {
        initComponents();
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

    public ProdutoAlterarGUI(ProdutoModel produto) {
        this.objproduto = produto;
        initComponents();
        listarGrupo();
        listarUnidade();
        jtf_codigo.setText(String.valueOf(produto.getCod_produto()));
        jtf_nome.setText(String.valueOf(produto.getNome_produto()));
        jtf_concentração.setText(String.valueOf(produto.getConcentraçao()));
        jtf_estoqueIdeal.setText(String.valueOf(produto.getEstoque_ideal()));
        jtf_estoqueMinimo.setText(String.valueOf(produto.getEstoque_minimo()));

        GrupoModel grupoModel = new GrupoModel();
        grupoModel.setCod_grupo(produto.getGrupo().getCod_grupo());
        grupoModel.setDesc_grupo(produto.getGrupo().getDesc_grupo());

        UnidadeModel unidadeModel = new UnidadeModel();
        unidadeModel.setCod_unidade(produto.getUnidade().getCod_unidade());
        unidadeModel.setDesc_unidade(produto.getUnidade().getDesc_unidade());
        unidadeModel.setSigla_unidade(produto.getUnidade().getSigla_unidade());

        for (Integer i = 0; i < jcb_grupo.getItemCount(); i++) {
            if (i != 0) {
                GrupoModel grupo = new GrupoModel();
                ItemDbGrid hashDbGrid1 = (ItemDbGrid) jcb_grupo.getItemAt(i);
                grupo = (GrupoModel) hashDbGrid1.getObjeto();
                if (grupo.getCod_grupo().equals(produto.getGrupo().getCod_grupo())) {
                    jcb_grupo.setSelectedIndex(i);
                    
                    break;
                }
            }
        }
        SubGrupoModel subGrupo = new SubGrupoModel();
        subGrupo.setIdSubGrupo(produto.getSubGrupo().getIdSubGrupo());
        subGrupo.setDescSubGrupo(produto.getSubGrupo().getDescSubGrupo());
        subGrupo.setGrupo(grupoModel);
        
        listarItem(grupoModel);
        
        for (Integer i = 0; i < jcb_sub.getItemCount(); i++) {
            if (i != 0) {
                SubGrupoModel sub = new SubGrupoModel();
                ItemDbGrid hashDbGrid2 = (ItemDbGrid) jcb_sub.getItemAt(i);
                sub = (SubGrupoModel) hashDbGrid2.getObjeto();
                if (sub.getIdSubGrupo().equals(produto.getSubGrupo().getIdSubGrupo())) {
                    jcb_sub.setSelectedIndex(i);
                    break;
                }
            }

        }
        for (Integer i = 0; i < jcb_unidade.getItemCount(); i++) {
            if (i != 0) {
                UnidadeModel unidade = new UnidadeModel();
                ItemDbGrid hashDbGrid1 = (ItemDbGrid) jcb_unidade.getItemAt(i);
                unidade = (UnidadeModel) hashDbGrid1.getObjeto();
                if (unidade.getCod_unidade().equals(produto.getUnidade().getCod_unidade())) {
                    jcb_unidade.setSelectedIndex(i);
                    break;
                }
            }

        }

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jb_salvar = new javax.swing.JButton();
        jb_cancelar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jtf_estoqueMinimo = new javax.swing.JTextField(11);
        jLabel4 = new javax.swing.JLabel();
        jtf_nome = new javax.swing.JTextField(new LimitadorTexto(80), "",10);
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtf_codigo = new javax.swing.JTextField();
        jtf_estoqueIdeal = new javax.swing.JTextField(new LimitadorTexto(11), "",10);
        jcb_unidade = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jcb_grupo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jtf_concentração = new javax.swing.JTextField(new LimitadorTexto(45), "",10);
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jcb_sub = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterando Produto");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/gravar_registro.gif"))); // NOI18N
        jb_salvar.setText("Salvar");
        jb_salvar.setName("jb_salvar"); // NOI18N
        jb_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_salvarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, 35));

        jb_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/exit.png"))); // NOI18N
        jb_cancelar.setText("Cancelar");
        jb_cancelar.setName("jb_cancelar"); // NOI18N
        jb_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, 35));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel14.setText("Nome comercial");
        jLabel14.setName("jLabel14"); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jtf_estoqueMinimo.setName("jtf_estoqueMinimo"); // NOI18N
        jtf_estoqueMinimo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtf_estoqueMinimoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtf_estoqueMinimoFocusLost(evt);
            }
        });
        getContentPane().add(jtf_estoqueMinimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 80, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel4.setText("Grupo *");
        jLabel4.setName("jLabel4"); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        jtf_nome.setDocument(new UnaccentedDocument());
        jtf_nome.setName("jtf_nome"); // NOI18N
        jtf_nome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtf_nomeFocusGained(evt);
            }
        });
        jtf_nome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf_nomeKeyPressed(evt);
            }
        });
        getContentPane().add(jtf_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 420, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel8.setText("Estoque Minimo *");
        jLabel8.setName("jLabel8"); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel5.setText("Unidade *");
        jLabel5.setName("jLabel5"); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel7.setText("Estoque Ideal *");
        jLabel7.setName("jLabel7"); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, -1, -1));

        jtf_codigo.setEditable(false);
        jtf_codigo.setName("jtf_codigo"); // NOI18N
        getContentPane().add(jtf_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 94, -1));

        jtf_estoqueIdeal.setName("jtf_estoqueIdeal"); // NOI18N
        jtf_estoqueIdeal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtf_estoqueIdealFocusGained(evt);
            }
        });
        getContentPane().add(jtf_estoqueIdeal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 80, -1));

        jcb_unidade.setEditable(true);
        jcb_unidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        jcb_unidade.setName("jcb_unidade"); // NOI18N
        jcb_unidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_unidadeActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_unidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 70, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel3.setText("Produto / Apresentação *");
        jLabel3.setName("jLabel3"); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jcb_grupo.setEditable(true);
        jcb_grupo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        jcb_grupo.setName("jcb_grupo"); // NOI18N
        jcb_grupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_grupoActionPerformed(evt);
            }
        });
        getContentPane().add(jcb_grupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 120, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel1.setText("Código");
        jLabel1.setName("jLabel1"); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jtf_concentração.setDocument(new UnaccentedDocument());
        jtf_concentração.setName("jtf_concentração"); // NOI18N
        jtf_concentração.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtf_concentraçãoFocusGained(evt);
            }
        });
        jtf_concentração.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf_concentraçãoKeyPressed(evt);
            }
        });
        getContentPane().add(jtf_concentração, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 420, -1));

        jLabel2.setText("Observação: Os campos com asteristico na frente são obrigatórios ");
        jLabel2.setName("jLabel2"); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        jButton2.setText("...");
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 30, -1));

        jButton1.setText("...");
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 30, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel9.setText("Sub-Grupo*");
        jLabel9.setName("jLabel9"); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, -1));

        jcb_sub.setEditable(true);
        jcb_sub.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        jcb_sub.setName("jcb_sub"); // NOI18N
        jcb_sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_subActionPerformed(evt);
            }
        });
        jcb_sub.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jcb_subFocusGained(evt);
            }
        });
        getContentPane().add(jcb_sub, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 130, -1));

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-482)/2, (screenSize.height-333)/2, 482, 333);
    }// </editor-fold>//GEN-END:initComponents

    private void jb_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salvarActionPerformed
        alterarProduto();
}//GEN-LAST:event_jb_salvarActionPerformed

    private void jb_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelarActionPerformed
        janelapai.setEnabled(true);
        janelapai.setVisible(true);
        janelapai.request();
        setVisible(false);
        // TODO add your handling code here:
}//GEN-LAST:event_jb_cancelarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        janelapai.setEnabled(true);
        janelapai.setVisible(true);
        janelapai.request();
        setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void jtf_estoqueMinimoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_estoqueMinimoFocusLost
    }//GEN-LAST:event_jtf_estoqueMinimoFocusLost
    GrupoModel grupoCombo;
    private void jcb_grupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_grupoActionPerformed
        listarItem();
//        
    }//GEN-LAST:event_jcb_grupoActionPerformed
    UnidadeModel unidadeCombo;
    private void jcb_unidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_unidadeActionPerformed
        ItemDbGrid hashDbGrid = (ItemDbGrid) jcb_unidade.getSelectedItem();
        unidadeCombo = (UnidadeModel) hashDbGrid.getObjeto();
    }//GEN-LAST:event_jcb_unidadeActionPerformed

    private void jtf_nomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_nomeFocusGained
        jtf_nome.setInputVerifier(new InputVerifier() {

            public boolean verify(JComponent input) {
                if (jtf_nome.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Informe o principio ativo do produto");
                    jtf_nome.requestFocus();
                    return false;
                } else {
                    return true;
                }
            }
        });
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_nomeFocusGained

    private void jtf_concentraçãoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_concentraçãoFocusGained
//    jtf_concentração.setInputVerifier(new InputVerifier() {
//    public boolean verify(JComponent input) {
//                if(jtf_concentração.getText().equals("")) {
//                    JOptionPane.showMessageDialog(null, "Informe a concentação do produto");
//                    jtf_concentração.requestFocus();
//                    return false;
//                } else {
//                    return true;
//                }
//            }
//    });
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_concentraçãoFocusGained

    private void jtf_estoqueMinimoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_estoqueMinimoFocusGained
        jtf_estoqueMinimo.setInputVerifier(new InputVerifier() {

            public boolean verify(JComponent input) {
                if (jtf_estoqueMinimo.getText().length() == 0) {
                    JOptionPane.showMessageDialog(null, "Informe o estoque minimo");
                    jtf_estoqueMinimo.requestFocus();
                    return false;
                } else {
                    return true;
                }
            }
        });
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_estoqueMinimoFocusGained

    private void jtf_estoqueIdealFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_estoqueIdealFocusGained
        jtf_estoqueIdeal.setInputVerifier(new InputVerifier() {

            public boolean verify(JComponent input) {
                Integer estoqueIdeal = 0;
                Integer estoqueMínimo = 0;
                estoqueIdeal = Integer.parseInt(jtf_estoqueIdeal.getText());
                estoqueMínimo = Integer.parseInt(jtf_estoqueMinimo.getText());
                if (jtf_estoqueIdeal.getText().length() == 0) {
                    JOptionPane.showMessageDialog(null, "Informe o estoque ideal");
                    jtf_estoqueIdeal.requestFocus();
                    return false;
                } else if (estoqueIdeal < estoqueMínimo) {
                    JOptionPane.showMessageDialog(null, "Estoque ideal menor que estoque mínimo");
                    jtf_estoqueIdeal.requestFocus();
                    return false;
                } else {
                    return true;
                }
            }
        });
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_estoqueIdealFocusGained

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    GrupoCadastroGUI grup = new GrupoCadastroGUI();
    grup.setVisible(true);
    grup.janelapai3 = this;
    this.setEnabled(false);
    // TODO add your handling code here:
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    UnidadeCadastroGUI unid = new UnidadeCadastroGUI();
    unid.setVisible(true);
    unid.janelapai3 = this;
    this.setEnabled(false);
//    ProdutoCadastroGUI prod = new ProdutoCadastroGUI();
//            prod.setVisible(true);
//            prod.janelapai = this;
//            this.setEnabled(false);

    // TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

private void jcb_subActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_subActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jcb_subActionPerformed

private void jtf_nomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_nomeKeyPressed
    jtf_nome.addKeyListener(new KeyAdapter() {  
      public void keyReleased(KeyEvent evt) {  
        if (evt.getKeyCode() != KeyEvent.VK_HOME) {  
          String s = jtf_nome.getText();  
          jtf_nome.setText(s.toUpperCase());  
        }  
      }  
    }); 
    
    // TODO add your handling code here:
}//GEN-LAST:event_jtf_nomeKeyPressed

private void jtf_concentraçãoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_concentraçãoKeyPressed
    jtf_concentração.addKeyListener(new KeyAdapter() {  
      public void keyReleased(KeyEvent evt) {  
        if (evt.getKeyCode() != KeyEvent.VK_HOME) {  
          String s = jtf_concentração.getText();  
          jtf_concentração.setText(s.toUpperCase());  
        }  
      }  
    }); 
    
    // TODO add your handling code here:
}//GEN-LAST:event_jtf_concentraçãoKeyPressed

private void jcb_subFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jcb_subFocusGained
// TODO add your handling code here:
}//GEN-LAST:event_jcb_subFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ProdutoAlterarGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jb_cancelar;
    private javax.swing.JButton jb_salvar;
    private javax.swing.JComboBox jcb_grupo;
    private javax.swing.JComboBox jcb_sub;
    private javax.swing.JComboBox jcb_unidade;
    private javax.swing.JTextField jtf_codigo;
    private javax.swing.JTextField jtf_concentração;
    private javax.swing.JTextField jtf_estoqueIdeal;
    private javax.swing.JTextField jtf_estoqueMinimo;
    private javax.swing.JTextField jtf_nome;
    // End of variables declaration//GEN-END:variables
        SubGrupoModel subCombo;
    private void alterarProduto() {
        if (verificarCampos() && validaEstoque()) {

            ItemDbGrid hashDbGrid1 = (ItemDbGrid) jcb_grupo.getSelectedItem();
            grupoCombo = (GrupoModel) hashDbGrid1.getObjeto();

            ItemDbGrid hashDbGrid2 = (ItemDbGrid) jcb_sub.getSelectedItem();
            subCombo = (SubGrupoModel) hashDbGrid2.getObjeto();
            
            ProdutoDAO produtoControl = new ProdutoDAO();
            this.objproduto.setNome_produto(jtf_nome.getText().trim());
            this.objproduto.setConcentraçao(jtf_concentração.getText().trim());
            this.objproduto.setEstoque_ideal(Integer.parseInt(jtf_estoqueIdeal.getText().trim()));
            this.objproduto.setEstoque_minimo(Integer.parseInt(jtf_estoqueMinimo.getText()));
            this.objproduto.setCod_produto(Integer.parseInt(jtf_codigo.getText()));
            this.objproduto.setGrupo(grupoCombo);
            this.objproduto.setUnidade(unidadeCombo);
            this.objproduto.setSubGrupo(subCombo);
            produtoControl.alterarProduto(this.objproduto);
            JOptionPane.showMessageDialog(null, "Cadastro Alterado com sucesso");
            retornaJanelaPai();
        }

    }

    public void verificaCadastro() {
        ProdutoDAO prod = new ProdutoDAO();
        produtos = prod.listarProduto(jtf_nome.getText().trim());
        validaCadastro(produtos);
    }

    public void validaCadastro(List<ProdutoModel> produto) {//verifica cadastro existente que retornou de uma lista

        if (produto.size() != 1) {
            alterarProduto();
        } else {
            jtf_nome.requestFocus();
            JOptionPane.showMessageDialog(null, "Produto existente");

        }
    }

    public boolean verificarCampos() {
        String msgERRO = "Preencha os campos obrigatórios:\n";
        Integer estoqueIdeal = 0;
        Integer estoqueMínimo = 0;
        estoqueIdeal = Integer.parseInt(jtf_estoqueIdeal.getText());
        estoqueMínimo = Integer.parseInt(jtf_estoqueMinimo.getText());
        if (jtf_nome.getText().trim().equals("")) {
            msgERRO = msgERRO + " *Descrição\n";
        }
        if (jcb_grupo.getSelectedIndex() == 0) {
            msgERRO = msgERRO + " *Grupo\n";
        }
        if (jcb_unidade.getSelectedIndex() == 0) {
            msgERRO = msgERRO + " *Unidade\n";
        }
        if (jtf_estoqueIdeal.getText().trim().equals("")) {
            msgERRO = msgERRO + " *Estoque Ideal\n";
        }
        if (jtf_estoqueMinimo.getText().trim().equals("")) {
            msgERRO = msgERRO + " *Estoque Minimo\n";
        } else if (estoqueIdeal < estoqueMínimo) {
            JOptionPane.showMessageDialog(null, "Estoque ideal menor que estoque mínimo");
            jtf_estoqueIdeal.requestFocus();
            return false;
        }

        if (!msgERRO.equals("Preencha os campos obrigatórios:\n")) {
            JOptionPane.showMessageDialog(this, msgERRO);
            jtf_nome.requestFocus();
            return false;
        } else {
            return true;
        }

    }

    public void retornaJanelaPai() {
        janelapai.setEnabled(true);
        janelapai.setVisible(true);
        janelapai.request();
        this.setVisible(false);
        janelapai.listaProduto();
    }

    public void setStatusTela(boolean status) {
        if (status) {
            this.setVisible(status);
        }
        this.setEnabled(status);
    }

    public boolean validaEstoque() {
        Integer estoqueIdeal = 0;
        Integer estoqueMínimo = 0;
        estoqueIdeal = Integer.parseInt(jtf_estoqueIdeal.getText());
        estoqueMínimo = Integer.parseInt(jtf_estoqueMinimo.getText());
        if (estoqueIdeal < estoqueMínimo) {
            JOptionPane.showMessageDialog(null, "Estoque ideal menor que estoque mínimo");
            jtf_estoqueIdeal.requestFocus();
            return false;
        }
        return true;
    }
    List<GrupoModel> grupos;

    public void listarGrupo() {
        GrupoDAO grup = new GrupoDAO();
        grupos = grup.listarGrupos();
        mostraGrupos(grupos);
    }

    public void mostraGrupos(List<GrupoModel> grupos) {
        if (grupos.size() == 0) {
            JOptionPane.showMessageDialog(this, "Nenhum grupo encontrado");

        } else {
            for (int i = 0; i < grupos.size(); i++) {//ou i<destino.size() para retornar todos
                GrupoModel grupoModel = new GrupoModel();
                grupoModel.setCod_grupo(grupos.get(i).getCod_grupo());
                grupoModel.setDesc_grupo(grupos.get(i).getDesc_grupo());

                ItemDbGrid hashDbGrid = new ItemDbGrid(grupoModel, grupoModel.getDesc_grupo());
                jcb_grupo.addItem(hashDbGrid);
                //Object item = jcb_grupo.getModel().getElementAt(i);
                //System.out.println(item);
                S20BinaryLookup comb = new S20BinaryLookup(jcb_grupo);
//                AutoCompletion auto = new AutoCompletion(jcb_grupo);
            }
        }
    }
    List<UnidadeModel> unidades;

    public void listarUnidade() {
        UnidadeDAO unid = new UnidadeDAO();
        unidades = unid.listarUnidades();
        mostraUnidades(unidades);
    }

    public void mostraUnidades(List<UnidadeModel> unidades) {
        if (unidades.size() == 0) {
            JOptionPane.showMessageDialog(this, "Nenhum grupo encontrado");

        } else {
            for (int i = 0; i < unidades.size(); i++) {//ou i<destino.size() para retornar todos
                UnidadeModel unidadeModel = new UnidadeModel();
                unidadeModel.setCod_unidade(unidades.get(i).getCod_unidade());
                unidadeModel.setDesc_unidade(unidades.get(i).getDesc_unidade());
                unidadeModel.setSigla_unidade(unidades.get(i).getSigla_unidade());

                ItemDbGrid hashDbGrid = new ItemDbGrid(unidadeModel, unidadeModel.getSigla_unidade());
                jcb_unidade.addItem(hashDbGrid);
                // Object item = jcb_unidade.getModel().getElementAt(i);
                //System.out.println(item);
                S20BinaryLookup comb = new S20BinaryLookup(jcb_unidade);
//                AutoCompletion auto = new AutoCompletion(jcb_grupo);
            }
        }
    }
    List<SubGrupoModel> subgrupos;

    public void listarItem() {
        jcb_sub.removeAllItems();
        
        ItemDbGrid hashDbGrid = (ItemDbGrid) jcb_grupo.getSelectedItem();
        grupoCombo = (GrupoModel) hashDbGrid.getObjeto();


        GrupoDAO controlGrupo = new GrupoDAO();
        Integer codgrupo;
        codgrupo = grupoCombo.getCod_grupo();
        
        subgrupos = controlGrupo.listarItens(codgrupo);
        mostrarItens(subgrupos);
        
    }
    public void listarItem(GrupoModel grupo) {
        jcb_sub.removeAllItems();
//        
//        ItemDbGrid hashDbGrid = (ItemDbGrid) jcb_grupo.getSelectedItem();
//        grupoCombo = (GrupoModel) hashDbGrid.getObjeto();


        GrupoDAO controlGrupo = new GrupoDAO();
        Integer codgrupo;
        codgrupo = grupo.getCod_grupo();
        
        subgrupos = controlGrupo.listarItens(codgrupo);
        mostrarItens(subgrupos);
        
    }

    public void mostrarItens(List<SubGrupoModel> subgrupos) {

        if (subgrupos.size() == 0) {
            // JOptionPane.showMessageDialog(this, "Nenhum subgrupo encontrado");
        } else {

            String preço = null;

            for (int i = 0; i < subgrupos.size(); i++) {

                //ou i<destino.size() para retornar todos
                SubGrupoModel subGrupo = new SubGrupoModel();
                subGrupo.setIdSubGrupo(subgrupos.get(i).getIdSubGrupo());
                subGrupo.setDescSubGrupo(subgrupos.get(i).getDescSubGrupo());

                ItemDbGrid hashDbGrid = new ItemDbGrid(subGrupo, subGrupo.getDescSubGrupo());
                jcb_sub.addItem(hashDbGrid);
                //    AutoCompletion auto = new AutoCompletion(jcb_sub);


            }
            //   JOptionPane.showMessageDialog(null, preço);
        }


//                S20BinaryLookup comb = new S20BinaryLookup(jcb_grupo);
    }
}
