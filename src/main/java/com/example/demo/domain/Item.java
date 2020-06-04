package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * itemsテーブルのエンティティ
 * 
 * @author masashi.nose
 *
 */
@Entity
@Table(name = "items")
public class Item {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;

	@Column(name = "item_name")
	private String itemName;

	@Column(name = "price")
	private Integer price;

	@Column(name = "size")
	private Integer size;

	@Column(name = "image_path")
	private String imagePath;

	@Column(name = "category_id")
	private Integer categoryId;

	@Column(name = "description")
	private String description;

	@Column(name = "deleted_flag")
	private boolean deletedFlag;

	@Override
	public String toString() {
		return "Item [id=" + id + ", itemName=" + itemName + ", price=" + price + ", size=" + size + ", imagePath="
				+ imagePath + ", categoryId=" + categoryId + ", description=" + description + ", deletedFlag="
				+ deletedFlag + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isDeletedFlag() {
		return deletedFlag;
	}

	public void setDeletedFlag(boolean deletedFlag) {
		this.deletedFlag = deletedFlag;
	}

}
