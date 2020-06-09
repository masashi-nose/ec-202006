package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	/**
	 * メールアドレスからユーザーを検索します.
	 * 
	 * @param email　メールアドレス
	 * @return　ユーザー情報
	 */
	User findByEmail(String email);
}
