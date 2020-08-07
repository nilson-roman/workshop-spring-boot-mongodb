package com.educandoweb.course.resources.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public interface URL {

	public static String decodeParam(String text) {
		try {
			return URLDecoder.decode(text, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return "";
		}
	}
}