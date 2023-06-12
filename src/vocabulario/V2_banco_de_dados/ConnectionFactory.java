package vocabulario.V2_banco_de_dados;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	public void connectionFactory() {
		try {
			// step1 load the driver class
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL","tm_miguel_lima", "101204");

			// step3 create the statement object
			Statement stmt = con.createStatement();

			// step4 execute query
			ResultSet rs = stmt.executeQuery("select * from t_voc_dictionary");
			while (rs.next())
//				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3)); // todos os elementos da tabela

//			System.out.println(rs.getInt(1)); // somente o id
				System.out.println(rs.getString(2)); // somente a tradução
//			System.out.println(rs.getString(3)); // somente a palavra em ingles

			// step5 close the connection object
			con.close();

		} catch (Exception e) {
			System.out.println("Nao foi possviel conectar ao banco de dados - erro: ");
			System.out.println(e);
		}

	}
}
