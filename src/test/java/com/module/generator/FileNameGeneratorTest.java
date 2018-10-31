package com.module.generator;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FileNameGeneratorTest {

	@Test
	public void name() {
		FileNameGenerator g = new FileNameGenerator();
		String actual = g.defaultName();
		assertThat(true, is(actual.matches(".{36}_.{17}")));
	}

}
