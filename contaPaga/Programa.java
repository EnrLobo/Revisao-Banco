/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contaPaga;

/**
 *
 * @author Quiqu
 */
public class Programa {
    
    public static void main(String[] args) {
        Produto pro1 = new Produto();
        Produto pro2 = new Produto();
        
        Cliente cli1 = new Cliente();
        Cliente cli2 = new Cliente();
        
        Conta con1 = new Conta();
        Conta con2 = new Conta();
        
        cli1.setNomeCliente("Ana Luiza de Oliveira Hirsch");
        cli1.setCPF(10233);
        pro1.setDescricaoProduto("Sabonete de Bebe");
        pro1.setValorProduto(12.50);
        con1.setIdConta(1);
        con1.setDataVencimento("02/05/2024");
        con1.setDataPagamento("01/05/2024");
        
        cli2.setNomeCliente("Enrique Rocha Lobo da Silva");
        cli2.setCPF(12554);
        pro2.setDescricaoProduto("Batata");
        pro2.setValorProduto(39.90);
        con2.setIdConta(2);
        con2.setDataVencimento("02/05/2024");
        con2.setDataPagamento("01/05/2024");
        
        con1.visualizarConta();
        con2.visualizarConta();
        
    }
    
}
