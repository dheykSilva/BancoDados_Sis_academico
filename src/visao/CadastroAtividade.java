package visao;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import ConexaoBD.ConexaoBD;
import persistencia.AtividadeDAO;
import vo.AtividadeVO;
import vo.TabelaVO;

public class CadastroAtividade extends javax.swing.JFrame {
    
    AtividadeVO atv = new AtividadeVO();
    AtividadeDAO atvd = new AtividadeDAO();
    ConexaoBD cone = new ConexaoBD();
    int flag = 0;
    CadastroTipoAtividade cadatvt = new CadastroTipoAtividade();
    
    public CadastroAtividade(String usuario) {
        initComponents();
        jTextFieldAluno.setText(usuario);
        preecherTipoAtividade();
        preecherDisciplina();
        preecherTabela("select cod_atividade,nome,descricao,data_entrega_atividade,entregue,conteudo from atividade inner join disciplina on atividade.cod_disciplina = disciplina.cod_disciplina inner join tipo_atividade on atividade.cod_tipo_atividade = tipo_atividade.cod_tipo_atividade order by data_entrega_atividade");
    }

    private CadastroAtividade() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelData = new javax.swing.JLabel();
        jLabelAnotacao = new javax.swing.JLabel();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAnotacao = new javax.swing.JTable();
        jButtonPesquisa = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPaneConteudo = new javax.swing.JTextPane();
        jTextFieldID = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jComboBoxTipoAtividade = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldPesquisa = new javax.swing.JTextField();
        jButtonCadTipoAtividade = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxEntregue = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxDisciplina = new javax.swing.JComboBox<>();
        jDateChooserAtividade = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldAluno = new javax.swing.JTextField();
        jLabelMenCadDisciplina = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelData.setText("Data de Entrega:");

        jLabelAnotacao.setText("Conteúdo:");

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
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

