package persistencia;

import ConexaoBD.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import vo.HoraVO;

public class HoraDAO {
    
    ConexaoBD cone = new ConexaoBD();
    
    public void salvar(HoraVO hora){
        cone.conexao();
        try {
            PreparedStatement pst = cone.con.prepareStatement("insert into horario(hora_inicio,hora_termino) values(?,?)");
//            pst.setTime(1, new java.sql.Time());
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir dados"+ex);
        }
        cone.desconecta();
    }
}