package visao;

import ConexaoBD.ConexaoBD;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.ListSelectionModel;
import persistencia.HoraDAO;
import vo.HoraVO;
import vo.TabelaVO;

public class CadastroHora extends javax.swing.JFrame {

    ConexaoBD cone = new ConexaoBD();
    HoraVO hora = new HoraVO();
    HoraDAO horad = new HoraDAO();
    int flag = 0;
    
    public CadastroHora(String usuario) {
        initComponents();
        jTextFieldAluno.setText(usuario);
        preecherTabela("select cod_horario,hora_inicio,hora_termino from horario order by cod_horario");
    }

    private CadastroHora() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTipoAtividade = new javax.swing.JTable();
        jButtonExcluir = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jTextFieldID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonPesquisar = new javax.swing.JButton();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonVoltar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldAluno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxHoraInicio = new javax.swing.JComboBox<>();
        jComboBoxHoraTermino = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel2.setText("Cadastro de Hora");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableTipoAtividade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableTipoAtividade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTipoAtividadeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableTipoAtividade);

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setEnabled(false);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setEnabled(false);
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jTextFieldID.setEnabled(false);

        jLabel3.setText("C??digo:");

        jLabel1.setText("Hora de In??cio:");

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jLabel4.setText("Aluno:");

        jTextFieldAluno.setEnabled(false);

        jLabel5.setText("Hora de T??rmino:");

        jComboBoxHoraInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "07:55", "08:45", "08:50", "09:40", "10:00", "10:50", "13:55", "14:45", "14:50", "15:40", "16:00", "16:50", "16:55", "17:45", "17:50", "18:40" }));
        jComboBoxHoraInicio.setEnabled(false);
        jComboBoxHoraInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxHoraInicioActionPerformed(evt);
            }
        });

        jComboBoxHoraTermino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "07:55", "08:45", "08:50", "09:40", "10:00", "10:50", "13:55", "14:45", "14:50", "15:40", "16:00", "16:50", "16:55", "17:45", "17:50", "18:40" }));
        jComboBoxHoraTermino.setEnabled(false);

        jLabel6.setText("Hora de In??cio:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 36, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(158, 158, 158)
                                    .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(101, 101, 101))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextFieldAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jComboBoxHoraTermino, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jComboBoxHoraInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(8, 8, 8))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxHoraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxHoraTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPesquisar)
                    .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(167, 167, 167))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(662, 573));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if(flag == 1){
            hora.setHoraInicio((String) jComboBoxHoraInicio.getSelectedItem());
            hora.setHoraTermino((String) jComboBoxHoraTermino.getSelectedItem());
            horad.salvar(hora);
            jButtonSalvar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonCancelar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jTextFieldID.setText("");
            jTextFieldPesquisa.setText("");
            jTableTipoAtividade.setEnabled(true);
            jButtonPesquisar.setEnabled(true);
            jTextFieldPesquisa.setEnabled(true);
            jComboBoxHoraInicio.setEnabled(false);
            jComboBoxHoraTermino.setEnabled(false);
            preecherTabela("select cod_horario,hora_inicio,hora_termino from horario order by cod_horario");
        } else{
            hora.setCodigo(Integer.parseInt(jTextFieldID.getText()));
            hora.setHoraInicio((String) jComboBoxHoraInicio.getSelectedItem());
            hora.setHoraTermino((String) jComboBoxHoraTermino.getSelectedItem());  
            horad.editar(hora);
            jButtonSalvar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonCancelar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jTextFieldID.setText("");
            jTextFieldPesquisa.setText("");
            jTableTipoAtividade.setEnabled(true);
            jButtonPesquisar.setEnabled(true);
            jTextFieldPesquisa.setEnabled(true);
            jComboBoxHoraInicio.setEnabled(false);
            jComboBoxHoraTermino.setEnabled(false);
            preecherTabela("select cod_horario,hora_inicio,hora_termino from horario order by cod_horario");
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jTextFieldID.setText("");
        jButtonCancelar.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonSalvar.setEnabled(false);
        jButtonNovo.setEnabled(true);
        jTableTipoAtividade.setEnabled(true);
        jButtonPesquisar.setEnabled(true);
        jTextFieldPesquisa.setEnabled(true);
        jComboBoxHoraInicio.setEnabled(false);
        jComboBoxHoraTermino.setEnabled(false);
        preecherTabela("select cod_horario,hora_inicio,hora_termino from horario order by cod_horario");
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int resp = 0;
        resp = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir o hor??rio ", "Excluir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(resp == JOptionPane.YES_OPTION){
            hora.setCodigo(Integer.parseInt(jTextFieldID.getText()));
            horad.excluir(hora);
            jTextFieldID.setText("");
            jButtonSalvar.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jButtonCancelar.setEnabled(false);
            jButtonEditar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            preecherTabela("select cod_horario,hora_inicio,hora_termino from horario order by cod_horario");
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTableTipoAtividadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTipoAtividadeMouseClicked
        String pesquisa = ""+jTableTipoAtividade.getValueAt(jTableTipoAtividade.getSelectedRow(), 0);
        cone.conexao();
        cone.buscaSQL("select cod_horario,hora_inicio,hora_termino from horario where cod_horario='"+pesquisa+"'");
        try {
            cone.rs.first();
            jTextFieldID.setText(String.valueOf(cone.rs.getInt("cod_horario")));
            jComboBoxHoraInicio.setSelectedItem(cone.rs.getString("hora_inicio"));
            jComboBoxHoraTermino.setSelectedItem(cone.rs.getString("hora_termino"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar dados!"+ex);
        }
        cone.desconecta();
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonCancelar.setEnabled(true);
    }//GEN-LAST:event_jTableTipoAtividadeMouseClicked

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag = 1;
        jButtonNovo.setEnabled(false);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jTableTipoAtividade.setEnabled(false);
        jButtonPesquisar.setEnabled(false);
        jTextFieldPesquisa.setEnabled(false);
        jComboBoxHoraInicio.setEnabled(true);
        jComboBoxHoraTermino.setEnabled(true);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        flag = 2;
        jComboBoxHoraInicio.setEnabled(true);
        jComboBoxHoraTermino.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonNovo.setEnabled(false);
        jButtonExcluir.setEnabled(false);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        
        preecherTabela("select cod_horario,hora_inicio,hora_termino from horario where hora_inicio like'%"+jTextFieldPesquisa.getText()+"%'");
        
        jButtonNovo.setEnabled(false);
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonCancelar.setEnabled(true);
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        CadastroHorario cadho = new CadastroHorario(jTextFieldAluno.getText());
        if(cadho == null){
            cadho = new CadastroHorario(jTextFieldAluno.getText());
            cadho.setVisible(true);
            cadho.setResizable(false);
            dispose();
        } else{
            cadho.setVisible(true);
            cadho.setResizable(false);
            dispose();
        }
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jComboBoxHoraInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxHoraInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxHoraInicioActionPerformed

    public void preecherTabela(String slq){
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID","Hora de In??cio","Hora de T??rmino"};
        cone.conexao();
        cone.buscaSQL(slq);
        try{
            cone.rs.first();
            do{
                dados.add(new Object[]{cone.rs.getInt("cod_horario"), cone.rs.getString("hora_inicio"), cone.rs.getString("hora_termino")}); 
            } while(cone.rs.next());
        } catch(SQLException ex){
            //JOptionPane.showMessageDialog(rootPane, "Erro ao preencher ArrayList"+ex);
        }
        TabelaVO tab = new TabelaVO(dados, colunas);
        jTableTipoAtividade.setModel(tab);
        jTableTipoAtividade.getColumnModel().getColumn(0).setPreferredWidth(46);
        jTableTipoAtividade.getColumnModel().getColumn(0).setResizable(false);
        jTableTipoAtividade.getColumnModel().getColumn(1).setPreferredWidth(244);
        jTableTipoAtividade.getColumnModel().getColumn(1).setResizable(false);
        jTableTipoAtividade.getColumnModel().getColumn(2).setPreferredWidth(244);
        jTableTipoAtividade.getColumnModel().getColumn(2).setResizable(false);
        jTableTipoAtividade.getTableHeader().setReorderingAllowed(false);
        jTableTipoAtividade.setAutoResizeMode(jTableTipoAtividade.AUTO_RESIZE_OFF);
        jTableTipoAtividade.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        cone.desconecta();
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CadastroHora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroHora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroHora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroHora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroHora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboBoxHoraInicio;
    private javax.swing.JComboBox<String> jComboBoxHoraTermino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTipoAtividade;
    private javax.swing.JTextField jTextFieldAluno;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldPesquisa;
    // End of variables declaration//GEN-END:variables
}
