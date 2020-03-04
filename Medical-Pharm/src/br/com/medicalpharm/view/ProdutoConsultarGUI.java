/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ConsultarProdutoGUI.java
 *
 * Created on 02/06/2011, 03:08:41
 */
package br.com.medicalpharm.view;

import br.com.medicalpharm.dao.ProdutoDAO;
import br.com.medicalpharm.model.ProdutoModel;
import br.com.medicalpharm.util.ItemDbGrid;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class ProdutoConsultarGUI extends javax.swing.JFrame {

    EntradaCadastraGUI janelapai;
    SaidaEstoqueGUI janelapai2;
    AjusteEstoqueGUI janelapai3;
    ArmazemCadastroGUI janelapai4;

    public ProdutoConsultarGUI() {
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


        janelapai = null;
        janelapai2 = null;
        janelapai3 = null;
        janelapai4 = null;

    }
    List<ProdutoModel> produtos;
    DefaultTableModel tmProduto = new DefaultTableModel(null, new String[]{"Código", "Produto", "Concentração", "Estoque"});
    ListSelectionModel lsmProduto;

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jb_cancelar = new javax.swing.JButton();
        jb_ok = new javax.swing.JButton();
        jb_novo1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Consulta Produto");
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

        jb_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/exit.png"))); // NOI18N
        jb_cancelar.setText("Cancelar");
        jb_cancelar.setName("jb_cancelar"); // NOI18N
        jb_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 110, 40));

        jb_ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/gravar_registro.gif"))); // NOI18N
        jb_ok.setText("OK");
        jb_ok.setName("jb_ok"); // NOI18N
        jb_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_okActionPerformed(evt);
            }
        });
        getContentPane().add(jb_ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 80, 40));

        jb_novo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/novo_registro.gif"))); // NOI18N
        jb_novo1.setText("Novo");
        jb_novo1.setName("jb_novo1"); // NOI18N
        jb_novo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_novo1ActionPerformed(evt);
            }
        });
        getContentPane().add(jb_novo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 110, 40));

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTable1.setUpdateSelectionOnSort(false);
        jTable1.setVerifyInputWhenFocusTarget(false);
        jTable1.setDefaultEditor(Object.class, null);
        jTable1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                if(e.getClickCount() == 2){
                    botaoOK(jTable1);

                }}});
                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    new Object [][] {

                    },
                    new String [] {
                        "Código", "Produto / Apresentação", "Nome Comercial", "Unid", "Estoque Atual"
                    }
                ) {
                    Class[] types = new Class [] {
                        java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
                    };
                    boolean[] canEdit = new boolean [] {
                        false, false, false, false, false
                    };

                    public Class getColumnClass(int columnIndex) {
                        return types [columnIndex];
                    }

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                    }
                });
                jTable1.setName("jTable1"); // NOI18N
                jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
                    public void keyPressed(java.awt.event.KeyEvent evt) {
                        jTable1KeyPressed(evt);
                    }
                });
                jScrollPane1.setViewportView(jTable1);
                jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
                jTable1.getColumnModel().getColumn(1).setPreferredWidth(180);
                jTable1.getColumnModel().getColumn(2).setPreferredWidth(150);
                jTable1.getColumnModel().getColumn(3).setPreferredWidth(10);
                jTable1.getColumnModel().getColumn(4).setPreferredWidth(10);

                getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 710, 330));

                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/product2.png"))); // NOI18N
                jLabel1.setName("jLabel1"); // NOI18N
                getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 60, 60));

                jLabel2.setFont(new java.awt.Font("Dialog", 0, 36));
                jLabel2.setText("Itens encontrados");
                jLabel2.setName("jLabel2"); // NOI18N
                getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

                java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
                setBounds((screenSize.width-783)/2, (screenSize.height-566)/2, 783, 566);
            }// </editor-fold>//GEN-END:initComponents

    private void jb_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelarActionPerformed
        setVisible(false);
        if ((janelapai != null)) {
            janelapai.setEnabled(true);
            janelapai.setVisible(true);
            //telaCadNota.setStatusTela(false);
        }

        if ((janelapai2 != null)) {
            janelapai2.setEnabled(true);
            janelapai2.setVisible(true);
            //telaSaidaEstoque.statusTela(true);
        }
        if ((janelapai3 != null)) {
            janelapai3.setEnabled(true);
            janelapai3.setVisible(true);
        }
        if ((janelapai4 != null)) {
            janelapai4.setEnabled(true);
            janelapai4.setVisible(true);
        }
}//GEN-LAST:event_jb_cancelarActionPerformed
    private EntradaCadastraGUI_InterFace telaCadNota;
    private SaidaEstoqueGUI_interface telaSaidaEstoque;
    private AjusteEstoqueGUI_Interface telaAjusteEstoque;
    private ArmazemCadastroGUI_Interface telaArmazemEstoque;

    private void jb_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_okActionPerformed
        botaoOK(jTable1);
}//GEN-LAST:event_jb_okActionPerformed
    public void botaoOK(JTable tb) {
        if(tb.getSelectedRow() != -1){
            setVisible(false);

        ProdutoModel prod = tbProdutoLinhaSelecionada(jTable1);
        if ((janelapai != null) && (prod != null)) {
            janelapai.setEnabled(true);
            janelapai.setVisible(true);
            telaCadNota.carregaProduto(prod);
            //telaCadNota.setStatusTela(false);
        }

        if ((janelapai2 != null) && (prod != null)) {
            janelapai2.setEnabled(true);
            janelapai2.setVisible(true);
            telaSaidaEstoque.carregaProduto(prod);
            //telaSaidaEstoque.statusTela(true);
        }
        if ((janelapai3 != null) && (prod != null)) {
            janelapai3.setEnabled(true);
            janelapai3.setVisible(true);
            telaAjusteEstoque.carregaProduto(prod);
            //telaSaidaEstoque.statusTela(true);        
        }
        if ((janelapai4 != null) && (prod != null)) {
            janelapai4.setEnabled(true);
            janelapai4.setVisible(true);
            telaArmazemEstoque.carregaProduto(prod);
            //telaSaidaEstoque.statusTela(true);

        }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione um produto");
        }
        
        
        
    }
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        setVisible(false);
        if ((janelapai != null)) {
            janelapai.setEnabled(true);
            janelapai.setVisible(true);
            //telaCadNota.setStatusTela(false);
        }

        if ((janelapai2 != null)) {
            janelapai2.setEnabled(true);
            janelapai2.setVisible(true);
            //telaSaidaEstoque.statusTela(true);
        }
        if ((janelapai3 != null)) {
            janelapai3.setEnabled(true);
            janelapai3.setVisible(true);
        }
        if ((janelapai4 != null)) {
            janelapai4.setEnabled(true);
            janelapai4.setVisible(true);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void jb_novo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_novo1ActionPerformed
        ProdutoCadastroGUI prod;
        try {
            prod = new ProdutoCadastroGUI();
            prod.janelapai2 = this;
            prod.setVisible(true);
            this.setEnabled(false);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

        // TODO add your handling code here:
}//GEN-LAST:event_jb_novo1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//        jt_pesquisar.getColumnModel().getColumn( 3 ).setMaxWidth( 60 );
//        jt_pesquisar.getColumnModel().getColumn( 3 ).setMinWidth( 60 );
//        jt_pesquisar.getTableHeader().getColumnModel().getColumn( 3 ).setMaxWidth( 60 );
//        jt_pesquisar.getTableHeader().getColumnModel().getColumn( 3 ).setMinWidth( 60 );
    }//GEN-LAST:event_formWindowOpened

