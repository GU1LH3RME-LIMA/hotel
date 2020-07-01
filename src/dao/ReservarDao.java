/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Vo.Pagamento;
import Vo.Reserva;
import factory.ConnectionFactory;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import javax.swing.JOptionPane;

/**
 *
 * @author haduk
 */
public class ReservarDao {
      private Connection connection;
 ConnectionFactory conex = new ConnectionFactory();
    public void Reservar(Reserva reservinha){
        try {
			Statement stm = conex.getConnection().createStatement();
			stm.executeUpdate("INSERT INTO reservas(cpf_hospede,data_checkin,data_checkout,num_pessoas,tipo,bar,frigobar,num_bar,valor) VALUES ('"
					+ reservinha.getCpf() + "', '"
					+ reservinha.getCheckin() + "', '"
                                        + reservinha.getCheckout() + "', "
                                        + reservinha.getNum()+ ", '"
                                        + reservinha.getTipo() + "', '"
                                        + reservinha.getBar() + "', '"
                                        + reservinha.getFrigobar() + "', "
                                        + reservinha.getBarnum()+ ", "
					+ reservinha.getValor() + 
                                 ")"); 
                               
			JOptionPane.showMessageDialog(null,
					"Feito a Reserva na Base de Dados", "Reserva",
					JOptionPane.INFORMATION_MESSAGE);
			stm.close();
			conex.desconectar();
        
		 } catch (Exception e) {
            e.printStackTrace();
        }
	} 
     public List<Reserva> read() {
         List<Reserva> reservinha= new ArrayList<>();
          
          ResultSet rs=null;
          
          try{
              Statement stmt = conex.getConnection().createStatement();
          rs = stmt.executeQuery("SELECT * FROM reservas"); 
           
           while(rs.next()){
            Reserva hospedes = new Reserva();
            hospedes.setCod(rs.getInt("cod"));
            hospedes.setCpf(rs.getString("cpf_hospede"));
            hospedes.setCheckin(rs.getString("data_checkin"));
            hospedes.setCheckout(rs.getString("data_checkout"));
            hospedes.setNum(rs.getInt("num_pessoas"));
            hospedes.setFrigobar(rs.getString("frigobar"));
            hospedes.setBar(rs.getString("bar"));
            hospedes.setTipo(rs.getString("tipo"));
            hospedes.setValor(rs.getDouble("valor"));
            hospedes.setConfirmar1(rs.getString("confirmar_check_in"));
             hospedes.setConfirmar2(rs.getString("confirmar_check_out"));
            reservinha.add(hospedes);
           }
           rs.close();
			stmt.close();
                        conex.desconectar();
           } catch (SQLException ex) {
                 java.util.logging.Logger.getLogger(ReservarDao.class.getName()).log(Level.SEVERE, null, ex);
             }
          return reservinha;
   
}
     public void deletar(Reserva vossaReserva) {
        this.connection = new ConnectionFactory().getConnection();
        PreparedStatement ps;
        String status = "";
        try {
            ps = connection.prepareStatement("DELETE FROM reservas WHERE cod=?");
            ps.setInt(1,  vossaReserva.getCod());
         
            int i = ps.executeUpdate();
            if (i != 0) {
                status = "Reserva deletada do database";
                JOptionPane.showMessageDialog(null,status,"Deleção de Reserva",JOptionPane.INFORMATION_MESSAGE);
            } else {
                status = "Erro ao deletar";
                JOptionPane.showMessageDialog(null,status,"Deleção de Reserva",JOptionPane.ERROR_MESSAGE);
            }
       } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
     public void atualizarReserva(Reserva vossoHospede) {
        this.connection = new ConnectionFactory().getConnection();
        PreparedStatement ps;
        String status = "";
        try {
            ps = connection.prepareStatement("UPDATE reservas SET cpf_hospede=?,data_checkin=?,data_checkout=?,num_pessoas=?,tipo=?,bar=?,frigobar=?,num_bar=?,valor=?,confirmar_check_in=?,confirmar_check_out=? WHERE cod=?");
            ps.setString(1,  vossoHospede.getCpf());
            ps.setString(2, vossoHospede.getCheckin());
            ps.setString(3, vossoHospede.getCheckout());
            ps.setInt(4, vossoHospede.getNum());
            ps.setString(5, (String) vossoHospede.getTipo());
            ps.setString(6, vossoHospede.getBar());
            ps.setString(7, vossoHospede.getFrigobar());
            ps.setInt(8,  vossoHospede.getBarnum());
            ps.setDouble(9,  vossoHospede.getValor());
            ps.setString(10,  vossoHospede.getConfimar1());
            ps.setString(11,  vossoHospede.getConfimar2());
            ps.setInt(12, vossoHospede.getCod());
            int i = ps.executeUpdate();
            if (i != 0) {
                status = "Reserva atualizado no database";
                JOptionPane.showMessageDialog(null,status,"Atualização",JOptionPane.INFORMATION_MESSAGE);
            } else {
                status = "Erro ao atualizar";
                JOptionPane.showMessageDialog(null,status,"Atualização",JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
      public List<Pagamento> reade() {
         List<Pagamento> pag= new ArrayList<>();
          
          ResultSet rs=null;
          
          try{
              Statement stmt = conex.getConnection().createStatement();
          rs = stmt.executeQuery("SELECT * FROM pagamento"); 
           
           while(rs.next()){
            Pagamento hospedes = new Pagamento();
           
            hospedes.setCpf(rs.getString("cpf_cliente"));
           hospedes.setNome(rs.getString("nome"));
           hospedes.setAgencia(rs.getString("agencia"));
           hospedes.setConta(rs.getString("conta"));
           hospedes.setNum_cartao(rs.getString("numero"));
           hospedes.setSenha(rs.getString("senha"));
           hospedes.setParcelas(rs.getInt("parcelas"));
            pag.add(hospedes);
           }
           rs.close();
			stmt.close();
                        conex.desconectar();
           } catch (SQLException ex) {
                 java.util.logging.Logger.getLogger(ReservarDao.class.getName()).log(Level.SEVERE, null, ex);
             }
          return pag;
   
}
      public void deletarPag(Pagamento vossoHospede) {
        this.connection = new ConnectionFactory().getConnection();
        PreparedStatement ps;
        String status = "";
        try {
            ps = connection.prepareStatement("DELETE FROM pagamento WHERE numero=?");
            ps.setString(1, (String) vossoHospede.getNum_cartao());
         
            int i = ps.executeUpdate();
            if (i != 0) {
                status = "Pagamento deletado do database";
                JOptionPane.showMessageDialog(null,status,"Pag",JOptionPane.INFORMATION_MESSAGE);
            } else {
                status = "Erro ao deletar";
                JOptionPane.showMessageDialog(null,status,"Pag",JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
      public List<Pagamento> buscar(String cpf) {
         List<Pagamento> hospede= new ArrayList<>();
           this.connection = new ConnectionFactory().getConnection();
        PreparedStatement ps;
        ResultSet rs= null;
        
          
          
          try{
              
                  ps = connection.prepareStatement("SELECT * FROM pagamento WHERE cpf_hospede LIKE ?");
         
          ps.setString(1,"%"+cpf+"%");
          rs= ps.executeQuery();
           
           while(rs.next()){
             Pagamento hospedes = new Pagamento();
           
            hospedes.setCpf(rs.getString("cpf_hospede"));
           hospedes.setNome(rs.getString("nome"));
           hospedes.setAgencia(rs.getString("agencia"));
           hospedes.setConta(rs.getString("conta"));
           hospedes.setNum_cartao(rs.getString("numero"));
           hospedes.setSenha(rs.getString("senha"));
           hospedes.setParcelas(rs.getInt("parcelas"));
            hospede.add(hospedes);
           }
           rs.close();
			ps.close();
                        conex.desconectar();
           } catch (SQLException ex) {
                 java.util.logging.Logger.getLogger(QuartoDao.class.getName()).log(Level.SEVERE, null, ex);
             }
          
return hospede;
    
}
}


