package persistencia;

import ConexaoBD.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import vo.ProfessorVO;

public class ProfessorDAO {
    
    ConexaoBD conex = new ConexaoBD();
    ProfessorVO prof = new ProfessorVO();
    
    public void salvar (ProfessorVO prof){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("insert into professor(nome,contato) values(?,?)");
            pst.setString(1, prof.getNome());
            pst.setString(2, prof.getContatos());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados!"+ex);
        }
        conex.desconecta();
    }
    
    public ProfessorVO buscaProfessor (ProfessorVO prof){
        conex.conexao();
        conex.executaSql("select * from professor where nome like'%"+prof.getPesquisa()+"%'");
        try {
            conex.rs.first();
            prof.setCodigo(conex.rs.getInt("cod_professor"));
            prof.setNome(conex.rs.getString("nome"));
            prof.setContatos(conex.rs.getString("contato"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Professor não cadastrado!");
        }
        conex.desconecta();
        return prof;
    }
    
    public void editar (ProfessorVO prof){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("update professor set nome=?, contato=? where cod_professor=?");
            pst.setString(1, prof.getNome());
            pst.setString(2, prof.getContatos());
            pst.setInt(3, prof.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar dados!"+ex);
        }
        conex.desconecta();
    }
    
    public void excluir (ProfessorVO prof){
        conex.conexao();
        try {
            PreparedStatement pst = conex.con.prepareStatement("delete from professor where cod_professor=?");
            pst.setInt(1, prof.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro ao excluir dados!"+ex);
            JOptionPane.showConfirmDialog(null, "Não é possível excluir, professor em uso", "Aviso", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
        }
        conex.desconecta();
    }
}