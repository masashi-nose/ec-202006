package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Item;

/**
 * itemsテーブルを操作するリポジトリ.
 * 
 * @author masashi.nose
 *
 */
@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

	/**
	 * カテゴリーIDから商品を検索します
	 * 
	 * @param categoryId
	 * @return
	 */
	List<Item> findByCategoryId(Integer categoryId);

	/**
	 * IDから商品を検索します.
	 *
	 */
	@Override
	Optional<Item> findById(Integer id);

	
	
}
