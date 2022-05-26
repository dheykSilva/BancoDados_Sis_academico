package persistencia;

import ConexaoBD.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import vo.DiaVO;

public class DiaDAO {
    
    ConexaoBD conect = new ConexaoBD();
    DiaVO dia = new DiaVO();
    
    public void salvarDia(DiaVO dia) {
    conect.conexao();
    try{
        PreparedStatement pst = conect.con.prepareStatement("insert into dia(nome_dia) values(?)");
        pst.setString(1, dia.getNomeDia());
        pst.execute();
        JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
    }catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao inserir dados"+ex);
    }
    conect.desconecta();
    }
    
    public void editarDia (DiaVO dia) {
        conect.conexao();
        try{
            PreparedStatement pst = conect.con.prepareStatement("update dia set nome_dia=? where cod_dia=?");
            pst.setString(1, dia.getNomeDia());
            pst.setInt(2, dia.getCodigo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados alterados com sucesso");
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar dados"+ex);
        }
        conect.desconecta();
    }
    
    public void excluirDia (DiaVO dia) {
    conect.conexao();
    try {
        PreparedStatement pst = conect.con.prepareStatement("delete from dia where cod_dia=?");
        pst.setInt(1, dia.getCodigo());
        pst.execute();
        JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao excluir dados!"+ex);
    }
    conect.desconecta();
    }
    
    
}