package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Item;
import com.example.demo.repository.ItemRepository;

/**
 * 商品を全件表示する業務処理を行うサービスクラス.
 * 
 * @author masashi.nose
 *
 */
@Service
@Transactional
public class ShowItemListService {

	@Autowired
	private ItemRepository itemRepository;

	/**
	 * 商品情報を商品IDの昇順で全件表示します.
	 * 
	 * @return 商品一覧情報が入ったリスト.
	 */
	public List<Item> findAll() {
		return itemRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
	}
}
