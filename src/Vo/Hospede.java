/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vo;

/**
 *
 * @author haduk
 */
public class Hospede {
    String cpf;
    String rg;     
    String nome;     
    String ano_nasc;     
    String email;     
    String senha;
    String telefone;
    String celular;
    String estado;
    
   
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCpf() {
        return cpf;        
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg= rg;
    }
    
     public String getAno() {
        return ano_nasc;
    }
    public void setAno(String ano_nasc) {
        this.ano_nasc= ano_nasc;
    }
     public Object getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado= estado;
    }
     public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone= telefone;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular= celular;
    }
}
