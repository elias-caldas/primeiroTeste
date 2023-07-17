/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cap;

/**
 *
 * @author Pc Elias
 */
public abstract class EmpregadoDaFaculdade {
    private String nome;
    private  double salario;
    
    public double getGastos(){
        return this.salario;
    }
    public String getInfo(){
        String informacao = "nome: " + this.nome + " com salario" + this.salario;
        return informacao;
    }
    
}
