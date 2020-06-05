package com.example.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * shipping_feeテーブルのエンティティ.
 * 
 * @author masashi.nose
 *
 */
@Entity
@Table(name = "shipping_fee")
public class ShippingFee {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private Integer id;

	@Column(name = "shipping_area")
	private String shippingArea;

	@Column(name = "local_area_id")
	private Integer localAreaId;

	@Column(name = "size_60")
	private Integer size60;

	@Column(name = "size_80")
	private Integer size80;

	@Column(name = "size_100")
	private Integer size100;

	@Column(name = "size_120")
	private Integer size120;

	@Column(name = "size_140")
	private Integer size140;

	@Column(name = "size_160")
	private Integer size160;

	/**
	 * localAreaIdとSizeドメインのプロパティ値（id）から、送料を求めリターンします.
	 * 
	 * @param localAreaId
	 * @param size
	 * @return
	 */
	public Integer getShippingFee(Integer localAreaId, Size size) {
//		北海道エリア
		if (localAreaId == 1 && size.getId() == 1) {
			return 930;
		} else if (localAreaId == 1 && size.getId() == 2) {
			return 1150;
		} else if (localAreaId == 1 && size.getId() == 3) {
			return 1390;
		} else if (localAreaId == 1 && size.getId() == 4) {
			return 1610;
		} else if (localAreaId == 1 && size.getId() == 5) {
			return 1850;
		} else if (localAreaId == 1 && size.getId() == 6) {
			return 2070;
		}

//		北東北エリア
		else if (localAreaId == 2 && size.getId() == 1) {
			return 1150;
		} else if (localAreaId == 2 && size.getId() == 2) {
			return 1370;
		} else if (localAreaId == 2 && size.getId() == 3) {
			return 1610;
		} else if (localAreaId == 2 && size.getId() == 4) {
			return 1830;
		} else if (localAreaId == 2 && size.getId() == 5) {
			return 2070;
		} else if (localAreaId == 2 && size.getId() == 6) {
			return 2290;
		}

//		南東北エリア
		else if (localAreaId == 3 && size.getId() == 1) {
			return 1260;
		} else if (localAreaId == 3 && size.getId() == 2) {
			return 1480;
		} else if (localAreaId == 3 && size.getId() == 3) {
			return 1720;
		} else if (localAreaId == 3 && size.getId() == 4) {
			return 1940;
		} else if (localAreaId == 3 && size.getId() == 5) {
			return 2180;
		} else if (localAreaId == 3 && size.getId() == 6) {
			return 2400;
		}

//		関東エリア
		else if (localAreaId == 4 && size.getId() == 1) {
			return 1370;
		} else if (localAreaId == 4 && size.getId() == 2) {
			return 1590;
		} else if (localAreaId == 4 && size.getId() == 3) {
			return 1830;
		} else if (localAreaId == 4 && size.getId() == 4) {
			return 2050;
		} else if (localAreaId == 4 && size.getId() == 5) {
			return 2290;
		} else if (localAreaId == 4 && size.getId() == 6) {
			return 2510;
		}

//		信越エリア
		else if (localAreaId == 5 && size.getId() == 1) {
			return 1370;
		} else if (localAreaId == 5 && size.getId() == 2) {
			return 1590;
		} else if (localAreaId == 5 && size.getId() == 3) {
			return 1830;
		} else if (localAreaId == 5 && size.getId() == 4) {
			return 2050;
		} else if (localAreaId == 5 && size.getId() == 5) {
			return 2290;
		} else if (localAreaId == 5 && size.getId() == 6) {
			return 2510;
		}

//		北陸エリア
		else if (localAreaId == 6 && size.getId() == 1) {
			return 1480;
		} else if (localAreaId == 6 && size.getId() == 2) {
			return 1700;
		} else if (localAreaId == 6 && size.getId() == 3) {
			return 1940;
		} else if (localAreaId == 6 && size.getId() == 4) {
			return 2160;
		} else if (localAreaId == 6 && size.getId() == 5) {
			return 2400;
		} else if (localAreaId == 6 && size.getId() == 6) {
			return 2620;
		}

//		中部エリア
		else if (localAreaId == 7 && size.getId() == 1) {
			return 1480;
		} else if (localAreaId == 7 && size.getId() == 2) {
			return 1700;
		} else if (localAreaId == 7 && size.getId() == 3) {
			return 1940;
		} else if (localAreaId == 7 && size.getId() == 4) {
			return 2160;
		} else if (localAreaId == 7 && size.getId() == 5) {
			return 2400;
		} else if (localAreaId == 7 && size.getId() == 6) {
			return 2620;
		}

//		関西エリア
		else if (localAreaId == 8 && size.getId() == 1) {
			return 1700;
		} else if (localAreaId == 8 && size.getId() == 2) {
			return 1920;
		} else if (localAreaId == 8 && size.getId() == 3) {
			return 2160;
		} else if (localAreaId == 8 && size.getId() == 4) {
			return 2380;
		} else if (localAreaId == 8 && size.getId() == 5) {
			return 2620;
		} else if (localAreaId == 8 && size.getId() == 6) {
			return 2840;
		}

//		中国エリア
		else if (localAreaId == 9 && size.getId() == 1) {
			return 1810;
		} else if (localAreaId == 9 && size.getId() == 2) {
			return 2030;
		} else if (localAreaId == 9 && size.getId() == 3) {
			return 2270;
		} else if (localAreaId == 9 && size.getId() == 4) {
			return 2490;
		} else if (localAreaId == 9 && size.getId() == 5) {
			return 2730;
		} else if (localAreaId == 9 && size.getId() == 6) {
			return 2950;
		}

//		四国エリア
		else if (localAreaId == 10 && size.getId() == 1) {
			return 1810;
		} else if (localAreaId == 10 && size.getId() == 2) {
			return 2030;
		} else if (localAreaId == 10 && size.getId() == 3) {
			return 2270;
		} else if (localAreaId == 10 && size.getId() == 4) {
			return 2490;
		} else if (localAreaId == 10 && size.getId() == 5) {
			return 2730;
		} else if (localAreaId == 10 && size.getId() == 6) {
			return 2950;
		}

//		九州エリア
		else if (localAreaId == 11 && size.getId() == 1) {
			return 2030;
		} else if (localAreaId == 11 && size.getId() == 2) {
			return 2250;
		} else if (localAreaId == 11 && size.getId() == 3) {
			return 2490;
		} else if (localAreaId == 11 && size.getId() == 4) {
			return 2710;
		} else if (localAreaId == 11 && size.getId() == 5) {
			return 2950;
		} else if (localAreaId == 11 && size.getId() == 6) {
			return 3170;
		}

//		沖縄エリア
		else if (localAreaId == 12 && size.getId() == 1) {
			return 1370;
		} else if (localAreaId == 12 && size.getId() == 2) {
			return 1590;
		} else if (localAreaId == 12 && size.getId() == 3) {
			return 1830;
		} else if (localAreaId == 12 && size.getId() == 4) {
			return 2050;
		} else if (localAreaId == 12 && size.getId() == 5) {
			return 2290;
		} else if (localAreaId == 12 && size.getId() == 6) {
			return 2510;
		}

		else
			return null;

	}

