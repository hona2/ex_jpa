package com.egcho.jpa.user.service.impl;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.egcho.jpa.user.service.UserVO;

public interface UserRepository extends JpaRepository<UserVO, Long> {

	public List<UserVO> findByUserId(String userId);
	
	public List<UserVO> findByUserIdOrUserNm(String userId, String userNm);
	
}
