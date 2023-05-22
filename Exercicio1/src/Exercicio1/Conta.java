/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicio1;

public class Conta {

    public Conta (int _agencia,int _conta,float _saldo,float _limite){
        this.agencia = _agencia;
        this.conta = _conta;
        this.saldo = _saldo;
        this.limite = _limite;
    }
    
    public float getSaldo(){
        return saldo;
    }
    
    public void saque (float novoSaque){
        this.saldo -= novoSaque;
    }
    
    public void deposito (float novoDeposito){
        this.saldo += novoDeposito;
    }
    
    private int agencia;
    private int conta;
    private float saldo;
    private float limite;
    }

    
