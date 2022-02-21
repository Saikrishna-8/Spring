package com.sai.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;

import com.sai.model.User;

public class AppDAOImpl implements AppDAO {

	
	private DataSource dataSource;

	@Autowired
	private DataSource dataSource1;
	
	public AppDAOImpl(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public List<User> listUsers() {

		String SQL = "select * from users";
		List<User> listUsers = null;
		Connection connection = null;
		try {
			listUsers = new ArrayList<>();

			System.out.println(dataSource);
			System.out.println(dataSource1);
			//connection = dataSource.getConnection();
			connection = dataSource1.getConnection();
			PreparedStatement ps = connection.prepareStatement(SQL);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				User user = new User(rs.getInt(1), rs.getString(2), rs.getString(3));
				listUsers.add(user);
			}
			rs.close();
			ps.close();

			return listUsers;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return listUsers;
	}

}
