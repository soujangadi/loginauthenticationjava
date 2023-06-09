package com.rakuten.services;
	import org.springframework.beans.factory.annotation.Autowired;

import com.rakuten.beans.Login;
import com.rakuten.beans.User;
import com.rakuten.daos.UserDao;


	public class UserServiceImplemenattion implements UserService{
		
		@Autowired
		public UserDao userdao;

		@Override
		public int register(User user) {
			return userdao.register(user);
		}

		@Override
		public User validateUser(Login login) {
			return userdao.validateUser(login);
		}

	

		


}
