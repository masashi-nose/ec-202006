package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.Item;
import com.example.demo.service.ShowItemDetailService;

/**
 * 商品詳細画面表示を操作するコントローラクラス.
 * 
 * @author masashi.nose
 *
 */
@Controller
@RequestMapping("")
public class ShowItemDetailController {

	@Autowired
	private ShowItemDetailService showItemDetailService;

	/**
	 * 商品詳細画面へ遷移します.
	 * 
	 * @param id    ID
	 * @param model
	 * @return 商品詳細画面
	 */
	@RequestMapping("/detail")
	public String showDetail(Integer id, Model model) {
		Optional<Item> itemOpt = showItemDetailService.showDetail(id);

		Item item = itemOpt.get();
		System.out.println(item.getItemName());

		model.addAttribute("item", item);

		return "detail";
	}

}
