/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import javax.xml.crypto.Data;

/**
 *
 * @author joao
 */
public class Aluno {

    private int matricula;
    private String nome;
    private String end;
    private String cpf;
    private String email;
    private String cep;
    private String tel;
    private Cidade cidade;
    private String idade;
    private String nascimento;
    private String inicio;
    private String problemaCardiaco;
    private String casosFamiliar;
    private String atividadeFisica;

    public Aluno() {
    }

    public String getAtividadeFisica() {
        return atividadeFisica;
    }

    public void setAtividadeFisica(String atividadeFisica) {
        this.atividadeFisica = atividadeFisica;
    }

    public String getCasosFamiliar() {
        return casosFamiliar;
    }

    public void setCasosFamiliar(String casosFamiliar) {
        this.casosFamiliar = casosFamiliar;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getProblemaCardiaco() {
        return problemaCardiaco;
    }

    public void setProblemaCardiaco(String problemaCardiaco) {
        this.problemaCardiaco = problemaCardiaco;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCelular() {
        return tel;
    }

    public void setCelular(String celular) {
        this.tel = celular;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.getNome();
    }
}
