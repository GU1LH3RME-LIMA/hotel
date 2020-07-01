/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vo;


public class Reserva {
    private int cod;
      String cpf;  
    String data_checkin;     
    String data_checkout;     
    String tipo;     
    String frigobar;
    String bar;
    int num_pessoas;
    String confirmar1;
    String confirmar2;
    double valor ;
    int num_bar;
    
    public String getCpf() {
        return cpf;        
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public Object getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getCheckin() {
        return data_checkin;
    }
    public void setCheckin(String data_checkin) {
        this.data_checkin = data_checkin;
    }
      public String getCheckout() {
        return data_checkout;
    }
    public void setCheckout(String data_checkout) {
        this.data_checkout = data_checkout;
    }
    public int getNum() {
        return num_pessoas;        
    }
    public void setNum(int num_pessoas) {
        this.num_pessoas = num_pessoas;
    }
    public String getConfimar1() {
        return confirmar1;
    }
    public void setConfirmar1(String confirmar1) {
        this.confirmar1 = confirmar1;
    }
     public String getConfimar2() {
        return confirmar2;
    }
    public void setConfirmar2(String confirmar2) {
        this.confirmar2 = confirmar2;
    }
     public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor= valor;
    }
     public String getFrigobar() {
        return frigobar;
    }
    public void setFrigobar(String frigobar) {
        this.frigobar= frigobar;
    }
     public String getBar() {
        return bar;
    }
    public void setBar(String bar) {
        this.bar= bar;
    }
     public int getBarnum() {
        return num_bar;
    }
    public void setBarnum(int num_bar) {
        this.num_bar= num_bar;
    }

    /**
     * @return the cod
     */
    public int getCod() {
        return cod;
    }

    /**
     * @param cod the cod to set
     */
    public void setCod(int cod) {
        this.cod = cod;
    }

    
    
}
