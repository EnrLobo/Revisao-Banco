/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casa;

/**
 *
 * @author Quiqu
 */
public class Teste {
    
    public static void main(String[] args) {
        Pessoa pe = new Pessoa();
        
        pe.nome = "Ana Luiza de Oliveira Hirsch";
        pe.idade = 19;
        
        pe.fazAniversario();
        
        
        System.out.println("O nome da pessoa é: "+pe.nome+" e sua idade é: "+pe.idade);
        pe.fazAniversario();
        System.out.println("O nome da pessoa é: "+pe.nome+" e sua idade é: "+pe.idade);
        pe.fazAniversario();
        System.out.println("O nome da pessoa é: "+pe.nome+" e sua idade é: "+pe.idade);
    
    
        Porta po = new Porta();
        
        po.abre();
        //System.out.println("A porta está: "+po.aberta);
        po.fecha();
        //System.out.println("A porta está: "+po.aberta);
        po.abre();
        po.dimensaoX = 2;
        po.dimensaoY = 5;
        po.dimensaoZ = 3;
        po.pinta("Azul");
        System.out.println("As dimensões da porta são: "+po.dimensaoX+" por "+po.dimensaoY+" por "+po.dimensaoZ);
        System.out.println("A cor da porta é: "+po.cor);
       // po.estaAberta();
        //System.out.println("A porta está: "+);
    }
    
}
