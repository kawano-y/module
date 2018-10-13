package com.module.person;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FullNameConverterTest {

	@Test
	public void testConverte() {
		FullNameConverter converter = new FullNameConverter();
		Name actual = converter.converte("kkk tarou");
		assertThat(actual, is(new Name("kkk", "tarou")));
	}

}
