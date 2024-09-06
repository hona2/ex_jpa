package com.egcho.jpa.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.egcho.jpa.user.service.UserService;
import com.egcho.jpa.user.service.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<UserVO> getUserList() {
		return userRepository.findAll();
	}

	@Override
	public List<UserVO> getUserById(String userId) {
		return userRepository.findByUserId(userId);
	}

	@Override
	public List<UserVO> getUserSearch(UserVO userVO) {
		return userRepository.findByUserIdOrUserNm(userVO.getUserId(), userVO.getUserNm());
	}

}
