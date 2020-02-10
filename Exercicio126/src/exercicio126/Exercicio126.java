/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio126;

import entidades.Funcionario;
import entidades.Terceirizados;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author rafael
 */
public class Exercicio126 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Funcionario> lista = new ArrayList<>();
        System.out.print("Entre com numero do funcionario: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados do funcionario #" + i + ":");
            System.out.print("É Tercerizado S/N: ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            System.out.print("Horas: ");
            int horas = sc.nextInt();
            System.out.print("Valor por Hora: R$");
            double valorHora = sc.nextDouble();
            if (ch == 's') {
                System.out.print("Valor Adicional: R$");
                double valorAdicional = sc.nextDouble();
                //Funcionario ter = new Terceirizados(name, horas, valorHora, valorAdicional);
                lista.add(new Terceirizados(name, horas, valorHora, valorAdicional));
            }else{
                //Funcionario fun = new Funcionario(name, horas, valorHora);
                lista.add(new Funcionario(name, horas, valorHora));
            }
        }
        
        System.out.println("");
        System.out.println("Pagamentos:");
        for(Funcionario fun : lista){
            System.out.println(fun.getNome() + " - $ " + String.format("%.2f", fun.pagamento()));            
        }
        sc.close();
    }

}
