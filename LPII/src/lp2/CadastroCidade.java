/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2;

import Entidades.Cidade;
import Util.Data;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joao
 */
public final class CadastroCidade extends javax.swing.JDialog {

    int cod = 1;
    static List<Cidade> lista = new ArrayList<>();
    Cidade cd;

    public CadastroCidade(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        popularTabela();
        setLocationRelativeTo(null);
        setVisible(modal);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeCidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Dados da Cidade");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 11, -1, -1));

        jLabel2.setText("DESC:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));
        getContentPane().add(nomeCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 127, 240, -1));

        jLabel3.setText("ESTADO:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 130, 53, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 127, 70, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Cod", "Descricao", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 187, 417, 139));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3floppy_mount (1).png"))); // NOI18N
        jButton2.setText("Salvar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarCidade(evt);
            }
        });
        jButton2.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                jButton2VetoableChange(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, -1, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back_2.png"))); // NOI18N
        jButton3.setText("Voltar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, -1));

        jLabel5.setText("COD:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 95, -1, -1));

        jTextField2.setEditable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 89, 68, -1));

        jButton5.setText("Limpar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparCampos(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/old_edit_find_replace (1).png"))); // NOI18N
        jButton6.setText("Buscar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/deletered.png"))); // NOI18N
        jButton7.setText("Excluir");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirCidade(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, -1, -1));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pencil (1).png"))); // NOI18N
        jButton8.setText("Editar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarCidade(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        jButton9.setText("Selecionar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecionarCidade(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(366, 158, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1AncestorAdded

    private void salvarCidade(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarCidade
        int i = 0;
//        cd = new Cidade();
        Cidade cidade = new Cidade();
        if (nomeCidade.getText().isEmpty() && jTextField1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Os campo DESC e ESTADO não podem ser vazios!");
        } else if (jTextField2.getText().isEmpty()) {
            cidade.setCod(cod);
            cidade.setNome(nomeCidade.getText());
            cidade.setUf(jTextField1.getText());
            lista.add(cidade);
            cod++;
            limparCampos();
        } else if (!jTextField2.getText().isEmpty()) {
            cidade.setCod(Integer.parseInt(jTextField2.getText()));
            cidade.setNome(nomeCidade.getText());
            cidade.setUf(jTextField1.getText());
            atulisaCidade(cidade);
        }
        popularTabela();

//        }{
//        
//
//                this.cd.setNome(nomeCidade.getText());
//                this.cd.setUf(jTextField1.getText());
//                cd.setCod(cod);
//
//                this.cd.setCod(Integer.parseInt(jTextField2.getText()));
//
//                for (Cidade cidade : lista) {
//                    if (cidade.getCod() == this.cd.getCod()) {
//                        int index = lista.indexOf(cidade);
//                        lista.get(index).setNome(this.cd.getNome());
//                        lista.get(index).setUf(this.cd.getUf());
//                        i = 1;
//                        JOptionPane.showMessageDialog(rootPane, "Cidade Editada com sucesso!!!");
//                    }
//                }
//            }
//            if (i == 0) {
//            }
//        }
//        this.cd = null;
//        this.jTextField2.setText(null);
//        this.nomeCidade.setText(null);
//        this.jTextField1.setText(null);
    }//GEN-LAST:event_salvarCidade

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void limparCampos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparCampos
        // TODO add your handling code here:
        this.limparCampos();
    }//GEN-LAST:event_limparCampos

    private void excluirCidade(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirCidade
        // TODO add your handling code here:
        Cidade c = pegaObjeto();
        int i = JOptionPane.showConfirmDialog(rootPane, "Deseja mesmo exlcuir? ");
        if (i == 0) {
            removeCidadi(c);
        }
    }//GEN-LAST:event_excluirCidade

    private void editarCidade(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarCidade
        // TODO add your handling code here:

        editarCidade();
        JOptionPane.showMessageDialog(rootPane, "Cidade Editada com sucesso!!!!");
    }//GEN-LAST:event_editarCidade

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:

        buscarCidade();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void selecionarCidade(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecionarCidade
        // TODO add your handling code here:

        cd = new Cidade();
        int linha = jTable1.getSelectedRow();
        int cod = (Integer) jTable1.getValueAt(linha, 0);

        cd.setCod(cod);
        cd.setNome((String) jTable1.getValueAt(linha, 1));
        cd.setUf((String) jTable1.getValueAt(linha, 2));
//        JOptionPane.showMessageDialog(rootPane, cd.getUf());

        Data.hash.put("cidade", cd);
        dispose();
    }//GEN-LAST:event_selecionarCidade

    private void jButton2VetoableChange(java.beans.PropertyChangeEvent evt) throws java.beans.PropertyVetoException {//GEN-FIRST:event_jButton2VetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2VetoableChange

    public void popularTabela() {

        try {

            if (lista.isEmpty()) {
                DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
                modelo.setNumRows(0);
            }
            Cidade cidade;
            int t = 0;
            DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
            modelo.setNumRows(0);
            int aux = lista.size();
            while (t < aux) {
                cidade = new Cidade();
                cidade = lista.get(t);
                modelo.addRow(new Object[]{cidade.getCod(), cidade.getNome(), cidade.getUf()});
                t++;
            }

        } catch (Exception e) {
            System.out.println("Execão: " + e);
        }
    }

    public List retornaLista() {
        return this.lista;
    }

    public Cidade retorneCidade() {
        Cidade cd = new Cidade();

        int linha = jTable1.getSelectedRow();
        int codigo = (Integer) jTable1.getValueAt(linha, 0);

        cd.setCod(codigo);
        cd.setNome((String) jTable1.getValueAt(linha, 1));
        cd.setUf((String) jTable1.getValueAt(linha, 2));
        JOptionPane.showMessageDialog(rootPane, cd);
        return cd;
    }

    public void removeCidadi(Cidade c) {

        for (Iterator<Cidade> it = lista.iterator(); it.hasNext();) {
            Cidade cidade = it.next();
            if (cidade.getCod() == c.getCod()) {
                removeCidade(cidade);
            }
        }
    }

    public Cidade pegaObjeto() {
        Cidade cit = new Cidade();
        int linha = jTable1.getSelectedRow();
        int cod = (Integer) jTable1.getValueAt(linha, 0);
        cit.setCod(cod);
        cit.setNome((String) jTable1.getValueAt(linha, 1));
        cit.setUf((String) jTable1.getValueAt(linha, 2));
        return cit;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCidade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                CadastroCidade dialog = new CadastroCidade(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField nomeCidade;
    // End of variables declaration//GEN-END:variables

    private void limparCampos() {
        this.jTextField2.setText(null);
        this.nomeCidade.setText(null);
        this.jTextField1.setText(null);
    }

    private void removeCidade(Cidade cidade) {
        for (Cidade cida : lista) {
            if (cida.getCod() == cidade.getCod()) {
                lista.remove(cidade);
            }
            popularTabela();
        }
    }

    private void editarCidade() {
        cd = new Cidade();
        int linha = jTable1.getSelectedRow();
        int cod = (Integer) jTable1.getValueAt(linha, 0);

        cd.setCod(cod);
        cd.setNome((String) jTable1.getValueAt(linha, 1));
        cd.setUf((String) jTable1.getValueAt(linha, 2));


        jTextField2.setText(String.valueOf(cd.getCod()));
        nomeCidade.setText(cd.getNome());
        jTextField1.setText(cd.getUf());

    }

    private void buscarCidade() {
        List<Cidade> li = new ArrayList<>();
        String nome = JOptionPane.showInputDialog("Cidade: ");

        for (Cidade cidade : lista) {
            if (cidade.getNome().startsWith(nome)) {
                li.add(cidade);
            }
        }

        Cidade cidade;
        int t = 0;
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setNumRows(0);
        int aux = li.size();
        while (t < aux) {
            cidade = new Cidade();
            cidade = li.get(t);
            modelo.addRow(new Object[]{cidade.getCod(), cidade.getNome(), cidade.getUf()});
            t++;
        }
    }

    private void atulisaCidade(Cidade cd) {
        for (Cidade cidade : lista) {
            if (cd.getCod() == cidade.getCod()) {
                int index = lista.indexOf(cidade);
                lista.get(index).setNome(cd.getNome());
                lista.get(index).setUf(cd.getUf());
            }
        }
        limparCampos();
        popularTabela();
    }
}
