package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * お問い合わせフォームを表示させるコントローラクラス.
 * 
 * @author masashi.nose
 *
 */
@Controller
@RequestMapping("")
public class ShowContactController {

	/**
	 * お問い合わせフォームを表示します.
	 * 
	 * @return
	 */
	@RequestMapping("/contact")
	public String toContact() {
		return "contact";
	}

}
