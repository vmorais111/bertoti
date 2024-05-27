/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facedepattern;

/**
 *
 * @author guara
 */
public class bot�oLigar {
    private Tela tela = new Tela();
    private CPU cpu = new CPU();
    private Perif�ricos perif�ricos = new Perif�ricos();
    
    public bot�oLigar(){
        this.cpu= new CPU();
        this.perif�ricos=new Perif�ricos();
        this.tela=new Tela();
    }
    
    public void iniciar(){
        cpu.iniciar();
        perif�ricos.iniciar();
        tela.iniciar();
        System.out.println("Computador iniciado com sucesso!");
    }
}
