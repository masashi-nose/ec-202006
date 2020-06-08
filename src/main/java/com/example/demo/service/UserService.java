package com.example.demo.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;

/**
 * usersテーブルに関する業務処理を行うサービスクラス
 * 
 * @author masashi.nose
 *
 */
@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepository userRepository;

	/**
	 * userを登録します.
	 * 
	 * @param user
	 * @return
	 */
	public User insert(User user) {
		return userRepository.save(user);
	}

	/**
	 * メールアドレスからユーザーを検索します.
	 * 
	 * @param email メールアドレス
	 * @return ユーザー情報
	 */
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

}
