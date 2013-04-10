/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Entidades.Cidade;
import java.awt.FlowLayout;
import java.awt.Label;
import java.lang.reflect.Method;
import javax.swing.JDialog;
import javax.swing.JTextField;

/**
 *
 * @author joao
 */
public class Main {

    public static void main(String[] args) {
        Cidade cd = new Cidade(1, "moreira", "pr");
        init(cd);
    }

    public static void init(Object obj) {
        JDialog jd = new JDialog();
        jd.setSize(400, 300);
        jd.setLocationRelativeTo(null);
        jd.setVisible(true);

        jd.setTitle(obj.getClass().getSimpleName());
        jd.setLayout(new FlowLayout());
        jd.add(new JTextField());

        for (Method m : obj.getClass().getMethods()) {
            if (m.getName().startsWith("get")) {
                jd.add(new Label(m.getName() + ":"));
                try {
                    jd.add(new JTextField(m.invoke(obj, null).toString()), 15);
                } catch (Exception e) {
                    jd.add(new JTextField(e.getMessage()));
                }
            }
        }
        jd.setSize(500, 500);
        jd.repaint();
    }
}
