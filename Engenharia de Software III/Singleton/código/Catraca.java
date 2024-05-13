/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletonpattern;

/**
 *
 * @author guara
 */
public class Catraca {
    private static Catraca instance;
    private int contador;
    
    private Catraca(){
        this.contador=0;
    }
    
    public static Catraca getCatraca(){
        if (instance==null){
            instance=new Catraca();
        }
        return instance;
    }
    
    public void incrementContador(){
        this.contador+=1;
        System.out.println("Mais 1 pessoa passou pela catraca");
    }
    
    public int getContador(){
        return contador;
    }
    
    public void print(){
        System.out.println("Nº de pessoas que passaram pela catraca: " + getContador());
    }
}
