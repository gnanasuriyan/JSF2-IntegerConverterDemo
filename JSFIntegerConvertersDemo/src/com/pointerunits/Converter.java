package com.pointerunits;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

public class Converter {
	private Integer intNumber;
	
	public Converter() {
		
	}

	public Integer getIntNumber() {
		return intNumber;
	}

	public void setIntNumber(Integer intNumber) {
		this.intNumber = intNumber;
	}
	
}
