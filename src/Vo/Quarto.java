/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vo;


public class Quarto {
    int num;
    String descricao;     
    String tipo;     
   int metro;
   String cpf;
     public String getCpf() {
        return cpf;        
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
      public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Object getTipo() {
        return tipo;        
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getMetro() {
        return metro;
    }
    public void setMetro(int metro) {
        this.metro = metro;
    }
}
