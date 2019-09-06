package com.example;

import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.portal.kernel.util.PortalClassInvoker;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieKeysClp {

	private static final String DELEGATE_CLASS_NAME = "com.liferay.portal.util.CookieKeys";

	public static void addCookie(HttpServletRequest request,
			HttpServletResponse response, Cookie cookie) {
		MethodKey key = new MethodKey(DELEGATE_CLASS_NAME, "addCookie",
				HttpServletRequest.class, HttpServletResponse.class,
				Cookie.class);

		try {
			PortalClassInvoker.invoke(false, key, request, response, cookie);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static final int MAX_AGE = 31536000;
}
