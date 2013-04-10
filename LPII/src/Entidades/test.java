/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joao
 */
public class test {

    public static void main(String[] args) {
        
        List<Cidade> lista = new ArrayList<>();
        Cidade c0 = new Cidade(1, "dfg", "df");
        Cidade c1 = new Cidade(1, "dfg", "df");
        Cidade c2 = new Cidade(1, "dfg", "df");
        Cidade c3 = new Cidade(1, "dfg", "df");
        
        lista.add(c0);
        lista.add(c1);
        lista.add(c2);
        lista.add(c3);
        
        System.out.println(lista.size());
    }
}
