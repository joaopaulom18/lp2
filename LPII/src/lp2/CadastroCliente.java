/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lp2;

import Entidades.Aluno;
import Entidades.Cidade;
import Util.Data;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;

/**
 *
 * @author joao
 */
public class CadastroCliente extends javax.swing.JDialog {

    Aluno aluno;
    static List<Aluno> listaAluno = new ArrayList<>();
    int cod = 1;
    Cidade cd;

    public CadastroCliente(java.awt.Frame parent, boolean modal) {
        super(parent);
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeJtext = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        endereco = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cpfJtext = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        cidade = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        estado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jFormattedNascimento = new javax.swing.JFormattedTextField();
        jLabel17 = new javax.swing.JLabel();
        jFormattedTextField3 = new javax.swing.JFormattedTextField();
        telefone = new javax.swing.JFormattedTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jTextField3 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Dados do Cliente");
        jLabel1.setName("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 11, -1, -1));

        jLabel2.setText("NOME:*");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));
        getContentPane().add(nomeJtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 96, 399, -1));

        jLabel3.setText("END:*");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        endereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enderecoActionPerformed(evt);
            }
        });
        getContentPane().add(endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 126, 360, -1));

        jLabel4.setText("CPF:*");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));
        getContentPane().add(cpfJtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 126, 147, -1));

        jLabel5.setText("IDADE:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 100, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0 a 15", "15 a 30", "30 a 45", "45 a 60", "acima de 60" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, -1, -1));

        jLabel6.setText("CIDADE:*");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        cidade.setEditable(false);
        getContentPane().add(cidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 156, 147, -1));

        jButton1.setText("Procurar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 156, -1, -1));

        jLabel7.setText("UF:*");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(294, 160, -1, -1));

        estado.setEditable(false);
        getContentPane().add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 157, 45, -1));

        jLabel8.setText("TELEFONE:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/3floppy_mount (1).png"))); // NOI18N
        jButton2.setText("Salvar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarAluno(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 440, -1, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/window_close (2).png"))); // NOI18N
        jButton4.setText("Fechar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltar(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10), new java.awt.Color(51, 0, 51)), "Dados Especificos")); // NOI18N
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setText("Tem Problemas cardiaco ou outro tipo de problema fisíco? Se sim especifique.");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 27, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 47, 368, 110));

        jLabel11.setText("Tem casos na Familia?");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 50, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sim", "Não" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, -1));

        jLabel12.setText("Participa de atividade fisíca?");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sim", "Não" }));
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 570, 180));

        jLabel9.setText("MATRICULA:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 64, -1, -1));

        jTextField1.setEditable(false);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 61, 93, -1));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/old_edit_find_replace (1).png"))); // NOI18N
        jButton5.setText("Buscar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarAluno(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, -1, -1));

        jLabel13.setText("EMAIL:*");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(231, 64, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 61, 399, -1));

        jLabel14.setText("CEP:*");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel15.setText("NASCIMENTO:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 188, -1, -1));

        try {
            jFormattedNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedNascimento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jFormattedNascimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 185, 80, -1));

        jLabel17.setText("INICIO:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, -1, -1));

        try {
            jFormattedTextField3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jFormattedTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jFormattedTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 80, -1));

        try {
            telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####     ")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefoneActionPerformed(evt);
            }
        });
        getContentPane().add(telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, 110, -1));

        jToggleButton1.setText("Limpar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, -1, -1));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 90, -1));

        jLabel16.setText("* Campos obrigatórios");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void enderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enderecoActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        CadastroCidade cad = new CadastroCidade(null, true);
        cd = (Cidade) Data.hash.get("cidade");

        prencherCidade();
        Data.hash.remove("cd");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cadastrarAluno(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarAluno
        // TODO add your handling code here:
        validaCamposObrigatorios();

        if (jTextField1.getText().isEmpty()) {
            salvarAluno();
        } else {
            atualizaAluno();
            JOptionPane.showMessageDialog(nomeJtext, "Cliente atualizado com sucesso!!!");
        }
        lipmarCampos();
    }//GEN-LAST:event_cadastrarAluno

    private void voltar(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltar
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_voltar

    private void buscarAluno(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarAluno
        // TODO add your handling code here:
        aluno = new Aluno();
        PesquisarCliente pc = new PesquisarCliente(null, true);
        aluno = (Aluno) Data.hash.get("aluno");

        popularAluno(aluno);
    }//GEN-LAST:event_buscarAluno

    private void jFormattedTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField3ActionPerformed

    private void telefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefoneActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        lipmarCampos();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the dialog
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                CadastroCliente dialog = new CadastroCliente(new javax.swing.JFrame(), true);
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
    private javax.swing.JTextField cidade;
    private javax.swing.JTextField cpfJtext;
    private javax.swing.JTextField endereco;
    private javax.swing.JTextField estado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JFormattedTextField jFormattedNascimento;
    private javax.swing.JFormattedTextField jFormattedTextField3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField nomeJtext;
    private javax.swing.JFormattedTextField telefone;
    // End of variables declaration//GEN-END:variables

    private void prencherCidade() {
        cidade.setText(cd.getNome());
        estado.setText(cd.getUf());
    }

    private Cidade pegacidade() {

        return null;
    }

    private void lipmarCampos() {

        jTextField2.setText("");
        nomeJtext.setText("");
        jComboBox1.setSelectedIndex(0);
        cpfJtext.setText("");
        endereco.setText("");
        telefone.setText("");
        jTextField3.setText("");
        jFormattedNascimento.setText("");
        jFormattedTextField3.setText("");
        jTextArea1.setText("");
        jTextField1.setText("");
        jComboBox2.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);
        cidade.setText("");
        estado.setText("");
    }

    private void popularAluno(Aluno aluno) {
        jTextField1.setText(String.valueOf(aluno.getMatricula()));
        jTextField2.setText(aluno.getEmail());
        nomeJtext.setText(aluno.getNome());
        jComboBox1.setSelectedItem(aluno.getIdade());
        cpfJtext.setText(aluno.getCpf());
        endereco.setText(aluno.getEnd());
        cidade.setText(aluno.getCidade().getNome());
        estado.setText(aluno.getCidade().getUf());
        telefone.setText(aluno.getTel());
        jTextField3.setText(aluno.getCep());
        jFormattedNascimento.setText(aluno.getNascimento());
        jFormattedTextField3.setText(aluno.getInicio());
        jTextArea1.setText(aluno.getProblemaCardiaco());
        jComboBox2.setSelectedItem(aluno.getCasosFamiliar());
        jComboBox3.setSelectedItem(aluno.getAtividadeFisica());
    }

    private void salvarAluno() {
        Aluno aluno1 = new Aluno();

        if (jTextField1.getText().isEmpty()) {
            aluno1.setMatricula(cod);
        } else {
            aluno1.setMatricula(Integer.parseInt(jTextField1.getText()));
        }
        aluno1.setEmail(jTextField2.getText());
        aluno1.setNome(nomeJtext.getText());
        aluno1.setIdade((String) jComboBox1.getSelectedItem());
        aluno1.setCpf(cpfJtext.getText());
        aluno1.setEnd(endereco.getText());
        aluno1.setTel(telefone.getText());
        aluno1.setCep(jTextField3.getText());
        aluno1.setNascimento(jFormattedNascimento.getText());
        aluno1.setInicio(jFormattedTextField3.getText());
        aluno1.setProblemaCardiaco(jTextArea1.getText());
        aluno1.setCasosFamiliar((String) jComboBox2.getSelectedItem());
        aluno1.setAtividadeFisica((String) jComboBox3.getSelectedItem());
        aluno1.setCidade(cd);

        listaAluno.add(aluno1);

        lipmarCampos();

    }

    private void atualizaAluno() {

        aluno = new Aluno();
        int index = 0;
        int matricula = Integer.parseInt(jTextField1.getText());
        for (Aluno aluno1 : listaAluno) {
            if (aluno1.getMatricula() == matricula) {
                aluno = aluno1;
                index = listaAluno.indexOf(aluno);
            }
        }

        listaAluno.get(index).setAtividadeFisica((String) jComboBox3.getSelectedItem());
        listaAluno.get(index).setCasosFamiliar((String) jComboBox2.getSelectedItem());
        listaAluno.get(index).setCep(jFormattedTextField3.getText());
        listaAluno.get(index).setCidade(cd);
        listaAluno.get(index).setCpf((String) cpfJtext.getText());
        listaAluno.get(index).setEmail((String) jTextField2.getText());
        listaAluno.get(index).setEnd((String) endereco.getText());
        listaAluno.get(index).setIdade((String) jComboBox1.getSelectedItem());
        listaAluno.get(index).setInicio(jFormattedTextField3.getText());
        listaAluno.get(index).setNascimento(jFormattedNascimento.getText());
        listaAluno.get(index).setNome(nomeJtext.getText());
        listaAluno.get(index).setProblemaCardiaco(jTextArea1.getText());
        listaAluno.get(index).setTel((String) telefone.getText());
        lipmarCampos();
    }

    public void validaCamposObrigatorios() {
        String str = "";

        List<String> result = new ArrayList<>();

        if (jTextField2.getText().isEmpty()) {
            str = "O Campo e-mail precisa ser preenchido";
            jTextField2.setBorder(new LineBorder(Color.red));
            result.add(str);
        }

        if (nomeJtext.getText().isEmpty()) {
            str = "O Campo Nome precisa ser preenchido";
            nomeJtext.setBorder(new LineBorder(Color.red));
            result.add(str);
        }

        if (endereco.getText().isEmpty()) {
            str = "O Campo Endereço precisa ser preenchido";
            endereco.setBorder(new LineBorder(Color.red));
            result.add(str);
        }

        if (cpfJtext.getText().isEmpty()) {
            str = "O Campo CPF precisa ser preenchido";
            cpfJtext.setBorder(new LineBorder(Color.red));
            result.add(str);
        }

        if (cidade.getText().isEmpty()) {
            str = "A cidade Precisa ser selecionada";
            cidade.setBorder(new LineBorder(Color.red));
            estado.setBorder(new LineBorder(Color.red));
            result.add(str);
        }
        if (jTextField3.getText().isEmpty()) {
            str = "O Campo cep precisa ser preenchido";
            jTextField3.setBorder(new LineBorder(Color.red));
            result.add(str);
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < result.size(); i++) {
            builder.append(result.get(i));
            builder.append("\n");
        }

        JOptionPane.showMessageDialog(nomeJtext, builder);
    }
}
