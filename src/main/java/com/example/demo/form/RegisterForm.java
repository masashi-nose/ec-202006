package com.example.demo.form;

/**
 * 登録画面からパラメータを受け取るフォーム
 * 
 * @author masashi.nose
 *
 */
public class RegisterForm {

	/** 名前 */
	private String name;
	/** 郵便番号 */
	private String zipcode;
	/** 住所 */
	private String address;
	/** 電話番号 */
	private String tel;
	/** メールアドレス */
	private String email;
	/** パスワード */
	private String password;
	/** 確認用パスワード */
	private String confirmPassword;

	@Override
	public String toString() {
		return "RegisterForm [name=" + name + ", zipcode=" + zipcode + ", address=" + address + ", tel=" + tel
				+ ", email=" + email + ", password=" + password + ", confirmPassword=" + confirmPassword + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
