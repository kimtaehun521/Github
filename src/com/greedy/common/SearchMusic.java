package com.greedy.common;

public class SearchMusic {

	private String condition;
	private String value;

	public SearchMusic() {
		super();
	}

	public SearchMusic(String condition, String value) {
		super();
		this.condition = condition;
		this.value = value;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "SearchMusic [condition=" + condition + ", value=" + value + "]";
	}


}