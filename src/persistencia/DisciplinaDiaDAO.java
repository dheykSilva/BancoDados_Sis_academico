package persistencia;

import ConexaoBD.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import vo.DisciplinaDiaVO;

public class DisciplinaDiaDAO {
    
    ConexaoBD conect = new ConexaoBD();
    ConexaoBD conNome = new ConexaoBD();
    ConexaoBD conNome2 = new ConexaoBD();
    ConexaoBD conNome3 = new ConexaoBD();
    DisciplinaDiaVO horario = new DisciplinaDiaVO();
    int cod;
    int cod2;
    int cod3;
    String busNome;
    String busNome2;
    String busNome3;
    
    public void buscaCodDisciplina(String nome){
        conect.conexao();
        conect.executaSql("select * from disciplina where nome ='"+nome+"'");
        try {
            conect.rs.first();
            cod = conect.rs.getInt("cod_disciplina");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar codigo da disciplina!"+ex);
        }
        conect.desconecta();
    }
    
    public void buscaCodDia(String nome){
        conect.conexao();
        conect.executaSql("select * from dia where nome_dia ='"+nome+"'");
        try {
            conect.rs.first();
            cod = conect.rs.getInt("cod_dia");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar codigo do dia!"+ex);
        }
        conect.desconecta();
    }
    
    public void buscaCodHorario(String nome){
        conect.conexao();
        conect.executaSql("select * from horario where hora_inicio ='"+nome+"'");
        try {
            conect.rs.first();
            cod = conect.rs.getInt("cod_horario");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar codigo do horario de inicio!"+ex);
        }
        conect.desconecta();
    }
    
    public void buscaNomeDisciplina(int cod){
        conNome.conexao();
        try {
            conNome.executaSql("select * from disciplina where cod_disciplina="+cod);
            conNome.rs.first();
            busNome = conNome.rs.getString("nome");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar nome da disciplina!"+ex);
        }
        conNome.desconecta();
    }
    
    public void buscaNomeDia(int cod2){
        conNome2.conexao();
        try {
            conNome2.executaSql("select * from dia where cod_dia="+cod2);
            conNome2.rs.first();
            busNome2 = conNome2.rs.getString("nome_dia");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar nome do dia!"+ex);
        }
        conNome2.desconecta();
    }
    
    public void buscaNomeHorario(int cod3){
        conNome3.conexao();
        try {
            conNome3.executaSql("select * from horario where cod_horario="+cod3);
            conNome3.rs.first();
            busNome3 = conNome3.rs.getString("hora_inicio");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar hora de inicio!"+ex);
        }
        conNome3.desconecta();
    }
    
    public void salvar(DisciplinaDiaVO horario){
        buscaCodDisciplina(horario.getDisciplina());
        buscaCodDia(horario.getHorario());
        buscaCodHorario(horario.getHorario());
        conect.conexao();
        try{
            PreparedStatement pst = conect.con.prepareStatement("insert into disciplina_dia(cod_disciplina,cod_dia,cod_horario) values(?,?,?)");
            pst.setInt(1, cod);
            pst.setInt(2, cod2);
            pst.setInt(3, cod3);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados"+ex);
        }
        conect.desconecta();
    }
    
    public void editar(DisciplinaDiaVO horario){
        buscaCodDisciplina(horario.getDisciplina());
        buscaCodDia(horario.getHorario());
        buscaCodHorario(horario.getHorario());
        conect.conexao();
        try{
            PreparedStatement pst = conect.con.prepareStatement("update disciplina_dia set cod_disciplina=?,cod_dia=?,cod_horario=? where cod_disciplina_dia=?");
            pst.setInt(1, cod);
            pst.setInt(2, cod2);
            pst.setInt(3, cod3);
            pst.setInt(4, horario.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar dados"+ex);
        }
        conect.desconecta();
    }
    
    public void excluir (DisciplinaDiaVO horario) {
        conect.conexao();
        try {
            PreparedStatement pst = conect.con.prepareStatement("delete from disciplina_dia where cod_disciplina_dia=?");
            pst.setInt(1, horario.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados!"+ex);
        }
        conect.desconecta();
    }
    
    public DisciplinaDiaVO buscaDisciplina_Dia(DisciplinaDiaVO horario) {
        conect.conexao();
        try {
            conect.executaSql("select * from disciplina_dia where data like '%"+horario.getPesquisa()+"%'");
            conect.rs.first();
            buscaNomeDisciplina(conect.rs.getInt("cod_disciplina"));
            buscaNomeDia(conect.rs.getInt("cod_dia"));
            buscaNomeHorario(conect.rs.getInt("cod_horario"));
            horario.setCodigo(conect.rs.getInt("cod_disciplina_dia"));
            horario.setDisciplina(busNome);
            horario.setDia(busNome2);
            horario.setHorario(busNome3);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Disciplina_Dia!"+ex);
        }
        conect.desconecta();
        return horario;
    }
}