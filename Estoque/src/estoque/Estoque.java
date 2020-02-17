/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estoque;

import entidades.Produto;
import entidades.ProdutoUsado;
import entidades.produtoImportado;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafael
 */
public class Estoque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String etiqueta;
         List<Produto> lista = new ArrayList<>();
        
        System.out.print("Digite o número de produtos: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Dados do #" + i + " Produto:");
            System.out.print("Novo, Usado ou Importado (n/u/i):");
            char op = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Nome: ");
            String produto = sc.nextLine();
            System.out.print("Valor: ");
            Double valor = sc.nextDouble();

            if (op == 'n') {
                etiqueta = produto + "R$" + valor;
                lista.add( new Produto(produto, valor, etiqueta));
                
                
            } else if (op == 'u') {
                String dataReceb;
                sc.nextLine();
                System.out.print("Data de Fábricação: ");
                dataReceb = sc.nextLine();
                SimpleDateFormat df = new SimpleDateFormat("dd/MM/aaaa");
                Date data = null;
                try {
                    data = df.parse(dataReceb);
                    System.out.println(""+data);
                } catch (ParseException ex) {
                    Logger.getLogger(Estoque.class.getName()).log(Level.SEVERE, null, ex);
                }
                etiqueta = produto + " (usado) R$" + valor + "data de fabricação: " + data;
                lista.add(new ProdutoUsado(data, produto, valor, etiqueta));
                
            } else if (op == 'i') {
                System.out.print("Custo Importação: ");
                Double custoImporacao = sc.nextDouble();
                etiqueta = produto + " R$" + (valor + custoImporacao )+ "(Custo de Iportação: R$" + custoImporacao + ")";
                lista.add(new produtoImportado(custoImporacao, produto, valor, etiqueta));
                
            } else {
                System.out.print("Opção Inválida");
            }
        }
        System.out.println("\n\n Etiqueta de Preços:");
        for (Produto pro: lista){
            System.out.println(""+pro.etiqueta().toString());
        }
        sc.close();
    }

}
