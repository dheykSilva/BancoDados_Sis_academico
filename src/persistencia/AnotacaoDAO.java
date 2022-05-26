package persistencia;

import ConexaoBD.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import vo.AnotacaoVO;

public class AnotacaoDAO {
    
    ConexaoBD conect = new ConexaoBD();
    ConexaoBD conNome = new ConexaoBD();
    AnotacaoVO ano = new AnotacaoVO();
    int cod;
    int cod2;
    String busNome;
    
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
    
    public void buscaCod(String nome){
        conect.conexao();
        conect.executaSql("select * from disciplina where nome ='"+nome+"'");
        try {
            conect.rs.first();
            cod = conect.rs.getInt("cod_disciplina");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar disciplina!"+ex);
        }
        conect.desconecta();
    }
    
    public void buscaNome(int cod){
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
    
    public void salvar(AnotacaoVO ano) {
        buscaCod(ano.getNomeDisciplina());
        buscaCodAluno(ano.getAluno());
        conect.conexao();
        try{
            PreparedStatement pst = conect.con.prepareStatement("insert into anotacao(data_comentario,comentario,cod_disciplina,cod_aluno) values(?,?,?,?)");
            pst.setDate(1, new java.sql.Date(ano.getData().getTime()));
            pst.setString(2, ano.getAnotacao());
            pst.setInt(3, cod); 
            pst.setInt(4, cod2);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados"+ex);
        }
        conect.desconecta();
    }
    
    public AnotacaoVO buscaAnotacao(AnotacaoVO ano) {
        conect.conexao();
        try {
            conect.executaSql("select * from anotacao where comentario like '%"+ano.getPesquisa()+"%'");
            conect.rs.first();
            buscaNome(conect.rs.getInt("cod_disciplina"));
            ano.setCodigo(conect.rs.getInt("cod_anotacao"));
            ano.setData(conect.rs.getDate("data_comentario"));
            ano.setAnotacao(conect.rs.getString("comentario"));
            ano.setNomeDisciplina(busNome);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar anotação!"+ex);
        }
        conect.desconecta();
        return ano;
    }
    
    public void editar (AnotacaoVO ano) {
        buscaCod(ano.getNomeDisciplina());
        buscaCodAluno(ano.getAluno());
        conect.conexao();
        try{
            PreparedStatement pst = conect.con.prepareStatement("update anotacao set data_comentario=?,comentario=?,cod_disciplina=?,cod_aluno=? where cod_anotacao=?");
            pst.setDate(1, new java.sql.Date(ano.getData().getTime()));
            pst.setString(2, ano.getAnotacao());
            pst.setInt(3, cod);
            pst.setInt(4, cod2);
            pst.setInt(5, ano.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar dados"+ex);
        }
        conect.desconecta();
    }
    
    public void excluir (AnotacaoVO ano) {
        conect.conexao();
        try {
            PreparedStatement pst = conect.con.prepareStatement("delete from anotacao where cod_anotacao=?");
            pst.setInt(1, ano.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir dados!"+ex);
        }
        conect.desconecta();
    }
}