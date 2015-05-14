package com.shopping.text.dao;

import com.shopping.text.domain.User;

public interface UserDao {

	User findByUserName(String username);
}
