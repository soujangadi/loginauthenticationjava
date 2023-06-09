 package com.rakuten.daos;
 import java.sql.ResultSet;
 import java.sql.SQLException;
 import java.util.List;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.jdbc.core.JdbcTemplate;
 import org.springframework.jdbc.core.RowMapper;

 import com.rakuten.beans.Login;
 import com.rakuten.beans.User;

 public class UserDaoImpl implements UserDao {

 	@Autowired
 	public JdbcTemplate jdbcTemplate;

 	@Override
 	public int register(User user) {
 		String sql="insert into users(username,password,email,phone,firstname,lastname,address) values(?,?,?,?,?,?,?)";
 		return jdbcTemplate.update(sql, new Object[] {user.getUsername(),user.getPassword(),user.getEmail(),
 				user.getPhone(),user.getFirstname(),user.getLastname(),user.getAddress()
 		});

 	}

 	@Override
 	public User validateUser(Login login) {
 		String sql = "select * from users where username='"
 				+login.getUsername()+"' and password='"+login.getPassword()+"'";
 		List<User> users = jdbcTemplate.query(sql, new Usermapper());
 		return users.size()>0 ? users.get(0):null;//users.get(index:0)

 	}

 }

 class Usermapper implements RowMapper<User>{

 	@Override
 	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
 		User user = new User();
 		user.setUsername(rs.getString("username"));
 		user.setEmail(rs.getString("email"));
 		user.setPassword(rs.getString("password"));
 		user.setPhone(rs.getInt("phone"));
 		user.setFirstname(rs.getString("firstname"));
 		user.setLastname(rs.getString("lastname"));
 		user.setAddress(rs.getString("address"));
 		return user;
 	}

 }


	

 


