package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.Item;

/**
 * itemsテーブルを操作するリポジトリ.
 * 
 * @author masashi.nose
 *
 */
public interface ItemRepository extends JpaRepository<Item, Integer> {

}
