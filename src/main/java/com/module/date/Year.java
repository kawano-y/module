package com.module.date;

public class Year {

	private Integer year;

	public Year(Integer year) {
		super();
		this.year = year;
	}
	
	@Override
	public String toString() {
		return this.year == null ? null : this.year.toString();
	}
}
