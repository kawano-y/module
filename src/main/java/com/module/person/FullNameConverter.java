package com.module.person;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FullNameConverter {

	public Name converte(String fullName) {
		final List<String> splitName = Arrays.asList(Optional.ofNullable(fullName).orElse("").trim().split(" |　"));
		if (splitName.size() <= 0 || splitName.size() > 2) {
			log.info("名前:" + fullName);
			throw new RuntimeException("名前として認識できません");
		}
		Function<Integer, String> func = index -> {
			if (splitName.size() >= (index + 1)) {
				return splitName.get(index);
			}
			return "";
		};
		return new Name(func.apply(0), func.apply(1));
	}
}
