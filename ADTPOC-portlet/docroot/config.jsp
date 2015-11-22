<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@page import="com.liferay.portal.util.PortalUtil"%>
<%@ include file="init.jsp" %>
<%@page import="com.adt.poc.model.Student"%>
<%@page import="com.liferay.portal.kernel.template.TemplateHandlerRegistryUtil"%>
<%@page import="com.liferay.portal.kernel.template.TemplateHandler"%>
<liferay-portlet:actionURL portletConfiguration="true" var="configurationURL" />
<aui:form action="<%= configurationURL %>" method="post" name="fm">
    <aui:input name="<%= Constants.CMD %>" type="hidden" value="<%= Constants.UPDATE %>" />

    <aui:fieldset>
        <div class="display-template">

            <%
            TemplateHandler templateHandler = TemplateHandlerRegistryUtil.getTemplateHandler(Student.class.getName());
            %>

            <liferay-ui:ddm-template-selector
                classNameId="<%= PortalUtil.getClassNameId(templateHandler.getClassName()) %>"
                displayStyle="<%= displayStyle %>"
                displayStyleGroupId="<%= displayStyleGroupId %>"
                refreshURL="<%= PortalUtil.getCurrentURL(request) %>"
                showEmptyOption="<%= true %>"
            />
        </div>
    </aui:fieldset>
	<aui:button type="submit" name="submit"></aui:button>
</aui:form>