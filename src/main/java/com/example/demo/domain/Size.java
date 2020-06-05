package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * sizeテーブルのエンティティ.
 * 
 * @author masashi.nose
 *
 */
@Entity
@Table(name = "size")
public class Size {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;

	@Column(name = "size")
	private Integer size;

	@Override
	public String toString() {
		return "Size [id=" + id + ", size=" + size + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

}
