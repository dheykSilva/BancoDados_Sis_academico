package persistencia;

import ConexaoBD.ConexaoBD;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import vo.AtividadeVO;

public class AtividadeDAO {
    
    ConexaoBD conect = new ConexaoBD();
    ConexaoBD conNome = new ConexaoBD();
    ConexaoBD conNome2 = new ConexaoBD();
    AtividadeVO atv = new AtividadeVO();
    int cod;
    int cod2;
    int cod3;
    String busNome;
    String busNome2;
    
    public void buscaCodAluno(String nome3){
        conect.conexao();
        conect.executaSql("select * from aluno where login ='"+nome3+"'");
        try {
            conect.rs.first();
            cod3 = conect.rs.getInt("cod_aluno");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar codigo do aluno!"+ex);
        }
        conect.desconecta();
    }
    
    public void buscaCodTipoAtividade(String nome){
        conect.conexao();
        conect.executaSql("select * from tipo_atividade where descricao ='"+nome+"'");
        try {
            conect.rs.first();
            cod = conect.rs.getInt("cod_tipo_atividade");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar tipo de atividade!"+ex);
        }
        conect.desconecta();
    }
    
    public void buscaNomeTipoAtividade(int cod){
        conNome.conexao();
        try {
            conNome.executaSql("select * from tipo_atividade where cod_tipo_atividade="+cod);
            conNome.rs.first();
            busNome = conNome.rs.getString("descricao");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar nome do tipo de atividade!"+ex);
        }
        conNome.desconecta();
    }
    
    public void buscaCodDisciplina(String nome2){
        conect.conexao();
        conect.executaSql("select * from disciplina where nome ='"+nome2+"'");
        try {
            conect.rs.first();
            cod2 = conect.rs.getInt("cod_disciplina");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar disciplina!"+ex);
        }
        conect.desconecta();
    }
    
    public void buscaNomeDisciplina(int cod2){
        conNome2.conexao();
        try {
            conNome2.executaSql("select * from disciplina where cod_disciplina="+cod2);
            conNome2.rs.first();
            busNome2 = conNome2.rs.getString("nome");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar nome da disciplina!"+ex);
        }
        conNome2.desconecta();
    }
    
    public void salvar(AtividadeVO atv) {
        buscaCodTipoAtividade(atv.getTipoAtividade());
        buscaCodDisciplina(atv.getNomeDisciplina());
        buscaCodAluno(atv.getAluno());
        conect.conexao();
        try{
            PreparedStatement pst = conect.con.prepareStatement("insert into atividade(data_entrega_atividade,conteudo,entregue,cod_disciplina,cod_tipo_atividade,cod_aluno) values(?,?,?,?,?,?)");
            pst.setDate(1, new java.sql.Date(atv.getDataAtividade().getTime()));
            pst.setString(2, atv.getConteudo());
            pst.setString(3, atv.getEntrega());
            pst.setInt(4, cod2);
            pst.setInt(5, cod); 
            pst.setInt(6, cod3);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados"+ex);
        }
        conect.desconecta();
    }
    
    public AtividadeVO buscaAtividade(AtividadeVO atv) {
        conect.conexao();
        try {
            conect.executaSql("select * from atividade where conteudo like '%"+atv.getPesquisa()+"%'");
            conect.rs.first();
            buscaNomeTipoAtividade(conect.rs.getInt("cod_tipo_atividade"));
            buscaNomeDisciplina(conect.rs.getInt("cod_disciplina"));
            atv.setCodigo(conect.rs.getInt("cod_atividade"));
            atv.setConteudo(conect.rs.getString("conteudo"));
            atv.setEntrega(conect.rs.getString("entregue"));
            atv.setNomeDisciplina(busNome2);
            atv.setTipoAtividade(busNome);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar atividade!"+ex);
        }
        conect.desconecta();
        return atv;
    }
    
    public void editar (AtividadeVO atv) {
        buscaCodTipoAtividade(atv.getTipoAtividade());
        buscaCodDisciplina(atv.getNomeDisciplina());
        buscaCodAluno(atv.getAluno());
        conect.conexao();
        try{
            PreparedStatement pst = conect.con.prepareStatement("update atividade set data_entrega_atividade=?,conteudo=?,entregue=?,cod_disciplina=?,cod_tipo_atividade=?,cod_aluno=? where cod_atividade=?");
            pst.setDate(1, new java.sql.Date(atv.getDataAtividade().getTime()));
            pst.setString(2, atv.getConteudo());
            pst.setString(3, atv.getEntrega());
            pst.setInt(4, cod2);
            pst.setInt(5, cod);
            pst.setInt(6, cod3);
            pst.setInt(7, atv.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar dados"+ex);
        }
        conect.desconecta();
    }
    
    public void excluir (AtividadeVO atv) {
        conect.conexao();
        try {
            PreparedStatement pst = conect.con.prepareStatement("delete from atividade where cod_atividade=?");
            pst.setInt(1, atv.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados!"+ex);
        }
        conect.desconecta();
    }
    
    public AtividadeVO buscaAtividadePorCod(int cod) {
        
        AtividadeVO atvp = new AtividadeVO();
        
        conect.conexao();
        conect.executaSql("select data_entrega_atividade,nome,descricao,conteudo,entregue from atividade inner join disciplina on atividade.cod_disciplina = disciplina.cod_disciplina inner join tipo_atividade on atividade.cod_tipo_atividade = tipo_atividade.cod_tipo_atividade where cod_atividade='"+cod+"'");
        
        try {
            conect.rs.first();
            atvp.setDataAtividade(conect.rs.getDate("data_entrega_atividade"));
            atvp.setNomeDisciplina(conect.rs.getString("nome"));
            atvp.setTipoAtividade(conect.rs.getString("descricao"));
            atvp.setConteudo(conect.rs.getString("conteudo"));
            atvp.setEntrega(conect.rs.getString("entregue"));;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar!"+ex);
        }
        conect.desconecta();
        return atvp;
    }
}