package ConexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConexaoBD {
    
    public Statement stm;
    public ResultSet rs;
    public Connection con;
    private String driver = "org.postgresql.Driver";
    private String url = "jdbc:postgresql://localhost:5432/ProjetoBD2";
    private String usr = "postgres";
    //private String pass = "aluno";
    private String pass = "postgres";
    
    public void conexao(){
        try {
            System.setProperty("jdbc.Drivers", driver);
            con = DriverManager.getConnection(url, usr, pass);
            //JOptionPane.showMessageDialog(null, "Conexão estabelecida com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar no banco de dados: "+ex.getMessage());
        }
    }
    
    public void desconecta(){
        try {
            con.close();
            //JOptionPane.showMessageDialog(null, "Conexão encerada com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao desconectar do banco de dados: "+ex.getMessage());
        }
    }
    
        public void executaSql(String sql){
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(null, "Erro executaSql "+ex.getMessage());
        }
    }
}