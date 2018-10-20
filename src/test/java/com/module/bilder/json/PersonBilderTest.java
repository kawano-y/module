package com.module.bilder.json;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.module.bilder.Person;

public class PersonBilderTest {

	@Test
	public void test() {
		PersonBilder p = new PersonBilder();
		Person pp = p.person("k", "東京都", 30, new StrongBilder()).bild();
		assertThat(pp.getName(), is("k"));
		assertThat(pp.getAge(), is(30));
		assertThat(pp.getStlonger(), is("めっちゃ強い"));
	}
}
