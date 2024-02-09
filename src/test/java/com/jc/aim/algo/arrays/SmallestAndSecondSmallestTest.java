package com.jc.aim.algo.arrays;

import static org.testng.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.testng.annotations.Test;

public class SmallestAndSecondSmallestTest {

	@Test
	public void testSmallestAndSecondSmallest() {
		// Test Case 1
		testWithInput("5\n2 4 3 5 6", "2\n3\n");

		// Test Case 2
		testWithInput("6\n3 2 4 2 5 6", "2\n3\n");

		// Test Case 3
		testWithInput("4\n7 7 7 7", "7\n" + Integer.MAX_VALUE + "\n");

		// Test Case 4
		testWithInput("8\n9 2 1 8 5 4 7 6", "1\n2\n");

		// Test Case 5
		testWithInput("7\n-2 -8 -1 -5 -7 -3 -4", "-8\n-7\n");

		// Test Case 6
		testWithInput("1\n3", "-1\n");

		// Test Case 7
		testWithInput("1\n11", "-1\n");

		// Test Case 8
		testWithInput("10\n100 90 80 70 60 50 40 30 20 10", "10\n20\n");

		// Test Case 9
		testWithInput("3\n-2147483648 5 10", "-2147483648\n5\n");

		// Test Case 10
		testWithInput("4\n2147483647 100 200 300", "100\n200\n");
	}

	private void testWithInput(String input, String expectedOutput) {
		// Redirect System.in and System.out for testing
		InputStream originalIn = System.in;
		PrintStream originalOut = System.out;

		try {
			// Set System.in to the provided input
			System.setIn(new ByteArrayInputStream(input.getBytes()));

			// Capture System.out for later assertion
			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			System.setOut(new PrintStream(outputStream));

			// Call the main method of the class
			SmallestAndSecondSmallest.main(new String[] {});

			// Assert the output matches the expected output
			assertEquals(outputStream.toString(), expectedOutput);
		} finally {
			// Reset System.in and System.out
			System.setIn(originalIn);
			System.setOut(originalOut);
		}
	}
}
