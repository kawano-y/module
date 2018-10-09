package com.module.support;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringEmptyCheckerTest {

	private Fixture fixture;

	public StringEmptyCheckerTest(Fixture fixture) {
		this.fixture = fixture;
	}

	@Parameters
	public static Collection<Fixture> params() {
		Fixture[] outputs = { new Fixture("a", "b", false), new Fixture("a", "", true), new Fixture("a", null, true) };
		return Arrays.asList(outputs);
	}

	@Test
	public void testContainEmpty() {
		StringEmptyChecker strEmp = new StringEmptyChecker();
		boolean actual = strEmp.containEmpty(fixture.a, fixture.b);
		assertEquals(fixture.expected, actual);
	}

	static class Fixture {
		String a;
		String b;
		boolean expected;

		public Fixture(String a, String b, boolean expected) {
			super();
			this.a = a;
			this.b = b;
			this.expected = expected;
		}

	}

}
