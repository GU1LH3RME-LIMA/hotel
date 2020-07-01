/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;
import Vo.Hospede;
import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Vo.Quarto;


import factory.ConnectionFactory;
import java.util.List;
import java.util.logging.Level;

/**
 *
 * @author haduk
 */
public class QuartoDao {
    private Connection connection;
 ConnectionFactory conex = new ConnectionFactory();
	/**
	 * Uso o objeto para instaciar uma pessoa
	 * @param minhaPessoa
	 */
	public void registrarQuarto(Quarto vossoQuarto) {
		

		try {
			Statement stm = conex.getConnection().createStatement();
			stm.executeUpdate("INSERT INTO quarto(tipo,metro,descricao) VALUES ('"
					+ vossoQuarto.getTipo() + "', "
					+ vossoQuarto.getMetro() + ", '"
					+ vossoQuarto.getDescricao() + 
                                 "')"); 
                               
			JOptionPane.showMessageDialog(null,
					"Feito Registro na Base de Dados", "Informativo",
					JOptionPane.INFORMATION_MESSAGE);
			stm.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null,
					"Registro não realizado, verifique seu console para verificar o error informado",
					"Error", JOptionPane.ERROR_MESSAGE);
		}
	}

 
    public List<Quarto> read() {
         List<Quarto> quartos= new ArrayList<>();
          
          ResultSet rs=null;
          
          try{
              Statement stmt = conex.getConnection().createStatement();
          rs = stmt.executeQuery("SELECT * FROM quarto ORDER BY num ASC"); 
           
           while(rs.next()){
            Quarto quarto = new Quarto();
            quarto.setNum(rs.getInt("num"));
            quarto.setTipo(rs.getString("tipo"));
            quarto.setMetro(rs.getInt("metro"));
            quarto.setDescricao(rs.getString("descricao"));
            quartos.add(quarto);
           }
           rs.close();
			stmt.close();
                        conex.desconectar();
           } catch (SQLException ex) {
                 java.util.logging.Logger.getLogger(QuartoDao.class.getName()).log(Level.SEVERE, null, ex);
             }
          
      
        return quartos;
        }
     public String deletarQuarto(String id) {
        this.connection = new ConnectionFactory().getConnection();
        PreparedStatement ps;
        String status = "";
        try {
            ps = connection.prepareStatement("delete  from quarto where num=?");
            ps.setString(1, id);
            int i = ps.executeUpdate();
            if (i != 0) {
                status = "Quarto deletado do database";
                JOptionPane.showMessageDialog(null,status,"Deleção de Usuário",JOptionPane.INFORMATION_MESSAGE);
            } else {
                status = "Usuario não deletado do database";
                JOptionPane.showMessageDialog(null,status,"Deleção de Usuário",JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
      public void atualizarQuarto(Quarto vossoQuarto) {
        this.connection = new ConnectionFactory().getConnection();
        PreparedStatement ps;
        String status = "";
        try {
            ps = connection.prepareStatement("UPDATE quarto SET tipo=?,metro=?,descricao=? WHERE num=?");
            ps.setString(1, (String) vossoQuarto.getTipo());
            ps.setInt(2, vossoQuarto.getMetro());
            ps.setString(3, vossoQuarto.getDescricao());
            ps.setInt(4, vossoQuarto.getNum());
            int i = ps.executeUpdate();
            if (i != 0) {
                status = "Quarto atualizado do database";
                JOptionPane.showMessageDialog(null,status,"Atu",JOptionPane.INFORMATION_MESSAGE);
            } else {
                status = "Erro ao atualizar";
                JOptionPane.showMessageDialog(null,status,"Atu",JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
      public List<Quarto> read2() {
         List<Quarto> quartos= new ArrayList<>();
          
          ResultSet rs=null;
          
          try{
              Statement stmt = conex.getConnection().createStatement();
          rs = stmt.executeQuery("SELECT num,cpf_hosp FROM alocacao ORDER BY num ASC"); 
           
           while(rs.next()){
            Quarto quarto = new Quarto();
            quarto.setNum(rs.getInt("num"));
            quarto.setCpf(rs.getString("cpf_hosp"));
            quartos.add(quarto);
           }
           rs.close();
			stmt.close();
                        conex.desconectar();
           } catch (SQLException ex) {
                 java.util.logging.Logger.getLogger(QuartoDao.class.getName()).log(Level.SEVERE, null, ex);
             }
          
      
        return quartos;
        }
      public void atualizarAlocacao(Quarto vossoQuarto) {
        this.connection = new ConnectionFactory().getConnection();
        PreparedStatement ps;
        String status = "";
        try {
            ps = connection.prepareStatement("UPDATE alocacao SET cpf_hosp=? WHERE num=?");
            ps.setString(1, vossoQuarto.getCpf());
            ps.setInt(2, vossoQuarto.getNum());
           
            int i = ps.executeUpdate();
            if (i != 0) {
                status = "Alocação atualizado do database";
                JOptionPane.showMessageDialog(null,status,"Atu",JOptionPane.INFORMATION_MESSAGE);
            } else {
                status = "Erro ao atualizar";
                JOptionPane.showMessageDialog(null,status,"Atu",JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }  
      public String quartoQuarto(String id) {
        this.connection = new ConnectionFactory().getConnection();
        PreparedStatement ps;
        String status = "";
        try {
            ps = connection.prepareStatement("INSERT INTO alocacao(num) VALUE (?)");
            ps.setString(1, id);
            int i = ps.executeUpdate();
            if (i != 0) {
                status = "Quarto inserido para alocação";
                JOptionPane.showMessageDialog(null,status,"Alocacação",JOptionPane.INFORMATION_MESSAGE);
            } else {
                status = "Erro";
                JOptionPane.showMessageDialog(null,status,"Alocação",JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
      
      
}


       
      

	/**
	 * Usa o objeto model para guardar diretamente a informação obtida
	 * do BD, e  mostra na view tabela
	 * 
	 * @param model
	 */
        
        
	
