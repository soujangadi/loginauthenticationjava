package com.rakuten.dao;

import com.rakuten.beans.Login;
import com.rakuten.beans.User;

public interface UserDao {
	int saveUsers(User us);
	User validateUser(Login login);

}