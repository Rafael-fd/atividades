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
public final class SavingsAccount extends Account {

    private Double interestRate;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
    
    public void updateBalance(){
        balance+= balance * interestRate;
    }
    
    @Override
    public final void withdraw(double amount){
        balance -= amount;
    }
    
}
