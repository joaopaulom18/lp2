/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author joao
 */
public class Aparelho {

    private int cod;
    private String nome;
    private String grupoMuscular;
    private String musculoTrabalhado;
    private String obs;

    public Aparelho() {
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getGrupoMuscular() {
        return grupoMuscular;
    }

    public void setGrupoMuscular(String grupoMuscular) {
        this.grupoMuscular = grupoMuscular;
    }

    public String getMusculoTrabalhado() {
        return musculoTrabalhado;
    }

    public void setMusculoTrabalhado(String musculoTrabalhado) {
        this.musculoTrabalhado = musculoTrabalhado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String toString() {
        return this.nome + " -- " + this.musculoTrabalhado;
    }
}
