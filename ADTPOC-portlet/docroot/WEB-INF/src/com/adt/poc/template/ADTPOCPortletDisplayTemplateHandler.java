package com.adt.poc.template;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.adt.poc.model.Student;
import com.liferay.portal.kernel.language.LanguageUtil;
import com.liferay.portal.kernel.portletdisplaytemplate.BasePortletDisplayTemplateHandler;
import com.liferay.portal.kernel.template.TemplateVariableGroup;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portlet.portletdisplaytemplate.util.PortletDisplayTemplateConstants;
public class ADTPOCPortletDisplayTemplateHandler extends
		BasePortletDisplayTemplateHandler {

	@Override
	public String getClassName() {
		// TODO Auto-generated method stub
		return Student.class.getName();
	}

	@Override
	public String getName(Locale arg0) {
		// TODO Auto-generated method stub
		return "ADTPOC Template";
	}

	@Override
	public String getResourceName() {
		// TODO Auto-generated method stub
		return "ADTPOC_WAR_ADTPOCportlet";
	}

	public Map<String, TemplateVariableGroup> getTemplateVariableGroups(
            long classPK, String language, Locale locale)
        throws Exception {

        Map<String, TemplateVariableGroup> templateVariableGroups =
            super.getTemplateVariableGroups(classPK, language, locale);

        TemplateVariableGroup templateVariableGroup =
            templateVariableGroups.get("fields");

        templateVariableGroup.empty();

        templateVariableGroup.addCollectionVariable(
                "students", List.class, PortletDisplayTemplateConstants.ENTRIES,
                "student", Student.class, "curStudent", "name");
        return templateVariableGroups;
    }
}
