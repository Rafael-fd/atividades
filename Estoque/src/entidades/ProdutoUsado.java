/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author rafael
 */
public class ProdutoUsado extends Produto {

    private Date Data;

    public ProdutoUsado() {
        super();
    }

    public ProdutoUsado(Date Data, String Produto, Double Preco, String Etiqueta) {
        super(Produto, Preco, Etiqueta);
        this.Data = Data;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date Data) {
        this.Data = Data;
    }
    
    
}
