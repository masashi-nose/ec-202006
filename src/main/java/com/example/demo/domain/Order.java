package com.example.demo.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ordersテーブルのエンティティ.
 * 
 * @author masashi.nose
 *
 */
@Entity
@Table(name = "orders")
public class Order {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;

	@Column(name = "userId")
	private Integer userId;

	@Column(name = "total_price")
	private Integer totalPrice;

	@Column(name = "order_date")
	private Date orderDate;

	@Column(name = "delivery_name")
	private String deliveryName;

	@Column(name = "delivery_email")
	private String deliveryEmail;

	@Column(name = "delivery_tel")
	private String deliveryTel;

	@Column(name = "delivery_zipcode")
	private String deliveryZipcode;

	@Column(name = "delivery_address")
	private String deliveryAddress;

	@Column(name = "delivery_time")
	private Date deliveryTime;

	@Column(name = "payment_method")
	private Integer paymentMethod;

	private User user;

	private List<OrderItem> orderItemList;

	/**
	 * 合計金額を算出します.
	 * 
	 * @return
	 */
	public Integer getTotalPrice() {
		Integer totalPrice = 0;
		for (OrderItem orderItem : orderItemList) {
			totalPrice = totalPrice + orderItem.getSubTotal();
		}

		return totalPrice;

	}

	/**
	 * 消費税をリターンします.
	 * 
	 * @return
	 */
	public int getTax() {
		return (int) (getTotalPrice() * 0.1);
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", userId=" + userId + ", totalPrice=" + totalPrice + ", orderDate=" + orderDate
				+ ", deliveryName=" + deliveryName + ", deliveryEmail=" + deliveryEmail + ", deliveryTel=" + deliveryTel
				+ ", deliveryZipcode=" + deliveryZipcode + ", deliveryAddress=" + deliveryAddress + ", deliveryTime="
				+ deliveryTime + ", paymentMethod=" + paymentMethod + ", user=" + user + ", orderItemList="
				+ orderItemList + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getDeliveryName() {
		return deliveryName;
	}

	public void setDeliveryName(String deliveryName) {
		this.deliveryName = deliveryName;
	}

	public String getDeliveryEmail() {
		return deliveryEmail;
	}

	public void setDeliveryEmail(String deliveryEmail) {
		this.deliveryEmail = deliveryEmail;
	}

	public String getDeliveryTel() {
		return deliveryTel;
	}

	public void setDeliveryTel(String deliveryTel) {
		this.deliveryTel = deliveryTel;
	}

	public String getDeliveryZipcode() {
		return deliveryZipcode;
	}

	public void setDeliveryZipcode(String deliveryZipcode) {
		this.deliveryZipcode = deliveryZipcode;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public Date getDeliveryTime() {
		return deliveryTime;
	}

	public void setDeliveryTime(Date deliveryTime) {
		this.deliveryTime = deliveryTime;
	}

	public Integer getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(Integer paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<OrderItem> getOrderItemList() {
		return orderItemList;
	}

	public void setOrderItemList(List<OrderItem> orderItemList) {
		this.orderItemList = orderItemList;
	}

}
