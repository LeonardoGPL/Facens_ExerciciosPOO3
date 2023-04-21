/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.lista03.exerc02;

import java.util.ArrayList;

/**
 *
 * @author leogo
 */
public class Pessoa {
    private int codigo;
    private String nome;
    private ArrayList<Automovel> automoveis = new ArrayList();

    public Pessoa() {
    }

    public Pessoa(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }
    
    public void inserirAutomovel(Automovel automovel){
    this.automoveis.add(automovel);
    }
    public void removerAutomovel(int index){
        this.automoveis.remove(index);
    }
    public String imprimir(){
        return "Codigo " + this.codigo +
                "\n Nome " + this.nome;
                
    }
    public String imprimirCompleto(){
        String retorno = imprimir();
        for (Automovel automovel : automoveis){
            retorno+=automovel.imprimir();
            
        }
        return retorno;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Automovel> getAutomoveis() {
        return automoveis;
    }

    public void setAutomoveis(ArrayList<Automovel> automoveis) {
        this.automoveis = automoveis;
    }
        

}
