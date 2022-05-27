package br.com.farmacia.factory;

import com.mysql.jdbc.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private static final String user = "root";
	private static final String pass = "1234";
	
	private static final String url = "jdbc:mysql://localhost:3306/farmacia";
	
	public static Connection createConnToSQL() {
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, pass);
			
		} catch(SQLException e){
			System.out.println("Erro no SQL");
		} catch (Exception e) {
			System.out.println("Erro geral");
		}

		return conn;
	}
	
	public static void main(String[] args) throws Exception{
		
		Connection conn = createConnToSQL();
		
		if (conn != null) {
			System.out.println("Conexão rodando corretamente!");
			//conn.close();
		}
	}
	
}
