package com.egcho.jpa.user.service;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Entity
@Table(name = "ET_USER")
@AllArgsConstructor
@RequiredArgsConstructor
public class UserVO {
	@Id
	@Column(name = "USER_ID")
	private String userId;
	
	@Column(name = "USER_NM")
	private String userNm;
}
