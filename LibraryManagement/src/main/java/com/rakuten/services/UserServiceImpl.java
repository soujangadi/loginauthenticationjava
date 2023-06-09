package com.rakuten.services;



import org.springframework.beans.factory.annotation.Autowired;

import com.rakuten.beans.Login;
import com.rakuten.beans.User;
import com.rakuten.dao.UserDao;

public class UserServiceImpl implements UserService{
		
		@Autowired
		UserDao dao;

		@Override
		public int saveUser(User user) {
			return dao.saveUsers(user);
		}

		@Override
		public User validateUser(Login login) {
			return dao.validateUser(login);
		}

		


}
