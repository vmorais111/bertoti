/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ObserverPattern;

/**
 *
 * @author guara
 */
public class StrategyDesingPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BancoDeInvestimento bd1 = new BancoDeInvestimento();
        sedeRJ RJ = new sedeRJ();
        sedeSP SP = new sedeSP();
        
        bd1.addBancoSede(SP);
        bd1.addBancoSede(RJ);
        
        bd1.setInv("Tesouro direto", true, 1000);
        System.out.println("============================");
        bd1.setInv("Investimento em Jsl SA", false, 10000);
    }
    
}
