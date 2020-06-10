package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Item;
import com.example.demo.service.ShowItemListService;

/**
 * itemsテーブルのデータ一覧を表示させるコントローラクラス.
 * 
 * @author masashi.nose
 *
 */
@Controller
@RequestMapping("")
public class ShowItemListController {

	@Autowired
	private ShowItemListService showItemListService;

	/**
	 * IDの昇順で商品一覧を表示します.
	 * 
	 * @param model
	 * @return
	 */
	@RequestMapping("")
	public String showList(Model model) {
		List<Item> itemList = showItemListService.findAll();

		model.addAttribute("itemList", itemList);

		return "list";
	}

}
