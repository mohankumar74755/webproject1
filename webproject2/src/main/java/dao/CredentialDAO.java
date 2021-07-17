package dao;

import java.sql.Connection;

import java.sql.PreparedStatement;

import model.Credential;

public class CredentialDAO {
	
	Connection conn;
	
	public CredentialDAO()throws Exception
	{
		conn=utility.DBConn.getMySQLConnection();
	}

	public void insertCredential(Credential credential)throws Exception
{
		PreparedStatement psmt=conn.prepareStatement("insert into Customer Values(?,?,?,?,?,?)"); 
		
		psmt.setString(1, credential.getFirstname());
		psmt.setString(2, credential.getLastname());
		psmt.setString(3, credential.getDateofbirth());
		psmt.setString(4, credential.getEmailaddress());
		psmt.setString(5, credential.getContactnumber());
		psmt.setString(6, credential.getPassword());

        int row_eff=psmt.executeUpdate();

   }
	
}
