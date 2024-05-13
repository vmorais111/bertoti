/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObserverPattern;

/**
 *
 * @author guara
 */
public class sedeRJ implements Observer {
    @Override
    public void update(String nomeInv, boolean status, int valor){
        String c = status? "Crescimento" : "Queda"; 
        int value = status? (valor+500):(valor-500);
        
        System.out.print("""
                           ==============
                              Sede Rio
                           ==============
                           """);
        System.out.println("""
                           Nome do investimento: %s
                           Status: %s
                           valor: %d
                           """.formatted(nomeInv,c,value));
    } 
}
