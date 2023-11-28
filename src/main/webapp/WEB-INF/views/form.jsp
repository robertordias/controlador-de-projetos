<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <title>Formulário de Projeto</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>

<div class="container">
    <h2>Formulário de Projeto</h2>
    <form:form method="post" modelAttribute="projeto" action="${action}">
        <form:label path="nome">Nome:</form:label>
        <form:input path="nome" class="form-control"/>

        <!-- Adicione outros campos do projeto aqui -->

        <button type="submit" class="btn btn-primary">Salvar</button>
    </form:form>
    <a href="<c:url value='/projetos'/>">Cancelar</a>
</div>

</body>
</html>