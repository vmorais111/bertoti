/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compositepattern;

/**
 *
 * @author guara
 */
public class Arquivo implements Sistema{
    private String nome;
    private int tamanho;

    public Arquivo(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }
    
    @Override
    public String getNome(){
        return nome;
    }
    
    @Override
    public int getTamanho(){
        return tamanho;
    }
    
    public void print() {
        System.out.println("Arquivo: " + nome + "\nTamanho: " + tamanho + "KB");
    }
}
