
	package com.rakuten.daos;

	import com.rakuten.beans.Login;
	import com.rakuten.beans.User;

	public interface UserDao {
		
		int register(User user);
		User validateUser(Login login);

	}


