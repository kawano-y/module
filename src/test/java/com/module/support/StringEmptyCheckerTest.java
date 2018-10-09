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

	private String a;
	private String b;

	public StringEmptyCheckerTest(String a, String b) {
		this.a = a;
		this.b = b;
	}

	@Parameters(name="{0} {1}")
	public static Collection<String[]> params() {
		String[][] outputs = { { "a", "b"}, { "b", "a" } };
		return Arrays.asList(outputs);
	}

	@Test
	public void testContainEmpty() {
		StringEmptyChecker strEmp = new StringEmptyChecker();
		boolean actual = strEmp.containEmpty(a, b);
		
		assertEquals(false, actual);

	}

	@Test
	public void testContainEmptyBad() {
		StringEmptyChecker strEmp = new StringEmptyChecker();
		boolean actual = strEmp.containEmpty(a, b);
		
		assertEquals(true, actual);

	}

}
