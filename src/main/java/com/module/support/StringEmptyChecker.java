package com.module.support;

import org.springframework.util.StringUtils;

public class StringEmptyChecker {

	public boolean containEmpty(String... strs) {
		for (String str : strs) {
			if (StringUtils.isEmpty(str)) {
				return true;
			}
		}
		return false;
	}
}
