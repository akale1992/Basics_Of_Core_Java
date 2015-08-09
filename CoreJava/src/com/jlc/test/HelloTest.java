package com.jlc.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.jlc.Lab;
import com.jlc.Lab.Hello;

public class HelloTest {
	Hello h = null;
	@Before
	public void setUp() throws Exception {
		h = new Lab().new Hello();
	}

	@Test
	public void testToString() throws Exception{
		

		String expected = "Ashish";
		assertEquals(expected, h.toString());

	}
	
	@Test
	public void testM1() throws Exception  {
		int expectedSum=20;
		assertEquals(expectedSum, h.m1(10,10));
		
		
		
	}

}
