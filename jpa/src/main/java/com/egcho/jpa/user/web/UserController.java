package com.egcho.jpa.user.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.egcho.jpa.user.service.UserService;
import com.egcho.jpa.user.service.UserVO;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/user")
	public List<UserVO> userList() {
		return userService.getUserList();
	}

	@GetMapping("/user/{userId}")
	public List<UserVO> userInfo(@PathVariable String userId) {
		return userService.getUserById(userId);
	}

	@GetMapping("/user/search")
	public List<UserVO> userSearch(@ModelAttribute UserVO userVO) {
		return userService.getUserSearch(userVO);
	}
}
