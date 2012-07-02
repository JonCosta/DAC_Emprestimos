package dao;

//Pacotes de importa��o
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.mysql.jdbc.exceptions.* ;

import jdbc.ConnectionFactory;

public class TransacaoDAO {

private Connection connection = null ;
	
	public TransacaoDAO(){
		
		try{
			this.connection = new ConnectionFactory().getConnection() ;
		}catch(SQLException e){
			throw new RuntimeException(e) ;
		}
		
	}//Fecha construtor
	
}
