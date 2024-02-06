package com.jc.aim.algo.strings;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidPalindromeTest {
	@Test
	public void testcase1() {
		String s = "abc";
		boolean expected = false;
		boolean actual = ValidPalindrome.isPalindrome(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testcase2() {
		String s = "ab_A";
		boolean expected = true;
		boolean actual = ValidPalindrome.isPalindrome(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testcase3() {
		String s = " ";
		boolean expected = true;
		boolean actual = ValidPalindrome.isPalindrome(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testcase4() {
		String s = "race a car";
		boolean expected = false;
		boolean actual = ValidPalindrome.isPalindrome(s);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void testcase5() {
		String s = "A man, a plan, a canal: Panama";
		boolean expected = true;
		boolean actual = ValidPalindrome.isPalindrome(s);
		Assert.assertEquals(expected, actual);
	}
}
