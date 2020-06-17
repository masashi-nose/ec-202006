package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.Item;
import com.example.demo.repository.ItemRepository;

/**
 * 商品詳細画面を表示させる業務処理を行うサービスクラスクラス.
 * 
 * @author masashi.nose
 *
 */
@Service
@Transactional
public class ShowItemDetailService {

	@Autowired
	private ItemRepository itemRepository;

	/**
	 * 商品詳細表示をします.Optional型でリターンします.
	 * 
	 * @param id
	 * @return
	 */
	public Optional<Item> showDetail(@RequestParam("id") Integer id) {
		return itemRepository.findById(id);
	}

	/**
	 * カテゴリーIDで商品を検索します.
	 * 
	 * @param categoryId カテゴリーID
	 * @return 商品リスト
	 */
	public List<Item> findByCategoryId(Integer categoryId) {
		return itemRepository.findByCategoryId(categoryId);
	}

}
