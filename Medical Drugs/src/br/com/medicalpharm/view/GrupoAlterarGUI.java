/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GrupoAlterarGUI.java
 *
 * Created on 23/05/2011, 22:34:57
 */
package br.com.medicalpharm.view;

import br.com.medicalpharm.dao.GrupoDAO;
import br.com.medicalpharm.model.GrupoModel;
import br.com.medicalpharm.model.SubGrupoModel;
import br.com.medicalpharm.util.LimitadorTexto;
import br.com.medicalpharm.util.UnaccentedDocument;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author ALENCAR
 */
public class GrupoAlterarGUI extends javax.swing.JFrame {

    public GrupoGUI janelapai;
    public GrupoModel objgrupo;

    /** Creates new form GrupoAlterarGUI */
    public GrupoAlterarGUI() {
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
    GrupoModel grupo = new GrupoModel();

    GrupoAlterarGUI(GrupoModel grupo, SubGrupoModel subgrupo) {
        this.objgrupo = grupo;
        initComponents();
        jtf_cod_grupo.setText(String.valueOf(grupo.getCod_grupo()));
        jtf_desc_grupo.setText(String.valueOf(grupo.getDesc_grupo()));
       
        jtf_codSub.setText(String.valueOf(subgrupo.getIdSubGrupo()));
        jtf_SubDesc.setText(String.valueOf(subgrupo.getDescSubGrupo()));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jtf_cod_grupo = new javax.swing.JTextField();
        jtf_desc_grupo = new javax.swing.JTextField(new LimitadorTexto(45), "",10);
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jb_cancelar = new javax.swing.JButton();
        jb_salvar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jtf_SubDesc = new javax.swing.JTextField();
        jtf_codSub = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterando grupo");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));
        jPanel2.setName("jPanel2"); // NOI18N

        jtf_cod_grupo.setEditable(false);
        jtf_cod_grupo.setName("jtf_cod_grupo"); // NOI18N

        jtf_desc_grupo.setDocument(new UnaccentedDocument());
        jtf_desc_grupo.setName("jtf_desc_grupo"); // NOI18N
        jtf_desc_grupo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtf_desc_grupoFocusGained(evt);
            }
        });
        jtf_desc_grupo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf_desc_grupoKeyPressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel2.setText("Código");
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel3.setText("Descrição");
        jLabel3.setName("jLabel3"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtf_desc_grupo, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(jtf_cod_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(7, 7, 7)
                .addComponent(jtf_cod_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtf_desc_grupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jb_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/exit.png"))); // NOI18N
        jb_cancelar.setText("Cancelar");
        jb_cancelar.setName("jb_cancelar"); // NOI18N
        jb_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelarActionPerformed(evt);
            }
        });

        jb_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/gravar_registro.gif"))); // NOI18N
        jb_salvar.setText("Salvar");
        jb_salvar.setName("jb_salvar"); // NOI18N
        jb_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_salvarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Sub-Grupo"));
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("Descrição");
        jLabel4.setName("jLabel4"); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jtf_SubDesc.setDocument(new UnaccentedDocument());
        jtf_SubDesc.setName("jtf_SubDesc"); // NOI18N
        jtf_SubDesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf_SubDescKeyPressed(evt);
            }
        });
        jPanel1.add(jtf_SubDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 480, -1));

        jtf_codSub.setEditable(false);
        jtf_codSub.setName("jtf_codSub"); // NOI18N
        jPanel1.add(jtf_codSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 90, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12));
        jLabel5.setText("Código");
        jLabel5.setName("jLabel5"); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jb_salvar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jb_cancelar))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_salvar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-572)/2, (screenSize.height-378)/2, 572, 378);
    }// </editor-fold>//GEN-END:initComponents

    private void jb_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salvarActionPerformed
        alteraGrupo();
}//GEN-LAST:event_jb_salvarActionPerformed

    private void jb_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelarActionPerformed
        janelapai.setEnabled(true);
        janelapai.setVisible(true);
        janelapai.request();
        setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jb_cancelarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        janelapai.setEnabled(true);
        janelapai.setVisible(true);
        janelapai.request();
        setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void jtf_desc_grupoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_desc_grupoKeyPressed
            jtf_desc_grupo.addKeyListener(new KeyAdapter() {  
      public void keyReleased(KeyEvent evt) {  
        if (evt.getKeyCode() != KeyEvent.VK_HOME) {  
          String s = jtf_desc_grupo.getText();  
          jtf_desc_grupo.setText(s.toUpperCase());  
        }  
      }  
    }); 
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_desc_grupoKeyPressed

    private void jtf_desc_grupoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtf_desc_grupoFocusGained
        jtf_desc_grupo.setInputVerifier(new InputVerifier() {

            public boolean verify(JComponent input) {
                if (jtf_desc_grupo.getText().equals("(  )    -    ")) {
                    JOptionPane.showMessageDialog(null, "Informe a descrição do grupo");
                    jtf_desc_grupo.requestFocus();
                    return false;
                } else {
                    return true;
                }
            }
        });
        // TODO add your handling code here:
    }//GEN-LAST:event_jtf_desc_grupoFocusGained

private void jtf_SubDescKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_SubDescKeyPressed
            jtf_SubDesc.addKeyListener(new KeyAdapter() {  
      public void keyReleased(KeyEvent evt) {  
        if (evt.getKeyCode() != KeyEvent.VK_HOME) {  
          String s = jtf_SubDesc.getText();  
          jtf_SubDesc.setText(s.toUpperCase());  
        }  
      }  
    }); 
    // TODO add your handling code here:
}//GEN-LAST:event_jtf_SubDescKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new GrupoAlterarGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jb_cancelar;
    private javax.swing.JButton jb_salvar;
    private javax.swing.JTextField jtf_SubDesc;
    private javax.swing.JTextField jtf_codSub;
    private javax.swing.JTextField jtf_cod_grupo;
    private javax.swing.JTextField jtf_desc_grupo;
    // End of variables declaration//GEN-END:variables

    private void alteraGrupo() {
        if (verificarCampos()) {
            GrupoModel grupo = new GrupoModel();
            SubGrupoModel sub = new SubGrupoModel();
            
            grupo.setCod_grupo(Integer.parseInt(jtf_cod_grupo.getText().trim()));
            grupo.setDesc_grupo(jtf_desc_grupo.getText().trim());
            
            sub.setIdSubGrupo(Integer.parseInt(jtf_codSub.getText().trim()));
            sub.setDescSubGrupo(jtf_SubDesc.getText().trim());
            
            GrupoDAO grupoControl = new GrupoDAO();
            
            grupoControl.alterarGrupo(grupo,sub);
            JOptionPane.showMessageDialog(null, "Cadastro alterado com sucesso");
            retornaJanelaPai();
        }else {
            JOptionPane.showMessageDialog(null, "Erro ao alterar");
        }
    }

    public boolean verificarCampos() {
        String msgERRO = "Preencha os campos obrigatórios:\n";

        if (jtf_desc_grupo.getText().trim().equals("")) {
            msgERRO = msgERRO + " *Descrição do grupo\n";
        }
        if(jtf_SubDesc.getText().trim().equals("")){
             msgERRO = msgERRO + " *Descrição do sub-grupo\n";
        }
        if (!msgERRO.equals("Preencha os campos obrigatórios:\n")) {
            JOptionPane.showMessageDialog(this, msgERRO);
            return false;
        } else {
            return true;
        }
    }

    public void retornaJanelaPai() {
        janelapai.listarGrupo();
        janelapai.setEnabled(true);
        janelapai.setVisible(true);
        janelapai.request();
        setVisible(false);
    }
}
