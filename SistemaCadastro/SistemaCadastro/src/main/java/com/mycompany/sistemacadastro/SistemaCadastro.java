/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemacadastro;

/**
 *
 * @author guilherme62977766
 */
public class SistemaCadastro {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
       
        Professor prof = new Professor (12000.00 , 12345 , "Marcio" , 9923 , "rua 12");
       prof.apresentar();
        
        Aluno aluno1 = new Aluno (8, 7.20, "Gui" , 23445 , "rua 20");
        aluno1.apresentar();
        
        
        
        
        
    }
}
