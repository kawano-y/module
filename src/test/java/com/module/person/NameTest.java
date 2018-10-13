package com.module.person;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NameTest {

	@Test
	public void testFullName() {
		Name name = new Name("kkk", "tarou");
		String actual = name.fullName("");
		assertThat(actual, is("kkktarou"));
	}
	@Test
	public void testFullName_spasedelimiter() {
		Name name = new Name("kkk", "tarou");
		String actual = name.fullName(" ");
		assertThat(actual, is("kkk tarou"));
	}
	@Test
	public void testFullName_nulldelimiter() {
		Name name = new Name("kkk", "tarou");
		String actual = name.fullName(null);
		assertThat(actual, is("kkktarou"));
	}
	@Test
	public void testFullName_trim() {
		Name name = new Name(" kkk ", " tarou ");
		String actual = name.fullName(" ");
		assertThat(actual, is("kkk tarou"));
	}
}
