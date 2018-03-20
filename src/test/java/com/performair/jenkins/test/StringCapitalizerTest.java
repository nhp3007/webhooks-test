
package com.performair.jenkins.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCapitalizerTest
{

	@Test
	public void testCapitalize()
	{
		String s = "morgan";
		assertEquals("String should be capitalized", StringCapitalizer.capitalize(s), "MORGAN");
	}

	@Test
	public void testCapitalizeAlreadyCapitalized()
	{
		String s = "MORGAN";
		assertEquals("String should be capitalized", StringCapitalizer.capitalize(s), "MORGAN");
	}

}
