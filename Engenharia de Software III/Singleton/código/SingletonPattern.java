/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singletonpattern;

/**
 *
 * @author guara
 */
public class SingletonPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Catraca catraca= Catraca.getCatraca();
        catraca.print();
        catraca.incrementContador();
        catraca.print();
        
    }
    
}
