package persistencia;

import ConexaoBD.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import vo.UsuarioVO;

public class UsuarioDAO {
    
    ConexaoBD conect = new ConexaoBD();
    UsuarioVO usr = new UsuarioVO();
    
    public void inserir(UsuarioVO usr){
        conect.conexao();
        try {
            PreparedStatement pst = conect.con.prepareStatement("insert into aluno(nome,login,senha,email,sexo) values(?,?,?,?,?)");
            pst.setString(1, usr.getNome());
            pst.setString(2, usr.getUsuario());
            pst.setString(3, usr.getSenha());
            pst.setString(4, usr.getEmail());
            pst.setString(5, usr.getSexo());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados"+ex);
        }
        conect.desconecta();
    }
}