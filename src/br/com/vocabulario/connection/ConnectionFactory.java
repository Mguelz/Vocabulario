package br.com.vocabulario.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {
	private static String ORACLE = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
	private static DataSource conexao = null;

	// singleton para um unico pool de conexoes
	public ConnectionFactory() {

	}

	public Connection conectar() throws SQLException {
		if (conexao == null) {
			final ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
			comboPooledDataSource.setJdbcUrl(ORACLE);
			comboPooledDataSource.setUser("tm_miguel_lima");
			comboPooledDataSource.setPassword("101204");
			// numero maximo de conexoes
			comboPooledDataSource.setMaxPoolSize(20);
			conexao = comboPooledDataSource;

			
			
			
			
			// TODO excluir esta parte depois
			
			// step1 load the driver class
//						Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL",
					"tm_miguel_lima", "101204"); // ("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL","root", "root")

			// step3 create the statement object
			Statement stmt = con.createStatement();

			// step4 execute query
			ResultSet rs = stmt.executeQuery("select * from t_voc_dictionary");
			while (rs.next())
//							System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3)); // todos os elementos da tabela

//						System.out.println(rs.getInt(1)); // somente o id
				System.out.println(rs.getString(2)); // somente a tradução
//						System.out.println(rs.getString(3)); // somente a palavra em ingles

			// step5 close the connection object
			con.close();

		}
		return conexao.getConnection();
	}
}

/*
 * public void connectionFactory() { try { // step1 load the driver class
 * Class.forName("oracle.jdbc.driver.OracleDriver");
 * 
 * Connection con =
 * DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL",
 * "tm_miguel_lima", "101204"); //
 * ("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL","root", "root")
 * 
 * // step3 create the statement object Statement stmt = con.createStatement();
 * 
 * // step4 execute query ResultSet rs =
 * stmt.executeQuery("select * from t_voc_dictionary"); while (rs.next()) //
 * System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " +
 * rs.getString(3)); // todos os elementos da tabela
 * 
 * // System.out.println(rs.getInt(1)); // somente o id
 * System.out.println(rs.getString(2)); // somente a tradução //
 * System.out.println(rs.getString(3)); // somente a palavra em ingles
 * 
 * // step5 close the connection object con.close();
 * 
 * } catch (Exception e) {
 * System.out.println("Nao foi possviel conectar ao banco de dados");
 * System.out.println("erro: " + e); }
 * 
 * }
 */
