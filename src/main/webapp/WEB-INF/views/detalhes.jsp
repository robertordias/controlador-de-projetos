<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.text.SimpleDateFormat" %>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <title>Detalhes do Projeto</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
</head>
<body>

<div class="container">
    <h2>Detalhes do Projeto</h2>

    <c:if test="${not empty projeto}">
        <dl class="row">
            <dt class="col-sm-3">ID:</dt>
            <dd class="col-sm-9">${projeto.id}</dd>

            <dt class="col-sm-3">Nome:</dt>
            <dd class="col-sm-9">${projeto.nome}</dd>

            <dt class="col-sm-3">Data de Início:</dt>
            <dd class="col-sm-9">${projeto.dataInicio}</dd>

            <dt class="col-sm-3">Data de Previsão de Término:</dt>
            <dd class="col-sm-9">${projeto.dataPrevisaoFim}</dd>

            <dt class="col-sm-3">Descrição:</dt>
            <dd class="col-sm-9">${projeto.descricao}</dd>

            <dt class="col-sm-3">Status:</dt>
            <dd class="col-sm-9">${projeto.status}</dd>

            <dt class="col-sm-3">Orçamento:</dt>
            <dd class="col-sm-9">${projeto.orcamento}</dd>

            <dt class="col-sm-3">Risco:</dt>
            <dd class="col-sm-9">${projeto.risco}</dd>
        </dl>
    </c:if>

    <a href="<c:url value='/projetos'/>">Voltar para a Lista de Projetos</a>
</div>

</body>
</html>