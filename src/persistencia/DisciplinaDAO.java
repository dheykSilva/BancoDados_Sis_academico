package persistencia;

import ConexaoBD.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import vo.DisciplinaVO;

public class DisciplinaDAO {
    
    ConexaoBD conect = new ConexaoBD();
    ConexaoBD conNome = new ConexaoBD();
    ConexaoBD conNome2 = new ConexaoBD();
    DisciplinaVO disVO = new DisciplinaVO();
    int cod;
    int cod2;
    String busNome;
    String busNome2;
    
    public void buscaCodProfessor(String nome){
        conect.conexao();
        conect.executaSql("select * from professor where nome ='"+nome+"'");
        try {
            conect.rs.first();
            cod = conect.rs.getInt("cod_professor");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar codigo do professor!"+ex);
        }
        conect.desconecta();
    }
    
    public void buscaCodAluno(String nome2){
        conect.conexao();
        conect.executaSql("select * from aluno where login ='"+nome2+"'");
        try {
            conect.rs.first();
            cod2 = conect.rs.getInt("cod_aluno");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar codigo do aluno!"+ex);
        }
        conect.desconecta();
    }
    
    public void buscaNomeProfessor(int cod){
        conNome.conexao();
        try {
            conNome.executaSql("select * from professor where cod_professor="+cod);
            conNome.rs.first();
            busNome = conNome.rs.getString("nome");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar nome do professor!"+ex);
        }
        conNome.desconecta();
    }
    
    public void buscaNomeAluno(int cod2){
        conNome2.conexao();
        try {
            conNome2.executaSql("select * from aluno where cod_aluno="+cod2);
            conNome2.rs.first();
            busNome2 = conNome2.rs.getString("nome");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar nome do aluno!"+ex);
        }
        conNome2.desconecta();
    }
    
    public void salvar(DisciplinaVO disVO) {
        buscaCodProfessor(disVO.getProfessor());
        buscaCodAluno(disVO.getAluno());
        conect.conexao();
        try{
            PreparedStatement pst = conect.con.prepareStatement("insert into disciplina(nome,carga_horaria,sigla,cod_aluno,cod_professor) values(?,?,?,?,?)");
            pst.setString(1, disVO.getNome());
            pst.setInt(2, disVO.getCargaHoraria());
            pst.setString(3, disVO.getSigla());
            pst.setInt(4, cod2);
            pst.setInt(5, cod); 
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados"+ex);
        }
        conect.desconecta();
    }
    
    public void editar (DisciplinaVO disVO) {
        buscaCodProfessor(disVO.getProfessor());
        buscaCodAluno(disVO.getAluno());
        conect.conexao();
        try{
            PreparedStatement pst = conect.con.prepareStatement("update disciplina set nome=?,carga_horaria=?,sigla=?,cod_aluno=?,cod_professor=? where cod_disciplina=?");
            pst.setString(1, disVO.getNome());
            pst.setInt(2, disVO.getCargaHoraria());
            pst.setString(3, disVO.getSigla());
            pst.setInt(4, cod2);
            pst.setInt(5, cod); 
            pst.setInt(6, disVO.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar dados"+ex);
        }
        conect.desconecta();
    }
    
    public void excluir (DisciplinaVO disVO) {
        conect.conexao();
        try {
            PreparedStatement pst = conect.con.prepareStatement("delete from disciplina where cod_disciplina=?");
            pst.setInt(1, disVO.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro ao excluir dados!"+ex);
            JOptionPane.showConfirmDialog(null, "Não é possível excluir, disciplina em uso", "Aviso", JOptionPane.CLOSED_OPTION, JOptionPane.WARNING_MESSAGE);
        }
        conect.desconecta();
    }
    
    public DisciplinaVO buscaDisciplina(DisciplinaVO disVO) {
        conect.conexao();
        try {
            conect.executaSql("select * from disciplina where nome like '%"+disVO.getPesquisa()+"%'");
            conect.rs.first();
            buscaNomeAluno(conect.rs.getInt("cod_aluno"));
            buscaNomeProfessor(conect.rs.getInt("cod_professor"));
            disVO.setCodigo(conect.rs.getInt("cod_disciplina"));
            disVO.setNome(conect.rs.getString("nome"));
            disVO.setCargaHoraria(conect.rs.getInt("carga_horaria"));
            disVO.setSigla(conect.rs.getString("sigla"));
            disVO.setAluno(busNome2);
            disVO.setProfessor(busNome);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar atividade!"+ex);
        }
        conect.desconecta();
        return disVO;
    }
}