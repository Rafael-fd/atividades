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
public class produtoImportado extends Produto{
    private Double CustoPersonalizado;
    
    public produtoImportado(){
        super();
    }

    public produtoImportado(Double CustoPersonalizado, String Produto, Double Preco, String Etiqueta) {
        super(Produto, Preco, Etiqueta);
        this.CustoPersonalizado = CustoPersonalizado;
    }

    public Double getCustoPersonalizado() {
        return CustoPersonalizado;
    }

    public void setCustoPersonalizado(Double CustoPersonalizado) {
        this.CustoPersonalizado = CustoPersonalizado;
    }

    public Double total(Double custo){
        return getPreco() + CustoPersonalizado;
    }
    

    
    
    
}
