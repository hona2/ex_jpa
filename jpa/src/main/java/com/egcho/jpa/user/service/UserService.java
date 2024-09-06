package com.egcho.jpa.user.service;

import java.util.List;

public interface UserService {

	List<UserVO> getUserList();

	List<UserVO> getUserById(String userId);

	List<UserVO> getUserSearch(UserVO userVO);

}
