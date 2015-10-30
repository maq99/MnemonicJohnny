package com.maq.service;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MajorSystemWordFinder {

	private static final String CONF_FILE = "pao.properties";
	private static final Logger log = LoggerFactory
			.getLogger(MajorSystemWordFinder.class);
	private Configuration config;

	public MajorSystemWordFinder() throws ConfigurationException {
		super();
		Configuration config = new PropertiesConfiguration(CONF_FILE);
	}

	private String[][] readLetters() {
		String[] letters = config.getStringArray("letters");
		String[][] retValue = new String [letters.length][]; 
		for (int i=0;i<letters.length;i++) {
			//TOFO
		}
		return retValue;
	}

	public static void main(String[] args) {

	}
}
