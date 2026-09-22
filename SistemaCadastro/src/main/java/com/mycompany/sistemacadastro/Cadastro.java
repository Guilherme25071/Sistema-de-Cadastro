/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemacadastro;

/**
 *
 * @author guilherme62977766
 */
public class Cadastro {
    private String nome;
    private int telefone;
    private String endereco;
    
    public String getNome(){
        return this.nome;
    }
    public int getTelefone(){
        return this.telefone;
    }
    public String getEndereco(){
        return this.endereco;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setTelefone(int telefone){
        this.telefone = telefone;

    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public Cadastro(String nome, int telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
    

}
