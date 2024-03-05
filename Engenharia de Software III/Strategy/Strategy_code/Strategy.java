/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strategy;

/**
 *
 * @author guara
 */
public class Strategy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Gandalf g1 = new Gandalf();
        g1.setShallPass(new Hobbit());
        g1.shallPass();
        g1.setShallPass(new Balrog());
        g1.shallPass();
    }
    
}
