/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compositepattern;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author guara
 */
public class Pasta implements Sistema{
    private String nome;
    private List<Sistema> componentes;
    
    public Pasta(String nome){
        this.nome=nome;
        this.componentes = new ArrayList<>();
    }
    
    public void addComponente(Sistema comp){
        componentes.add(comp);
    }
    
    @Override
    public String getNome(){
        return nome;
    }
    
    @Override
    public int getTamanho(){
        int tam=0;
        for (Sistema componente : componentes) {
            tam+= componente.getTamanho();   
        }
        return tam;
    }
    
    @Override
    public void print(){
        System.out.println("\nPasta: "+ nome +" (" + getTamanho() + " KB)");
        for (Sistema comp: componentes){
            comp.print();
        }
    }
}
