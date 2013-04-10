/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author joao
 */
 
public class Cidade {

    private int cod;
    private String nome;
    private String uf;

    public Cidade(){}
    public Cidade(int cod, String nome, String uf) {
        
        this.cod = cod;
        this.nome = nome;
        this.uf = uf;
    }

    public int getCod() {
        return cod;
    }
    
    public void setCod(int cod){
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return this.cod + " -- " + this.nome + " --- " + this.uf;
    }
}
