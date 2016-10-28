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
	<form:form action="${s:mvcUrl('PC#gravar').build() }" method="POST" commandName="processo" enctype="multipart/form-data">
		<div>
			<label>Processo</label>
			<form:input path="numero" />
			<form:errors path="numero" />
		</div>
		<div>
			<label>Resumo</label>
			<form:textarea path="resumo" rows="10" cols="20" />
			<form:errors path="resumo" />
		</div>
		<div>
			<label>Fórum</label>
			<form:input path="forum" />
			<form:errors path="forum" />
		</div>
		<div>
			<label>Data de Entrada</label>
			<form:input path="dataEntrada" />
			<form:errors path="dataEntrada" />
		</div>
		
		<c:forEach items="${tipos }" var="tipoParte" varStatus="status">
			<div>
				<label>${tipoParte } </label>
				<form:input path="parte[${status.index }].nome" />
				<form:hidden path="parte[${status.index }].tipo" value="${tipoParte }" />
			</div>
		</c:forEach>
		
		<div>
			<label>Sumário</label>
			<input name="sumario" type="file" />
			
		</div>
		<button type="submit">Cadastrar</button>
	</form:form>	
</body>
</html>