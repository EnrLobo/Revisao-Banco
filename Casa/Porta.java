/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casa;

import java.util.Scanner;

/**
 *
 * @author Quiqu
 */
public class Porta {
    Scanner entrada = new Scanner(System.in);
    
    String cor="Preta", aberta;
    int dimensaoX, dimensaoY, dimensaoZ, i=0;
    
    
    void abre(){
        aberta = "aberta";
        i++;
    }
    
    void fecha(){
        aberta = "fechada";
        i--;
        
    }
    
    void pinta(String s){
        cor = s;
    }
    
    //boolean estaAberta(){
      //  if(aberta == "aberta"){
        //    System.out.println("A porta está aberta");
          //  return true;
        //}else{
          //  System.out.println("A porta está fechada");
           // return false;
        //}
    //}
    
    //int quantasPortasAbertas(){
      //  return i;
    //}
}
