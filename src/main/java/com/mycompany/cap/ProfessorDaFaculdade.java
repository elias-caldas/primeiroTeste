/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cap;

/**
 *
 * @author Pc Elias
 */
public class ProfessorDaFaculdade extends EmpregadoDaFaculdade {
    private int horasDeAula;
    
    @Override
    public double getGastos(){
        return this.getGastos() + this.horasDeAula * 10;
    }
    
    public String getInfo(){
        String informacao = super.getInfo();
        String informacaoBasica = informacao + " horas de aulas: " + this.horasDeAula;
        return informacaoBasica;
    }
    
}
