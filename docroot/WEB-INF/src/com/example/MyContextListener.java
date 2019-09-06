package com.example;

import com.liferay.portal.kernel.language.Language;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.BasePortalLifecycle;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author Minhchau Dang
 */
public class MyContextListener
    extends BasePortalLifecycle
    implements ServletContextListener {

    @Override
    protected void doPortalInit() throws Exception {
    	_oldLanguage = LanguageUtil.getLanguage();

    	_log.debug("overriding the default Language implementation.");
        new LanguageUtil().setLanguage(new MyCustomLanguageImpl());
    }

	@Override
	protected void doPortalDestroy() throws Exception {
	}
	
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        registerPortalLifecycle();
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        new LanguageUtil().setLanguage(_oldLanguage);
    }

    private Language _oldLanguage;

    private static final Log _log = LogFactoryUtil.getLog(MyContextListener.class);
}