package com.reno.property.brothers.application.vo.forBase;

import java.util.List;

public class ProductListVO {
	
	private List<String> product;
	
	private List<String> bound;
	
	private List<String> inBound;
	
	private List<String> outBound;
	


	public List<String> getInBound() {
		return inBound;
	}

	public void setInBound(List<String> inBound) {
		this.inBound = inBound;
	}

	public List<String> getOutBound() {
		return outBound;
	}

	public void setOutBound(List<String> outBound) {
		this.outBound = outBound;
	}

	public List<String> getProduct() {
		return product;
	}

	public void setProduct(List<String> product) {
		this.product = product;
	}

	public List<String> getBound() {
		return bound;
	}

	public void setBound(List<String> bound) {
		this.bound = bound;
	}
	
	

}
