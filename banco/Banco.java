/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author Quiqu
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        Funcionario f1 = new Funcionario();
        
        f1.nome = "Ana Luiza de Oliveira Hirsch";
        f1.dep();
        f1.dataDeEntrada();
        f1.RegistroGeral();
        f1.salario = 10000;
        f1.bonifica(50);
        //f1.demite();
        f1.mostra();
        
        
        
        
        
        
        
        
    }
    
}
