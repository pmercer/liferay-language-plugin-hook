package com.example;

import com.liferay.portal.kernel.util.MethodKey;
import com.liferay.portal.kernel.util.PortalClassInvoker;

import java.util.Locale;

public class LanguageResourcesClp {

	private static final String DELEGATE_CLASS_NAME = "com.liferay.portal.language.LanguageResources";

	public static String fixValue(String value) {
		MethodKey key = new MethodKey(DELEGATE_CLASS_NAME, "fixValue",
				String.class);

		try {
			return (String) PortalClassInvoker.invoke(false, key, value);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static String getMessage(Locale locale, String key) {
		MethodKey _key = new MethodKey(DELEGATE_CLASS_NAME, "getMessage",
				Locale.class, String.class);

		try {
			return (String) PortalClassInvoker.invoke(false, _key, locale, key);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