	@Override
	public String toString() {
		return "ShippingFee [id=" + id + ", shippingArea=" + shippingArea + ", localAreaId=" + localAreaId + ", size60="
				+ size60 + ", size80=" + size80 + ", size100=" + size100 + ", size120=" + size120 + ", size140="
				+ size140 + ", size160=" + size160 + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getShippingArea() {
		return shippingArea;
	}

	public void setShippingArea(String shippingArea) {
		this.shippingArea = shippingArea;
	}

	public Integer getLocalAreaId() {
		return localAreaId;
	}

	public void setLocalAreaId(Integer localAreaId) {
		this.localAreaId = localAreaId;
	}

	public Integer getSize60() {
		return size60;
	}

	public void setSize60(Integer size60) {
		this.size60 = size60;
	}

	public Integer getSize80() {
		return size80;
	}

	public void setSize80(Integer size80) {
		this.size80 = size80;
	}

	public Integer getSize100() {
		return size100;
	}

	public void setSize100(Integer size100) {
		this.size100 = size100;
	}

	public Integer getSize120() {
		return size120;
	}

	public void setSize120(Integer size120) {
		this.size120 = size120;
	}

	public Integer getSize140() {
		return size140;
	}

	public void setSize140(Integer size140) {
		this.size140 = size140;
	}

	public Integer getSize160() {
		return size160;
	}

	public void setSize160(Integer size160) {
		this.size160 = size160;
	}

}
