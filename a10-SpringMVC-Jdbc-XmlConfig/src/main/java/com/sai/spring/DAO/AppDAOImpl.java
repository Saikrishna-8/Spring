package com.sai.spring.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;


import com.sai.spring.model.User;

public class AppDAOImpl implements AppDAO {

	private DataSource dataSource;

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

			connection = dataSource.getConnection();
			PreparedStatement ps = connection.prepareStatement(SQL);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				User user = new User(rs.getInt("user_id"), "name", "email");
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
