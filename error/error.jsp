<%@page contentType="text/html; charset=iso-8859-1" language="java" import="java.util.*" isErrorPage ="true" %>
<jsp:include page="../include/HeaderError.jsp"/>
<div class="panel panel-ibx">
<div class="panel-body">
<div class="error-wrap">
	<h4 style="font-size:36px;margin-top:30px;">Oops!</h4>
	<p>something went wrong</p>
	<%--<a href="javascript: history.go(-1)"><i class="fa fa-home" style="color:#FF3300"></i></a>--%>
	<button class="btn btn-success" onclick="location.href='javascript: history.go(-1)';">GO BACK <i class="fa fa-arrow-circle-left"></i></button>
</div>
</div>
</div>
<jsp:include page="../include/Footer.jsp" />