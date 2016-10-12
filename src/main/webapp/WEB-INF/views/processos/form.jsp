<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta charset="UTF-8">
<title>sistema Jurídico</title>
</head>
<body>
	<form action="/rti-juridico/processos" method="post">
		<div>
			<label>Processo</label>
			<input type="text" name="numero">
		</div>
		<div>
			<label>Resumo</label>
			<textarea rows="10" cols="20" name="resumo"></textarea>
		</div>
		<div>
			<label>Fórum</label>
			<input type="text" name="forum">
		</div>
		<button type="submit">Cadastrar</button>
	</form>	
</body>
</html>