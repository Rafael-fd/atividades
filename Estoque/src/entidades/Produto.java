/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author rafael
 */
public class Produto {
    private String Produto;
    private Double Preco;
    private String Etiqueta;
    
    public Produto(){
        
    }

    public Produto(String Produto, Double Preco, String Etiqueta) {
        this.Produto = Produto;
        this.Preco = Preco;
        this.Etiqueta = Etiqueta;
    }

    public String getProduto() {
        return Produto;
    }

    public void setProduto(String Produto) {
        this.Produto = Produto;
    }

    public Double getPreco() {
        return Preco;
    }

    public void setPreco(Double Preco) {
        this.Preco = Preco;
    }

    public String getEtiqueta() {
        return Etiqueta;
    }

    public void setEtiqueta(String Etiqueta) {
        this.Etiqueta = Etiqueta;
    }
    
    public String etiqueta(){
        return Produto + " R$" + Preco;
    }
    
    
    
}
