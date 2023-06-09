package com.rakuten.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.rakuten.beans.Login;
import com.rakuten.beans.User;
import com.rakuten.services.UserService;


	public class UseDaoImpl implements UserDao {

	    

	    @Autowired
	   public JdbcTemplate jdbcTemplate;
	       
	    @Autowired
	    public UserService userService;


		public int updateUsers(User us) {
			String updateQuery = "Update user set username='"+us.getUsername()+"',userpassword='"
					+us.getPassword()
					+"',userrole='"
					+us.getRole()+"'"
					+"where userid="+us.getUserid()+"";
			return jdbcTemplate.update(updateQuery);
		}
		public int deleteUsers(int userid) {
			String deleteQuery="Delete from user where userid="+userid+"";
			return jdbcTemplate.update(deleteQuery);
		}
		public User getUsersById(int userid){
			String fetchSingleRecord="Select * from user where userid=?";
			return jdbcTemplate.queryForObject(fetchSingleRecord,
											new Object[] {userid},
											new BeanPropertyRowMapper<User>(User.class));

		}
		public List<User> getAllUser(){
			return jdbcTemplate.query("Select * from user", new RowMapper<User>() {
				
				@Override

				public User mapRow(ResultSet rs, int rowNum) throws SQLException {
					User u = new User();
					
					u.setUserid(rs.getInt(1));
				    u.setUsername(rs.getString(2));
				    u.setPassword(rs.getString(3));
				    u.setRole(rs.getString(4));
				
				return u;
				}
				
			});
					
		}

		@Override
		public int saveUsers(User user) {
			String sql="insert into user (username,userpassword,userrole)values(?,?,?)";
			return jdbcTemplate.update(sql,new Object[] {user.getUsername(),user.getRole(),
					 user.getPassword()});
		}

		@Override
		public User validateUser(Login login) {
			String sql="select * from user where username='"+login.getUsername()+"' and userpassword='"
					+login.getPassword()+"'";
			List<User> user= jdbcTemplate.query(sql, new userMapper());
			return user.size()>0 ? user.get(0):null;
		}
		class userMapper implements RowMapper<User>{

			

			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User us = new User();
				us.setUsername(rs.getString(2));
				us.setPassword(rs.getString(3));
				return us;
			}
			
		}

}
