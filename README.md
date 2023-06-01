# Vocabulario
Sorteia palavras em ingles e o usuario tera uma tentativa para acertar a tradução.
package vocabulario.banco_de_dados_V2;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	Class.forNmae("oracle.jdbc.driver.OracleDriver");

	private String usuario = "tm_miguel_lima", senha = "101204", host = "oracle.fiap.com.br", porta = "1521",
			bd = "ORCL";

	public Connection onConnection() {
		try {
			Connection c = DriverManager.getConnection(
					"jdbc:oracle://" + host + ":" + porta + "/" + bd + "?useTimezone=true&serverTimezone=UTC", usuario,
					senha);
			
			
			
				//			"jdbc:oracle:thin:@localhost:1521:orcl","system","tiger" // peguei de um video do youtube --> https://www.youtube.com/watch?v=mX2vqAle9Ss&ab_channel=realNameHidden
			return c;
		} catch (Exception e) {
			System.out.println("Erro na conexao");
			return null;
		}
	}

}
