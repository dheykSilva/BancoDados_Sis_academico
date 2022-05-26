package persistencia;

import ConexaoBD.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import vo.TipoAtividadeVO;

public class TipoAtividadeDAO {
    
    ConexaoBD conect = new ConexaoBD();
    TipoAtividadeVO atv = new TipoAtividadeVO();
    
    public void salvar(TipoAtividadeVO atv) {
        conect.conexao();
        try{
            PreparedStatement pst = conect.con.prepareStatement("insert into tipo_atividade(descricao) values(?)");
            pst.setString(1, atv.getDescricao());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados"+ex);
        }
        conect.desconecta();
    }
    
    public void excluir (TipoAtividadeVO atv) {
        conect.conexao();
        try{
            PreparedStatement pst = conect.con.prepareStatement("delete from tipo_atividade where cod_tipo_atividade=?");
            pst.setInt(1, atv.getCodigo());
            pst.execute();
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro ao excluir dados!"+ex);
            JOptionPane.showConfirmDialog(null, "Não é possível excluir, tipo de atividade em uso", "Aviso", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
        }
        conect.desconecta();
    }
    
    public TipoAtividadeVO buscaTipoAtividade (TipoAtividadeVO atv){
        conect.conexao();
        try {
            conect.executaSql("select * from tipo_atividade where descricao like '%"+atv.getPesquisa()+"%'");
            conect.rs.first();
            atv.setCodigo(conect.rs.getInt("cod_tipo_atividade"));
            atv.setDescricao(conect.rs.getString("descricao"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Tipo de Atividade não cadastrado!");
        }
        conect.desconecta();
        return atv;
    }
    
    public void editar (TipoAtividadeVO atv){
        conect.conexao();
        try {
            PreparedStatement pst = conect.con.prepareStatement("update tipo_atividade set descricao=? where cod_tipo_atividade=?");
            pst.setString(1, atv.getDescricao());
            pst.setInt(2, atv.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar dados!"+ex);
        }
        conect.desconecta();
    }
}