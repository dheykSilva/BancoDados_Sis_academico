package visao;

import ConexaoBD.ConexaoBD;

public class Principal extends javax.swing.JFrame {

    ConexaoBD conecta = new ConexaoBD();
    Login login = new Login();
    
    public Principal(String usuario) {
        initComponents();
        jLabelUsuario.setText(usuario);
        conecta.conexao();
    }

    private Principal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelMenSistema = new javax.swing.JLabel();
        jPanelInterno = new javax.swing.JPanel();
        jLabelMenCadastro = new javax.swing.JLabel();
        jLabeMenlConsulta = new javax.swing.JLabel();
        jButtonCadHorario = new javax.swing.JButton();
        jButtonCadAtividade = new javax.swing.JButton();
        jButtonCadAnotacao = new javax.swing.JButton();
        jButtonConAnotacao = new javax.swing.JButton();
        jButtonConAtividade = new javax.swing.JButton();
        jButtonConHorario = new javax.swing.JButton();
        jButtonLogout = new javax.swing.JButton();
        jLabelUsr = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabelMenSistema.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabelMenSistema.setText("Sistema de gerenciamendo academico para estudantes");
        getContentPane().add(jLabelMenSistema);
        jLabelMenSistema.setBounds(220, 20, 660, 40);

        jPanelInterno.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelInterno.setLayout(null);

        jLabelMenCadastro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelMenCadastro.setText("Cadastros ");
        jPanelInterno.add(jLabelMenCadastro);
        jLabelMenCadastro.setBounds(210, 70, 90, 17);

        jLabeMenlConsulta.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabeMenlConsulta.setText("Consultas ");
        jPanelInterno.add(jLabeMenlConsulta);
        jLabeMenlConsulta.setBounds(720, 70, 90, 17);

        jButtonCadHorario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCadHorario.setText("Horário");
        jButtonCadHorario.setToolTipText("Cadastro de Horário");
        jButtonCadHorario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonCadHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadHorarioActionPerformed(evt);
            }
        });
        jPanelInterno.add(jButtonCadHorario);
        jButtonCadHorario.setBounds(120, 150, 260, 90);

        jButtonCadAtividade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCadAtividade.setText("Atividade");
        jButtonCadAtividade.setToolTipText("Cadastro de Atividade");
        jButtonCadAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadAtividadeActionPerformed(evt);
            }
        });
        jPanelInterno.add(jButtonCadAtividade);
        jButtonCadAtividade.setBounds(120, 260, 260, 90);

        jButtonCadAnotacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCadAnotacao.setText("Anotações");
        jButtonCadAnotacao.setToolTipText("Cadastro de Anotações");
        jButtonCadAnotacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadAnotacaoActionPerformed(evt);
            }
        });
        jPanelInterno.add(jButtonCadAnotacao);
        jButtonCadAnotacao.setBounds(120, 370, 260, 90);

        jButtonConAnotacao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonConAnotacao.setText("Anotações");
        jButtonConAnotacao.setToolTipText("Consulta de Anotações");
        jPanelInterno.add(jButtonConAnotacao);
        jButtonConAnotacao.setBounds(630, 370, 260, 90);

        jButtonConAtividade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonConAtividade.setText("Atividades");
        jButtonConAtividade.setToolTipText("Consulta de Atividades");
        jPanelInterno.add(jButtonConAtividade);
        jButtonConAtividade.setBounds(630, 260, 260, 90);

        jButtonConHorario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonConHorario.setText("Horário");
        jButtonConHorario.setToolTipText("Consulta do Horário");
        jButtonConHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConHorarioActionPerformed(evt);
            }
        });
        jPanelInterno.add(jButtonConHorario);
        jButtonConHorario.setBounds(630, 150, 260, 90);

        getContentPane().add(jPanelInterno);
        jPanelInterno.setBounds(10, 80, 1010, 550);

        jButtonLogout.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        jButtonLogout.setForeground(new java.awt.Color(0, 0, 255));
        jButtonLogout.setText("Sair");
        jButtonLogout.setToolTipText("Sair");
        jButtonLogout.setBorder(null);
        jButtonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogout);
        jButtonLogout.setBounds(910, 30, 110, 40);

        jLabelUsr.setText("Usuário:");
        getContentPane().add(jLabelUsr);
        jLabelUsr.setBounds(10, 640, 50, 20);

        jLabelUsuario.setText("jLabel2");
        getContentPane().add(jLabelUsuario);
        jLabelUsuario.setBounds(60, 640, 240, 20);

        setSize(new java.awt.Dimension(1045, 705));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutActionPerformed
        conecta.desconecta();
        if(login == null){
            login = new Login();
            login.setVisible(true);
            login.setResizable(false);
        } else{
            login.setVisible(true);
            login.setResizable(false);
        }
        dispose();
    }//GEN-LAST:event_jButtonLogoutActionPerformed

    private void jButtonConHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonConHorarioActionPerformed

    private void jButtonCadAnotacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadAnotacaoActionPerformed
        CadastroAnotacao ano = new CadastroAnotacao(jLabelUsuario.getText());
        if(ano == null){
            ano = new CadastroAnotacao(jLabelUsuario.getText());
            ano.setVisible(true);
            ano.setResizable(false);
        } else{
            ano.setVisible(true);
            ano.setResizable(false);
        }
    }//GEN-LAST:event_jButtonCadAnotacaoActionPerformed

    private void jButtonCadAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadAtividadeActionPerformed
        CadastroAtividade cadAtv = new CadastroAtividade(jLabelUsuario.getText());
        if(cadAtv == null){
            cadAtv = new CadastroAtividade(jLabelUsuario.getText());
            cadAtv.setVisible(true);
            cadAtv.setResizable(false);
        } else{
            cadAtv.setVisible(true);
            cadAtv.setResizable(false);
        }      
    }//GEN-LAST:event_jButtonCadAtividadeActionPerformed

    private void jButtonCadHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadHorarioActionPerformed
        CadastroDisciplina casDis = new CadastroDisciplina(jLabelUsuario.getText());
        if(casDis == null){
            casDis = new CadastroDisciplina(jLabelUsuario.getText());
            casDis.setVisible(true);
            casDis.setResizable(false);
        } else{
            casDis.setVisible(true);
            casDis.setResizable(false);
        }
    }//GEN-LAST:event_jButtonCadHorarioActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadAnotacao;
    private javax.swing.JButton jButtonCadAtividade;
    private javax.swing.JButton jButtonCadHorario;
    private javax.swing.JButton jButtonConAnotacao;
    private javax.swing.JButton jButtonConAtividade;
    private javax.swing.JButton jButtonConHorario;
    private javax.swing.JButton jButtonLogout;
    private javax.swing.JLabel jLabeMenlConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelMenCadastro;
    private javax.swing.JLabel jLabelMenSistema;
    private javax.swing.JLabel jLabelUsr;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanelInterno;
    // End of variables declaration//GEN-END:variables
}