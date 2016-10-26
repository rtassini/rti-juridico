<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>sistema Jurídico</title>
</head>
<body>
	<form:form action="${s:mvcURl('PC#gravar').build() }" method="POST" commandName="processo">
		<div>
			<label>Processo</label>
			<input type="text" name="numero">
			<form:errors path="numero" />
		</div>
		<div>
			<label>Resumo</label>
			<textarea rows="10" cols="20" name="resumo"></textarea>
			<form:errors path="resumo" />
		</div>
		<div>
			<label>Fórum</label>
			<input type="text" name="forum">
			<form:errors path="forum" />
		</div>
		
		
		<c:forEach items="${tipos }" var="tipoParte" varStatus="status">
			<div>
				<label>${tipoParte } </label>
				<input type="text" name="parte[${status.index }].nome">
				<input type="hidden" name="parte[${status.index }].tipo" value="${tipoParte }">
			</div>
		</c:forEach>
		<button type="submit">Cadastrar</button>
	</form:form>	
</body>
</html>