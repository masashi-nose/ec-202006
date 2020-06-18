package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.domain.Item;
import com.example.demo.domain.ShippingFee;
import com.example.demo.domain.Size;
import com.example.demo.service.ShippingFeeService;
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

	@Autowired
	private ShippingFeeService shippingFeeService;

	/**
	 * 商品詳細画面へ遷移します.
	 * 
	 * @param id    ID
	 * @param model
	 * @return 商品詳細画面
	 */
	@RequestMapping("/detail")
	public String showDetail(@RequestParam("id") Integer id, Model model) {
		Optional<Item> itemOpt = showItemDetailService.showDetail(id);
		Item item = itemOpt.get();

		List<Item> categoryItemList = showItemDetailService.findByCategoryId(item.getCategoryId());
		List<ShippingFee> shippingFeeList = shippingFeeService.showAllShippingFee();

		model.addAttribute("item", item);
		model.addAttribute("categoryItemList", categoryItemList);
		model.addAttribute("shippingFeeList", shippingFeeList);

		return "detail";
	}

}
