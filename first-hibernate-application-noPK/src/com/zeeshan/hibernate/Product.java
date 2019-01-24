package com.zeeshan.hibernate;

public class Product {

	private Integer productId;
	private String proName;
	private Double price;

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getProName() {
		return proName;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	/*@Override
	public String toString() {
		return "Product [proName=" + proName + ", price=" + price + "]";
	}*/

	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", proName=" + proName + ", price=" + price + "]";
	}

}