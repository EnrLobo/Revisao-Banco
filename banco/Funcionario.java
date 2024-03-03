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
public class Funcionario {
    
    Scanner entrada = new Scanner(System.in);
    
    String nome, departamento, dataEntrada, RG;
    double salario;
    boolean ativo=true;
    
    
    
    String dep(){
        System.out.println("Digite o departamento do funcionario: ");
        departamento = entrada.nextLine();
        return departamento;
    }
    
    String dataDeEntrada(){
        System.out.println("Digite a data de entrada do funcionario no banco: ");
        dataEntrada = entrada.nextLine();
        return dataEntrada;
    }
    
    String RegistroGeral(){
        System.out.println("Digite o RG do funcionario: ");
        RG = entrada.nextLine();
        return RG;
    }
    
    void bonifica(double aumento){
        salario += aumento;
    }
    boolean demite(){
        ativo = false;
        return ativo;
    }
    
    void mostra(){
        System.out.println("\nO nome da funcionaria é: " + this.nome);
        System.out.println("\nO departamento da funcionaria é: " + this.departamento);
        System.out.println("\nA data de entrada da funcionaria no banco é: " + this.dataEntrada);
        System.out.println("\nO RG da funcionaria é: " + this.RG);
        System.out.println("\nO salario atual da funcionaria: " + this.nome + " é: " + this.salario);
           
        if(this.ativo == true){
            
            System.out.println("\nO funcionario ainda trabalha no banco");
            
        }else{
            System.out.println("\nO funcionario nao trabalha mais no banco");
        }
    }
    
}
