package com.example.practice;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;
public class CalTest {
	
	@Mock
	Calculator cal;
	
	@Before
	public void setUp() {
		
		MockitoAnnotations.initMocks(this);
		
	}
	
	@Test
	public void testAbs() {
		
		when(cal.oneMore(Mockito.anyInt())).thenReturn(21);
		
		int value = cal.oneMore(2000);
		
		assertEquals(21, value);
	}
}
