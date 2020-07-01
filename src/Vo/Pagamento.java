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
public class Pagamento {
    String cpf;
    String nome;
    private String conta;
    private String senha;
    private String agencia;
    private String num_cartao;
    private int parcelas;
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
    
      public String getNum() {
        return getNum_cartao();
    }
    public void setNum(String num_cartao) {
        this.setNum_cartao(num_cartao);
    }

    /**
     * @return the conta
     */
    public String getConta() {
        return conta;
    }

    /**
     * @param conta the conta to set
     */
    public void setConta(String conta) {
        this.conta = conta;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the agencia
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    /**
     * @return the num_cartao
     */
    public String getNum_cartao() {
        return num_cartao;
    }

    /**
     * @param num_cartao the num_cartao to set
     */
    public void setNum_cartao(String num_cartao) {
        this.num_cartao = num_cartao;
    }

    /**
     * @return the parcelas
     */
    public int getParcelas() {
        return parcelas;
    }

    /**
     * @param parcelas the parcelas to set
     */
    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }
}
