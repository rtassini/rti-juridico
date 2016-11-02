<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>sistema Jurídico</title>
</head>
<body>
	<h1>Lista de Processos</h1>
	
	<div>${sucesso }</div>
	
	<table>
		<tr>
			<td>Número</td>
			<td>Fórum</td>
			<td>Resumo</td>
		</tr>
		<c:forEach items="${processos }" var="processo">
			<tr>
				<td>
					<a href="${s:mvcUrl('PC#detalhe').arg(0, processo.id).build() }">${processo.numero }</a>
				</td>
				<td>${processo.forum }</td>
				<td>${processo.resumo }</td>
			</tr>
		</c:forEach>
	</table>	
</body>
</html>