/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.medicalpharm.view;

import br.com.medicalpharm.dao.ProdutoDAO;
import br.com.medicalpharm.dao.RequisicoesDAO;
import br.com.medicalpharm.dao.RequisicoesProdutoDAO;
import br.com.medicalpharm.dao.UsuarioRequisitanteDAO;
import br.com.medicalpharm.model.RequisicoesModel;
import br.com.medicalpharm.model.RequisicoesProdutoModel;
import br.com.medicalpharm.relatorios.Relatorios;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author willi
 */
public class RequisicaoDevolverGUI extends javax.swing.JFrame implements RequisicaoDevolverGUI_Interface{

    /**
     * Creates new form requisicaoDevolver
     */
    public RequisicaoDevolverGUI() {
        initComponents();        
        this.setLocationRelativeTo(null);

    }
   
    //DefaultTableModel Jt_requisicoesProduto = new DefaultTableModel(null, new String[]{"Usuario Requisitante","Produto","Saldo","Devolver"});
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jb_salvar = new javax.swing.JButton();
        jb_cancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Devolução");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_salvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/gravar_registro.gif"))); // NOI18N
        jb_salvar.setText("Salvar");
        jb_salvar.setFocusable(false);
        jb_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_salvarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_salvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 6, -1, 35));

        jb_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/medicalpharm/image/exit.png"))); // NOI18N
        jb_cancelar.setText("Cancelar");
        jb_cancelar.setFocusable(false);
        jb_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jb_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 6, -1, 35));

        jTable1.setUpdateSelectionOnSort(false);
        jTable1.setVerifyInputWhenFocusTarget(false);
        jTable1.setDefaultEditor(Object.class, null);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "código Requisicao", "Produto", "Saldo", "Qtd"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoscrolls(false);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setDropMode(javax.swing.DropMode.ON);
        jTable1.setFocusCycleRoot(true);
        jTable1.setVerifyInputWhenFocusTarget(false);
        jTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                devolverProduto(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(90);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(115);
            jTable1.getColumnModel().getColumn(2).setMinWidth(70);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(90);
            jTable1.getColumnModel().getColumn(3).setMinWidth(70);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(90);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 59, 532, 223));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_salvarActionPerformed
        cadastrarDevolucao();
    }//GEN-LAST:event_jb_salvarActionPerformed

    private void jb_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_cancelarActionPerformed