private void jTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable1KeyPressed
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
//        if(jTable1.getSelectedRowCount()<1){                           
        botaoOK(jTable1);
        //      }
    }

    // TODO add your handling code here:
}//GEN-LAST:event_jTable1KeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ProdutoConsultarGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jb_cancelar;
    private javax.swing.JButton jb_novo1;
    private javax.swing.JButton jb_ok;
    // End of variables declaration//GEN-END:variables

    //Recebendo tela como parametro para atualização apos pesquisa
    public void setTelaCadNota(EntradaCadastraGUI_InterFace telaCadNota) {
        this.telaCadNota = telaCadNota;
    }

    public void setTelaSaidaEstoque(SaidaEstoqueGUI_interface telaSaidaEstoque) {
        this.telaSaidaEstoque = telaSaidaEstoque;
    }

    public void setTelaAjusteEstoque(AjusteEstoqueGUI_Interface telaAjusteEstoque) {
        this.telaAjusteEstoque = telaAjusteEstoque;
    }

    public void setTelaArmazemEstoque(ArmazemCadastroGUI_Interface telaArmazemEstoque) {
        this.telaArmazemEstoque = telaArmazemEstoque;
    }

    public ProdutoModel tbProdutoLinhaSelecionada(JTable tb) {
        ProdutoModel prod = null;
        if (tb.getSelectedRow() != -1) {
            prod = new ProdutoModel();
            prod.setCod_produto(produtos.get(tb.getSelectedRow()).getCod_produto());
            prod.setNome_produto(produtos.get(tb.getSelectedRow()).getNome_produto());
            prod.setConcentraçao(produtos.get(tb.getSelectedRow()).getConcentraçao());
            prod.setEstoque(produtos.get(tb.getSelectedRow()).getEstoque());
        }
        return prod;
    }

    public void listaProduto(String consulta) {
        if(janelapai2!=null){
            jb_novo1.setEnabled(false);
        }
        ProdutoDAO prod = new ProdutoDAO();
        produtos = prod.listarProd("%" + consulta + "%");
        mostraProduto(produtos,consulta);
    }
    public void listaProduto1(String consulta) {
        if(janelapai2!=null){
            jb_novo1.setEnabled(false);
        }
        ProdutoDAO prod = new ProdutoDAO();
        produtos = prod.listarProd1("%" + consulta + "%");
        mostraProduto(produtos,consulta);
    }
    public void mostraProduto(List<ProdutoModel> produtos, String consulta) {
        ((DefaultTableModel) jTable1.getModel()).setRowCount(0);
        jTable1.updateUI();

        if (produtos.size() == 0) {
           // listaProduto1(consulta);
            JOptionPane.showMessageDialog(this, "Nenhum produto encontrado");

        } else  {
            for (int i = 0; i < produtos.size(); i++) {
                ProdutoModel produto = new ProdutoModel();
                produto.setCod_produto(produtos.get(i).getCod_produto());
                produto.setNome_produto(produtos.get(i).getNome_produto());
                produto.setConcentraçao(produtos.get(i).getConcentraçao());
                produto.setEstoque(produtos.get(i).getEstoque());
                produto.setEstoque_ideal(produtos.get(i).getEstoque_ideal());
                produto.setEstoque_minimo(produtos.get(i).getEstoque_minimo());
                produto.setGrupo(produtos.get(i).getGrupo());
                produto.setUnidade(produtos.get(i).getUnidade());

                DefaultTableModel row = (DefaultTableModel) jTable1.getModel();
                ItemDbGrid hashDbGrid = new ItemDbGrid(produto, produto.getNome_produto());
                row.addRow(new Object[]{produto.getCod_produto(), hashDbGrid, produto.getConcentraçao(), produto.getUnidade().getSigla_unidade(), produto.getEstoque()});
            }
            jTable1.setSelectionMode(2);
        } 

    }

    public void mostra(List<ProdutoModel> produtos) {
        jb_novo1.setEnabled(false);
        this.produtos = produtos;
        ((DefaultTableModel) jTable1.getModel()).setRowCount(0);
        jTable1.updateUI();

        if (produtos.size() == 0) {
            JOptionPane.showMessageDialog(this, "Nenhum produto encontrado");

        } else {
            for (int i = 0; i < produtos.size(); i++) {
                ProdutoModel produto = new ProdutoModel();
                produto.setCod_produto(produtos.get(i).getCod_produto());
                produto.setNome_produto(produtos.get(i).getNome_produto());
                produto.setConcentraçao(produtos.get(i).getConcentraçao());
                produto.setEstoque(produtos.get(i).getEstoque());
                produto.setEstoque_ideal(produtos.get(i).getEstoque_ideal());
                produto.setEstoque_minimo(produtos.get(i).getEstoque_minimo());
                produto.setGrupo(produtos.get(i).getGrupo());
                produto.setUnidade(produtos.get(i).getUnidade());

                DefaultTableModel row = (DefaultTableModel) jTable1.getModel();
                ItemDbGrid hashDbGrid = new ItemDbGrid(produto, produto.getNome_produto());
                row.addRow(new Object[]{produto.getCod_produto(), hashDbGrid, produto.getConcentraçao(), produto.getUnidade().getSigla_unidade(), produto.getEstoque()});
            }
            jTable1.setSelectionMode(2);
        }
    }
}