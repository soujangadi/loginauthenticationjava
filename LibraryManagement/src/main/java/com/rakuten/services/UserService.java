package com.rakuten.services;

import com.rakuten.beans.Login;
import com.rakuten.beans.User;

public interface UserService {
	    int saveUser(User user);
	    User validateUser(Login login);
	}