//        ((DefaultTableModel) jTable1.getModel()).setRowCount(0);
//        jTable1.updateUI();
//        this.setVisible(false);
//        janelaPaim.setEnabled(true);
//        janelaPaim.setVisible(true);;

        janelaPai.setEnabled(true);
        setVisible(false);
        

    }//GEN-LAST:event_jb_cancelarActionPerformed

    private void devolverProduto(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_devolverProduto
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {  
            this.devolver = new RequisicaoQtdDevolvidaGUI();
            abrirDevolucao(n);            
       }   
    }//GEN-LAST:event_devolverProduto

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        janelaPai.setEnabled(true);
        setVisible(false);
    }//GEN-LAST:event_formWindowClosed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RequisicaoDevolverGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RequisicaoDevolverGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RequisicaoDevolverGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RequisicaoDevolverGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RequisicaoDevolverGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jb_cancelar;
    private javax.swing.JButton jb_salvar;
    // End of variables declaration//GEN-END:variables
     
    RequisicaoListaGUI janelaPai;
    boolean n  = false;
    private int index;
    public String codigo = null;
    public void listaProdutosRequicao(){
        ProdutoDAO buscarProduto = new ProdutoDAO();
        UsuarioRequisitanteDAO buscarRequisitante = new UsuarioRequisitanteDAO();                           
        RequisicoesProdutoDAO d = new RequisicoesProdutoDAO();
        ArrayList<RequisicoesProdutoModel> itens = d.buscarRequisicaoPorCodigo(codigo);       
        int a = 0;
        DefaultTableModel row = (DefaultTableModel) jTable1.getModel();
        for (int i = 0; i < itens.size(); i++) {            
            if(itens.get(i).getSaldo() != 0){                                               
                row.addRow(new Object[]{buscarRequisitante.buscarRequisitanteCodigo(itens.get(i).getCodigoRequisicao()),buscarProduto.listarProdutoCodigo(itens.get(i).getProduto()),itens.get(i).getSaldo()});
                a++;
            }
        }
    }
                
    public void pegarQtd(String qtd,int index){         
        try{
            jTable1.setValueAt(qtd, index, 3);        
            moverLinha(index+1);                 
            this.devolver = new RequisicaoQtdDevolvidaGUI();
            moverLinha(index+1);        
            completeTask();            
        }catch(Exception ex){
           System.out.println("Erro:"+ex);            
        }   
    }
    
    public void inicioTabela(){
        jTable1.setRowSelectionInterval(0,0);
    }
    
    public List<RequisicoesProdutoModel> criarListaProdutos(){
        ProdutoDAO buscarProduto = new ProdutoDAO();
        DefaultTableModel row = (DefaultTableModel) jTable1.getModel();
        List<RequisicoesProdutoModel> produtosList = new ArrayList();
        RequisicoesProdutoModel produtos = null;
        for (int i = 0; i < row.getRowCount(); i++) {    
                try{
                produtos = new RequisicoesProdutoModel();
                produtos.setTipo("D");                
                produtos.setCodigoRequisicao(Integer.parseInt(codigo));
                produtos.setProduto(buscarProduto.listarProdutoDesc(row.getValueAt(i, 1).toString()));
                produtos.setQtd(Integer.parseInt(row.getValueAt(i, 3).toString()));            
                produtos.setData_devolucao(new java.sql.Date(new java.util.Date().getTime()));
                produtosList.add(produtos);
                
                ProdutoDAO pro = new ProdutoDAO(); 
                int produtoID = Integer.parseInt(buscarProduto.listarProdutoDesc(row.getValueAt(i, 1).toString()));                
                pro.updateQuatidade(Integer.parseInt(row.getValueAt(i, 3).toString()),produtoID , "+");
               
                }catch(Exception ex){
                    System.out.println("erro:"+ex);
                }
        }
        return produtosList;                
    }
    
    public void cadastrarDevolucao(){
        try{
            RequisicoesModel novaRequisicao = new RequisicoesModel();
            RequisicoesDAO cadastrar = new  RequisicoesDAO();
            cadastrar.cadastrarNovaRequisicao(novaRequisicao, criarListaProdutos(),true);
            JOptionPane.showMessageDialog(null, "Devolução concluida!");
            
            int selectedOption = JOptionPane.showConfirmDialog(this, "Deseja imprimir relatorio ?", "Atenção", JOptionPane.YES_NO_OPTION);
            if (selectedOption == JOptionPane.YES_NO_OPTION) {
                Relatorios relatorio = new Relatorios();
                relatorio.relatorioDevolucaoRequisicao(Integer.parseInt(codigo), new java.sql.Date(new java.util.Date().getTime()));                
            }
            janelaPai.setEnabled(true);
                janelaPai.listarRequisicoesAction();
                setVisible(false);
        }catch(Exception ex){
            
        }
    }
    
    RequisicaoQtdDevolvidaGUI devolver = null;
    public void abrirDevolucao(boolean novo){       
        try{                           
                devolver.index = jTable1.getSelectedRow();
                devolver.saldo = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
                devolver.setDevolver(this);
                devolver.foco(); 
                if(novo){
                    moverLinha(devolver.index-1);
                }
                devolver.setVisible(true);                                       
        }catch(Exception ec){            
            System.out.println("cont tabela:"+jTable1.getSelectedRow());                    
            
        }
    }
      
    private void moverLinha(int index){        
        try{                  
            System.out.println("index:"+index);
            if(index == -1){
                jTable1.setRowSelectionInterval(0,1);
                jTable1.removeRowSelectionInterval(1, 1);
            }else{                
                jTable1.setRowSelectionInterval(index,index);                        
            }
        }catch(Exception e){
            jTable1.setRowSelectionInterval(0,0);            
        }
    }
    
    private void completeTask() {
        try {
            Thread.sleep(1000);       
            System.out.println("1 segundo");
            abrirDevolucao(false);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
   

}

