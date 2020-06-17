package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
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
	 * IDから商品を検索します.
	 *
	 */
	@Override
	@Query(value = "select i.id, i.item_name, i.price, i.category_id, i.image_path, i.deleted_flag, i.description, s.id, s.size from items i left outer join size s on i.size = s.id where i.id = :id", nativeQuery = true)
	Optional<Item> findById(@Param("id") Integer id);

	/**
	 * カテゴリーIDから商品を検索します
	 * 
	 * @param categoryId
	 * @return
	 */
	List<Item> findByCategoryId(Integer categoryId);
}