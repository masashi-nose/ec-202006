package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.domain.User;
import com.example.demo.form.RegisterForm;
import com.example.demo.service.UserService;

/**
 * user登録に関するコントローラクラス.
 * 
 * @author masashi.nose
 *
 */
@Controller
@RequestMapping("")
public class UserRegisterController {

	@Autowired
	private UserService userService;

	@ModelAttribute
	public RegisterForm setUpForm() {
		return new RegisterForm();
	}

	/**
	 * ログイン画面へ遷移します.
	 * 
	 * @return
	 */
	@RequestMapping("/toLogin")
	public String toLoginRegister() {
		return "login-register";
	}

	/**
	 * ユーザー登録画面へ遷移します.
	 * 
	 * @return ユーザー登録画面
	 */
	@RequestMapping("/toRegister")
	public String toRegister() {
		return "register";
	}

	/**
	 * ユーザーを登録します.
	 * 
	 * @param form
	 * @param result
	 * @param model
	 * @return
	 */
	@RequestMapping("/register")
	public String register(@Validated RegisterForm form, BindingResult result, Model model) {
		User confirmUser = userService.findByEmail(form.getEmail());

		if (confirmUser != null) {
			result.rejectValue("email", "", "このメールアドレスは既に登録されています。");
		}

		if (!(form.getPassword().equals(form.getConfirmPassword()))) {
			result.rejectValue("password", "", "パスワードが異なります。");
		}

		if (result.hasErrors()) {
			return toRegister();
		}

		User user = new User();
		user.setUserName(form.getUserName());
		user.setZipcode(form.getZipcode());
		user.setAddress(form.getAddress());
		user.setTel(form.getTel());
		user.setEmail(form.getEmail());
		user.setPassword(form.getPassword());

		System.out.println("userオブジェクトの中身：" + user);

		userService.insert(user);

		return "register";

	}

}
