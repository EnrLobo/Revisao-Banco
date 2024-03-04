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
public class Conta {
    private int idConta;
    private String dataVencimento, dataPagamento;
    
    Produto pro = new Produto();
    Cliente cli = new Cliente();
    
    void visualizarConta(){
        System.out.println("\n\n\nIDENTIFICADOR: "+idConta);
        System.out.println("PRODUTO: "+pro.getDescricaoProduto());
        System.out.println("CLIENTE: "+cli.getNomeCliente()+" CPF: "+cli.getCPF());
        System.out.println("VALOR: "+pro.getValorProduto());
        System.out.println("DATA DO VENCIMENTO: "+dataVencimento);
        System.out.println("DATA DO VENCIMENTO: "+dataPagamento);
    }

    public int getIdConta() {
        return idConta;
    }

    public void setIdConta(int idConta) {
        this.idConta = idConta;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    
    
}
