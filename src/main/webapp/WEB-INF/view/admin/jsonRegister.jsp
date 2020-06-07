<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
[
<c:forEach items="${cityListByStateId}" var="i" varStatus="j">
	{
		"id":${i.id},
		"cityName":"${i.cityName}"
	}
	<c:if test="${!j.last}">
	,
	</c:if>
</c:forEach>
]