import java.sql.*;
import javax.swing.JOptionPane;

	public class Conexao {
	    private Connection Con = null;
	    private Statement Stmt = null;
	    
	    public Conexao(){
	        try {
	            Con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=AulaJava","sa","teste11");
	            Stmt = Con.createStatement();
	        } catch (SQLException e) {
	        	JOptionPane.showMessageDialog(null, "esta dando erro");
	        }
	    }
	    public void incluir(String nome, int idade, float peso, float altura, String objetivo){        
	        try {
	            Stmt.executeUpdate("insert into tb_aluno (nome, idade, peso, altura, objetivo)values("+"'"+ nome +"'"+","+idade+","+peso+","+altura+",'"+objetivo+"')");
	            JOptionPane.showMessageDialog(null, "enviado");
	        } catch (SQLException e) {
	        	JOptionPane.showMessageDialog(null, "Não enviado");
	        }        
	    }
	}