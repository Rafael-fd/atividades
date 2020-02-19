/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author rafael
 * Aqui foi implementado o conceito de Herança.
 * Para que uma classe herde de outro, é necessário utilizar o metodo "extends",
 * conforme foi inserido a baixo na calsse BusniessAccount que é uma subclasse
 * da superclasse Account.
 * Em seguida, é necessario criar as variáveis que irão ser utilizadas, após 
 * declaradas criaremos os métodos construtores. 
 * O uso do "super()", serve para que as variáveis da nossa superclasse sejam 
 * utilizadas dentro da nossa subclasse.
 * Já nessa subclasse utilizamos a sobreposição de método que é identificada
 * pelo comentário "@Override", apartir deste recurso o compilador consegue
 * interpretar com facilidade que trata-se de uma sobreposição facilitando a
 * verificação e execução do projeto.
 */

public class BusniessAccount extends Account {

    private Double loanLimit;

    public BusniessAccount() {
        super();
    }

    public BusniessAccount(Integer number, String holder, Double balance, Double LoanLimit) {
        super(number, holder, balance);
        this.loanLimit = LoanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double LoanLimit) {
        this.loanLimit = LoanLimit;
    }

    public void loan(double amount) {
        if (amount <= loanLimit) {
            balance += amount -10;
        }
    }
    
    @Override
    public final void withdraw(double amount){
        super.withdraw(amount);
        balance -= 2.0;
    }

}
