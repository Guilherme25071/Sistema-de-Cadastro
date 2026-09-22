/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacadastro;

/**
 *
 * @author guilherme62977766
 */
public class Professor extends Cadastro{
    
    private double salario;
    private int nContrato;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getnContrato() {
        return nContrato;
    }

    public void setnContrato(int nContrato) {
        this.nContrato = nContrato;
    }

    public Professor(double salario, int nContrato, String nome, int telefone, String endereco) {
        super(nome, telefone, endereco);
        this.salario = salario;
        this.nContrato = nContrato;
    }
    
    @Override
    public void apresentar(){
    System.out.println("Olá, sou o professor. Me chamo " + nome);
    }
}
