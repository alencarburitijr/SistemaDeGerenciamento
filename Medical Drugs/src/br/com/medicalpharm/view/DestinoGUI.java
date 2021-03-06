/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * DestinoGUI.java
 *
 * Created on 02/06/2011, 00:56:52
 */
package br.com.medicalpharm.view;

import br.com.medicalpharm.dao.DestinoDAO;
import br.com.medicalpharm.model.ArmazemModel;
import java.awt.event.KeyEvent;
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
 * @author ALENCAR
 */
public class DestinoGUI extends javax.swing.JFrame {

    String tipoCadastro;
    public TelaPrincipal janelapai;
    List<ArmazemModel> destinos;

    /** Creates new form DestinoGUI */
    public DestinoGUI() {
        initComponents();
        listarDestino();
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
    DefaultTableModel tmDestino = new DefaultTableModel(null, new String[]{"Código", "Descrição"});
    ListSelectionModel lsmDestino;

    public void setTela(String permissao) {
        if (permissao.equals("usuario")) {
            jb_novo.setEnabled(false);
            jb_alterar.setEnabled(false);
            jb_excluir.setEnabled(false);
        } else {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jrb_codigo = new javax.swing.JRadioButton();
        jrb_detalhado = new javax.swing.JRadioButton();
        jrb_descricao = new javax.swing.JRadioButton();
        jl_pesquisar_destino = new javax.swing.JLabel();
        jb_buscar = new javax.swing.JButton();
        jtf_pesquisar_destino = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_pesquisar = new javax.swing.JTable();
        jb_excluir = new javax.swing.JButton();
        jb_sair = new javax.swing.JButton();
        jb_novo = new javax.swing.JButton();
        jb_alterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento de almoxarifado");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultas"));
        jPanel1.setName("jPanel1"); // NOI18N

        buttonGroup1.add(jrb_codigo);
        jrb_codigo.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jrb_codigo.setSelected(true);
        jrb_codigo.setText("Código");
        jrb_codigo.setName("jrb_codigo"); // NOI18N

        buttonGroup1.add(jrb_detalhado);
        jrb_detalhado.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jrb_detalhado.setText("Específica");
        jrb_detalhado.setName("jrb_detalhado"); // NOI18N

        buttonGroup1.add(jrb_descricao);
        jrb_descricao.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jrb_descricao.setText("Descrição");
        jrb_descricao.setName("jrb_descricao"); // NOI18N

        jl_pesquisar_destino.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jl_pesquisar_destino.setText("Parâmetro");
        jl_pesquisar_destino.setName("jl_pesquisar_destino"); // NOI18N

        jb_buscar.setText("Ir");
        jb_buscar.setName("jb_buscar"); // NOI18N
        jb_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_buscarActionPerformed(evt);
            }
        });

        jtf_pesquisar_destino.setName("jtf_pesquisar_destino"); // NOI18N
        jtf_pesquisar_destino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtf_pesquisar_destinoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jrb_codigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrb_descricao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jrb_detalhado))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jl_pesquisar_destino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtf_pesquisar_destino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jb_buscar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrb_codigo)
                    .addComponent(jrb_descricao)
                    .addComponent(jrb_detalhado))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_pesquisar_destino)
                    .addComponent(jtf_pesquisar_destino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_buscar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jt_pesquisar.setModel(tmDestino);
        jt_pesquisar.setUpdateSelectionOnSort(false);

        jt_pesquisar.setVerifyInputWhenFocusTarget(false);
        jt_pesquisar.setDefaultEditor(Object.class, null);
        jt_pesquisar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                if(e.getClickCount() == 2){
                    alterar();
                }}});
                jt_pesquisar.setDoubleBuffered(true);
                jt_pesquisar.setDragEnabled(true);
                jt_pesquisar.setName("jt_pesquisar"); // NOI18N
                jt_pesquisar.getTableHeader().setReorderingAllowed(false);
                jt_pesquisar.setModel(tmDestino);
                jt_pesquisar.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                lsmDestino = jt_pesquisar.getSelectionModel();
                /*
                lsmDestino.addListSelectionListener(new ListSelectionListener() {
                    public void valueChanged(ListSelectionEvent e){
                        if (! e.getValueIsAdjusting()){
                            tbDestinoLinhaSelecionada(jt_pesquisar);
                        }
                    }
                });*/
                jt_pesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
                    public void keyPressed(java.awt.event.KeyEvent evt) {
                        jt_pesquisarKeyPressed(evt);
                    }
                });
                jScrollPane1.setViewportView(jt_pesquisar);

                jb_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/delete.gif"))); // NOI18N
                jb_excluir.setText("Excluir");
                jb_excluir.setName("jb_excluir"); // NOI18N
                jb_excluir.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jb_excluirActionPerformed(evt);
                    }
                });

                jb_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/exit.png"))); // NOI18N
                jb_sair.setText("Sair");
                jb_sair.setName("jb_sair"); // NOI18N
                jb_sair.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jb_sairActionPerformed(evt);
                    }
                });

                jb_novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/novo_registro.gif"))); // NOI18N
                jb_novo.setText("Novo");
                jb_novo.setName("jb_novo"); // NOI18N
                jb_novo.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jb_novoActionPerformed(evt);
                    }
                });

                jb_alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/alterar_registro.gif"))); // NOI18N
                jb_alterar.setText("Alterar");
                jb_alterar.setName("jb_alterar"); // NOI18N
                jb_alterar.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jb_alterarActionPerformed(evt);
                    }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(jb_novo)
                                .addGap(5, 5, 5)
                                .addComponent(jb_alterar)
                                .addGap(5, 5, 5)
                                .addComponent(jb_excluir)
                                .addGap(5, 5, 5)
                                .addComponent(jb_sair)))
                        .addContainerGap(27, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                    layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_novo)
                            .addComponent(jb_alterar)
                            .addComponent(jb_excluir)
                            .addComponent(jb_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(29, Short.MAX_VALUE))
                );

                setSize(new java.awt.Dimension(616, 374));
                setLocationRelativeTo(null);
            }// </editor-fold>//GEN-END:initComponents

    private void jb_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_novoActionPerformed
        DestinoCadastroGUI des = new DestinoCadastroGUI();
        des.janelapai = this;
        des.setVisible(true);
        this.setEnabled(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_novoActionPerformed

    private void jb_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_alterarActionPerformed
        alterar();
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_alterarActionPerformed
    public void alterar() {
        ArmazemModel desti = tbDestinoLinhaSelecionada(jt_pesquisar);
        if (desti != null) {
            DestinoAlterarGUI destinoAltera = new DestinoAlterarGUI(desti);
            destinoAltera.janelapai = this;
            destinoAltera.setVisible(true);
            this.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um armazém");
            jtf_pesquisar_destino.requestFocus();
        }
    }
    private void jb_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_excluirActionPerformed
        excluiDestino();
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_excluirActionPerformed

    private void jb_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_sairActionPerformed
        setVisible(false);
        telaPrincipal.setStatusTela(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jb_sairActionPerformed

    private void jb_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_buscarActionPerformed
        if (jrb_codigo.isSelected() == true) {
            listarDestinoCodigo();
        } else if (jrb_descricao.isSelected() == true) {
            listarDestinoDescricao();
        } else if (jrb_detalhado.isSelected() == true) {
            listarDestino();
        } else {
            listarDestino();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jb_buscarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        setVisible(false);
        telaPrincipal.setStatusTela(true);
    }//GEN-LAST:event_formWindowClosed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jtf_pesquisar_destino.requestFocus();
        // TODO add your handling code here:

        jt_pesquisar.getColumnModel().getColumn(0).setMaxWidth(80);
        jt_pesquisar.getColumnModel().getColumn(0).setMinWidth(80);
        jt_pesquisar.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(80);
        jt_pesquisar.getTableHeader().getColumnModel().getColumn(0).setMinWidth(80);

        jt_pesquisar.getColumnModel().getColumn(1).setMaxWidth(520);
        jt_pesquisar.getColumnModel().getColumn(1).setMinWidth(520);
        jt_pesquisar.getTableHeader().getColumnModel().getColumn(1).setMaxWidth(520);
        jt_pesquisar.getTableHeader().getColumnModel().getColumn(1).setMinWidth(520);
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jtf_pesquisar_destinoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtf_pesquisar_destinoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            listarDestino();
            jt_pesquisar.addRowSelectionInterval(0, 0);
        }

    }//GEN-LAST:event_jtf_pesquisar_destinoKeyPressed

    private void jt_pesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_pesquisarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ArmazemModel desti = tbDestinoLinhaSelecionada(jt_pesquisar);
            if (desti != null) {
                DestinoAlterarGUI destinoAltera = new DestinoAlterarGUI(desti);
                destinoAltera.janelapai = this;
                destinoAltera.setVisible(true);
            }

        }
    }//GEN-LAST:event_jt_pesquisarKeyPressed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new DestinoGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_alterar;
    private javax.swing.JButton jb_buscar;
    private javax.swing.JButton jb_excluir;
    private javax.swing.JButton jb_novo;
    private javax.swing.JButton jb_sair;
    private javax.swing.JLabel jl_pesquisar_destino;
    private javax.swing.JRadioButton jrb_codigo;
    private javax.swing.JRadioButton jrb_descricao;
    private javax.swing.JRadioButton jrb_detalhado;
    private javax.swing.JTable jt_pesquisar;
    private javax.swing.JTextField jtf_pesquisar_destino;
    // End of variables declaration//GEN-END:variables
    private TelaPrincipal_Interface telaPrincipal;
    //Recebendo tela como parametro para atualização apos pesquisa

    public void setTelaPrincipal(TelaPrincipal_Interface telaPrincipal) {
        this.telaPrincipal = telaPrincipal;
    }

    public ArmazemModel tbDestinoLinhaSelecionada(JTable tb) {
        ArmazemModel dest = null;
        if (tb.getSelectedRow() != -1) {
            dest = new ArmazemModel();
            dest.setCod_destino(destinos.get(tb.getSelectedRow()).getCod_destino());
            dest.setDesc_destino(destinos.get(tb.getSelectedRow()).getDesc_destino());

        }
        return dest;
    }
    ArmazemModel destino = new ArmazemModel();

    public void request() {
        jtf_pesquisar_destino.requestFocus();
        // TODO add your handling code here:
    }

    public ArmazemModel removeDestino(JTable tb) {
        if (tb.getSelectedRow() != -1) {
            int selectedOption = JOptionPane.showConfirmDialog(this, "Deseja excluir ?", "Atenção", JOptionPane.YES_NO_OPTION);
            if (selectedOption == JOptionPane.YES_NO_OPTION) {
                DestinoDAO destinoControl = new DestinoDAO();
                destino.setCod_destino(destinos.get(tb.getSelectedRow()).getCod_destino());
                if (destinoControl.excluiDestino(destino)) {
                    tmDestino.removeRow(tb.getSelectedRow());
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um armazém");
        }
        return destino;
    }

    public void excluiDestino() {
        removeDestino(jt_pesquisar);
    }

    public final void listarDestino() {
        DestinoDAO dest = new DestinoDAO();
        destinos = dest.listarDestino("%" + jtf_pesquisar_destino.getText().trim() + "%");
        mostraDestinos(destinos);
    }

    private void listarDestinoCodigo() {
        if (jtf_pesquisar_destino.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Informe um código");
        } else {
            DestinoDAO dest = new DestinoDAO();
            destinos = dest.listarDestinoCodigo(jtf_pesquisar_destino.getText().trim());
            mostraDestinos(destinos);
        }
    }

    private void listarDestinoDescricao() {
        DestinoDAO dest = new DestinoDAO();
        destinos = dest.listarDestinoDescricao(jtf_pesquisar_destino.getText().trim() + "%");
        mostraDestinos(destinos);
    }

    public void mostraDestinos(List<ArmazemModel> destino) {
        while (tmDestino.getRowCount() > 0) {
            tmDestino.removeRow(0);
        }

        if (destino.size() == 0) {
            JOptionPane.showMessageDialog(this, "Nenhum armazém encontrado");

        } else {


            String[] campos = new String[]{null, null};
            for (int i = 0; i < destino.size(); i++) {//ou i<destino.size() para retornar todos

                tmDestino.addRow(campos);

                tmDestino.setValueAt(destino.get(i).getCod_destino(), i, 0);
                tmDestino.setValueAt(destino.get(i).getDesc_destino(), i, 1);
            }
        }

    }
}
