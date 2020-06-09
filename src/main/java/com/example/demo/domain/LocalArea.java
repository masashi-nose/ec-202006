package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * local_areasテーブルのエンティティ.
 * 
 * @author masashi.nose
 *
 */
@Entity
@Table(name = "local_areas")
public class LocalArea {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "local_area_name")
	private String localAreaName;

	@Override
	public String toString() {
		return "LocalArea [id=" + id + ", localAreaName=" + localAreaName + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLocalAreaName() {
		return localAreaName;
	}

	public void setLocalAreaName(String localAreaName) {
		this.localAreaName = localAreaName;
	}

}
