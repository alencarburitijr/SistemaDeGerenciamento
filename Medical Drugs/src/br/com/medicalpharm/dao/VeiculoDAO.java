/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.medicalpharm.dao;

import br.com.medicalpharm.model.VeiculoModel;
import br.com.medicalpharm.util.Conexao;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author willi
 */
public class VeiculoDAO {
     
    java.sql.PreparedStatement pstm;
    ResultSet rs;
    
    private String cadastrarVeiculo = "INSERT INTO `veiculo`(`descricao`, `chassi`, `placa`) VALUES (?,?,?)";
    private String editarVeiculo = "UPDATE `veiculo` SET `descricao`= ?,`chassi`=?,`placa`= ? WHERE codigo = ?";
    private String listaVeiculos = "SELECT * FROM `veiculo` WHERE chassi LIKE ?";
    
    public List<VeiculoModel> listarVeiculos(String chassi){
        List<VeiculoModel> veiculo = new ArrayList();
        try{
            Conexao conexao = new Conexao();
            pstm = (PreparedStatement) conexao.conecta().prepareStatement(listaVeiculos);
            pstm.setString(1,"%"+chassi+"%");
            rs = pstm.executeQuery();
            VeiculoModel vei;
            while(rs.next()){
                vei = new VeiculoModel();
                vei.setCodigo(rs.getInt("codigo"));
                vei.setDescricao(rs.getString("descricao"));
                vei.setChassi(rs.getString("chassi"));
                vei.setPlaca(rs.getString("placa"));                
                veiculo.add(vei);
            }
            conexao.desconecta();
        }catch(Exception ex){
             //JOptionPane.showMessageDialog(null, "Não foi possivel listar os veiculos:"+ex);
        }
        return veiculo;
    }
    
    public void cadastarVeiculo(VeiculoModel veiculo,boolean editar){
        if(editar){
            cadastrarVeiculo = editarVeiculo;
        }
        try{
            Conexao conexao = new Conexao();
            
            pstm = (PreparedStatement) conexao.conecta().prepareStatement(cadastrarVeiculo);
            pstm.setString(1, veiculo.getDescricao());
            pstm.setString(2, veiculo.getChassi());
            pstm.setString(3, veiculo.getPlaca());
            if(editar){
                pstm.setInt(4, veiculo.getCodigo());
            }
            pstm.executeUpdate();
            conexao.desconecta();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar novo veiculo");
        }
    }
    
    public void EditarVeiculo(){
        
    }
}