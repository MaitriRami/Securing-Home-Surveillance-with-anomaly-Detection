<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
[
<c:forEach items="${stateListByCountryId}" var="i" varStatus="j">
	{
		"id":${i.id },
		"stateName":"${i.stateName}"
	}
	<c:if test="${!j.last }">
	,
	</c:if>
</c:forEach>
]