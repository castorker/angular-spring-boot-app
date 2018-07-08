package com.standapp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.standapp.controller.HomeController;

public class AppTest {

	@Test
	public void testApp()
    {
		HomeController hc = new HomeController();
		String result = hc.home();
		assertEquals(result, "StandApp, reporting for duty!");
    }
}
