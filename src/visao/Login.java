package visao;

import ConexaoBD.ConexaoBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    ConexaoBD con = new ConexaoBD();
    CadastroUsuario cadusr = new CadastroUsuario();
    
    public Login() {
        initComponents();
        con.conexao();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonAcessar = new javax.swing.JButton();
        jButtonRegeistrar = new javax.swing.JButton();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jPasswordFieldSenha = new javax.swing.JPasswordField();
        jButtonSair = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
        jLabelImgFundoLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButtonAcessar.setText("Acessar");
        jButtonAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAcessarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAcessar);
        jButtonAcessar.setBounds(300, 210, 80, 40);

        jButtonRegeistrar.setForeground(new java.awt.Color(51, 51, 255));
        jButtonRegeistrar.setText("Não é Registrado ? -  Registre-se !");
        jButtonRegeistrar.setToolTipText("Registre-se");
        jButtonRegeistrar.setBorder(null);
        jButtonRegeistrar.setContentAreaFilled(false);
        jButtonRegeistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonRegeistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegeistrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegeistrar);
        jButtonRegeistrar.setBounds(270, 150, 230, 30);

        jLabelUsuario.setText("Usuário:");
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(220, 80, 50, 30);

        jLabelSenha.setText("  Senha:");
        getContentPane().add(jLabelSenha);
        jLabelSenha.setBounds(220, 120, 50, 30);

        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(270, 80, 230, 30);

        jPasswordFieldSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordFieldSenha);
        jPasswordFieldSenha.setBounds(270, 120, 230, 30);

        jButtonSair.setText("Sair");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSair);
        jButtonSair.setBounds(410, 210, 60, 40);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/IconeHorario.png"))); // NOI18N
        getContentPane().add(jLabelLogo);
        jLabelLogo.setBounds(50, 70, 90, 100);

        jLabelImgFundoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/FundoLogin.jpg"))); // NOI18N
        jLabelImgFundoLogin.setText("Login");
        jLabelImgFundoLogin.setToolTipText("Login");
        getContentPane().add(jLabelImgFundoLogin);
        jLabelImgFundoLogin.setBounds(0, 0, 520, 280);

        setSize(new java.awt.Dimension(537, 312));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordFieldSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldSenhaActionPerformed

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void jButtonAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAcessarActionPerformed
        try {
            if(jTextFieldUsuario.getText().length() == 0){
                JOptionPane.showMessageDialog(rootPane, "O campo usuário vazio");
                jTextFieldUsuario.requestFocus();
            } else{
                if (jPasswordFieldSenha.getText().length() == 0){
                    JOptionPane.showMessageDialog(rootPane, "O campo senha vazio");
                    jPasswordFieldSenha.requestFocus();
                } else{
                    con.executaSql("select * from aluno where login='"+ jTextFieldUsuario.getText() +"'");
                    con.rs.first();
                    if(con.rs.getString("senha").equals(jPasswordFieldSenha.getText())){
                        Principal tela = new Principal(jTextFieldUsuario.getText());
                        tela.setVisible(true);
                        dispose();
                    } else{
                        JOptionPane.showMessageDialog(rootPane, "Usuário ou Senha Inválidos");
                    }
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(rootPane, "Usuário ou Senha Inválidos");
        }
    }//GEN-LAST:event_jButtonAcessarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        con.desconecta();
        System.exit(0);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonRegeistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegeistrarActionPerformed
        if(cadusr == null){
            cadusr = new CadastroUsuario();
            cadusr.setVisible(true);
            cadusr.setResizable(false);
        } else{
            cadusr.setVisible(true);
            cadusr.setResizable(false);
        }
    }//GEN-LAST:event_jButtonRegeistrarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAcessar;
    private javax.swing.JButton jButtonRegeistrar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabelImgFundoLogin;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPasswordField jPasswordFieldSenha;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}