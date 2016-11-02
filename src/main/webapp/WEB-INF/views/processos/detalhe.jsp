<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
	<title>${processo.numero }</title>
</head>
<body>
	<header id="layout-header">
		<div class="clearfix container">
			<div id="header-content">
				<nav id="main-nav">
					<ul class="clearfix">
						<li><a href="/cart" rel="nofollow">Carrinho</a></li>

						<li><a href="/pages/sobre-a-casa-do-codigo" rel="nofollow">Sobre Nós</a></li>

						<li><a href="/pages/perguntas-frequentes" rel="nofollow">Perguntas Frequentes</a></li>
					</ul>
				</nav>
			</div>
		</div>
	</header>
	<article id="livro-css-eficiente">
		<header id="product-highlight" class="clearfix">
			<div id="product-overview" class="container">
				<h1>${processo.numero }</h1>
				<p class="book-description">${processo.resumo }</p>
			</div>
		</header>
		<section class="buy-options clearfix">
			<form action="/cart/add" method="post" class="container">
				<input type="hidden" value="${processo.id }" name="processoId" />
				<ul id="variants" class="clearfix">
					<c:forEach items="${processo.parte }" var="parte">
						<li>
							<label class="variant-label" for="product-variant-9720393823">${parte.tipo  } </label> 
							<p class="variant-price">${parte.nome  }</p>
						</li>
					</c:forEach>
				</ul>
			</form>
		</section>
		<div class="container">
			<section class="summary">
				<ul>
					<li>
						<h3>E muito mais... <a href='/pages/sumario-java8'>veja o sumário</a>.</h3>
					</li>
				</ul>
			</section>
		</div>
	</article>

	<footer id="layout-footer">
		<div class="clearfix container">
			
		</div>
	</footer>
</body>
</html>