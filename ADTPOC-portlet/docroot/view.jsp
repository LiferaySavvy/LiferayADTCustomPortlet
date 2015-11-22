<%@page import="java.util.ArrayList"%>
<%@page import="com.adt.poc.model.Student"%>
<%@page import="java.util.List"%>
<%@ include file="init.jsp" %>

<h1> ADT Implementation to Custom Portlet</h1>
<%
List<Student> students = new ArrayList<Student>();
for(int i=1; i<10; i++){
	Student student = new Student();
	student.setId(i);
	student.setName("name"+i);
	student.setCity("city"+i);
	students.add(student);
}
%>
<c:choose>
<c:when test="<%= portletDisplayDDMTemplateId > 0 %>">
  <%= PortletDisplayTemplateUtil.renderDDMTemplate(pageContext, portletDisplayDDMTemplateId, students) %>
</c:when>
    <c:otherwise>
    <table border="1">
    <tr><th>Name</th><th>city</th></tr>
    
    <%
    for(Student student:students){%>
   <tr><td><%=student.getName()%></td>
   <td><%=student.getCity()%></td></tr>
    <%} %>
    </table>
    </c:otherwise>
</c:choose>