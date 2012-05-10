package com.mkyong.common;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import java.io.Serializable;

@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;
        private String parent;
        private String address;
        private String grade;
        
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
        public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}
        public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	 public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
}