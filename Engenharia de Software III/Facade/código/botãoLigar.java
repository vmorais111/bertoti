/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facedepattern;

/**
 *
 * @author guara
 */
public class botãoLigar {
    private Tela tela = new Tela();
    private CPU cpu = new CPU();
    private Periféricos periféricos = new Periféricos();
    
    public botãoLigar(){
        this.cpu= new CPU();
        this.periféricos=new Periféricos();
        this.tela=new Tela();
    }
    
    public void iniciar(){
        cpu.iniciar();
        periféricos.iniciar();
        tela.iniciar();
        System.out.println("Computador iniciado com sucesso!");
    }
}
