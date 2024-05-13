/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObserverPattern;
import java.util.ArrayList;
import java.util.List;

public class BancoDeInvestimento{
    private String nomeInv;
    private boolean status;
    private int valor;
    private List<Observer> local;

    public BancoDeInvestimento(){
        this.nomeInv="";
        this.status=false;
        this.valor=0;
        this.local= new ArrayList<>();
    }
    
    public void setInv(String nomeInv,boolean status,int valor){
        this.nomeInv=nomeInv;
        this.status=status;
        this.valor=valor;
        notify(nomeInv, status, valor);
    }
    
    public void addBancoSede(Observer local){
        this.local.add(local);
    }
    
    public void notify(String nomeInv,boolean status, int valor){
        this.local.stream().forEach(item -> {
           item.update(nomeInv,status,valor) ;
        });
    }     
}
