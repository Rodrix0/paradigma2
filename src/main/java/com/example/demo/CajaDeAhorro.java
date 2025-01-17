package com.example.demo;
public class CajaDeAhorro {
    // Atributos o Variables internas
    private int saldo;
    private String titular;
    public void depositar(int monto) {
        saldo += monto;
    }
    public int saldo(){
        return saldo;
    }
    public int extraer(int monto) {
       
        if (saldo < monto) {
            throw new RuntimeException("Saldo insuficiente");
        }
        saldo -= monto;
        return saldo;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
}
