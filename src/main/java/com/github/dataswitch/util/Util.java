package com.github.dataswitch.util;

import java.util.Arrays;

import org.springframework.util.StringUtils;

public class Util {

	public static String[] splitColumns(String columns) {
		String[] result = StringUtils.trimArrayElements(columns.trim().split("[,\\s]+"));
		return result;
	}
	
}
