/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

import entities.Account;
import entities.BusniessAccount;
import entities.SavingsAccount;

/**
 *
 * @author rafael
 */
public class Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Account acc = new Account(1001, "Alex", 1500.0);
        BusniessAccount bacc = new BusniessAccount(1002, "Maria", 400.0, 500.0);

        //UPCASTING - Converte da Subclass para SuperClass 
        Account acc1 = bacc;
        Account acc2 = new BusniessAccount(1002, "Bobo", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1003, "Anna", 500.0, 0.0);
        double saque = 1500.01;
        if (acc3.getBalance() >= saque) {
            acc3.withdraw(saque);
            System.out.println("Valor do Saque: R$" + acc3.getBalance());
        } else {
            System.out.println("Saldo Insuficiente: R$" + acc3.getBalance());
        }

        //DOWNCASTING -> Converte da SuperClass para SubClass
        
        //Instanceof -> Utilizado para verificar se o objeto pertence a classe
        //que está sendo feito a conversão.
        if (acc3 instanceof BusniessAccount) {
            BusniessAccount acc5 = (BusniessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            //necessário fazer o casting para conversão de classe
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        //Saque com métodos da classe principal.
        Account acc6 = new Account(1001, "Alex", 1000.00);
        acc6.withdraw(200.0);
        System.out.println("Saque: R$" + acc6.getBalance());

        //Utilizando método de sobreposição apartido do saque
        Account acc7 = new SavingsAccount(10002, "Maria", 1000.00, 0.0);
        acc7.withdraw(200.0);
        System.out.println("Saque: R$" + acc7.getBalance());

        //Utilizando método de sobreposição apartido do saque
        Account acc8 = new BusniessAccount(1003, "bob", 1000.0, 500.0);
        acc8.withdraw(200.0);
        System.out.println("Saque: R$" + acc8.getBalance());

        //Polimorfismo
        Account x = new Account(1200, "alex", 1000.0);
        Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.1);
        
        x.withdraw(50.0);
        y.withdraw(50.0);
        
        System.out.println("Saque x: R$" + x.getBalance());
        System.out.println("Saque y: R$" + y.getBalance());
    }//class execução

}//class principal
