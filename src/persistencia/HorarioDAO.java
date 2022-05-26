package persistencia;

import ConexaoBD.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import vo.DisciplinaDiaVO;

public class HorarioDAO {
    
    ConexaoBD conect = new ConexaoBD();
    ConexaoBD conNome = new ConexaoBD();
    ConexaoBD conNome2 = new ConexaoBD();
    ConexaoBD conNome3 = new ConexaoBD();
    ConexaoBD cone = new ConexaoBD();
    DisciplinaDiaVO horario = new DisciplinaDiaVO();
    int cod;
    int cod2;
    int cod3;
    String busNome;
    String busNome2;
    String busNome3;
    
    public void buscaCodDisciplina(String nome){
        conect.conexao();
        conect.buscaSQL("select * from disciplina where nome ='"+nome+"'");
        try {
            conect.rs.first();
            cod = conect.rs.getInt("cod_disciplina");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar codigo da disciplina!"+ex);
        }
        conect.desconecta();
    }
    
    public void buscaCodDia(String nome2){
        conect.conexao();
        conect.buscaSQL("select * from dia where nome_dia ='"+nome2+"'");
        try {
            conect.rs.first();
            cod2 = conect.rs.getInt("cod_dia");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar codigo do dia!"+ex);
        }
        conect.desconecta();
    }
    
    public void buscaCodHorario(String nome3){
        conect.conexao();
        conect.buscaSQL("select * from horario where hora_inicio ='"+nome3+"'");
        try {
            conect.rs.first();
            cod3 = conect.rs.getInt("cod_horario");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar codigo do horario de inicio!"+ex);
        }
        conect.desconecta();
    }
    
    public void buscaNomeDisciplina(int cod){
        conNome.conexao();
        try {
            conNome.buscaSQL("select * from disciplina where cod_disciplina="+cod);
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
            conNome2.buscaSQL("select * from dia where cod_dia="+cod2);
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
            conNome3.buscaSQL("select * from horario where cod_horario="+cod3);
            conNome3.rs.first();
            busNome3 = conNome3.rs.getString("hora_inicio");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar hora de inicio!"+ex);
        }
        conNome3.desconecta();
    }
    
    public void verificaSalvar(DisciplinaDiaVO horario){
        buscaCodDisciplina(horario.getDisciplina());
        buscaCodDia(horario.getDia());
        buscaCodHorario(horario.getHorario());
        conect.conexao();
        try{
            PreparedStatement pst = conect.con.prepareStatement("select * from disciplina_dia where cod_dia ='"+cod2+"' and cod_horario='"+cod3+"'");
            pst.executeQuery();
            ResultSet resultSet = pst.getResultSet();
            if(resultSet.next() == true){
                JOptionPane.showMessageDialog(null, "Horário já cadastrado");
            } else{
                cone.conexao();
                buscaCodDisciplina(horario.getDisciplina());
                buscaCodDia(horario.getDia());
                buscaCodHorario(horario.getHorario());
                try{
                    PreparedStatement pst2 = cone.con.prepareStatement("insert into disciplina_dia(cod_disciplina,cod_dia,cod_horario) values(?,?,?)");
                    pst2.setInt(1, cod);
                    pst2.setInt(2, cod2);
                    pst2.setInt(3, cod3);
                    pst2.execute();
                    JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
                }catch (SQLException ex){
                    JOptionPane.showMessageDialog(null, "Erro ao inserir dados"+ex);
                }
                cone.desconecta();
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro"+ex);
        }
        conect.desconecta();
    }
    
    public void verificaEditar(DisciplinaDiaVO horario){
        buscaCodDisciplina(horario.getDisciplina());
        buscaCodDia(horario.getDia());
        buscaCodHorario(horario.getHorario());
        conect.conexao();
        try{
            PreparedStatement pst = conect.con.prepareStatement("select * from disciplina_dia where cod_dia ='"+cod2+"' and cod_horario='"+cod3+"'");
            pst.executeQuery();
            ResultSet resultSet = pst.getResultSet();
            if(resultSet.next() == true){
                JOptionPane.showMessageDialog(null, "Horário já cadastrado");
            } else{
                cone.conexao();
                buscaCodDisciplina(horario.getDisciplina());
                buscaCodDia(horario.getDia());
                buscaCodHorario(horario.getHorario());
                try{
                    PreparedStatement pst2 = cone.con.prepareStatement("update disciplina_dia set cod_disciplina=?,cod_dia=?,cod_horario=? where cod_disciplina_dia=?");
                    pst2.setInt(1, cod);
                    pst2.setInt(2, cod2);
                    pst2.setInt(3, cod3);
                    pst2.setInt(4, horario.getCodigo());
                    pst2.execute();
                    JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
                } catch(SQLException ex){
                    JOptionPane.showMessageDialog(null, "Erro ao alterar dados"+ex);
                }
                cone.desconecta();
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro"+ex);
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
    
    public DisciplinaDiaVO buscaDisciplinaDiaPorCod(int codigo) {
        DisciplinaDiaVO hora = new DisciplinaDiaVO();
        conect.conexao();
        conect.buscaSQL("select cod_disciplina_dia,nome,nome_dia,hora_inicio,hora_termino from disciplina_dia inner join disciplina on disciplina_dia.cod_disciplina = disciplina.cod_disciplina inner join dia on disciplina_dia.cod_dia = dia.cod_dia inner join horario on disciplina_dia.cod_horario = horario.cod_horario where cod_disciplina_dia='"+codigo+"'");
        try {
            conect.rs.first();
            hora.setDisciplina(conect.rs.getString("nome"));
            hora.setDia(conect.rs.getString("nome_dia"));
            hora.setHoraInicio(conect.rs.getString("hora_inicio"));
            hora.setHoraTermino(conect.rs.getString("hora_termino"));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar Disciplina_Dia!"+ex);
        }
        conect.desconecta();
        return hora;
    }
}