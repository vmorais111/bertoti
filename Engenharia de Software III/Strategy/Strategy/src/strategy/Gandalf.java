/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

/**
 *
 * @author guara
 */
public class Gandalf {
    
    private ShallPass shallpass;


    public void setShallPass(ShallPass shallpass) {
        this.shallpass = shallpass;
    }
    
    public void shallPass(){
        shallpass.shallTheyPass();
    }
        
}
