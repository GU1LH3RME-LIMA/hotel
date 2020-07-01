package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Vo.Hospede;
import Vo.Quarto;

import factory.ConnectionFactory;
import java.util.List;
import java.util.logging.Level;


public class HospedeDao {
 private Connection connection;
 ConnectionFactory conex = new ConnectionFactory();
	
	public void registrarHospede(Hospede minhaPessoa) {
		

		try {
			Statement stm = conex.getConnection().createStatement();
			stm.executeUpdate("INSERT INTO hospede VALUES ('"
					+ minhaPessoa.getCpf() + "', '"
					+ minhaPessoa.getRg() + "', '"
					+ minhaPessoa.getNome() + "', '"
                                + minhaPessoa.getAno() + "', '"
					+ minhaPessoa.getEmail() + "', '"
                                + minhaPessoa.getCelular() + "', '"
                                + minhaPessoa.getTelefone() + "', '"
                                + minhaPessoa.getSenha() + "', '"
					+ minhaPessoa.getEstado() + "')"); 
                               
			JOptionPane.showMessageDialog(null,
					"Hospede Cadastrado", "Informativo",
					JOptionPane.INFORMATION_MESSAGE);
			stm.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			JOptionPane.showMessageDialog(null,
					"Registro não realizado, verifique s console para verificar o error informado",
					"Error", JOptionPane.ERROR_MESSAGE);
		}
	}
         public List<Hospede> read() {
         List<Hospede> hospede= new ArrayList<>();
          
          ResultSet rs=null;
          
          try{
              Statement stmt = conex.getConnection().createStatement();
          rs = stmt.executeQuery("SELECT * FROM hospede"); 
           
           while(rs.next()){
            Hospede hospedes = new Hospede();
            hospedes.setCpf(rs.getString("cpf"));
            hospedes.setRg(rs.getString("rg"));
            hospedes.setNome(rs.getString("nome"));
            hospedes.setAno(rs.getString("ano_nasc"));
            hospedes.setEmail(rs.getString("email"));
            hospedes.setCelular(rs.getString("celular"));
            hospedes.setTelefone(rs.getString("telefone"));
            hospedes.setSenha(rs.getString("senhar"));
            hospedes.setEstado(rs.getString("estado"));
            
            hospede.add(hospedes);
           }
           rs.close();
			stmt.close();
                        conex.desconectar();
           } catch (SQLException ex) {
                 java.util.logging.Logger.getLogger(QuartoDao.class.getName()).log(Level.SEVERE, null, ex);
             }
          
      
        return hospede;
        }
    public List<Hospede> buscar(String cpf) {
         List<Hospede> hospede= new ArrayList<>();
           this.connection = new ConnectionFactory().getConnection();
        PreparedStatement ps;
        ResultSet rs= null;
        
          
          
          try{
              
                  ps = connection.prepareStatement("SELECT * FROM hospede WHERE cpf LIKE ?");
         
          ps.setString(1,"%"+cpf+"%");
          rs= ps.executeQuery();
           
           while(rs.next()){
            Hospede hospedes = new Hospede();
            hospedes.setCpf(rs.getString("cpf"));
            hospedes.setRg(rs.getString("rg"));
            hospedes.setNome(rs.getString("nome"));
            hospedes.setAno(rs.getString("ano_nasc"));
            hospedes.setEmail(rs.getString("email"));
            hospedes.setCelular(rs.getString("celular"));
            hospedes.setTelefone(rs.getString("telefone"));
            hospedes.setSenha(rs.getString("senhar"));
            hospedes.setEstado(rs.getString("estado"));
            
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
    public void deletar(Hospede vossoHospede) {
        this.connection = new ConnectionFactory().getConnection();
        PreparedStatement ps;
        String status = "";
        try {
            ps = connection.prepareStatement("DELETE FROM hospede WHERE cpf=?");
            ps.setString(1, (String) vossoHospede.getCpf());
         
            int i = ps.executeUpdate();
            if (i != 0) {
                status = "Hospede deletado do database";
                JOptionPane.showMessageDialog(null,status,"Deleção de Usuário",JOptionPane.INFORMATION_MESSAGE);
            } else {
                status = "Erro ao deletar";
                JOptionPane.showMessageDialog(null,status,"Deleção de Usuário",JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    public void atualizarHospede(Hospede vossoHospede) {
        this.connection = new ConnectionFactory().getConnection();
        PreparedStatement ps;
        String status = "";
        try {
            ps = connection.prepareStatement("UPDATE hospede SET rg=?,nome=?,ano_nasc=?,email=?,celular=?,telefone=?,senhar=?,estado=? WHERE cpf=?");
            ps.setString(1,  vossoHospede.getRg());
            ps.setString(2, vossoHospede.getNome());
            ps.setString(3, vossoHospede.getAno());
            ps.setString(4, vossoHospede.getEmail());
            ps.setString(5, vossoHospede.getCelular());
            ps.setString(6, vossoHospede.getTelefone());
            ps.setString(7, vossoHospede.getSenha());
            ps.setString(8, (String) vossoHospede.getEstado());
            ps.setString(9, vossoHospede.getCpf());
            int i = ps.executeUpdate();
            if (i != 0) {
                status = "Hospede atualizado no database";
                JOptionPane.showMessageDialog(null,status,"Atualização",JOptionPane.INFORMATION_MESSAGE);
            } else {
                status = "Erro ao atualizar";
                JOptionPane.showMessageDialog(null,status,"Atualização",JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    
}


	/**
	 * Usa o objeto model para guardar diretamente a informação obtida
	 * do BD, e  mostra na view tabela
	 * 
	 * @param model
	 */
        
        
	
