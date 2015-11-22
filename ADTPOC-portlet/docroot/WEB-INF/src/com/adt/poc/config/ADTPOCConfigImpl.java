package com.adt.poc.config;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletConfig;

import com.liferay.portal.kernel.portlet.DefaultConfigurationAction;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portlet.PortletPreferencesFactoryUtil;

public class ADTPOCConfigImpl extends DefaultConfigurationAction {
	@Override
	public void processAction(PortletConfig portletConfig,
			ActionRequest actionRequest, ActionResponse actionResponse)
			throws Exception {
		// TODO Auto-generated method stub
		String portletResource = ParamUtil.getString(actionRequest, "portletResource"); 
		javax.portlet.PortletPreferences prefs = PortletPreferencesFactoryUtil.getPortletSetup(actionRequest, portletResource); 
		String displayStyle = ParamUtil.getString(actionRequest, "displayStyle");
		prefs.setValue("displayStyle", displayStyle);
	    prefs.store();
		super.processAction(portletConfig, actionRequest, actionResponse);
	}
}
