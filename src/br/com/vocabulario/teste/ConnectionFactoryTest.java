package br.com.vocabulario.teste;

import java.sql.SQLException;

import br.com.vocabulario.connection.ConnectionFactory;

public class ConnectionFactoryTest {
	public static void main(String[] args) {
		ConnectionFactory cf = new ConnectionFactory();
		try {
			cf.conectar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
