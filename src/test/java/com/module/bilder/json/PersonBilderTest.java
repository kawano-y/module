package com.module.bilder.json;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.module.bilder.Person;
import com.module.bilder.json.PersonBilder.Strong;

public class PersonBilderTest {

	@Test
	public void personbild() {
		PersonBilder p = new PersonBilder();
		Person pp = p.person("k", "東京都", 30, new Strong("めっちゃ強い")).bild();
		assertThat(pp.getName(), is("k"));
		assertThat(pp.getAge(), is(30));
		assertThat(pp.getStlonger(), is("めっちゃ強い"));
	}

	@Test
	public void toIntStrong() {
		PersonBilder p = new PersonBilder();
		Person pp = p.person("k", "東京都", 30, new Strong(10_000)).bild();
		assertThat(pp.getName(), is("k"));
		
		assertThat(pp.getAge(), is(30));
		assertThat(pp.getStlonger(), is("10000"));
	}
}