        jButtonEditar.setText("Editar");
        jButtonEditar.setEnabled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setEnabled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jTableAnotacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTableAnotacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableAnotacaoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableAnotacao);

        jButtonPesquisa.setText("Pesquisar");
        jButtonPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisaActionPerformed(evt);
            }
        });

        jTextPaneConteudo.setEnabled(false);
        jScrollPane2.setViewportView(jTextPaneConteudo);

        jTextFieldID.setEnabled(false);
        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });

        jLabelID.setText("Código:");

        jComboBoxTipoAtividade.setEnabled(false);
        jComboBoxTipoAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoAtividadeActionPerformed(evt);
            }
        });

        jLabel1.setText("Tipo de Atividade:");

        jButtonCadTipoAtividade.setText("Cadastrar Tipo de Atividade");
        jButtonCadTipoAtividade.setEnabled(false);
        jButtonCadTipoAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadTipoAtividadeActionPerformed(evt);
            }
        });

        jLabel2.setText("Entregue:");

        jComboBoxEntregue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N", "S" }));
        jComboBoxEntregue.setEnabled(false);

        jLabel3.setText("Disciplina:");

        jComboBoxDisciplina.setEnabled(false);

        jDateChooserAtividade.setEnabled(false);

        jLabel4.setText("Aluno:");

        jTextFieldAluno.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(114, 114, 114)
                                        .addComponent(jLabel3))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(jLabel1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel2)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabelData)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jComboBoxTipoAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                    .addComponent(jButtonCadTipoAtividade))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jDateChooserAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBoxEntregue, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jTextFieldAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(106, 106, 106)
                            .addComponent(jLabelAnotacao)
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabelID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonPesquisa))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(116, 116, 116)
                                .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(178, 178, 178)))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelID, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooserAtividade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelData, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBoxDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jComboBoxTipoAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonCadTipoAtividade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBoxEntregue)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAnotacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPesquisa)
                    .addComponent(jTextFieldPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabelMenCadDisciplina.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabelMenCadDisciplina.setText("Cadastro de Atividade");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelMenCadDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(228, 228, 228))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelMenCadDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(762, 720));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void preecherTipoAtividade() {
        cone.conexao();
        cone.executaSql("select * from tipo_atividade order by descricao");
        try {
            cone.rs.first();
            jComboBoxTipoAtividade.removeAllItems();
            do{
                jComboBoxTipoAtividade.addItem(cone.rs.getString("descricao"));
            } while(cone.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preecher Tipo de Atividade!"+ex);
        }    
        cone.desconecta();
    }
    
    public void preecherDisciplina() {
        cone.conexao();
        cone.executaSql("select * from disciplina order by nome");
        try {
            cone.rs.first();
            jComboBoxDisciplina.removeAllItems();
            do{
                jComboBoxDisciplina.addItem(cone.rs.getString("nome"));
            } while(cone.rs.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao preecher Disciplina!"+ex);
        }    
        cone.desconecta();
    }
    
    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        flag = 1;
        jDateChooserAtividade.setEnabled(true);
        jTextPaneConteudo.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jTextPaneConteudo.setText("");
        jTextFieldID.setText("");
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jButtonPesquisa.setEnabled(false);
        jDateChooserAtividade.setEnabled(true);
        jTableAnotacao.setEnabled(true);
        jTextFieldPesquisa.setEnabled(false);
        jComboBoxTipoAtividade.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonCadTipoAtividade.setEnabled(true);
        jComboBoxDisciplina.setEnabled(true);
        jComboBoxEntregue.setEnabled(true);
        jComboBoxTipoAtividade.setEnabled(true);
    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if(flag == 1){
            atv.setDataAtividade(jDateChooserAtividade.getDate());
            atv.setAluno(jTextFieldAluno.getText());
            atv.setNomeDisciplina((String) jComboBoxDisciplina.getSelectedItem());
            atv.setTipoAtividade((String) jComboBoxTipoAtividade.getSelectedItem());
            atv.setEntrega((String) jComboBoxEntregue.getSelectedItem());
            atv.setConteudo(jTextPaneConteudo.getText());
            if (jTextPaneConteudo.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "O conteúdo não pode ser vazia!");
                jTextPaneConteudo.requestFocus();
            } else{
                atvd.salvar(atv);
                jTextPaneConteudo.setText("");
                jTextFieldID.setText("");
                jTextPaneConteudo.setEnabled(false);
                jButtonSalvar.setEnabled(false);
                jButtonCancelar.setEnabled(false);
                jTableAnotacao.setEnabled(true);
                jDateChooserAtividade.setEnabled(false);
                jButtonPesquisa.setEnabled(true);
                jTextFieldPesquisa.setEnabled(true);
                jComboBoxTipoAtividade.setEnabled(false);
                jButtonNovo.setEnabled(true);
                jButtonCadTipoAtividade.setEnabled(false);
                jComboBoxDisciplina.setEnabled(false);
                jComboBoxEntregue.setEnabled(false);
                jComboBoxTipoAtividade.setEnabled(false);
                preecherTabela("select cod_atividade,nome,descricao,data_entrega_atividade,entregue,conteudo from atividade inner join disciplina on atividade.cod_disciplina = disciplina.cod_disciplina inner join tipo_atividade on atividade.cod_tipo_atividade = tipo_atividade.cod_tipo_atividade order by data_entrega_atividade");
            }
        } else{
            atv.setCodigo(Integer.parseInt(jTextFieldID.getText()));
            atv.setAluno(jTextFieldAluno.getText());
            atv.setDataAtividade(jDateChooserAtividade.getDate());
            atv.setNomeDisciplina((String) jComboBoxDisciplina.getSelectedItem());
            atv.setTipoAtividade((String) jComboBoxTipoAtividade.getSelectedItem());
            atv.setEntrega((String) jComboBoxEntregue.getSelectedItem());
            atv.setConteudo(jTextPaneConteudo.getText());
            if (jTextPaneConteudo.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "O conteúdo não pode ser vazia!");
                jTextPaneConteudo.requestFocus();
            } else{
                atvd.editar(atv);
                jTextPaneConteudo.setText("");
                jTextFieldID.setText("");
                jDateChooserAtividade.setEnabled(false);
                jTextPaneConteudo.setEnabled(false);
                jButtonSalvar.setEnabled(false);
                jButtonNovo.setEnabled(true);
                jButtonCancelar.setEnabled(false);
                jComboBoxTipoAtividade.setEnabled(false);
                jButtonPesquisa.setEnabled(true);
                jTextFieldPesquisa.setEnabled(true);
                jButtonCadTipoAtividade.setEnabled(false);
                jComboBoxDisciplina.setEnabled(false);
                jComboBoxEntregue.setEnabled(false);
                jComboBoxTipoAtividade.setEnabled(false);
                preecherTabela("select cod_atividade,nome,descricao,data_entrega_atividade,entregue,conteudo from atividade inner join disciplina on atividade.cod_disciplina = disciplina.cod_disciplina inner join tipo_atividade on atividade.cod_tipo_atividade = tipo_atividade.cod_tipo_atividade order by data_entrega_atividade");
            }
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisaActionPerformed
        atv.setPesquisa(jTextFieldPesquisa.getText());
        AtividadeVO atvo = atvd.buscaAtividade(atv);
        
        preecherTabela("select cod_atividade,nome,descricao,data_entrega_atividade,entregue,conteudo from atividade inner join disciplina on atividade.cod_disciplina = disciplina.cod_disciplina inner join tipo_atividade on atividade.cod_tipo_atividade = tipo_atividade.cod_tipo_atividade where conteudo like '%"+jTextFieldPesquisa.getText()+"%'");
        
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonCancelar.setEnabled(true);
    }//GEN-LAST:event_jButtonPesquisaActionPerformed

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        flag = 2;
        jDateChooserAtividade.setEnabled(true);
        jTextPaneConteudo.setEnabled(true);
        jButtonSalvar.setEnabled(true);
        jButtonCancelar.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jComboBoxTipoAtividade.setEnabled(true);
        jTextFieldPesquisa.setEnabled(false);
        jButtonPesquisa.setEnabled(false);
        jButtonCadTipoAtividade.setEnabled(true);
        jComboBoxDisciplina.setEnabled(true);
        jComboBoxEntregue.setEnabled(true);
        jComboBoxTipoAtividade.setEnabled(true);
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        jDateChooserAtividade.setEnabled(!true);
        jTextPaneConteudo.setEnabled(!true);
        jButtonSalvar.setEnabled(!true);
        jButtonCancelar.setEnabled(!true);
        jButtonNovo.setEnabled(true);
        jButtonEditar.setEnabled(false);
        jButtonExcluir.setEnabled(false);
        jTextPaneConteudo.setText("");
        jTextFieldID.setText("");
        jTextFieldPesquisa.setEnabled(true);
        jButtonPesquisa.setEnabled(true);
        jComboBoxTipoAtividade.setEnabled(false);
        jButtonCadTipoAtividade.setEnabled(false);
        jComboBoxDisciplina.setEnabled(false);
        jComboBoxEntregue.setEnabled(false);
        preecherTabela("select cod_atividade,nome,descricao,data_entrega_atividade,entregue,conteudo from atividade inner join disciplina on atividade.cod_disciplina = disciplina.cod_disciplina inner join tipo_atividade on atividade.cod_tipo_atividade = tipo_atividade.cod_tipo_atividade order by data_entrega_atividade");
        
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int resp = 0;
        resp = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir a atividade: "+jTextPaneConteudo.getText()+" ?", "Excluir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(resp == JOptionPane.YES_OPTION){
            atv.setCodigo(Integer.parseInt(jTextFieldID.getText()));
            atvd.excluir(atv);
            jTextPaneConteudo.setText("");
            jTextFieldID.setText("");
            jDateChooserAtividade.setEnabled(false);
            jTextPaneConteudo.setEnabled(false);
            jButtonSalvar.setEnabled(false);
            jButtonCancelar.setEnabled(false);
            jButtonEditar.setEnabled(false);
            jButtonExcluir.setEnabled(false);
            jButtonNovo.setEnabled(true);
            jComboBoxTipoAtividade.setEnabled(false);
            jButtonCadTipoAtividade.setEnabled(false);
            jComboBoxDisciplina.setEnabled(false);
            jComboBoxEntregue.setEnabled(false);
            jComboBoxTipoAtividade.setEnabled(false);
            preecherTabela("select cod_atividade,nome,descricao,data_entrega_atividade,entregue,conteudo from atividade inner join disciplina on atividade.cod_disciplina = disciplina.cod_disciplina inner join tipo_atividade on atividade.cod_tipo_atividade = tipo_atividade.cod_tipo_atividade order by data_entrega_atividade");
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jTableAnotacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableAnotacaoMouseClicked
        String pesquisa = ""+jTableAnotacao.getValueAt(jTableAnotacao.getSelectedRow(), 0);
        cone.conexao();
        cone.executaSql("select * from atividade where cod_atividade='"+pesquisa+"'");
        try {
            cone.rs.first();
            jTextFieldID.setText(String.valueOf(cone.rs.getInt("cod_atividade")));
            jDateChooserAtividade.setDate(cone.rs.getDate("data_entrega_atividade"));
            jComboBoxEntregue.setSelectedItem(cone.rs.getString("entregue"));
            jTextPaneConteudo.setText(cone.rs.getString("conteudo"));
            ConexaoBD conPesq = new ConexaoBD();
            conPesq.conexao();
            conPesq.executaSql("select* from disciplina where cod_disciplina="+cone.rs.getInt("cod_disciplina"));
            conPesq.rs.first();
            jComboBoxDisciplina.setSelectedItem(conPesq.rs.getString("nome"));
            conPesq.desconecta();
            ConexaoBD conPesq2 = new ConexaoBD();
            conPesq2.conexao();
            conPesq2.executaSql("select* from tipo_atividade where cod_tipo_atividade="+cone.rs.getInt("cod_tipo_atividade"));
            conPesq2.rs.first();
            jComboBoxTipoAtividade.setSelectedItem(conPesq2.rs.getString("descricao"));
            conPesq2.desconecta();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar dados!"+ex);
        }
        cone.desconecta();
        jButtonEditar.setEnabled(true);
        jButtonExcluir.setEnabled(true);
        jButtonNovo.setEnabled(false);
        jButtonCancelar.setEnabled(true);
    }//GEN-LAST:event_jTableAnotacaoMouseClicked

    private void jComboBoxTipoAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoAtividadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoAtividadeActionPerformed

    private void jButtonCadTipoAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadTipoAtividadeActionPerformed
        if(cadatvt == null){
            cadatvt = new CadastroTipoAtividade();
            cadatvt.setVisible(true);
            cadatvt.setResizable(false);
            dispose();
        } else{
            cadatvt.setVisible(true);
            cadatvt.setResizable(false);
            dispose();
        }
    }//GEN-LAST:event_jButtonCadTipoAtividadeActionPerformed

    public void preecherTabela(String slq){
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"ID","Disciplina","Tipo de Atividade","Data de Entrega", "Entregue", "Conteúdo"};
        cone.conexao();
        cone.executaSql(slq);
        try{
            cone.rs.first();
            do{
                dados.add(new Object[]{cone.rs.getInt("cod_atividade"), cone.rs.getString("nome"), cone.rs.getString("descricao"), cone.rs.getDate("data_entrega_atividade"), cone.rs.getString("entregue"), cone.rs.getString("conteudo")}); 
            } while(cone.rs.next());
        } catch(SQLException ex){
            //JOptionPane.showMessageDialog(rootPane, "Erro ao preencher ArrayList"+ex);
        }
        TabelaVO tab = new TabelaVO(dados, colunas);
        jTableAnotacao.setModel(tab);
        jTableAnotacao.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTableAnotacao.getColumnModel().getColumn(0).setResizable(false);
        jTableAnotacao.getColumnModel().getColumn(1).setPreferredWidth(110);
        jTableAnotacao.getColumnModel().getColumn(1).setResizable(false);
        jTableAnotacao.getColumnModel().getColumn(2).setPreferredWidth(120);
        jTableAnotacao.getColumnModel().getColumn(2).setResizable(false);
        jTableAnotacao.getColumnModel().getColumn(3).setPreferredWidth(100);
        jTableAnotacao.getColumnModel().getColumn(3).setResizable(false);
        jTableAnotacao.getColumnModel().getColumn(4).setPreferredWidth(60);
        jTableAnotacao.getColumnModel().getColumn(4).setResizable(false);
        jTableAnotacao.getColumnModel().getColumn(5).setPreferredWidth(244);
        jTableAnotacao.getColumnModel().getColumn(5).setResizable(false);
        jTableAnotacao.getTableHeader().setReorderingAllowed(false);
        jTableAnotacao.setAutoResizeMode(jTableAnotacao.AUTO_RESIZE_OFF);
        jTableAnotacao.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        cone.desconecta();
    }
    
    
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
            java.util.logging.Logger.getLogger(CadastroAtividade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAtividade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAtividade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAtividade.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new CadastroAtividade().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadTipoAtividade;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisa;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JComboBox<String> jComboBoxDisciplina;
    private javax.swing.JComboBox<String> jComboBoxEntregue;
    private javax.swing.JComboBox<String> jComboBoxTipoAtividade;
    private com.toedter.calendar.JDateChooser jDateChooserAtividade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelAnotacao;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelMenCadDisciplina;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableAnotacao;
    private javax.swing.JTextField jTextFieldAluno;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldPesquisa;
    private javax.swing.JTextPane jTextPaneConteudo;
    // End of variables declaration//GEN-END:variables
}