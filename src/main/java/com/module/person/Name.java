package com.module.person;

import java.util.Optional;

import lombok.EqualsAndHashCode;


@EqualsAndHashCode
public class Name {

	/**
	 * 姓
	 */
	private String sei;

	/**
	 * 名
	 */
	private String mei;

	public Name(String sei, String mei) {
		this.sei = Optional.ofNullable(sei).orElse("").trim();
		this.mei = Optional.ofNullable(mei).orElse("").trim();
	}

	@Override
	public String toString() {
		return this.fullName(" ");
	}

	public String fullName(String delimiter) {
		StringBuilder s = new StringBuilder();
		s.append(this.sei).append(Optional.ofNullable(delimiter).orElse("")).append(this.mei);
		return s.toString().trim();
	}

}
