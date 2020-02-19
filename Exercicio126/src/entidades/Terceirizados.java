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
public class Terceirizados extends Funcionario {

    private double valorAdicional;

    public Terceirizados() {
        super();
    }

    public Terceirizados(String nome, Integer horas, Double valorPorHora, double valorAdicional) {
        super(nome, horas, valorPorHora);
        this.valorAdicional = valorAdicional;
    }

    @Override
    public double pagamento() {
        return super.pagamento() + valorAdicional * 1.1;
    }

}
