/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Util.Data;
import annotations.ClassProperty;
import annotations.MethodProperty;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;
import java.lang.reflect.Method;
import javax.swing.*;

/**
 *
 * @author joao
 */
public class GenericViewEdit {

    public void mostraJanela(Object obj) {

        JDialog dialog = preparaDialog(obj);
        insereMetodosValores(obj, dialog.getRootPane().getContentPane());

        dialog.setVisible(true);
        JLabel l = new JLabel();

        JButton salvar = new JButton("Salvar");
        dialog.add(salvar);
        
        salvar.addActionListener(new java.awt.event.ActionListener() {  
            public void actionPerformed(java.awt.event.ActionEvent evt) {  
                salvarActionPerformed(evt);  
            }

            private void salvarActionPerformed(ActionEvent evt) {
                
            }
        });
    }

    private JDialog preparaDialog(Object obj) {

        JDialog dialog = new JDialog();
        dialog.setLocationRelativeTo(dialog);
        dialog.setVisible(true);
        dialog.setModal(true);
        dialog.setLayout(new GridLayout(0, 2));

        if (obj.getClass().isAnnotationPresent(ClassProperty.class)) {
            ClassProperty classProperty = obj.getClass().getAnnotation(ClassProperty.class);
            dialog.setSize(classProperty.width(), classProperty.height());
            dialog.setTitle(classProperty.label());
            dialog.setBackground(classProperty.color().getColor());
        } else {
            dialog.setSize(400, obj.getClass().getDeclaredFields().length * 40);
            dialog.setTitle(obj.getClass().getSimpleName());
            dialog.setBackground(Color.PINK);
        }

        return dialog;
    }

    private void insereMetodosValores(Object obj, Container container) {
        
        
        for (Method o : obj.getClass().getMethods()) {
            if (o.getName().startsWith("get") && !o.getName().endsWith("getClass")) {
                MethodProperty anot = o.getAnnotation(MethodProperty.class);
                String labelText = o.getName().substring(3);
                Color labelColor = Color.RED;
                if (anot != null) {
                    labelText = anot.label();
                    labelColor = anot.color().getColor();
                }
                JLabel label = new JLabel(labelText + ":");
                label.setForeground(labelColor);
                container.add(label);
                try {
                    Object value = o.invoke(obj, null);
//                    container.add(new JTextField(value.toString()));
                    container.add(new JTextField(value == null ? "(VAZIO)" : value.toString()));
                } catch (Exception ex) {
                    container.add(new JLabel(ex.getMessage()));
                }
            }
        }
    }
}
