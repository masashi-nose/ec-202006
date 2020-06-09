package com.example.demo.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.NumberFormat;

/**
 * 登録画面からパラメータを受け取るフォーム
 * 
 * @author masashi.nose
 *
 */
public class RegisterForm {

	/** 名前 */
	@NotBlank(message = "名前の入力は必須です。")
	private String userName;
	
	/** 郵便番号 */
	@NotBlank(message = "郵便番号の入力は必須です。")
	@Size(max = 7)
	private String zipcode;
	
	/** 住所 */
	@NotBlank(message = "住所の入力は必須です。")
	private String address;
	
	/** 電話番号 */
	@NotBlank(message = "電話番号の入力は必須です。")
	private String tel;
	
	/** メールアドレス */
	@NotBlank(message = "メールアドレスの入力は必須です。")
	@Email(message = "メールアドレスの形式が不正です。")
	private String email;
	
	/** パスワード */
	@NotBlank(message = "パスワードの入力は必須です。")
	private String password;
	
	/** 確認用パスワード */
	@NotBlank(message = "確認用パスワードの入力は必須です。")
	private String confirmPassword;

	@Override
	public String toString() {
		return "RegisterForm [userName=" + userName + ", zipcode=" + zipcode + ", address=" + address + ", tel=" + tel
				+ ", email=" + email + ", password=" + password + ", confirmPassword=" + confirmPassword + "]";
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

}
