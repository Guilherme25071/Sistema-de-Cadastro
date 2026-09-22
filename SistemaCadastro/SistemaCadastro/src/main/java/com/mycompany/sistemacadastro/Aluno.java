/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacadastro;

/**
 *
 * @author guilherme62977766
 */
public class Aluno extends Cadastro{
    
    private int nota;
    private double media;

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public Aluno(int nota, double media, String nome, int telefone, String endereco) {
        super(nome, telefone, endereco);
        this.nota = nota;
        this.media = media;
    }
    
    @Override
    public void apresentar(){
    System.out.println("Olá, sou o aluno. Me chamo " + nome);
    }
    
    
}
