/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package compositepattern;

/**
 *
 * @author guara
 */
public class CompositePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // criação arquivos
        Arquivo a1= new Arquivo("Teste.txt",14);
        Arquivo a2= new Arquivo("Notas_aula_ze.txt",100);
        Arquivo a3= new Arquivo("Arq_123341_100522.pdf",450);
        Arquivo a4 = new Arquivo("Banco_dados_Jsl", 10000);
        //criação pastas
        Pasta p1 = new Pasta("Pasta 1");
        Pasta p2= new Pasta("Pasta 2");
        Pasta p3 = new Pasta("Pasta 3");
        //add arquivos nas pastas
        p1.addComponente(a1);
        p1.addComponente(a2);
        p2.addComponente(a3);
        p2.addComponente(a4);
        //add pasta 1 e 2 na pasta 3
        p3.addComponente(p1);
        p3.addComponente(p2);
        //print p3
        p3.print();
    }
    
}
