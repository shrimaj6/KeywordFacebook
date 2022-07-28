package com.qa.hs.tests;

import org.apache.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.Test;


import com.qa.hs.keyword.engine.KeyWordEngine;

public class LoginTest {
	public KeyWordEngine keyWordEngine;
	Logger log = Logger.getLogger(LoginTest.class);

	@Test
	public void loginTest() throws InvalidFormatException {
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("login");

	}

	@Test
	public void signUpTest() throws InvalidFormatException {
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("signup");
	}

}
